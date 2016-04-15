/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dvdlibrarymvc.dao;

import com.tsg.dvdlibrarymvc.dto.DVD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public class DvdLibraryDaoDbImpl implements DvdLibraryDao {

    private static final String SQL_INSERT_DVD
            = "insert into dvd (title, director, studio, ratings, release_date, notes) value (?, ?, ?, ?, ?, ?)";
    private static final String SQL_DELETE_DVD
            = "delete from dvd where iddvd = ?";
    private static final String SQL_UPDATE_DVD
            = "update dvd set title = ?, director = ?, studio = ?, ratings = ?, release_date = ?, notes = ? where iddvd = ?";
    private static final String SQL_SELECT_ALL_DVDS
            = "select * from dvd";
    private static final String SQL_SELECT_DVD
            = "select * from dvd where iddvd = ?";
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public DVD addDVD(DVD dvd) {
        jdbcTemplate.update(SQL_INSERT_DVD,
                dvd.getTitle(),
                dvd.getDirector(),
                dvd.getStudio(),
                dvd.getRatings(),
                dvd.getReleaseDate(),
                dvd.getNotes());
        dvd.setDvdId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class));
        return dvd;
    }

    @Override
    public void removeDVD(int dvdId) {
        jdbcTemplate.update(SQL_DELETE_DVD, dvdId);
    }

    @Override
    public void updateDVD(DVD dvd) {
        jdbcTemplate.update(SQL_UPDATE_DVD,
                dvd.getTitle(),
                dvd.getDirector(),
                dvd.getStudio(),
                dvd.getRatings(),
                dvd.getReleaseDate(),
                dvd.getNotes(),
                dvd.getDvdId());
    }

    @Override
    public List<DVD> getAllDVDs() {
        return jdbcTemplate.query(SQL_SELECT_ALL_DVDS, new DvdMapper());
    }

    @Override
    public DVD getDVDById(int dvdId) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_DVD, new DvdMapper(), dvdId);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<DVD> searchDVDs(Map<SearchTerm, String> criteria) {
        if(criteria.size() == 0)
        {
            return getAllDVDs();
        } else {
            StringBuilder sQuery = new StringBuilder("select * from dvd where ");
            int numParams = criteria.size();
            int paramPosition = 0;
            String[] paramVals = new String[numParams];
            Set<SearchTerm> keySet = criteria.keySet();
            Iterator<SearchTerm> iter = keySet.iterator();
            
            while(iter.hasNext())
            {
                SearchTerm currentKey = iter.next();
                
                if(paramPosition > 0)
                {
                    sQuery.append(" and ");
                }
                
                sQuery.append(currentKey);
                sQuery.append(" = ? ");
                paramVals[paramPosition] = criteria.get(currentKey);
                paramPosition++;
            }
            return jdbcTemplate.query(sQuery.toString(), new DvdMapper(), paramVals);
        }
    }

    private static final class DvdMapper implements RowMapper<DVD> {

        @Override
        public DVD mapRow(ResultSet rs, int i) throws SQLException {
            DVD dvd = new DVD();
            dvd.setDvdId(rs.getInt("iddvd"));
            dvd.setTitle(rs.getString("title"));
            dvd.setDirector(rs.getString("director"));
            dvd.setStudio(rs.getString("studio"));
            dvd.setRatings(rs.getString("ratings"));
            dvd.setReleaseDate(rs.getString("release_date"));
            dvd.setNotes(rs.getString("notes"));

            return dvd;
        }

    }
}
