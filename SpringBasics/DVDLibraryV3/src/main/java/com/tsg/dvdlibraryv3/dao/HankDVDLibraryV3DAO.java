/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dvdlibraryv3.dao;

import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author Hank Stocker
 */
public class HankDVDLibraryV3DAO implements DvdLibraryDao {

    List<Dvd> movie = new ArrayList<>();

    @Override
    public void add(Dvd dvd) {
        movie.add(dvd);
    }

    @Override
    public void remove(int id) {
        Dvd dvd = this.getById(id);
        movie.remove(dvd);
    }

    @Override
    public List<Dvd> listAll() {
        return movie.stream().collect(Collectors.toList());
    }

    @Override
    public Dvd getById(int id) throws NoSuchElementException {
        Optional<Dvd> result;
        result = movie.stream().filter(s -> s.getId() == id).findFirst();
        return result.get();
    }

//    public Dvd getById(int id) {
//        Optional<Dvd> result;
//        result = movie.stream().filter(s -> s.getId() == id).findFirst();
//        if (result.isPresent()) {
//            return result.get();
//        } else {
//            return null;
//        }
//    }
    //optional version with null checking instead

    @Override
    public List<Dvd> getByTitle(String title) {
        return movie.stream().filter(s -> s.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
    }

    @Override
    public List<Dvd> getByRating(String rating) {
        return movie.stream().filter(s -> s.getMpaaRating().equalsIgnoreCase(rating)).collect(Collectors.toList());
    }

    @Override
    public List<Dvd> getByStudio(String studio) {
        return movie.stream().filter(s -> s.getStudio().equalsIgnoreCase(studio)).collect(Collectors.toList());
    }

}