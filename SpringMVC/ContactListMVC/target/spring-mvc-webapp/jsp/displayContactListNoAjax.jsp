<%-- 
    Document   : home
    Created on : Mar 28, 2016, 1:16:13 PM
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
        <title>Company Contacts</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet"/>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png"/>
    </head>
    <body>
        <div class="container">
            <h1>Company Contacts</h1>

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
                        <a href="${pageContext.request.contextPath}/displayContactListNoAjax">Contact List (No Ajax)</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="container">
            <h1>Company Contacts</h1>
            <a href="displayNewContactFormNoAjax">Add a Contact</a>
            <hr/>

            <c:forEach var="contact" items="${contactList}">
                <s:url value="deleteContactNoAjax" var="deleteContact_url">
                    <s:param name="contactId" value="${contact.contactId}"/>
                </s:url>
                <s:url value="displayEditContactFormNoAjax" var="editContact_url">
                    <s:param name="contactId" value="${contact.contactId}"/>
                </s:url>
                Name: ${contact.firstName} ${contact.lastName} |
                <a href="${deleteContact_url}">Delete</a> |
                <a href="${editContact_url}">Edit</a><br/>
                Phone: ${contact.phone}<br/>
                Email: ${contact.email}<br/>
                Company: ${contact.company}<br/>
                <hr/>
            </c:forEach>
        </div>

        <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
