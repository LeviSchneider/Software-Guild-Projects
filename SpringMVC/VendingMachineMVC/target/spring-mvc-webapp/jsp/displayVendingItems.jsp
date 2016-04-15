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
        <style>
            .btn {
                padding: 14px 24px;
                border: 0 none;
                font-weight: 700;
                letter-spacing: 1px;
                text-transform: uppercase;
            }

            .btn:focus, .btn:active:focus, .btn.active:focus {
                outline: 0 none;
            }

            .btn-primary {
                background: #0099cc;
                color: #ffffff;
            }

            .btn-primary:hover, .btn-primary:focus, .btn-primary:active, .btn-primary.active, .open > .dropdown-toggle.btn-primary {
                background: #33a6cc;
            }

            .btn-primary:active, .btn-primary.active {
                background: #007299;
                box-shadow: none;
            }

            .btn-sharp {
                border-radius: 0;
            }

            #design {
                padding: 14px 24px;
                border-radius: 5px;
                color: white;
                font-weight: 700;
                letter-spacing: 1px;
                text-transform: uppercase;
                background-color: #67b168;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="row" style="padding-top: 20px">
                <div class="col-md-6">
                    <h1>Vending Machine</h1>
                </div>

                <div class="col-md-4 col-md-offset-1" id="design">
                    <h3 id="jqResponse">Welcome!</h3>
                </div>
            </div>

            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation">
                        <a href="${pageContext.request.contextPath}/home">Home</a>
                    </li>
                    <li role="presentation" class="active">
                        <a href="${pageContext.request.contextPath}/vendingMachine">Vending Machine</a>
                    </li>
                </ul>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <hr/>
                    <c:forEach var="items" items="${inventory}">
                        Brand: ${items.itemName}<br/>
                        Cost: ${items.itemCost}<br/>
                        Quantity: ${items.amountLeft}<br/>
                        Item #: ${items.index}<br/>
                        <hr/>
                    </c:forEach>
                </div>

                <div class="col-md-4 col-md-offset-1">
                    <form class="form-horizontal" 
                          role="form" 
                          action="vendItem" 
                          method="POST">

                        <div class="form-group">
                            <label for="add-change" class="control-label">Insert Change</label>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="add-change" name="change" placeholder="Change"/>
                        </div>

                        <div class="form-group">
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="add-item" class="control-label">Select Snack!</label>
                                </div>

                                <div class="btn-group" data-toggle="buttons">
                                    <div class="form-group">
                                        <c:choose>
                                            <c:when test="${snickers.amountLeft != 0}">
                                                <label class="btn btn-primary btn-lg sharp">
                                                    <input name="item" value="1" type="radio">Snickers</input>
                                                </label>
                                            </c:when>
                                            <c:when test="${snickers.amountLeft != 0}">
                                                <label class="btn btn-primary btn-lg sharp">
                                                    <input name="item" value="1" type="radio">Snickers</input>
                                                </label>
                                            </c:when>
                                            <c:otherwise>
                                                <label class="btn btn-primary btn-lg sharp" disabled>
                                                    <input name="item" value="1" type="radio" disabled>Out of Stock</input>
                                                </label>
                                            </c:otherwise>
                                        </c:choose>
                                        </label>
                                    </div>
                                    
                                    <div class="form-group">
                                        <c:choose>
                                            <c:when test="${mms.amountLeft != 0}">
                                                <label class="btn btn-primary btn-lg sharp">
                                                    <input name="item" value="2" type="radio">M&Ms</input>
                                                </label>
                                            </c:when>
                                            <c:when test="${change < mms.itemCost}">
                                                <label class="btn btn-primary btn-lg sharp">
                                                    <input name="item" value="2" type="radio">M&Ms</input>
                                                </label>
                                            </c:when>
                                            <c:otherwise>
                                                <label class="btn btn-primary btn-lg sharp" disabled>
                                                    <input name="item" value="2" type="radio" disabled>Out of Stock</input>
                                                </label>
                                            </c:otherwise>
                                        </c:choose>
                                        </label>
                                    </div>
                                    
                                    <div class="form-group">
                                        <c:choose>
                                            <c:when test="${milkyWay.amountLeft != 0}">
                                                <label class="btn btn-primary btn-lg sharp">
                                                    <input name="item" value="3" type="radio">Milky Way</input>
                                                </label>
                                            </c:when>
                                            <c:when test="${milkyWay.itemCost > change}">
                                                <label class="btn btn-primary btn-lg sharp">
                                                    <input name="item" value="3" type="radio">Milky Way</input>
                                                </label>
                                            </c:when>
                                            <c:otherwise>
                                                <label class="btn btn-primary btn-lg sharp" disabled>
                                                    <input name="item" value="3" type="radio" disabled>Out of Stock</input>
                                                </label>
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div>
                                <button type="Submit" class="btn btn-success btn-lg sharp" id="add-button">Thou Shalt Snack</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        

        <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script>
            $(document).ready(function () {
                $('button').click(function () {
                    $('#jqResponse').replaceWith("Thank you for your patronage!");
                });
            });
        </script>
    </body>
</html>
