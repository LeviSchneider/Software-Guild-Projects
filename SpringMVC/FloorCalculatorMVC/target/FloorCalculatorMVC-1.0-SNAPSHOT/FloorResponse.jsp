<%-- 
    Document   : FloorResponse
    Created on : Mar 28, 2016, 10:49:11 AM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Floor Calculator</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container-fluid" style="text-align: center">
            <h1>Here is your Estimate</h1><br/>
            <h2>${materialPrice}</h2><br/>
            <h2>${laborPrice}</h2><br/>
            <h2>${totalPrice}</h2><br/>
            <h2><a href="FloorEntry.jsp">Play Again</a></h2>
        </div>
    </body>
</html>
