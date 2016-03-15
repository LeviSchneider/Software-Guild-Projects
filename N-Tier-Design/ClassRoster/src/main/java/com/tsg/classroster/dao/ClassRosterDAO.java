/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.classroster.dao;

import com.tsg.classroster.dto.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class ClassRosterDAO {

    private Map<Integer, Student> students = new HashMap<Integer, Student>();
    private static final String ROSTER_FILE = "roster.txt";
    private static final String DELIMITER = "::";
    private Integer maxStudentID = 0;
    
    public void createStudent(Student student) {    
        student.setStudentId(maxStudentID);
        students.put(student.getStudentId(), student);
        maxStudentID++;
    }

    public Integer[] getAllStudentIds() {
        Set<Integer> keySet = students.keySet();
        Integer[] keyArray = new Integer[keySet.size()];
        keyArray = keySet.toArray(keyArray);
        return keyArray;
    }

    public Student getStudent(Integer studentId) {
        return students.get(studentId);
    }

    public Student removeStudent(Integer studentId) {
        return students.remove(studentId);
    }

    public void loadRoster() throws FileNotFoundException {
        
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        
        String currentLine;
        String[] currentTokens;
        
        while(sc.hasNextLine())
        {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            
            Student student = new Student();
            student.setStudentId(Integer.parseInt(currentTokens[0]));
            student.setFirstName(currentTokens[1]);
            student.setLastName(currentTokens[2]);
            student.setCohort(currentTokens[3]);
            
            students.put(student.getStudentId(), student);
        }
        sc.close();
    }

    public void writerRoster() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(ROSTER_FILE));
        
        Integer[] studentIds = this.getAllStudentIds();
        
        for(int i = 0; i < studentIds.length; i++)
        {
            Student student = this.getStudent(studentIds[i]);
            writer.println(student.getStudentId() + DELIMITER + student.getFirstName() + DELIMITER + student.getLastName() + DELIMITER + student.getCohort());
            writer.flush();
        }
        writer.close();
        
    }
    
}
