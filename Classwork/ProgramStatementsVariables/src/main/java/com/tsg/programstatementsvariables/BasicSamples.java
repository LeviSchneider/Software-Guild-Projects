package com.tsg.programstatementsvariables;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author apprentice
 */
public class BasicSamples {
    public static void main(String[] args)
    {
        /*
        This is a main method
        we can have multi line comments here.
        */
            System.out.println("Print something here"/*something else*/);
            System.out.println("Test this as well");//this is a single line comment

//            System.out.println("Print something here");
//            System.out.println("Test this as well");
            
            boolean testBool = true;
            char testChar = 'Z';
            testChar = '\n';
             System.out.println("Sample String with \n sone new lines.");
             testChar = '\u1234';
             System.out.println("Unicode character here: " + testChar);
             
             double testDouble = 3.14;
             testDouble = 3.14E-89;
             testDouble = 3.14d;
             float testFloat = 3.141234f;
             
             //this is declaration and assignment
             int testInt = 189;
             //compiler would not allow me to make this assignment
             //testInt = 99999999999999999999999999;
             
             testInt = 0XFA3D;
             
             //this is exclusively declaring a variable
             long sampleDeclaration;
             //must have assignment 
             sampleDeclaration = 234324;
             System.out.println(sampleDeclaration);
             
    }
}
