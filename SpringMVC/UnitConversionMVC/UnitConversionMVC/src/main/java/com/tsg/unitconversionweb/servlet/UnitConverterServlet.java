/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unitconversionweb.servlet;

import com.tsg.unitconversionweb.model.UnitConversionModel;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
@WebServlet(name = "UnitConversionServlet", urlPatterns = {"/UnitConverter"})
public class UnitConverterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("UnitConversionForm.jsp");
        request.setAttribute("model", new UnitConversionModel() );
        rd.forward(request, response);
    }
}
