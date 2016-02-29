/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.warmupdata;

import java.util.HashMap;

/**
 *
 * @author apprentice
 */
public class StudentMapData {
    String email, name;
    public static void main(String[] args) {
        StudentInput si = new StudentInput();
        CourseMapInput course1 = new CourseMapInput("TacoDynamics", "HUM123");
        CourseMapInput course2 = new CourseMapInput("Corn Chucking", "PHY45");
        
        StudentInput student1 = new StudentInput("Deadpool", "Noneyaa@gmail.com");
        StudentInput student2 = new StudentInput("Dwayne Wade", "IDwayne@gmail.com");
        StudentInput student3 = new StudentInput("Merge Conflict", "Satans.cousin@aol.com");
        StudentInput student4 = new StudentInput("Who Dat", "Heistheone!@gmail.com");
        StudentInput student5 = new StudentInput("Mahatma Gahndi", "coolguy@gmail.com");
        
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course2.addStudent(student3);
        course2.addStudent(student4);
        course2.addStudent(student5);
        
        HashMap hm = new HashMap();
        
        
        
        
        
    }
}
