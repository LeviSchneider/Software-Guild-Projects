/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.olympianexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) {
        
        //ClassPathXmlApplicationContext allows us to access an attached xml file to provide a type and
        //elements to a specific class rather than constantly getting an setting different values.
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SkiJumper sj = (SkiJumper) ctx.getBean("superSkiJumper");
        
        sj.competeInEvent();
        
        
        Event skiJumpEvent = new SkiJumpEvent();
        Olympian olympianSkiJumper = new Olympian(skiJumpEvent);
        olympianSkiJumper.competeInEvent(); 
        
        
        //You can call the Olympian class as a parameter rather than a casting it to the Olympian type.
        Olympian usaSkiJumper = ctx.getBean("usaSkiJumper", Olympian.class);
        usaSkiJumper.competeInEvent();
        
        Olympian usaSpeedSkater = ctx.getBean("usaSpeedSkater", Olympian.class);
        usaSpeedSkater.competeInEvent();
        
        Olympian canadianSpeedSkater = ctx.getBean("canadaSpeedSkater", Olympian.class);
        canadianSpeedSkater.competeInEvent();
    }
}
