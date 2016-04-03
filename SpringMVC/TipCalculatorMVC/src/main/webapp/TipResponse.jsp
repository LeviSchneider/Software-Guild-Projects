<%-- 
    Document   : InterestResponse
    Created on : Mar 27, 2016, 8:06:07 PM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tip Calculator</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container-fluid" style="text-align: center">
            <h1>This is your total</h1>
            <br>
            <h2>${messageBill}</h2><br/>
            <h2>${tipPercent}</h2><br/>
            <h2>${messageTip}</h2><br/>
            <h2>${totalBill}</h2><br/>
            <h2><a href="TipEntry.jsp">Return</a></h2>
        </div>
    </body>
</html>
