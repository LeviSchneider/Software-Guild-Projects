/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dvdlibrarymvc;

import com.tsg.dvdlibrarymvc.dao.DvdLibraryDao;
import com.tsg.dvdlibrarymvc.dao.SearchTerm;
import com.tsg.dvdlibrarymvc.dto.DVD;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author apprentice
 */
@Controller
public class SearchController {
    
    private final DvdLibraryDao dao;
    
    @Inject
    public SearchController(DvdLibraryDao dao)
    {
        this.dao = dao;
    }
    
    @RequestMapping(value="/search", method=RequestMethod.GET)
    public String displaySearchPage()
    {
        return "search";
    }
    
    @RequestMapping(value="search/dvds", method=RequestMethod.POST)
    @ResponseBody
    public List<DVD> searchDVDs(@RequestBody Map<String, String> searchMap){
        Map<SearchTerm, String> criteriaMap = new HashMap<>();
        
        String currentTerm = searchMap.get("title");
        if(!currentTerm.isEmpty())
        {
            criteriaMap.put(SearchTerm.TITLE, currentTerm);
        }
        currentTerm = searchMap.get("director");
        if(!currentTerm.isEmpty())
        {
            criteriaMap.put(SearchTerm.DIRECTOR, currentTerm);
        }
        currentTerm = searchMap.get("studio");
        if(!currentTerm.isEmpty())
        {
            criteriaMap.put(SearchTerm.STUDIO, currentTerm);
        }
        currentTerm = searchMap.get("ratings");
        if(!currentTerm.isEmpty())
        {
            criteriaMap.put(SearchTerm.RATINGS, currentTerm);
        }
        currentTerm = searchMap.get("release_date");
        if(!currentTerm.isEmpty())
        {
            criteriaMap.put(SearchTerm.RELEASE_DATE, currentTerm);
        }
        currentTerm = searchMap.get("notes");
        if(!currentTerm.isEmpty())
        {
            criteriaMap.put(SearchTerm.NOTES, currentTerm);
        }
        
        return dao.searchDVDs(criteriaMap);
    }
}
