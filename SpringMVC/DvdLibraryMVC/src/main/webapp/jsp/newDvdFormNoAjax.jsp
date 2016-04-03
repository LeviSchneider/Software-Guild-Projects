<%-- 
    Document   : newDvdFormNoAjax
    Created on : Mar 29, 2016, 2:49:12 PM
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
            <h1>New DVD</h1>
            <a href='displayDvdLibraryNoAjax'>DVD Library (No Ajax)</a>
            <hr/>
            <form class="form-horizontal" role="form" action="addNewDvdNoAjax" method="POST">
                <div class="form-group">
                    <label  for="add-title" class="col-md-4 control-label">Title</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="add-title" name="title" placeholder="Title"/>
                    </div>
                </div>
                <div class="form-group">
                    <label  for="add-director" class="col-md-4 control-label">Director</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="add-director" name="director" placeholder="Director"/>
                    </div>
                </div>
                <div class="form-group">
                    <label  for="add-studio" class="col-md-4 control-label">Studio</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="add-studio" name="studio" placeholder="Studio"/>
                    </div>
                </div>
                <div class="form-group">
                    <label  for="add-rating" class="col-md-4 control-label">Rating</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="add-rating" name="rating" placeholder="Rating"/>
                    </div>
                </div>
                <div class="form-group">
                    <label  for="add-notes" class="col-md-4 control-label">Notes</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="add-notes" name="notes" placeholder="Notes"/>
                    </div>
                </div>
                <div class="form-group">
                    <label  for="add-release-date" class="col-md-4 control-label">Release Date</label>
                    <div class="col-md-8">
                        <input type="text" class="form-control" id="add-release-date" name="releaseDate" placeholder="Release Date"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type="Submit" class="btn btn-default" id="add-button">Submit</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
