/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.classroster;

import com.tsg.classroster.dao.ClassRosterDAO;
import com.tsg.classroster.dto.Student;
import com.tsg.classroster.ui.ConsoleIO;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author apprentice
 */
public class ClassRosterController {
    
    private ConsoleIO con = new ConsoleIO();
    private ClassRosterDAO roster = new ClassRosterDAO();

    void run() {
        
        try{
        boolean keepAlive = true;
        int menuSelection = 0;
        roster.loadRoster();
        while(keepAlive)
        {
            printMenu();
            menuSelection = con.readInt("Please select from the above choices", 1, 5);
            
            switch(menuSelection)
            {
                case 1:
                    con.print("Listing students...");
                    listStudents();
                    break;
                case 2:
                    con.print("Creating New Student...");
                    createStudent();
                    break;
                case 3:
                    con.print("Viewing Student Information...");
                    viewStudent();
                    break;
                case 4:
                    con.print("Removing student...");
                    removeStudent();
                    break;
                case 5:
                    con.print("Exiting...");
                    keepAlive = false;
                    break;
                default:
                    con.print("Unknown Input...");
                    break;
            }
        }
        roster.writerRoster();
        con.print("Thank you for using our product.");
        }catch(FileNotFoundException e)
        {
            con.print("Roster file was not found.");
        }catch(IOException e)
        {
            con.print("unable to write roster file.");
        }
    }

    private void printMenu() {      
        con.print("Class Roster Main Menu: ");
        con.print("1. List Student IDs");
        con.print("2. Create New Student");
        con.print("3. View a Student");
        con.print("4. Remove a Student");
        con.print("5. Exit");
    }

    private void createStudent() {
        Integer studentId = con.readInt("Please enter Student ID:");
        String firstName = con.readString("Please enter First Name:");
        String lastName = con.readString("Please enter Last Name");
        String cohort = con.readString("Please enter Cohort:");
                
        Student student = new Student();
        student.setCohort(cohort);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setStudentId(studentId);
        
        roster.createStudent(student);
    }

    private void listStudents() {
        Integer[] studentId = roster.getAllStudentIds();
        for(int i = 0; i < studentId.length; i++)
        {
            Student student = roster.getStudent(studentId[i]);
            con.print(studentId[i] + ": " + student.getFirstName() + " " + student.getLastName());
        }
        
        con.readString("Please hit enter to continue.");
    }

    private void viewStudent() {
        Integer studentId = con.readInt("Please enter ID of the student you wish to view.");
        Student student = roster.getStudent(studentId);
        
        con.print("ID: " + student.getStudentId());
        con.print("First Name: " + student.getFirstName());
        con.print("Last Name: " + student.getLastName());
        con.print("Cohort: " + student.getCohort());
        con.print("");
        
        con.readString("Please hit enter to continue.");
        
    }

    private void removeStudent() {
        Integer studentId = con.readInt("Please enter the ID of the student to be removed:");
        roster.removeStudent(studentId);
        con.readString("Student successfully removed from the database.");
    }
}


