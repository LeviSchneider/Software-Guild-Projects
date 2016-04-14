<!DOCTYPE html>
<html>
    <head>
        <title>Address Book</title>
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.css"
              rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1>Address Form</h1>
            <hr/>
            <!--<div class="navbar">-->
            <!--<ul class="nav nav-tabs">-->
            <!--<li role="presentation" class="active">-->
            <!--<a href="home">Home</a>-->
            <!--</li>-->
            <!--<li role="presentation">-->
            <!--<a href="search">Search</a>-->
            <!--</li>-->
            <!--<li role="presentation">-->
            <!--<a href="stats">Stats</a>-->
            <!--</li>-->
            <!--</ul>-->
            <!--</div>-->
            <!--
            Add a row to our container - this will hold the summary table and the new contact form.
            -->
            <div class="row">
                <!-- #2: Add a col to hold the summary table - have it take up half the row -->
                <div class="col-md-6">
                    <div id="addressTable">
                        <h2>My Address</h2>

                        <table id="addressTable" class="table table-hover">
                            <tr>
                                <th width="40%">Title</th>
                                <th width="30%">Director</th>
                                <th width="15%"></th>
                                <th width="15%"></th>
                            </tr>
                            <!--
                             #3: This holds the list of contacts - we will add rows
                            dynamically
                             using jQuery
                             -->
                            <tbody id="contentRows"></tbody>
                        </table>
                    </div>
                </div> <!-- End col div -->
                <!--
                #4: Add col to hold the new contact form - have it take up the other half of the row
                -->
                <div class="col-md-6">

                    <div id="editFormDiv" style="display: none">
                        <h2 onclick="hideEditForm()">Edit Address</h2>

                        <form class="form-horizontal" role="form">
                            <div class="form-group">
                                <label for="edit-name" class="col-md-4 control-label">
                                    Name:
                                </label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="edit-name"
                                           placeholder="Name"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-address-line-1" class="col-md-4 control-label">
                                    Address Line 1:
                                </label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="edit-address-line-1"
                                           placeholder="Address Line 1"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="edit-address-line-2" class="col-md-4 control-label">
                                    Address Line 2:
                                </label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="edit-address-line-2"
                                           placeholder="Address Line 2"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="edit-city" class="col-md-4 control-label">
                                    City:</label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="edit-city"
                                           placeholder="City"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="edit-state" class="col-md-4 control-label">State:</label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="edit-state"
                                           placeholder="State"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="edit-zip-code" class="col-md-4 control-label">Zip Code:</label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="edit-zip-code"
                                           placeholder="Zip Code"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-md-offset-4 col-md-4">
                                    <input type="hidden" id="edit-address-id">
                                    <button type="button"
                                            id="edit-cancel-button"
                                            class="btn btn-default"
                                            onclick="hideEditForm()">
                                        Cancel
                                    </button>
                                </div>
                                <div class="col-md-4">
                                    <button type="submit"
                                            id="edit-button"
                                            class="btn btn-default">
                                        Update DVD
                                    </button>
                                </div>
                            </div>

                        </form>
                    </div>
                    <div id="addFormDiv">

                        <h2>Add New DVD</h2>

                        <form class="form-horizontal" role="form">
                            <div class="form-group">
                                <label for="add-name" class="col-md-4 control-label">
                                    Name:
                                </label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="add-name"
                                           placeholder="Name"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-address-line-1" class="col-md-4 control-label">
                                    Address Line 1:
                                </label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="add-address-line-1"
                                           placeholder="Address Line 1"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-address-line-2" class="col-md-4 control-label">
                                    Address Line 2:
                                </label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="add-address-line-2"
                                           placeholder="Address Line 2"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-city" class="col-md-4 control-label">
                                    City:</label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="add-city"
                                           placeholder="City"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-state" class="col-md-4 control-label">State:</label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="add-state"
                                           placeholder="State"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-zip-code" class="col-md-4 control-label">Zip Code:</label>

                                <div class="col-md-8">
                                    <input type="tel"
                                           class="form-control"
                                           id="add-zip-code"
                                           placeholder="Zip Code"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-offset-4 col-md-8">
                                    <button type="submit"
                                            id="add-button"
                                            class="btn btn-default">
                                        Add DVD
                                    </button>
                                </div>
                            </div>
                        </form>
                        <div id="validationErrors" style="color:red"/>
                    </div>
                </div> <!-- End col div -->
            </div> <!-- End row div -->
        </div>
        <!-- #5: Placed at the end of the document so the pages load faster -->
        <script src="js/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/restAddressBook.js"></script>
    </body>
</html>