/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.addressbookmvc.validation;

/**
 *
 * @author apprentice
 */
public class ValidationErrors {
    private String fieldName;
    private String message;
    
    public ValidationErrors(String fieldName, String message)
    {
        this.fieldName = fieldName;
        this.message = message;
    }
    
    public String getFieldName()
    {
        return fieldName;
    }
    
    public String getMessage()
    {
        return message;
    }
}
