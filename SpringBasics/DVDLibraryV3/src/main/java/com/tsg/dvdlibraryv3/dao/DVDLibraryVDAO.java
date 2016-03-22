/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dvdlibraryv3.dao;

import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class DVDLibraryVDAO implements DvdLibraryDao {

    public ArrayList<Dvd> dvdLibrary = new ArrayList<>();
    static final String ROSTER_FILE = "dvd_library.txt";
    static final String DELIMITER = "::";

    public void loadLibrary() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {

            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            Dvd dvd = new Dvd();

            dvd.setId(Integer.parseInt(currentTokens[0]));
            dvd.setTitle(currentTokens[1]);
            dvd.setReleaseDate(LocalDate.parse(currentTokens[2]));
            dvd.setMpaaRating(currentTokens[3]);
            dvd.setDirector(currentTokens[4]);
            dvd.setStudio(currentTokens[5]);
            dvd.setNote(currentTokens[6]);

            dvdLibrary.add(dvd);
        }

        sc.close();
    }
    
    public Dvd getDvd(int id)
    {
        return dvdLibrary.get(id);
    }
    
    public Integer getNumberOfDVDs() {
        return dvdLibrary.size();
    }

    public void writeLibrary() throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter(ROSTER_FILE));
        List<Dvd> newDVDList = dvdLibrary;
        newDVDList.stream().map((dvd) -> {
            writer.println(dvd.getId() + DELIMITER
                    + dvd.getTitle() + DELIMITER
                    + dvd.getReleaseDate() + DELIMITER
                    + dvd.getMpaaRating() + DELIMITER
                    + dvd.getDirector() + DELIMITER
                    + dvd.getStudio() + DELIMITER
                    + dvd.getNote()
            );
            return dvd;
        }).forEach((_item) -> {
            writer.flush();
        });

        writer.close();
    }
    
    public List<Dvd> findOldestDVD() {
        List<LocalDate> dateList = new ArrayList<>();
        for (Dvd dvd : dvdLibrary) {
            dateList.add(dvd.getReleaseDate());
        }
        List<Dvd> newList = dvdLibrary.stream()
                .filter(s -> s.getReleaseDate().equals(Collections.min(dateList)))
                .collect(Collectors.toList());

        return newList;
    }
    
    public List<Dvd> findNewestDVD() {
        List<LocalDate> dateList = new ArrayList<>();
        for (Dvd dvd : dvdLibrary) {
            dateList.add(dvd.getReleaseDate());
        }
        List<Dvd> newList = dvdLibrary.stream()
                .filter(s -> s.getReleaseDate().equals(Collections.max(dateList)))
                .collect(Collectors.toList());

        return newList;
    }

    public List<Dvd> getByDirector(String director) {
        List<Dvd> newDVDList = new ArrayList<>();
        newDVDList = dvdLibrary.stream()
                .filter(s -> s.getDirector().equalsIgnoreCase(director))
                .collect(Collectors.toList());

        return newDVDList;
    }

    public Integer getHighestIndex() {
        Integer id = dvdLibrary.size() + 1;
        return id;
    }

    @Override
    public void add(Dvd dvd) {
        dvdLibrary.add(dvd);
    }

    @Override
    public void remove(int id) {
        dvdLibrary.remove(id);
    }

    @Override
    public List<Dvd> listAll() {
        List<Dvd> list = new ArrayList<>();

        list = dvdLibrary;

        return list;
    }

    @Override
    public Dvd getById(int id) {
        Iterator<Dvd> it = dvdLibrary.iterator();
        Dvd newDVD = new Dvd();
        while (it.hasNext()) {
            Dvd dvd = it.next();
            if (dvd.getId() == id) {
                newDVD = dvd;
            }
        }
        return newDVD;
    }

    @Override
    public List<Dvd> getByTitle(String title) {
        List<Dvd> list = new ArrayList<>();
        list = dvdLibrary.stream()
                .filter(s -> s.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());

        return list;
    }

    @Override
    public List<Dvd> getByRating(String rating) {
        List<Dvd> list = new ArrayList<>();
        list = dvdLibrary.stream()
                .filter(s -> s.getMpaaRating().equalsIgnoreCase(rating))
                .collect(Collectors.toList());

        return list;
    }

    @Override
    public List<Dvd> getByStudio(String studio) {
        List<Dvd> list = new ArrayList<>();
        list = dvdLibrary.stream()
                .filter(s -> s.getStudio().equalsIgnoreCase(studio))
                .collect(Collectors.toList());

        return list;
    }

}
