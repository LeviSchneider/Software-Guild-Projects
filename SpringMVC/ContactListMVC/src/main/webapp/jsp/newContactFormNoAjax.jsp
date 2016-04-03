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
                <h1>New Contact Form</h1>
                <a href="displayContactListNoAjax">Contact List (No Ajax)</a>
                <hr/>
                <form class="form-horizontal" 
                         role="form" 
                         action="addNewContactNoAjax" 
                         method="POST">
                    <div class="form-group">
                        <label for="add-first-name" class="col-md-4 control-label">Fist Name</label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="add-first-name" path="firstName" placeholder="First Name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-last-name" class="col-md-4 control-label">Last Name</label>
                            <div class="col-md-8">
                            <input type="text" class="form-control" id="add-last-name" path="lastName" placeholder="Last Name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-company" class="col-md-4 control-label">Company</label>
                            <div class="col-md-8">
                            <input type="text" class="form-control" id="add-company" path="company" placeholder="Company"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-email" class="col-md-4 control-label">Email</label>
                            <div class="col-md-8">
                            <input type="text" class="form-control" id="add-email" path="email" placecompanyholder="Email"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-phone" class="col-md-4 control-label">Phone</label>
                            <div class="col-md-8">
                            <input type="text" class="form-control" id="add-phone" path="phone" placeholder="Phone"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type='submit' id="add-button" class="btn btn-defualt">Edit Contact</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
