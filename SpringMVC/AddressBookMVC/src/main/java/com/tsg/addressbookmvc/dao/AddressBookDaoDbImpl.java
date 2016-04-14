/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.addressbookmvc.dao;

import com.tsg.addressbookmvc.dto.Address;
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
public class AddressBookDaoDbImpl implements AddressBookDao {

    private static final String SQL_INSERT_ADDRESS
            = "insert into address (name, address_line_1, address_line_2, city, state, zip) value (?,?,?,?,?,?)";
    private static final String SQL_DELETE_ADDRESS
            = "delete from address where idaddress = ?";
    private static final String SQL_UPDATE_ADDRESS
            = "update address set name = ?, address_line_1 = ?, address_line_2 = ?, city = ?, state = ?, zip = ? where idaddress = ?";
    private static final String SQL_SELECT_ALL_ADDRESSES
            = "select * from address";
    private static final String SQL_SELECT_ADDRESS
            = "select * from address where idaddress = ?";
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Address addAddress(Address address) {
        jdbcTemplate.update(SQL_INSERT_ADDRESS,
                address.getName(),
                address.getAddressLine1(),
                address.getAddressLine2(),
                address.getCity(),
                address.getState(),
                address.getZipCode());
        address.setAddressId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class));
        return address;
    }

    @Override
    public void removeAddress(int addressId) {
        jdbcTemplate.update(SQL_DELETE_ADDRESS, addressId);
    }

    @Override
    public void updateAddress(Address address) {
        jdbcTemplate.update(SQL_UPDATE_ADDRESS,
                address.getName(),
                address.getAddressLine1(),
                address.getAddressLine2(),
                address.getCity(),
                address.getState(),
                address.getZipCode(),
                address.getAddressId());
    }

    @Override
    public List<Address> getAllAddresses() {
        return jdbcTemplate.query(SQL_SELECT_ALL_ADDRESSES, new AddressMapper());
    }

    @Override
    public Address getAddressById(int addressId) {
        try{
            return jdbcTemplate.queryForObject(SQL_SELECT_ADDRESS, new AddressMapper(), addressId);
        }catch(EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public List<Address> searchAddresses(Map<SearchTerm, String> criteria) {
        if(criteria.size() == 0)
        {
            return getAllAddresses();
        } else {
            StringBuilder sQuery = new StringBuilder("select * from address where ");
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
            return jdbcTemplate.query(sQuery.toString(), new AddressMapper(), paramVals);
        }
    }

    private static final class AddressMapper implements RowMapper<Address> {

        @Override
        public Address mapRow(ResultSet rs, int i) throws SQLException {
            Address address = new Address();
            address.setAddressId(rs.getInt("idaddress"));
            address.setName(rs.getString("name"));
            address.setAddressLine1(rs.getString("address_line_1"));
            address.setAddressLine2(rs.getString("address_line_2"));
            address.setCity(rs.getString("city"));
            address.setState(rs.getString("state"));
            address.setZipCode(rs.getString("zip"));
            
            return address;
        }

    }

}
