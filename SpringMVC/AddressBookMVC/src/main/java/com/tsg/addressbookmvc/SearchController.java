/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.addressbookmvc;

import com.tsg.addressbookmvc.dao.AddressBookDao;
import com.tsg.addressbookmvc.dao.SearchTerm;
import com.tsg.addressbookmvc.dto.Address;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
public class SearchController {
    
    private final AddressBookDao dao;
    
    @Inject
    public SearchController(AddressBookDao dao)
    {
        this.dao = dao;
    }
    
    @RequestMapping(value="/search", method=RequestMethod.GET)
    public String displaySearchPage()
    {
        return "search";
    }
    
    @RequestMapping(value = "/search/addresses", method=RequestMethod.GET)
    public List<Address> searchAddresses(@RequestBody Map<String, String> searchMap)
    {
        Map<SearchTerm, String> criteriaMap = new HashMap<>();
        
        String currentTerm = searchMap.get("name");
        if(!currentTerm.isEmpty())
        {
            criteriaMap.put(SearchTerm.NAME, currentTerm);
        }
        currentTerm = searchMap.get("addressLine1");
        if(!currentTerm.isEmpty())
        {
            criteriaMap.put(SearchTerm.ADDRESS_LINE_1, currentTerm);
        }
        currentTerm = searchMap.get("addressLine2");
        if(!currentTerm.isEmpty())
        {
            criteriaMap.put(SearchTerm.ADDRESS_LINE_2, currentTerm);
        }
        currentTerm = searchMap.get("city");
        if(!currentTerm.isEmpty())
        {
            criteriaMap.put(SearchTerm.CITY, currentTerm);
        }
        currentTerm = searchMap.get("state");
        if(!currentTerm.isEmpty())
        {
            criteriaMap.put(SearchTerm.STATE, currentTerm);
        }
        currentTerm = searchMap.get("zipCode");
        if(!currentTerm.isEmpty())
        {
            criteriaMap.put(SearchTerm.ZIP_CODE, currentTerm);
        }
        return dao.searchAddresses(criteriaMap);
    }
}
