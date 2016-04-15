<%-- 
    Document   : contactSummaryTableFragment
    Created on : Apr 7, 2016, 3:42:09 PM
    Author     : apprentice
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table id="contactTable" class="table table-hover">
            <tr>
                <th width="40%">Contact Name</th>
                <th width="30%">Company</th>
                <th width="15%"></th>
                <th width="15%"></th>
            </tr>
            <tbody id="contentRows"></tbody>
        </table>
    </body>
</html>
