/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dvdlibrarymvc;

import com.tsg.dvdlibrarymvc.dao.DvdLibraryDao;
import com.tsg.dvdlibrarymvc.dto.DVD;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
public class HomeControllerNoAjax {

    private final DvdLibraryDao dao;
    
    @Inject
    public HomeControllerNoAjax(DvdLibraryDao dao)
    {
        this.dao = dao;
    }
    
    @RequestMapping(value="/displayDvdLibraryNoAjax", method=RequestMethod.GET)
    public String displayDvdLibraryNoAjax(Model model)
    {
        List<DVD> dList = dao.getAllDVDs();
        model.addAttribute("dvdLibrary", dList);
        return "displayDvdLibraryNoAjax";
    }
    
    @RequestMapping(value="/displayNewDvdFormNoAjax", method=RequestMethod.GET)
    public String displayNewDvdFormNoAjax()
    {
        return "newDvdFormNoAjax";
    }
    
    @RequestMapping(value="/addNewDvdNoAjax", method=RequestMethod.POST)
    public String addNewDvdNoAjax(HttpServletRequest req)
    {
        String title = req.getParameter("title");
        String director = req.getParameter("director");
        String studio = req.getParameter("studio");
        String ratings = req.getParameter("ratings");
        String notes = req.getParameter("notes");
        String releaseDate = req.getParameter("releaseDate");
        
        DVD dvd = new DVD();
        dvd.setTitle(title);
        dvd.setDirector(director);
        dvd.setStudio(studio);
        dvd.setRatings(ratings);
        dvd.setNotes(notes);
        dvd.setReleaseDate(releaseDate);
        
        dao.addDVD(dvd);
                
        return "redirect:displayDvdLibraryNoAjax";
    }
    
    @RequestMapping(value="/deleteDvdNoAjax", method=RequestMethod.GET)
    public String deleteDvdNoAjax(HttpServletRequest req)
    {
        int dvdId = Integer.parseInt(req.getParameter("dvdId"));
        dao.removeDVD(dvdId);
        
        return "redirect:displayDvdLibraryNoAjax";
    }
    
    @RequestMapping(value="/displayEditDvdFormNoAjax", method=RequestMethod.GET)
    public String displayEditDvdFormNoAjax(HttpServletRequest req, Model model)
    {
        int dvdId = Integer.parseInt(req.getParameter("dvdId"));
        DVD dvd = dao.getDVDById(dvdId);
        model.addAttribute("dvd", dvd);
        
        return "editDvdFormNoAjax";
    }
    
    @RequestMapping(value="/editDvdFormNoAjax", method=RequestMethod.POST)
    public String editDvdFormNoAjax(@Valid @ModelAttribute("dvd") DVD dvd,
            BindingResult result)
    {
        if(result.hasErrors())
        {
            return "editDvdFormNoAjax";
        }
        dao.updateDVD(dvd);
        
        return "redirect:displayDvdLibraryNoAjax";
    }
}
