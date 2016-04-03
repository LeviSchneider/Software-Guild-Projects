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
            <a href="displayAddressBookNoAjax">Address Book (No Ajax)</a>
            <hr/>
            <form class="form-horizontal" role="form" action="addNewAddressNoAjax" method="POST">
                <div class="form-group">
                    <label for="add-name" class="col-md-4 control-label">Name</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="add-name" name="name" placeholder="Name"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="add-address-line-1" class="col-md-4 control-label">Street Address 1</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="add-address-line-1" name="addressLine1" placeholder="Address Line 1"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="add-address-line-2" class="col-md-4 control-label">Street Address 2</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="add-address-line-2" name="addressLine2" placeholder="Address Line 2"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="add-city" class="col-md-4 control-label">City</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="add-city" name="city" placeholder="City"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="add-state" class="col-md-4 control-label">State</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="add-state" name="state" placeholder="State"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="add-zip-code" class="col-md-4 control-label">Zip Code</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="add-zip-code" name="zipCode" placeholder="Zip Code"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type='submit' id="add-button" class="btn btn-default">Add Address</button>
                    </div>
                </div>
            </form>
        </div>

        <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
