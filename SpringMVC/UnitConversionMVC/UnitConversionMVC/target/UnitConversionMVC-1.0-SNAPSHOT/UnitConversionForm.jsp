<%-- 
    Document   : UnitEntry
    Created on : Mar 29, 2016, 1:03:16 PM
    Author     : apprentice
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/customStyle.css"/>
    </head>
    <body>
        <div class="container">
            <h1>Hello World!</h1>
            <form class="form-horizontal" style="text-align: center" action="UnitConverter" method="POST">
                <div class="form-group">
                    <label for="sel1">Unit Type</label>
                    <input type="select" name="unitType">
                    <c:forEach var="ut" items="${model.unitTypes}">
                        <option value="${ut.unitCode}">${ut.name}</option>
                    </c:forEach>
                    </input>
                </div>
            </form>
        </div>
    </body>
</html>
