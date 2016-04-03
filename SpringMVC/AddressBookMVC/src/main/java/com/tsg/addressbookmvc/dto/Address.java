/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.addressbookmvc.dto;

import java.util.Objects;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author apprentice
 */
public class Address {
    
    @NotEmpty(message="You must supply a value for Name")
    @Length(max=20, message="Name must be no more than 20 characters in length.")
    private String name;
    @NotEmpty(message="You must supply a value for State")
    @Length(max=20, message="State must be no more than 20 characters in length.")
    private String state;
    @NotEmpty(message="You must supply a value for City")
    @Length(max=20, message="City must be no more than 20 characters in length.")
    private String city;
    @NotEmpty(message="You must supply a value for Zip Code")
    @Length(max=5, message="Zip Code must be no more than 5 characters in length.")
    private String zipCode;
    @NotEmpty(message="You must supply a value for Street Address 1")
    @Length(max=20, message="Street Address 1 must be no more than 20 characters in length.")
    private String addressLine1;
    @NotEmpty(message="You must supply a value for Street Address 2")
    @Length(max=20, message="Street Address 2 must be no more than 20 characters in length.")
    private String addressLine2;
    private int addressId;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.state);
        hash = 37 * hash + Objects.hashCode(this.city);
        hash = 37 * hash + Objects.hashCode(this.zipCode);
        hash = 37 * hash + Objects.hashCode(this.addressLine1);
        hash = 37 * hash + Objects.hashCode(this.addressLine2);
        hash = 37 * hash + this.addressId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (this.addressId != other.addressId) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.zipCode, other.zipCode)) {
            return false;
        }
        if (!Objects.equals(this.addressLine1, other.addressLine1)) {
            return false;
        }
        if (!Objects.equals(this.addressLine2, other.addressLine2)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
}
