/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.factorizermvcproject;

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
@WebServlet(name = "FactorizerServlet", urlPatterns = {"/FactorizerServlet"})
public class FactorizerServlet extends HttpServlet {

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
            out.println("<title>Servlet FactorizerServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FactorizerServlet at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher rd = request.getRequestDispatcher("FactorizerEntry.jsp");
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
        String myInput = request.getParameter("myInput");
        int factorNumber;
        int perfectMatch = 0;
        int initialInput = Integer.parseInt(myInput);
        String message = "";
        String message2 = "";
        String numbers = "";
        //prints out factors
        System.out.println("The factors of " + initialInput + " are:");
        for (factorNumber = 1; factorNumber <= initialInput; factorNumber++) {
            if (initialInput % factorNumber == 0) {
                numbers = numbers + "\n" + Integer.toString(factorNumber);
            }
        }

        //checks for a perfect number
        for (factorNumber = 1; factorNumber < initialInput; factorNumber++) {
            if (initialInput % factorNumber == 0) {
                perfectMatch = perfectMatch + factorNumber;
            }
        }

        //prints if perfect
        if (initialInput == perfectMatch) {
            message = initialInput + " is a perfect number.";
        } else {
            message = initialInput + " is not a perfect number.";

        }

        //checks for prime number
        int primeCheck = 0;
        for (factorNumber = 2; factorNumber < initialInput; factorNumber++) {
            if (initialInput % factorNumber == 0) {
                primeCheck = primeCheck + 1;
            }
            //This if statement prints if the numbers prime or not.      
        }
        if (primeCheck > 0) {
            message2 = initialInput + " is not a prime number.";
        }
        if (primeCheck == 0) {
            message2 = initialInput + " is a prime number.";

        }
        request.setAttribute("numbers", numbers);
        request.setAttribute("message", message);
        request.setAttribute("message2", message2);
        RequestDispatcher rd = request.getRequestDispatcher("FactorizerResponse.jsp");
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
