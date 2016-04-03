<%-- 
    Document   : InterestEntry
    Created on : Mar 27, 2016, 8:05:20 PM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
    </head>
    <body>
        <form class="form-horizontal" action='InterestServlet' method="POST">
            <br>
                <h2>How much money would you like to Invest?<h2/>
                <input type="text" name="myInvestment" /><br/>
                <br>
                <h2>How long would you like to invest it?<h2/>
                <input type="text" name="myTimeInvested" /><br/>
                <br>
                <h2>At what interest rate?<h2/>
                <input type="text" name="myInterestRate" /><br/>
                <br>
                <h2>Compounded at what interval? Daily(1) Monthly(2) Quarterly(3) Yearly(4)?<br>
                    Answer with the corresponding number please.<h2/>
                <input type="text" name="myCompoundRate" /><br/>
                <br>
                <input type="submit" class="btn btn-success" value="money"/>
        </form>
    </body>
</html>
