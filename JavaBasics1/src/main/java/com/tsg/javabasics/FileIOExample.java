/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.javabasics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class FileIOExample {
    public static final String DELIMITER = "::";
    public static void main(String[] args) throws IOException {
        writeToFile();
        readAndPrintFile();
        
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setCohort("Java Feb 2016");
        student.setStudentFirstName("John");
        student.setStudentLastName("Doe");
        student.setStudentId("0042");
        
        students.add(student);
        
        student.setCohort("Java Sep 2015");
        student.setStudentFirstName("Joss");
        student.setStudentLastName("Whedon");
        student.setStudentId("1111");
        
        students.add(student);

        student.setCohort("Java Feb 2016");
        student.setStudentFirstName("Jane");
        student.setStudentLastName("Smith");
        student.setStudentId("0084");
        
        students.add(student);
        
        encodeStudents(students);
        
        List<Student> decodeList = decodeStudentList();
    }
    
    private static void encodeStudents(List<Student> students) throws IOException{//To change body of generated methods, choose Tools | Templates.
        PrintWriter out = new PrintWriter(new FileWriter("StudentRecords.txt"));
        
        for(Student student: students){
            out.println(student.getStudentId()+ DELIMITER +
                    student.getStudentFirstName()+ DELIMITER +
                    student.getStudentLastName()+ DELIMITER +
                    student.getCohort());
        }
            
    }

    
    public static void writeToFile()throws IOException{
        //this code results in the same output for out2
        //as the code below for variable out
//        String fileName = "OutFile.txt";
//        FileWriter fileWriter = new FileWriter(fileName);
//        PrintWriter out = new PrintWriter(fileWriter);
        
        PrintWriter out = new PrintWriter(new FileWriter("outfile.txt"));
        
        out.println("this is a first line in my file...");
        out.flush();
        out.println("This is another String!!!");
        out.flush();
        out.close();//close deals with file handle. You do not run close() it will throw errors the next time you try to input another file.
        //Will not write any more after first close!!!!!
        
        out.println("This is a second line in my file...");
        out.flush();
        out.close();
    }
    
    public static void readAndPrintFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("outfile.txt")));
        while(sc.hasNextLine())
        {
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
        }
        
    }

    private static List<Student> decodeStudentList() throws FileNotFoundException {
       Scanner sc = new Scanner(new BufferedReader(new FileReader("StudentRecords.txt")));
       List<Student> resultList = new ArrayList<>();
       while(sc.hasNextLine())
       {
           String currentLine = sc.nextLine();
           Student student = new Student();
           String[] tokens = currentLine.split(DELIMITER);  
           student.setStudentId(tokens[0]);
           student.setStudentFirstName(tokens[1]);
           student.setStudentLastName(tokens[2]);
           student.setCohort(tokens[3]);
           
           resultList.add(student);
       }
       return resultList;
    }
}

