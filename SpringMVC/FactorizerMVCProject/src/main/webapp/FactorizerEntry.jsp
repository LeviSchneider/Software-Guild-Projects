<%-- 
    Document   : FactorizerEntry
    Created on : Mar 27, 2016, 2:39:05 PM
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
        <div class="container-fluid">
            <h1>The Factorizer!</h1>
            <br>
            <form class="form-horizontal" action='FactorizerServlet' method="POST">
                <h2>What number do you want factorized?<h2/>
                <br>
                <input type="text" name="myInput" /><br/>
                <br>
                <input type="submit" class="btn btn-success" value="input"/>
            </form>
        </div>
    </body>
</html>
