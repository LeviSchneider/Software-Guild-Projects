/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.lambdagroupbysample;

/**
 *
 * @author apprentice
 */
public class Sample {
    
    private String location;
    private String timeOfDay;
    private Integer sampleSize;
    private Double sampleReading;
    private String collectedBy;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public Integer getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(Integer sampleSize) {
        this.sampleSize = sampleSize;
    }

    public Double getSampleReading() {
        return sampleReading;
    }

    public void setSampleReading(Double sampleReading) {
        this.sampleReading = sampleReading;
    }

    public String getCollectedBy() {
        return collectedBy;
    }

    public void setCollectedBy(String collectedBy) {
        this.collectedBy = collectedBy;
    }
    
}
