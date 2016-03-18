/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.lambdagroupbysample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {
        List<Sample> samples = new ArrayList<>();
        Sample sample = new Sample();

        sample.setCollectedBy("Arthur Dent");
        sample.setLocation("basement");
        sample.setSampleReading(123.456);
        sample.setSampleSize(20);
        sample.setTimeOfDay("morning");

        samples.add(sample);

        sample = new Sample();
        sample.setCollectedBy("Ford Prefect");
        sample.setLocation("basement");
        sample.setSampleReading(43.21);
        sample.setSampleSize(23);
        sample.setTimeOfDay("morning");

        samples.add(sample);

        sample = new Sample();
        sample.setCollectedBy("Ford Prefect");
        sample.setLocation("garage");
        sample.setSampleReading(123.456);
        sample.setSampleSize(42);
        sample.setTimeOfDay("afternoon");

        samples.add(sample);

        sample = new Sample();
        sample.setCollectedBy("Arthur Dent");
        sample.setLocation("basement");
        sample.setSampleReading(123.456);
        sample.setSampleSize(51);
        sample.setTimeOfDay("evening");

        samples.add(sample);
        
        sample = new Sample();
        sample.setCollectedBy("Trisha McMillan");
        sample.setLocation("garage");
        sample.setSampleReading(123.456);
        sample.setSampleSize(19);
        sample.setTimeOfDay("morning");

        samples.add(sample);

        sample = new Sample();
        sample.setCollectedBy("Ford Prefect");
        sample.setLocation("first floor");
        sample.setSampleReading(24.53);
        sample.setSampleSize(13);
        sample.setTimeOfDay("evening");

        samples.add(sample);

        sample = new Sample();
        sample.setCollectedBy("Trisha McMillan");
        sample.setLocation("basement");
        sample.setSampleReading(12.345);
        sample.setSampleSize(98);
        sample.setTimeOfDay("evening");
        
        Map<String, List<Sample>> basementSamplesGroupedByPerson = samples.stream()
                .filter(smpl -> smpl.getLocation().equalsIgnoreCase("basement"))
                .collect(Collectors.groupingBy(s -> s.getCollectedBy()));
         
        for(String person: basementSamplesGroupedByPerson.keySet())
        {
            System.out.println("Collected by: " + person);
            
            basementSamplesGroupedByPerson.get(person).stream()
                    .forEach(s -> System.out.println("Sample reading: " + s.getSampleReading() + " in the " + s.getTimeOfDay()));
        }
        
    }
}



















