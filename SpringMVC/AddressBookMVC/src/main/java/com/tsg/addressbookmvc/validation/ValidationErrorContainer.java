/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.addressbookmvc.validation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class ValidationErrorContainer {
    private List<ValidationErrors> validationErrors = new ArrayList<>();
    
    public void addValidationError(String field, String message)
    {
        ValidationErrors error = new ValidationErrors(field, message);
        validationErrors.add(error);
    }
    
    public List<ValidationErrors> getFieldErrors()
    {
        return validationErrors;
    }
}
