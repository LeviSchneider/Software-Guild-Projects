/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.interestratemvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
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
@WebServlet(name = "InterestServlet", urlPatterns = {"/InterestServlet"})
public class InterestServlet extends HttpServlet {

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
            out.println("<title>Servlet InterestServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InterestServlet at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher rd = request.getRequestDispatcher("InterestEntry.jsp");
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
        String myInvestment = request.getParameter("myInvestment");
        String myInterestRate = request.getParameter("myInterestRate");
        String myCompoundRate = request.getParameter("myCompoundRate");
        String myTimeInvested = request.getParameter("myTimeInvested");
        
        String message = "";
        float annualInterest = Float.parseFloat(myInterestRate);
        float principal = Float.parseFloat(myInvestment);
        float principalAtStartOfYear = 0;
        float compoundRate;
        float yearsToInvest = Float.parseFloat(myTimeInvested);
        int compoundingInterval = Integer.parseInt(myCompoundRate);
        int reportInterval;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        
//        System.out.println("How much do you want to invest?");
//        principal = sc.nextFloat();
//
//        System.out.println("What is the annual interest rate?");
//        annualInterest = sc.nextFloat();
//
//        System.out.println("How often do you want interest rate to compound?\n(1)Daily (2)Monthly (3)Quarterly (4)Annually");
//        compoundingInterval = sc.nextInt();
//
//        System.out.println("How many years would you like us to hold your money?");
//        yearsToInvest = sc.nextInt();

        switch (compoundingInterval) { //aware that we repeat ourselves a lot here, but hard to read when condensed
            case 1:
                yearsToInvest *= 365;
                compoundRate = 1 + ((annualInterest / 365) / 100);
                reportInterval = 365;
                break;
            case 2:
                yearsToInvest *= 12;
                compoundRate = 1 + ((annualInterest / 12) / 100);
                reportInterval = 12;
                break;
            case 3:
                yearsToInvest *= 4;
                compoundRate = 1 + ((annualInterest / 4) / 100);
                reportInterval = 4;
                break;
            default:
                compoundRate = 1 + (annualInterest / 100);
                reportInterval = 1;
                break;

        }

        for (int i = 0; i < yearsToInvest;) {
            if (i % reportInterval == 0) {
                principalAtStartOfYear = principal;
                System.out.println("Principal at start of year:\t$" + df.format(principal));
            }
            i++;
            principal *= compoundRate;
            if (i % reportInterval == 0) {
                message = message + "Principal end at year " + (i / reportInterval) + ":\t$" + df.format(principal);
                message = message + "\nInterest earned this year:\t$" + df.format(principal - principalAtStartOfYear) + "\n";
            }

        }
        message = message + "\nFinal return is:\t\t$" + df.format(principal);
        
        request.setAttribute("message", message);
        RequestDispatcher rd = request.getRequestDispatcher("InterestResponse.jsp");
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
