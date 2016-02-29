/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.warmupdata;

/**
 *
 * @author apprentice
 */
public class CourseMapInput {
    private String courseName;
    private String courseNumber;
    private StudentInput[] students;
    private int index;

    public CourseMapInput(String courseName, String courseNumber) {
        this();//<= Calls the default construct.
        //students = new Student[10];
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public CourseMapInput() {//<= This is the default construct.
        students = new StudentInput[10];
        this.courseName = "";
        this.courseNumber = "";
        this.index = 0;
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
    
    public void addStudent(StudentInput student){
        students[index] = student;
        index++;
    }
    
    public void printCourseReport()
    {
        System.out.println("Course name: " + courseName);
        System.out.println("Course number: " + courseNumber);
        for(int i = 0; i < index; i++)
        {
            System.out.println("Student: " + students[i].getName() + " email:" + students[i].getEmail());
        }
            
    }
}
