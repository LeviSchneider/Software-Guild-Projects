<%-- 
    Document   : newContactFormNoAjax
    Created on : Mar 29, 2016, 10:23:59 AM
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
        <title>Company Contacts</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet"/>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png"/>
    </head>
    <body>
        <div class="container">
            <h1>Company Contacts</h1>
            <hr/>
            <div class="container">
                <h1>Edit Contact Form</h1>
                <a href="displayContactListNoAjax">Contact List (No Ajax)</a>
                <hr/>
                <sf:form class="form-horizontal" 
                         modelAttribute="contact"
                         role="form" 
                         action="editContactNoAjax" 
                         method="POST">
                    <div class="form-group">
                        <label for="edit-first-name" class="col-md-4 control-label">Fist Name</label>
                        <div class="col-md-8">
                            <sf:input type="text" class="form-control" id="add-first-name" path="firstName" placeholder="First Name"/>
                            <sf:errors path="firstName" cssClass="text-danger"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-last-name" class="col-md-4 control-label">Last Name</label>
                        <div class="col-md-8">
                            <sf:input type="text" class="form-control" id="edit-last-name" path="lastName" placeholder="Last Name"/>
                            <sf:errors path="lastName" cssClass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-company" class="col-md-4 control-label">Company</label>
                        <div class="col-md-8">
                            <sf:input type="text" class="form-control" id="edit-company" path="company" placeholder="Company"/>
                            <sf:errors path="company" cssClass="text-danger"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-email" class="col-md-4 control-label">Email</label>
                        <div class="col-md-8">
                            <sf:input type="text" class="form-control" id="edit-email" path="email" placecompanyholder="Email"/>
                            <sf:errors path="email" cssClass="text-danger"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-phone" class="col-md-4 control-label">Phone</label>
                        <div class="col-md-8">
                            <sf:input type="text" class="form-control" id="edit-phone" path="phone" placeholder="Phone"/>
                            <sf:errors path="phone" cssClass="error"></sf:errors>
                            <sf:hidden path="contactId"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type='submit' id="edit-button" class="btn btn-defualt">Edit Contact</button>
                        </div>
                    </div>
                </sf:form>
            </div>
        </div>
    </body>
</html>
