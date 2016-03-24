/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dvdlibraryv3;

import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
import com.tsg.dvdlibraryv3.ui.ConsoleIO;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author apprentice
 */
public final class DVDLibraryV3Controller {

    private final ConsoleIO con = new ConsoleIO();
    private DvdLibraryDao controllerLibrary;

    public DVDLibraryV3Controller(DvdLibraryDao dao)
    {
        controllerLibrary = dao;
    }
    
    void run() {
        boolean keepAlive = true;
        int menuSelection = 0;
        while (keepAlive) {
            printMenu();
            menuSelection = con.readInt("\nPlease select from the above choices.", 1, 8);
            switch (menuSelection) {
                
                case 1:
                    con.print("Adding DVD...");
                    addDVD();
                    break;
                case 2:
                    con.print("Removing DVD...");
                    removeDVD();
                    break;
                case 3:
                    con.print("Listing all DVDs...");
                    //listAllDVDs();
                    break;
                case 4:
                    con.print("Searching for a DVD...");
                    searchForDVD();
                    break;
                case 5:
                    con.print("Editing a DVD...");
                    editDVD();
                    break;
                case 6:
                    con.print("Number of DVDs is...");
                    //con.print(Integer.toString(controllerLibrary.getNumberOfDVDs()));
                    break;
                case 7:
                    con.print("Quitting...");
                    keepAlive = false;
                    //controllerLibrary.writeLibrary();
                    break;
                default:
                    con.print("Unknown input");
                    break;
            }
        }
        con.print("Thank you for using our product.");

    }

    private void printMenu() {

        con.print("*************************");
        con.print("*DVD Library Main Menu");
        con.print("*************************");
        con.print("*1. Add DVD");
        con.print("*2. Remove DVD");
        con.print("*3. List All DVDs");
        con.print("*4. Search for DVD");
        con.print("*5. Edit DVD");
        con.print("*6. Number of DVDs");
        con.print("*7. Quit");
        con.print("*************************");
    }

    private void addDVD() {
        String testDate = "";
        String title = con.readString("Please enter Movie Title");
        boolean alive = true;
        while (alive) {

            String date = con.readString("Please enter Release Date. (yyyy/MM/dd)");

            try {
                testDate = date.replaceAll("/", "");
                alive = false;
            } catch (Exception e) {
                con.print("Incorrectly type date. Try again please. (yyyy/MM/dd)");
            }
        }
        String rating = con.readString("Please enter Rating (G, PG, PG13, R, NC17, X, U, etc)");
        String director = con.readString("Please enter name of Director");
        String studio = con.readString("Please enter name of Studio");
        boolean hasMoreNotes = true;

        con.print("Please enter your ratings / notes");
        String note = con.readString("Press enter without typing to finish entering notes.");

        Dvd dvd = new Dvd();
        dvd.setTitle(title);
        dvd.setReleaseDate(LocalDate.now());
        dvd.setMpaaRating(rating);
        dvd.setDirector(director);
        dvd.setStudio(studio);
        dvd.setNote(note);

        controllerLibrary.add(dvd);

    }

    private void editDVD() {
        con.print("Which DVD do you want to edit?");
        controllerLibrary.getByTitle(con.readString("Please print the title of the movie"));
        Integer id = con.readInt("Please enter the ID of the DVD you wish to edit.");
        Dvd dvd = controllerLibrary.getById(id);
        boolean keepAlive = true;
        while (keepAlive) {
            if (dvd != null) {
                con.print("**********************");
                con.print("*1. Title");
                con.print("*2. Year");
                con.print("*3. Rating");
                con.print("*4. Director");
                con.print("*5. Studio");
                con.print("*6. Notes");
                con.print("*7. Quit");
                con.print("**********************");

                Integer userInput = con.readInt("\nWhich field do you want to edit?");
                String newFieldInfo = "";
                switch (userInput) {

                    case 1:
                        newFieldInfo = con.readString("\nWhat is the new title?");
                        dvd.setTitle(newFieldInfo);
                        controllerLibrary.add(dvd);
                        con.print("Changes saved.");
                        break;

                    case 2:
                        newFieldInfo = con.readString("\nWhat is the new year?");
                        dvd.setReleaseDate(LocalDate.now());
                        controllerLibrary.add(dvd);
                        con.print("Changes saved.");
                        break;
                    case 3:
                        newFieldInfo = con.readString("\nWhat is the new rating?");
                        dvd.setMpaaRating(newFieldInfo);
                        controllerLibrary.add(dvd);
                        con.print("Changes saved.");
                        break;
                    case 4:
                        newFieldInfo = con.readString("\nWhat is the new director?");
                        dvd.setDirector(newFieldInfo);
                        controllerLibrary.add(dvd);
                        con.print("Changes saved.");
                        break;
                    case 5:
                        newFieldInfo = con.readString("\nWhat is the new studio?");
                        dvd.setStudio(newFieldInfo);
                        controllerLibrary.add(dvd);
                        con.print("Changes saved.");
                        break;
                    case 6:
                        con.print("\nAdd notes or replace notes?");

                        con.print("1. Add");
                        con.print("2. Replace");

                        Integer notesChoice = con.readInt("Add/replace (1/2): ");
                        String note = con.readString("Please enter a note about the film in question");
                        dvd.setNote(note);
                        controllerLibrary.add(dvd);
                        con.print("Changes saved.");
                        break;
                    case 7:
                        con.print("Quitting...");
                        keepAlive = false;
                        break;
                    default:
                        con.print("That is not a response.");
                        keepAlive = true;
                        break;
                }
            } else {
                con.print("No DVD with ID: " + id + " exists.");
            }
        }
        con.readString("Please hit enter to continue.");
    }

