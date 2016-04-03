<%-- 
    Document   : home
    Created on : Mar 28, 2016, 3:54:07 PM
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
        <title>Address Book</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet"/>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png"/>
    </head>
    <body>
        <div class="container">
            <h1>Address Book</h1>

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
                        <a href="${pageContext.request.contextPath}/displayAddressBookNoAjax">Display Address Book</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="container">
            <h1>Address Book</h1>
            <a href="displayNewAddressFormNoAjax">Add Address</a>
            <hr/>
            <c:forEach var="address" items="${addressBook}">
                <s:url value="deleteAddressNoAjax" var="deleteAddress_url">
                    <s:param name="addressId" value="${address.addressId}"/>
                </s:url>
                <s:url value="displayEditAddressFormNoAjax" var="editAddress_url">
                    <s:param name="addressId" value="${address.addressId}"/>
                </s:url>
                Name: ${address.name} |
                <a href="${deleteAddress_url}">Delete</a> |
                <a href="${editAddress_url}">Edit</a><br/>
                Street Address 1: ${address.addressLine1}<br/>
                Street Address 2: ${address.addressLine2}<br/>
                City: ${address.city}<br/>
                State: ${address.state}<br/>
                Zip Code: ${address.zipCode}<br/>
                <hr/>
            </c:forEach>
        </div>

        <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
