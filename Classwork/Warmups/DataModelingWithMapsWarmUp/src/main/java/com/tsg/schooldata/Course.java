/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.schooldata;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class Course {
    private String courseName;
    private String courseNumber;
    private Map<String, Student> studentMap;
    //private Student[] students;
    //private int index;

    public Course(String courseName, String courseNumber) {
        this();//<= Calls the default construct.
        //students = new Student[10];
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public Course() {//<= This is the default construct.
        //students = new Student[10];
        studentMap = new HashMap<>();
        this.courseName = "";
        this.courseNumber = "";
        //this.index = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    public void addStudent(Student student){
//        students[index] = student;
//        index++;
        studentMap.put(student.getEmail(), student);
    }
    
    public void printCourseReport()
    {
        System.out.println("Course name: " + courseName);
        System.out.println("Course number: " + courseNumber);
        
        Set<String> keys = studentMap.keySet();
        
        for(String key : keys)
        {
            String email = studentMap.get(key).getEmail();
            String name = studentMap.get(key).getName();
            System.out.println("Student: " + name + " email" + email);
        }
//        for(int i = 0; i < index; i++)
//        {
//            System.out.println("Student: " + students[i].getName() + " email:" + students[i].getEmail());
//        }
            
    }
}
