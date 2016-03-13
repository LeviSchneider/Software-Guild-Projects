/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.junitexamples;

import static java.lang.Math.abs;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class JUnitConditional {
    
    void run() {
        System.out.println(MissingChar("kitten", 3));
    }

    /*We have two children, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble. 

AreWeInTrouble(true, true) -> true
AreWeInTrouble(false, false) -> true
AreWeInTrouble(true, false) -> false
     */
    public boolean AreWeInTrouble(boolean aSmile, boolean bSmile) {
        boolean trouble = true;
        if (aSmile == bSmile) {
            trouble = true;
        } else {
            trouble = false;
        }
        return trouble;
    }

    /*The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. 

sleepIn(false, false) -> true
sleepIn(true, false) -> false
sleepIn(false, true) -> true
     */
    public boolean CanSleepIn(boolean isWeekday, boolean isVacation) {
        boolean canSleep = true;
        if (isWeekday == false && isVacation == false) {
            canSleep = true;
        } else if (isWeekday == true) {
            canSleep = false;
        } else if (isWeekday == false && isVacation == true) {
            canSleep = true;
        }

        return canSleep;
    }

    /*Given two int values, return their sum. However, if the two values are the same, then return double their sum. 

SumDouble(1, 2) -> 3
SumDouble(3, 2) -> 5
SumDouble(2, 2) -> 8
     */
    public int SumDouble(int a, int b) {
        int sum = 0;

        if (a == b) {
            sum = 2 * (a + b);
        } else {
            sum = a + b;
        }
        return sum;
    }

//    Given an int n, return the absolute value of the difference between n and 21, except return double the absolute value of the difference if n is over 21. 
//
//Diff21(23) -> 4
//Diff21(10) -> 11
//Diff21(21) -> 0
    public int Diff21(int n) {
        int value = 21 - n;

        return Math.abs(value);
    }

//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble. 
//
//ParrotTrouble(true, 6) -> true
//ParrotTrouble(true, 7) -> false
//ParrotTrouble(false, 6) -> false
    public boolean ParrotTrouble(boolean isTalking, int hour) {
        boolean trouble = true;
        if (isTalking == true && hour < 7) {
            trouble = true;
        } else if (isTalking == true && hour > 20) {
            trouble = true;
        } else {
            trouble = false;
        }
        return trouble;
    }

//Given two ints, a and b, return true if one if them is 10 or if their sum is 10. 
//
//Makes10(9, 10) -> true
//Makes10(9, 9) -> false
//Makes10(1, 9) -> true
    public boolean Makes10(int a, int b) {
        int sum = a + b;
        boolean fact = true;
        if (sum == 10 || a == 10 || b == 10) {
            fact = true;
        } else {
            fact = false;
        }
        return fact;
    }

//Given an int n, return true if it is within 10 of 100 or 200.
//Hint: Check out the C# Math class for absolute value
//
//NearHundred(103) -> true
//NearHundred(90) -> true
//NearHundred(89) -> false
    public boolean NearHundred(int n) {
        boolean fact;
        if (n > 89 && n < 111) {
            fact = true;
        } else if (n > 189 && n < 211) {
            fact = true;
        } else {
            fact = false;
        }
        return fact;
    }

//Given two int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative. 
//
//PosNeg(1, -1, false) -> true
//PosNeg(-1, 1, false) -> true
//PosNeg(-4, -5, true) -> true
    public boolean PosNeg(int a, int b, boolean negative) {
        boolean fact = true;
        if ((Math.abs(a) + a) == 0 && (Math.abs(b) + b) == (2 * b) && negative == false) {
            fact = true;
        } else if ((Math.abs(a) + a) == (2 * a) && (Math.abs(b) + b) == 0 && negative == false) {
            fact = true;
        } else if ((Math.abs(a) + a) == 0 && (Math.abs(b) + b) == 0 && negative == true) {
            fact = true;
        } else {
            fact = false;
        }
        return fact;
    }

//Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged.
//
//Hint: Look up how to use "SubString" in c#
//
//NotString("candy") -> "not candy"
//NotString("x") -> "not x"
//NotString("not bad") -> "not bad"
    public String NotString(String s) {
        String something = "";
        if (s.contains("not")) {
            something = s;
        } else {
            something = "not " + s;
        }
        return something;
    }

//Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (Don't check for bad index). 
//
//MissingChar("kitten", 1) -> "ktten"
//MissingChar("kitten", 0) -> "itten"
//MissingChar("kitten", 4) -> "kittn"
    public String MissingChar(String str, int n) {
        StringBuilder word = new StringBuilder(str);
        word.deleteCharAt(n);
        String newStr = new String(word);
        return newStr;
    }

//Given a string, return a new string where the first and last chars have been exchanged. 
//
//FrontBack("code") -> "eodc"
//FrontBack("a") -> "a"
//FrontBack("ab") -> "ba"
    public String FrontBack(String str) {
        char[] c = str.toCharArray();
        
        char temp = c[c.length - 1];
        c[c.length - 1] = c[0];
        c[0] = temp;
        
        String swappedStr = new String(c);
        return swappedStr;
    }

//Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front. 
//
//Front3("Microsoft") -> "MicMicMic"
//Front3("Chocolate") -> "ChoChoCho"
//Front3("at") -> "atatat"
    public String Front3(String str) {
        String something = str.substring(0, 3);
        something = something + something + something;
        return something;
    }

//Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more. 
//
//BackAround("cat") -> "tcatt"
//BackAround("Hello") -> "oHelloo"
//BackAround("a") -> "aaa"
    public String BackAround(String str) {
        String something = str.substring(str.length() - 1) + str + str.substring(str.length() -1);
        return something;
    }

//Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
//
//Multiple3or5(3) -> true
//Multiple3or5(10) -> true
//Multiple3or5(8) -> false
    public boolean Multiple3or5(int number) {
        boolean fact = true;
        if ((number % 3) == 0 || (number % 5) == 0) {
            fact = true;
        } else {
            fact = false;
        }

        return fact;
    }

//Given a string, return true if the string starts with "hi" and false otherwise. 
//
//StartHi("hi there") -> true
//StartHi("hi") -> true
//StartHi("high up") -> false
    public boolean StartHi(String str) {
        boolean fact = true;
        if (str.contains("hi")) {
            if(str.equals("hi"))
            {
                fact = true;
            }else if(str.contains("hi "))
            {
                fact = true;
            }else
            {
                fact = false;
            }
        } else
        {
            fact = false;
        }
        return fact;
    }

//Given two temperatures, return true if one is less than 0 and the other is greater than 100. 
//
//IcyHot(120, -1) -> true
//IcyHot(-1, 120) -> true
//IcyHot(2, 120) -> false
    public boolean IcyHot(int temp1, int temp2) {
        boolean fact = true;

        if (temp1 < 0 && temp2 > 100) {
            fact = true;
        } else if (temp1 > 100 && temp2 < 0) {
            fact = true;
        } else {
            fact = false;
        }

        return fact;
    }

//Given 2 int values, return true if either of them is in the range 10..20 inclusive. 
//
//Between10and20(12, 99) -> true
//Between10and20(21, 12) -> true
//Between10and20(8, 99) -> false
    public boolean Between10and20(int a, int b) {
        boolean fact = true;
        if ((a > 10 && a < 20) || (b > 10 && b < 20)) {
            fact = true;
        } else {
            fact = false;
        }

        return fact;
    }

//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen. 
//
//HasTeen(13, 20, 10) -> true
//HasTeen(20, 19, 10) -> true
//HasTeen(20, 10, 12) -> false
    public boolean HasTeen(int a, int b, int c) {
        boolean fact = true;
        if ((a > 12 && a < 20) || (b < 13 && b < 20) || (c > 12 && c < 20)) {
            fact = true;
        } else {
            fact = false;
        }
        return fact;
    }

//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both. 
//
//SoAlone(13, 99) -> true
//SoAlone(21, 19) -> true
//SoAlone(13, 13) -> false
    public boolean SoAlone(int a, int b) {
        boolean fact = true;
        
        if (a > 12 && a < 20) {
            if(b < 13 && b > 19)
            {
                fact = true;
            }else if(b > 12 && b < 20)
            {
                fact = false;
            }
        } else if(b > 12 && b < 20)
        {
            if(a < 13 && a > 19)
            {
                fact = true;
            }
        }
        return fact;
    }

//Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged. 
//
//RemoveDel("adelbc") -> "abc"
//RemoveDel("adelHello") -> "aHello"
//RemoveDel("adedbc") -> "adedbc"
    public String RemoveDel(String str) {
        String word = str.replaceAll("del", "");
        return word;
    }

//Return true if the given string begins with "*ix", the '*' can be anything, so "pix", "9ix" .. all count. 
//
//IxStart("mix snacks") -> true
//IxStart("pix snacks") -> true
//IxStart("piz snacks") -> false
    public boolean IxStart(String str) {
        boolean fact = true;
        if (str.contains("ix")) {
            fact = true;
        } else {
            fact = false;
        }
        return fact;
    }

//Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz". 
//
//StartOz("ozymandias") -> "oz"
//StartOz("bzoo") -> "z"
//StartOz("oxx") -> "o"
    public String StartOz(String str) {
        String line;
        int line2 = str.indexOf("o");
        String that;
        that = Integer.toString(line2);
        if (str.indexOf("o") == 0 && str.indexOf("z") == 1) {
            line = "oz";
        } else if (str.indexOf("o") == 0) {
            line = "o";
        } else if (str.indexOf("z") == 1) {
            line = "z";
        } else {
            line = "";
        }
        return line;
    }

//Given three int values, a b c, return the largest. 
//
//Max(1, 2, 3) -> 3
//Max(1, 3, 2) -> 3
//Max(3, 2, 1) -> 3
    public int Max(int a, int b, int c) {
        int num = 0;
        if (a > b && a > c) {
            num = a;
        } else if (b > a && b > c) {
            num = b;
        } else if (c > a && c > b) {
            num = c;
        }
        return num;
    }

//Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
//
//Closer(8, 13) -> 8
//Closer(13, 8) -> 8
//Closer(13, 7) -> 0
    public int Closer(int a, int b) {
        int num = 0;
        if (abs(10 - a) < abs(10 - b)) {
            num = a;
        } else if (abs(10 - b) < abs(10 - a)) {
            num = b;
        }
        return num;
    }

//Return true if the given string contains between 1 and 3 'e' chars. 
//
//GotE("Hello") -> true
//GotE("Heelle") -> true
//GotE("Heelele") -> false
    public boolean GotE(String str) {
        boolean fact = true;
        if (str.indexOf("e") > 0 && str.lastIndexOf("e") < 4) {
            fact = true;
        } else {
            fact = false;
        }
        return fact;
    }

//Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. 
//
//EndUp("Hello") -> "HeLLO"
//EndUp("hi there") -> "hi thERE"
//EndUp("hi") -> "HI"
    public String EndUp(String str) {
        String right = str;
        String line1 = str.substring(str.length() - 3);
        String line2 = str.substring(str.length() - 2);
        String line3 = str.substring(str.length() - 1);
        String right1 = line1 + line2 + line3;
        String line = right.replaceAll(str.substring(str.length() - 3), line1.toUpperCase());
        
        return line;
    }

//Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more. 
//
//EveryNth("Miracle", 2) -> "Mrce"
//EveryNth("abcdefg", 2) -> "aceg"
//EveryNth("abcdefg", 3) -> "adg"
    public String EveryNth(String str, int n) {
        String line = "";
        String empty = "";
        for(int i = 0;i < n;i++)
        {
           line = str.replaceAll(str.substring(str.length() - (1 + i)), empty);
        }
        return line;
    }

    private void printOut() {


    }
}
