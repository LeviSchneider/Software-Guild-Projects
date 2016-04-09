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
                        <a href="${pageContext.request.contextPath}/displayAddressBookNoAjax">Display Address Book</a>
                    </li>
                </ul>
            </div>
            <div class="row">
                <div class='col-md-6'>
                    <h2>Address Book</h2>
                    <table id='addressTable' class='table table-hover'>
                        <tr>
                            <th width='40%'>Name</th>
                            <th width='30%'>State</th>
                            <th width='15%'></th>
                            <th width='15%'></th>
                        </tr>
                        <tbody id='contentRows'></tbody>
                    </table>
                </div>
                <div class='col-md-6'>
                    <h2>Add New Address</h2>
                    <form class='form-horizontal' role='form'>
                        <div class='form-group'>
                            <label for='add-name' class='col-md-4 control-label'>Name:</label>
                            <div class='col-md-8'>
                                <input type='text' class='form-control' id='add-name' placeholder='Name'/>
                            </div>
                        </div>
                        <div class='form-group'>
                            <label for='add-address-line-1' class='col-md-4 control-label'>Address Line 1:</label>
                            <div class='col-md-8'>
                                <input type='text' class='form-control' id='add-address-line-1' placeholder='Address Line 1'/>
                            </div>
                        </div>
                        <div class='form-group'>
                            <label for='add-address-line-2' class='col-md-4 control-label'>Address Line 2:</label>
                            <div class='col-md-8'>
                                <input type='text' class='form-control' id='add-address-line-2' placeholder='Address Line 2'/>
                            </div>
                        </div>
                        <div class='form-group'>
                            <label for='add-city' class='col-md-4 control-label'>City:</label>
                            <div class='col-md-8'>
                                <input type='text' class='form-control' id='add-city' placeholder='City'/>
                            </div>
                        </div>
                        <div class='form-group'>
                            <label for='add-state' class='col-md-4 control-label'>State:</label>
                            <div class='col-md-8'>
                                <input type='text' class='form-control' id='add-state' placeholder='State'/>
                            </div>
                        </div>
                        <div class='form-group'>
                            <label for='add-zip-code' class='col-md-4 control-label'>Zip Code:</label>
                            <div class='col-md-8'>
                                <input type='text' class='form-control' id='add-zip-code' placeholder='Zip Code'/>
                            </div>
                        </div>
                        <div class='form-group'>
                            <div class='col-md-offset-4 col-md-8'>
                                <button type='submit' class='btn btn-default' id='add-button'>Create Address</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <div class='modal fade' id='detailsModal' tabindex="-1" role='dialog' aria-labelledby='detailsModalLabel' aria-hidden='true'>
            <div class='modal-dialog'>
                <div class='modal-content'>
                    <div class='modal-header'>
                        <button type='button' class='close' data-dismiss='modal'>
                            <span aria-hidden='true'>&times;</span>
                            <span class='sr-only'>Close</span>
                        </button>
                        <h4 class='modal-title' id='detailsModalLabel'>Address Details</h4>
                    </div>
                    <div class='modal-body'>
                        <h3 class='address-id'></h3>
                        <table class='table table-bordered'>
                            <tr>
                                <th>Name:</th>
                                <td id='address-name'></td>
                            </tr>
                            <tr>
                                <th>Address Line 1:</th>
                                <td id='address-address-line-1'></td>
                            </tr>
                            <tr>
                                <th>Address Line 2:</th>
                                <td id='address-address-line-2'></td>
                            </tr>
                            <tr>
                                <th>City:</th>
                                <td id='address-city'></td>
                            </tr>
                            <tr>
                                <th>State:</th>
                                <td id='address-state'></td>
                            </tr>
                            <tr>
                                <th>Zip Code:</th>
                                <td id='address-zip-code'></td>
                            </tr>
                        </table>
                    </div>
                    <div class='modal-footer'>
                        <button type='button' class='btn btn-default' data-dismiss='modal'>Close</button>
                    </div>
                </div>
            </div>
        </div>

        <div class='modal fade' id="editModal" tabindex="-1" aria-labelledby='editModalLabel' aria-hidden='true'>
            <div class='modal-dialog'>
                <div class='modal-content'>
                    <div class='modal-header'>
                        <button type='button' class='close' data-dismiss='modal'>
                            <span arie-hidden='true'>&times;</span>
                            <span class='sr-only'>Close</span>
                        </button>
                        <h4 class='modal-title' id='editModalLabel'>Edit Address</h4>
                    </div>
                    <div class='modal-body'>
                        <h3 id='address-id'></h3>
                        <form class='form-horizontal' role='form'>
                            <div class='form-group'>
                                <label for='edit-name' class='col-md-4 control-label'>Name:</label>
                                <div class='col-md-8'>
                                    <input type='text' class='form-control' id='edit-name' placeholder="Name"/>
                                </div>
                            </div>
                            <div class='form-group'>
                                <label for='edit-address-line-1' class='col-md-4 control-label'>Address Line 1:</label>
                                <div class='col-md-8'>
                                    <input type='text' class='form-control' id='edit-address-line-1' placeholder="Address Line 1"/>
                                </div>
                            </div>
                            <div class='form-group'>
                                <label for='edit-address-line-2' class='col-md-4 control-label'>Address Line 2:</label>
                                <div class='col-md-8'>
                                    <input type='text' class='form-control' id='edit-address-line-2' placeholder="Address Line 2"/>
                                </div>
                            </div>
                            <div class='form-group'>
                                <label for='edit-city' class='col-md-4 control-label'>City:</label>
                                <div class='col-md-8'>
                                    <input type='text' class='form-control' id='edit-city' placeholder="City"/>
                                </div>
                            </div>
                            <div class='form-group'>
                                <label for='edit-state' class='col-md-4 control-label'>State:</label>
                                <div class='col-md-8'>
                                    <input type='text' class='form-control' id='edit-state' placeholder="State"/>
                                </div>
                            </div>
                            <div class='form-group'>
                                <label for='edit-zip-code' class='col-md-4 control-label'>Zip Code:</label>
                                <div class='col-md-8'>
                                    <input type='text' class='form-control' id='edit-zip-code' placeholder="Zip Code"/>
                                </div>
                            </div>
                            <div class='form-group'>
                                <div class='col-md-offset-4 col-md-8'>
                                    <input type='hidden' id="edit-address-id"/>
                                    <button type='submit' id='edit-button' class='btn btn-default' data-dismiss='modal'>Edit Address</button>
                                    <button type='button' class='btn btn-default' data-dismiss='modal'>Cancel</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/mockData.js"></script>
        <script src="${pageContext.request.contextPath}/js/addressList.js"></script>
    </body>
</html>
