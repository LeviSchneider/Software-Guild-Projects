/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.flooringmastery.consoleIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author apprentice
 */
@Aspect
public class AuditingInfo {
    
    private static final String DELIMITER = "::";
    public void AuditActivity(JoinPoint jp) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("timelog.txt"))) {
            writer.append(LocalDateTime.now() + DELIMITER);
            writer.flush();
        }
         System.out.println("++++++++++++++++++++++++++++");
         System.out.println(LocalDateTime.now());
         System.out.println("++++++++++++++++++++++++++++");
 }
}
