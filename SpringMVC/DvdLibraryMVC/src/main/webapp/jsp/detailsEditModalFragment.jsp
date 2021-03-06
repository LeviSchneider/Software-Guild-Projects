<%-- 
    Document   : detailsEditModalFragment
    Created on : Apr 15, 2016, 1:56:32 AM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="modal fade" id="detailsModal" tabindex="-1" role="dialog" aria-labelledby="detailsModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss='modal'>
                            <span aria-hidden='true'>&times;</span>
                            <span class='sr-only'>Close</span>
                        </button>
                        <h4 class='modal-title' id='detailsModalLabel'>DVD Details</h4>
                    </div>
                    <div class='modal-body'>
                        <h3 id='dvd-id'></h3>
                        <table class='table table-bordered'>
                            <tr>
                                <th>Title:</th>
                                <td id='dvd-title'></td>
                            </tr>
                            <tr>
                                <th>Director:</th>
                                <td id='dvd-director'></td>
                            </tr>
                            <tr>
                                <th>Studio:</th>
                                <td id='dvd-studio'></td>
                            </tr>
                            <tr>
                                <th>Release Date:</th>
                                <td id='dvd-release-date'></td>
                            </tr>
                            <tr>
                                <th>Ratings:</th>
                                <td id='dvd-ratings'></td>
                            </tr>
                            <tr>
                                <th>Notes:</th>
                                <td id='dvd-notes'></td>
                            </tr>
                        </table>
                    </div>
                    <div class='modal-footer'>
                        <button type='button' class='btn btn-default' data-dismiss='modal'>Close</button>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id='editModal' tabindex="-1" aria-labelledby='editModalLabel' aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class='modal-header'>
                        <button type='button' class='close' data-dismiss='modal'>
                            <span arie-hidden='true'>&times;</span>
                            <span class='sr-only'>Close</span>
                        </button>
                        <h4 class='modal-title' id='editModalLabel'>Edit DVD Details</h4>
                    </div>
                    <div class='modal-body'>
                        <h3 id='dvd-id'></h3>
                        <form class='form-horizontal' role='form'>
                            <div class='form-group'>
                                <label for='edit-title' class='col-md-4 control-label'>Title:</label>
                                <div class='col-md-8'>
                                    <input type='text' class='form-control' id='edit-title' placeholder="Title"/>
                                </div>
                            </div>
                            <div class='form-group'>
                                <label for='edit-director' class='col-md-4 control-label'>Director:</label>
                                <div class='col-md-8'>
                                    <input type='text' class='form-control' id='edit-director' placeholder="Director"/>
                                </div>
                            </div>
                            <div class='form-group'>
                                <label for='edit-studio' class='col-md-4 control-label'>Studio:</label>
                                <div class='col-md-8'>
                                    <input type='text' class='form-control' id='edit-studio' placeholder="Studio"/>
                                </div>
                            </div>
                            <div class='form-group'>
                                <label for='edit-release-date' class='col-md-4 control-label'>Release Date:</label>
                                <div class='col-md-8'>
                                    <input type='text' class='form-control' id='edit-release-date' placeholder="Release Date"/>
                                </div>
                            </div>
                            <div class='form-group'>
                                <label for='edit-ratings' class='col-md-4 control-label'>Ratings:</label>
                                <div class='col-md-8'>
                                    <input type='text' class='form-control' id='edit-ratings' placeholder="Ratings"/>
                                </div>
                            </div>
                            <div class='form-group'>
                                <label for='edit-notes' class='col-md-4 control-label'>Notes:</label>
                                <div class='col-md-8'>
                                    <input type='text' class='form-control' id='edit-notes' placeholder="Notes"/>
                                </div>
                            </div>
                            <div class='form-group'>
                                <div class='col-md-offset-4 col-md-8'>
                                    <input type="hidden" id="edit-dvd-id"/> 
                                    <button type='submit' id='edit-button' class='btn btn-default' data-dismiss="modal">Edit DVD</button>
                                    <button type='button' class='btn btn-default' data-dismiss="modal">Cancel</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
