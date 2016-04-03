/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.floorcalculatormvc;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "FloorServlet", urlPatterns = {"/FloorServlet"})
public class FloorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FloorServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FloorServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("FloorEntry.jsp");
        rd.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String myWidth = request.getParameter("myWidth");
        String myLength = request.getParameter("myLength");
        String myProduct = request.getParameter("myProduct");
        
        float width = Float.parseFloat(myWidth);
        float length = Float.parseFloat(myLength);
        float matCost = 0;
        float labCost = 0;
        String materialPrice = "";
        String laborPrice = "";
        String totalPrice = "";
        
        switch(myProduct)
        {
            case "Wood":
                matCost =  matCost + (float)(width * length * 2.00);
                labCost = labCost + (float)(width * length * 1.25);
                break;
            case "Laminate":
                matCost =  matCost + (float)(width * length * 1.75);
                labCost = labCost + (float)(width * length * 1.50);
                break;
            case "Tile":
                matCost =  matCost + (float)(width * length * 2.25);
                labCost = labCost + (float)(width * length * 1.00);
                break;
            case "Carpet":
                matCost =  matCost + (float)(width * length * 1.50);
                labCost = labCost + (float)(width * length * 1.50);
                break;
        }
        materialPrice = materialPrice + "Material Cost: $" + matCost;
        laborPrice = laborPrice + "Labor cost: $" + labCost;
        totalPrice = totalPrice + "Total: $" + (matCost + labCost);
       
        request.setAttribute("materialPrice", materialPrice);
        request.setAttribute("laborPrice", laborPrice);
        request.setAttribute("totalPrice", totalPrice);
        RequestDispatcher rd = request.getRequestDispatcher("FloorResponse.jsp");
        rd.forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
