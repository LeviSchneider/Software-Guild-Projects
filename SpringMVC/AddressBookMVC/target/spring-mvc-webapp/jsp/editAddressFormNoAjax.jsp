<%-- 
    Document   : home
    Created on : Mar 28, 2016, 3:54:07 PM
    Author     : apprentice
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

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
            <sf:form class="form-horizontal" modelAttribute="address" role="form" action="editAddressFormNoAjax" method="POST">
                <div class="form-group">
                    <label for="edit-name" class="col-md-4 control-label">Name</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-name" path="name" placeholder="Name"/>
                        <sf:errors path="name" cssClass="text-danger"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-address-line-1" class="col-md-4 control-label">Street Address 1</label>
                        <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-address-line-1" path="addressLine1" placeholder="Address Line 1"/>
                        <sf:errors path="addressLine1" cssClass="text-danger"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-address-line-2" class="col-md-4 control-label">Street Address 2</label>
                        <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-address-line-2" path="addressLine2" placeholder="Address Line 2"/>
                        <sf:errors path="addressLine2" cssClass="text-danger"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-city" class="col-md-4 control-label">City</label>
                        <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-city" path="city" placeholder="City"/>
                        <sf:errors path="city" cssClass="text-danger"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-state" class="col-md-4 control-label">State</label>
                        <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-state" path="state" placeholder="State"/>
                        <sf:errors path="state" cssClass="text-danger"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-zip-code" class="col-md-4 control-label">Zip Code</label>
                        <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-zip-code" path="zipCode" placeholder="Zip Code"/>
                        <sf:errors path="zipCode" cssClass="error"></sf:errors>
                        <sf:hidden path="addressId"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type='submit' id="edit-button" class="btn btn-default">Add Address</button>
                    </div>
                </div>
            </sf:form>
        </div>

        <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
