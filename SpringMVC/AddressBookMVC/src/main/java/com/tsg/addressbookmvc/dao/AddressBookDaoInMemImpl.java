/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.addressbookmvc.dao;

import com.tsg.addressbookmvc.dto.Address;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class AddressBookDaoInMemImpl implements AddressBookDao{

    private Map<Integer, Address> addressMap = new HashMap<>();
    private static int addressIdCounter = 0;
    
    @Override
    public Address addAddress(Address address) {
        address.setAddressId(addressIdCounter);
        addressIdCounter++;
        addressMap.put(address.getAddressId(), address);
        return address;
    }

    @Override
    public void removeAddress(int addressId) {
        addressMap.remove(addressId);
    }

    @Override
    public void updateAddress(Address address) {
        addressMap.put(address.getAddressId(), address);
    }

    @Override
    public List<Address> getAllAddresses() {
        Collection<Address> c = addressMap.values();
        return new ArrayList(c);
    }

    @Override
    public Address getAddressById(int addressId) {
        return addressMap.get(addressId);
    }

    @Override
    public List<Address> searchAddresses(Map<SearchTerm, String> criteria) {
        String nameCriteria = criteria.get(SearchTerm.NAME);
        String stateCriteria = criteria.get(SearchTerm.STATE);
        String cityCriteria = criteria.get(SearchTerm.CITY);
        String addressLine1Criteria = criteria.get(SearchTerm.ADDRESS_LINE_1);
        String addressLine2Criteria = criteria.get(SearchTerm.ADDRESS_LINE_2);
        String zipCodeCriteria = criteria.get(SearchTerm.ZIP_CODE);
        
        Predicate<Address> nameMatches;
        Predicate<Address> stateMatches;
        Predicate<Address> cityMatches;
        Predicate<Address> addressLine1Matches;
        Predicate<Address> addressLine2Matches;
        Predicate<Address> zipCodeMatches;
        
        Predicate<Address> truePredicate = (c) -> {return true;};
        
        nameMatches = (nameCriteria == null || nameCriteria.isEmpty())? truePredicate: (c) -> c.getName().equals(nameCriteria);
        stateMatches = (stateCriteria == null || stateCriteria.isEmpty())? truePredicate: (c) -> c.getState().equals(stateCriteria);
        cityMatches = (cityCriteria == null || cityCriteria.isEmpty())? truePredicate: (c) -> c.getCity().equals(cityCriteria);
        addressLine1Matches = (addressLine1Criteria == null || addressLine1Criteria.isEmpty())? truePredicate: (c) -> c.getAddressLine1().equals(addressLine1Criteria);
        addressLine2Matches = (addressLine2Criteria == null || addressLine2Criteria.isEmpty())? truePredicate: (c) -> c.getAddressLine2().equals(addressLine2Criteria);
        zipCodeMatches = (zipCodeCriteria == null || zipCodeCriteria.isEmpty())? truePredicate: (c) -> c.getZipCode().equals(zipCodeCriteria);
        
        return addressMap.values().stream()
                .filter(nameMatches
                    .and(stateMatches)
                    .and(cityMatches)
                    .and(addressLine1Matches)
                    .and(addressLine2Matches)
                    .and(zipCodeMatches))
                .collect(Collectors.toList());
    }
    
}
