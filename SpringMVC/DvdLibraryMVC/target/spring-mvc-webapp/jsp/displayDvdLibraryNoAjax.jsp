<%-- 
    Document   : home
    Created on : Mar 28, 2016, 5:31:34 PM
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
        <title>DVD Library</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet"/>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png"/>
    </head>
    <body>
        <div class="container">
            <h1>DVD Library</h1>

            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/home">Home</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/search">Search</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/stats">Stats</a>
                    </li>
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/displayDvdLibraryNoAjax">DVD Library (No Ajax)</a>
                    </li>
                </ul>
            </div>
            <div class="container">
                <h1>DVD Library</h1>
                <a href="displayNewDvdFormNoAjax">Add a DVD</a>
                <hr/>
                <c:forEach var="dvd" items="${dvdLibrary}">
                    <s:url value="deleteDvdNoAjax" var="deleteDvd_url">
                        <s:param name="dvdId" value="${dvd.dvdId}"/>
                    </s:url>
                    <s:url value="displayEditDvdFormNoAjax" var="editDvd_url">
                        <s:param name="dvdId" value="${dvd.dvdId}"/>
                    </s:url>
                    Title: ${dvd.title} |
                    <a href="${deleteDvd_url}">Delete</a> |
                    <a href="${editDvd_url}">Edit</a>
                    Director: ${dvd.director}<br/>
                    Studio: ${dvd.studio}<br/>
                    Ratings: ${dvd.ratings}<br/>
                    Release Date: ${dvd.releaseDate}<br/>
                    <hr/>
                </c:forEach>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
