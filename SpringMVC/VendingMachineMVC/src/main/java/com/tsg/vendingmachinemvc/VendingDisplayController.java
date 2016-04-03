/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.vendingmachinemvc;

import com.tsg.vendingmachinemvc.dao.VendingMachineDAO;
import com.tsg.vendingmachinemvc.dto.Item;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
public class VendingDisplayController {

    private final VendingMachineDAO dao;
    
    @Inject
    public VendingDisplayController(VendingMachineDAO dao)
    {
        this.dao = dao;
    }
    
    @RequestMapping(value={"/displayVendingItems"}, method=RequestMethod.GET)
    public String displayVendingItems(Model model)
    {
        List<Item> itemList = dao.getAllItems();
        model.addAttribute("inventory", itemList);
        model.addAttribute("snickers", itemList.get(0));
        model.addAttribute("mms", itemList.get(1));
        model.addAttribute("milkyWay", itemList.get(2));
        return "displayVendingItems";
    }
    
    @RequestMapping(value="/vendItem", method=RequestMethod.POST)
    public String vendItem(HttpServletRequest req)
    {
        String change = req.getParameter("change");
        String item = req.getParameter("item");
        
        double realChange = Double.parseDouble(change);
        int realItem = Integer.parseInt(item);
        
        Item newItem = new Item();
        newItem.setIndex(realItem);
        newItem.setItemName(dao.getItemById(realItem).getItemName());
        newItem.setAmountLeft(dao.getItemById(realItem).getAmountLeft()-1);
        newItem.setItemCost(dao.getItemById(realItem).getItemCost());
        dao.updateItem(newItem);
        
        return "redirect:displayVendingItems";
    }
}
