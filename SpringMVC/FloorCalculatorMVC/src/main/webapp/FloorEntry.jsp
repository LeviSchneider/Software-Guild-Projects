<%-- 
    Document   : FloorEntry
    Created on : Mar 28, 2016, 10:48:58 AM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Floor Calculator</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/customStyle.css"/>
    </head>
    <body>
        <h1 style="text-align: center">Floor Calculator</h1>
        <form class="form-horizontal" style="text-align: center" action='FloorServlet' method="POST">
            <h2>Please enter the width.<h2>
            <input type="text" name="myWidth"/><br/>
            <h2>Please enter the length.<h2>
            <input type="text" name="myLength"/><br/>
            <br>
            <div class="form-group">
                <label for="sel1">Select Floor Type:</label>
                <select type="text" class="form-control center-block" style="width:400px" name="myProduct" id="sel1">
                    <option>Wood</option>
                    <option>Laminate</option>
                    <option>Tile</option>
                    <option>Carpet</option>
                </select>
            </div>
            <input type="submit" class="btn btn-success" value="Calculate"/>
        </form>
    </body>
</html>
