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
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/search">Search</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/stats">Stats</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/displayContactListNoAjax">Contact List (No Ajax)</a>
                    </li>
                </ul>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <h2>Search Results</h2>
                    <%@include file="contactSummaryTableFragment.jsp" %>
                </div>
                <div class="col-md-6">
                    <h2>Search</h2>
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="search-first-name" class="col-md-4 control-label">First Name:</label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="search-first-name" placeholder="First Name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="search-last-name" class="col-md-4 control-label">Last Name:</label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="search-last-name" placeholder="Last Name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="search-company" class="col-md-4 control-label">Company:</label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="search-company" placeholder="Company"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="search-email" class="col-md-4 control-label">Email:</label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="search-email" placeholder="Email"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="search-phone" class="col-md-4 control-label">Phone:</label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="search-phone" placeholder="Phone"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <button type="submit"
                                        id="search-button"
                                        class="btn btn-defualt">Search</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
       <%@include file="detailsEditModalFragment.jsp"%>
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/mockData.js"></script>
        <script src="${pageContext.request.contextPath}/js/contactList.js"></script>
    </body>
</html>
