<!DOCTYPE html>
<html>
    <head>
        <title>DVD Library</title>
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.css"
              rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1>DVD Form</h1>
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
                    <div id="dvdTable">
                        <h2>My DVD</h2>

                        <table id="dvdTable" class="table table-hover">
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
                        <h2 onclick="hideEditForm()">Edit DVD</h2>

                        <form class="form-horizontal" role="form">
                            <div class="form-group">
                                <label for="edit-title" class="col-md-4 control-label">
                                    Title:
                                </label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="edit-title"
                                           placeholder="Title"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-director" class="col-md-4 control-label">
                                    Director:
                                </label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="edit-director"
                                           placeholder="Director"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="edit-studio" class="col-md-4 control-label">
                                    Studio:
                                </label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="edit-studio"
                                           placeholder="Studio"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="edit-ratings" class="col-md-4 control-label">
                                    Ratings:</label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="edit-ratings"
                                           placeholder="Ratings"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="edit-release-date" class="col-md-4 control-label">Release Date:</label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="edit-release-date"
                                           placeholder="Release Date"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="edit-notes" class="col-md-4 control-label">Notes:</label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="edit-notes"
                                           placeholder="Notes"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-md-offset-4 col-md-4">
                                    <input type="hidden" id="edit-dvd-id">
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
                                <label for="add-title" class="col-md-4 control-label">
                                    Title:
                                </label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="add-title"
                                           placeholder="Title"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-director" class="col-md-4 control-label">
                                    Director:
                                </label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="add-director"
                                           placeholder="Director"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-studio" class="col-md-4 control-label">
                                    Studio:
                                </label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="add-studio"
                                           placeholder="Studio"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-ratings" class="col-md-4 control-label">
                                    Ratings:</label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="add-ratings"
                                           placeholder="Ratings"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-release-date" class="col-md-4 control-label">Release Date:</label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="add-release-date"
                                           placeholder="Release Date"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-notes" class="col-md-4 control-label">Notes:</label>

                                <div class="col-md-8">
                                    <input type="text"
                                           class="form-control"
                                           id="add-notes"
                                           placeholder="Notes"/>
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
        <script src="js/restDvdLibrary.js"></script>
    </body>
</html>