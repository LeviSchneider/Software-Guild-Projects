<%-- 
    Document   : newDvdFormNoAjax
    Created on : Mar 29, 2016, 2:49:12 PM
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
        <title>DVD Library</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet"/>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png"/>
    </head>
    <body>
        <div class="container">
            <h1>Edit DVD</h1>
            <a href='displayDvdLibraryNoAjax'>DVD Library (No Ajax)</a>
            <hr/>
            <sf:form class="form-horizontal" 
                     modelAttribute="dvd" 
                     role="form" 
                     action="editDvdFormNoAjax" 
                     method="POST">
                <div class="form-group">
                    <label for="edit-title" class="col-md-4 control-label">Title</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-title" path="title" placeholder="Title"/>
                        <sf:errors path="title" cssClass="text-danger"></sf:errors>
                    </div>
                </div>
                <div class="form-group">
                    <label  for="edit-director" class="col-md-4 control-label">Director</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-director" path="director" placeholder="Director"/>
                        <sf:errors path="director" cssClass="text-danger"></sf:errors>
                    </div>
                </div>
                <div class="form-group">
                    <label  for="edit-studio" class="col-md-4 control-label">Studio</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-studio" path="studio" placeholder="Studio"/>
                        <sf:errors path="studio" cssClass="text-danger"></sf:errors>
                    </div>
                </div>
                <div class="form-group">
                    <label  for="edit-ratings" class="col-md-4 control-label">Rating</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-ratings" path="ratings" placeholder="Ratings"/>
                        <sf:errors path="ratings" cssClass="text-danger"></sf:errors>
                    </div>
                </div>
                <div class="form-group">
                    <label  for="edit-notes" class="col-md-4 control-label">Notes</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-notes" path="notes" placeholder="Notes"/>
                        <sf:errors path="notes" cssClass="text-danger"></sf:errors>
                    </div>
                </div>
                <div class="form-group">
                    <label  for="edit-release-date" class="col-md-4 control-label">Release Date</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="edit-release-date" path="releaseDate" placeholder="Release Date"/>
                        <sf:errors path="releaseDate" cssClass="text-danger"></sf:errors>
                        <sf:hidden path="dvdId"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type="Submit" class="btn btn-default" id="add-button">Submit</button>
                    </div>
                </div>
            </sf:form>
        </div>
    </body>
</html>
