/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.masterydependency.ui;

/**
 *
 * @author apprentice
 */
public interface ConsoleInterface {
    public int getAndReturnInt(String prompt);
    public int getAndReturnBoundInt(String prompt, int min, int max) throws Exception;
    public String getAndReturnString(String prompt);
    public Float getAndReturnFloat(String prompt);
    public Float getAndReturnBoundFloat(String prompt, float min, float max);
    public Double getAndReturnDouble(String prompt);
    public Double getAndReturnBoundDouble(String prompt, double min, double max);
    public void printString(String prompt);
    public boolean getIsValidResponse();
    public void setValid(boolean valid);
    public String getPrompt();
    public void setPrompt(String prompt);
    public void newTestForRange(int min, int max, String userInput) throws Exception;
}
