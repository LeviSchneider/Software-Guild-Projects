/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dvdlibrarymvc.dao;

import com.tsg.dvdlibrarymvc.dto.DVD;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class DvdLibraryDaoInMemImpl implements DvdLibraryDao{

    private Map<Integer, DVD> dvdMap = new HashMap<>();
    private static int dvdIdCounter = 0;
    
    @Override
    public DVD addDVD(DVD dvd) {
        dvd.setDvdId(dvdIdCounter);
        dvdIdCounter++;
        dvdMap.put(dvd.getDvdId(), dvd);
        return dvd;
    }

    @Override
    public void removeDVD(int dvdId) {
        dvdMap.remove(dvdId);
    }

    @Override
    public void updateDVD(DVD dvd) {
        dvdMap.put(dvd.getDvdId(), dvd);
    }

    @Override
    public List<DVD> getAllDVDs() {
        Collection<DVD> c = dvdMap.values();
        return new ArrayList(c);
    }

    @Override
    public DVD getDVDById(int dvdId) {
        return dvdMap.get(dvdId);
    }

    @Override
    public List<DVD> searchDVDs(Map<SearchTerm, String> criteria) {
        String titleCriteria = criteria.get(SearchTerm.TITLE);
        String directorCriteria = criteria.get(SearchTerm.DIRECTOR);
        String studioCriteria = criteria.get(SearchTerm.STUDIO);
        String releaseDateCriteria = criteria.get(SearchTerm.RELEASE_DATE);
        String ratingCriteria = criteria.get(SearchTerm.RATING);
        
        Predicate<DVD> titleMatches;
        Predicate<DVD> directorMatches;
        Predicate<DVD> studioMatches;
        Predicate<DVD> releaseDateMatches;
        Predicate<DVD> ratingMatches;
        
        Predicate<DVD> truePredicate = (c) -> {return true;};
        
        titleMatches = (titleCriteria == null || titleCriteria.isEmpty())? truePredicate: (c) -> c.getTitle().equals(titleCriteria);
        directorMatches = (directorCriteria == null || directorCriteria.isEmpty())? truePredicate: (c) -> c.getDirector().equals(directorCriteria);
        studioMatches = (studioCriteria == null || studioCriteria.isEmpty())? truePredicate: (c) -> c.getStudio().equals(studioCriteria);
        releaseDateMatches = (releaseDateCriteria == null || releaseDateCriteria.isEmpty())? truePredicate: (c) -> c.getReleaseDate().equals(releaseDateCriteria);
        ratingMatches = (ratingCriteria == null || ratingCriteria.isEmpty())? truePredicate:(c) -> c.getRatings().equals(ratingCriteria); 
        
        return dvdMap.values().stream()
                .filter(titleMatches
                    .and(directorMatches)
                    .and(studioMatches)
                    .and(releaseDateMatches)
                    .and(ratingMatches))
                .collect(Collectors.toList());
    }
}
