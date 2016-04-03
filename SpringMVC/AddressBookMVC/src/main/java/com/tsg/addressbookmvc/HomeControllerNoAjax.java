/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.addressbookmvc;

import com.tsg.addressbookmvc.dao.AddressBookDao;
import com.tsg.addressbookmvc.dto.Address;
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

    private final AddressBookDao dao;
    
    @Inject
    public HomeControllerNoAjax(AddressBookDao dao)
    {
        this.dao = dao;
    }
    @RequestMapping(value="/displayAddressBookNoAjax", method=RequestMethod.GET)
    public String displayAddressBookNoAjax(Model model)
    {
        List<Address> aList = dao.getAllAddresses();
        model.addAttribute("addressBook", aList);
        return "displayAddressBookNoAjax";
    }
    
    @RequestMapping(value="/displayNewAddressFormNoAjax", method=RequestMethod.GET)
    public String displayNewContactFormNoAjax()
    {
        return "newAddressFormNoAjax";
    }
    
    @RequestMapping(value="/addNewAddressNoAjax", method=RequestMethod.POST)
    public String addNewAddressNoAjax(HttpServletRequest req)
    {
        String name = req.getParameter("name");
        String state = req.getParameter("state");
        String city = req.getParameter("city");
        String addressLine1 = req.getParameter("addressLine1");
        String addressLine2 = req.getParameter("addressLine2");
        String zipCode = req.getParameter("zipCode");
        
        Address address = new Address();
        address.setName(name);
        address.setState(state);
        address.setCity(city);
        address.setAddressLine1(addressLine1);
        address.setAddressLine2(addressLine2);
        address.setZipCode(zipCode);
        
        dao.addAddress(address);
        
        return "redirect:displayAddressBookNoAjax";
    }
    
    @RequestMapping(value="/deleteAddressNoAjax", method=RequestMethod.GET)
    public String deleteAddressNoAjax(HttpServletRequest req)
    {
        int addressId = Integer.parseInt(req.getParameter("addressId"));
        
        dao.removeAddress(addressId);
        
        return "redirect:displayAddressBookNoAjax";
    }
    
    @RequestMapping(value="/displayEditAddressFormNoAjax", method=RequestMethod.GET)
    public String displayEditAddressFormNoAjax(HttpServletRequest req, Model model)
    {
        int addressId = Integer.parseInt(req.getParameter("addressId"));
        Address address = dao.getAddressById(addressId);
        model.addAttribute("address", address);
        
        return "editAddressFormNoAjax";
    }
    
    @RequestMapping(value="/editAddressFormNoAjax", method=RequestMethod.POST)
    public String editAddressFormNoAjax(@Valid @ModelAttribute("address") Address address,
            BindingResult result)
    {
        if(result.hasErrors())
        {
            return "editAddressFormNoAjax";
        }
        
        dao.updateAddress(address);
        
        return "redirect:displayAddressBookNoAjax";
    }
}
