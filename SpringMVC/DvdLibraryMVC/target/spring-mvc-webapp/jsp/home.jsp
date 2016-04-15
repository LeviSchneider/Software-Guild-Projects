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
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/home">Home</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/search">Search</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/stats">Stats</a>
                    </li>
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/displayDvdLibraryNoAjax">DVD Library (No Ajax)</a>
                    </li>
                </ul>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <h2>My DVDs</h2>
                    <%@include file="LibrarySummaryTable.jsp"%>
                </div>

                <div class="col-md-6">
                    <h2>Add New DVD</h2>
                    <form class='form-horizontal' role='form'>
                        <div class="form-group">
                            <label for='add-title' class='col-md-4 control-label'>Title:</label>
                            <div class='col-md-8'>
                                <input type='text' class='form-control' id='add-title' placeholder="Title"/>
                            </div>
                        </div>
                        <div class='form-group'>
                            <label for='add-director' class='col-md-4 control-label'>Director:</label>
                            <div class='col-md-8'>
                                <input type='text' class='form-control' id='add-director' placeholder="Director"/>
                            </div>
                        </div>
                        <div class='form-group'>
                            <label for='add-studio' class='col-md-4 control-label'>Studio:</label>
                            <div class='col-md-8'>
                                <input type='text' class='form-control' id='add-studio' placeholder="Studio"/>
                            </div>
                        </div>
                        <div class='form-group'>
                            <label for='add-ratings' class='col-md-4 control-label'>Ratings:</label>
                            <div class='col-md-8'>
                                <input type='text' class='form-control' id='add-ratings' placeholder="Ratings"/>
                            </div>
                        </div>
                        <div class='form-group'>
                            <label for='add-release-date' class='col-md-4 control-label'>Release Date:</label>
                            <div class='col-md-8'>
                                <input type='text' class='form-control' id='add-release-date' placeholder="Release Date"/>
                            </div>
                        </div>
                        <div class='form-group'>
                            <label for='add-notes' class='col-md-4 control-label'>Notes:</label>
                            <div class='col-md-8'>
                                <input type='text' class='form-control' id='add-notes' placeholder="Notes"/>
                            </div>
                        </div>
                        <div class='form-group'>
                            <div class='col-md-offset-4 col-md-8'>
                                <button type='submit' class='btn btn-default' id='add-button'>Add DVD</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <%@include file="detailsEditModalFragment.jsp" %>
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/contactList.js"></script>
    </body>
</html>