    private void searchForDVD() {
        boolean alive = true;
        while (alive) {
            String answer = con.readString("Search for DVD by \n1)Title, \n2)Director, \n3)Studio, \n4)Rating, \n5)Find Latest DVD, \n6)Find Oldest DVD");
            switch (answer) {
                case "1":
                    viewDVD(controllerLibrary.getByTitle(con.readString("Please print the title of the movie")));
                    alive = false;
                    break;
                case "2":
                    //viewDVD(controllerLibrary.getByDirector(con.readString("Please print the name of the director")));
                    alive = false;
                    break;
                case "3":
                    viewDVD(controllerLibrary.getByStudio(con.readString("Please print the name of the studio that produced the film.")));
                    alive = false;
                    break;
                case "4":
                    viewDVD(controllerLibrary.getByRating(con.readString("Please print the rating of the movie")));
                    alive = false;
                    break;
                case "5":
                    //viewDVD(controllerLibrary.findNewestDVD());
                    alive = false;
                    break;
                case "6":
                    //viewDVD(controllerLibrary.findOldestDVD());
                    alive = false;
                    break;
                default:
                    con.print("That is not a thing....  Please try again... or not.");
                    break;
            }
        }
    }

//    private void listAllDVDs() {
//
//        //List<Dvd> newDVDList = controllerLibrary.dvdLibrary;
//
//        for (Dvd dvd : newDVDList) {
//            con.print("****************************");
//            con.print("*Title: \t" + dvd.getTitle());
//            con.print("*Studio: \t" + dvd.getStudio());
//            con.print("*Rating: \t" + dvd.getMpaaRating());
//            con.print("*Director: \t" + dvd.getDirector());
//            con.print("*ID: \t" + dvd.getId());
//            con.print("*Notes: \t" + dvd.getNote());
//            con.print("*Release Date: \t" + dvd.getReleaseDate());
//            con.print("****************************\n");
//        }
//
//        con.readString("Please hit enter to continue.");
//
//    }

    private void removeDVD() {
        boolean alive = false;
        Integer id = 0;
        while (alive) {
            viewDVD(controllerLibrary.getByTitle(con.readString("Please print the title of the movie")));

            id = con.readInt("Please type the corresponding id number to select the DVD to be deleted.");
            String confirm = con.readString("Are you sure??? Type DELETE to really delete.");
            if (confirm.equals("DELETE")) {
                controllerLibrary.remove(id);
                con.print("DVD with ID: " + id + " has been removed.");
                alive = true;
            } else {
                con.print("Delete canceled.");
                alive = true;
            }
        }
        con.readString("Please hit enter to continue.");
    }

    private void viewDVD(List<Dvd> list) {
        for (Iterator<Dvd> it = list.iterator(); it.hasNext();) {
            Dvd dvd = it.next();
            con.print("****************************");
            con.print("Title: \t" + dvd.getTitle());
            con.print("Studio: \t" + dvd.getStudio());
            con.print("Rating: \t" + dvd.getMpaaRating());
            con.print("Director: \t" + dvd.getDirector());
            con.print("ID: \t" + dvd.getId());
            con.print("Notes: \t" + dvd.getNote());
            con.print("Release Date: \t" + dvd.getReleaseDate());
            con.print("****************************\n");
        }

        con.readString("Please hit enter to continue.");
    }

}
