/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.schooldata;

/**
 *
 * @author apprentice
 */
public class School {
    public static void main(String[] args) {
        Course math = new Course("Calculus", "MTH 201");
        Course otherCourse = new Course("Taco Dynamics in Suboptimal Environments before 1950's", "ANT 639");
        Student student1 = new Student("Flash Gordon", "flashgordon@uakron.edu");
        Student student2 = new Student("Freddy Mercury", "fredy@uakron.edu");
        Student student3 = new Student("Skeletor", "skeletor@uakron.edu");
        
        math.addStudent(student1);
        math.addStudent(student2);
        
        otherCourse.addStudent(student2);
        otherCourse.addStudent(student3);
        
        math.printCourseReport();
        otherCourse.printCourseReport();
    }
}
