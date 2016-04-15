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
        <form class="form-horizontal" style="text-align: center" action='TipCalculatorServlet' method="POST">
            <br>
                <h2>Please enter your bill total to calculate it..<h2/>
                <input type="text" name="myBill" /><br/>
                <br>
                <input type="submit" class="btn btn-success" value="Calculate"/>
        </form>
    </body>
</html>
