<%@page import="com.trendingtwig.controller.CartController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title  -->
    <title>Trending Twig</title>

    <!-- Favicon  -->
    <link rel="icon" href="${pageContext.request.contextPath}/resources/img/core-img/favicon.ico">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/core-style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">

</head>

<body>
<h3>CART</h3>

    Cart Details...

<br><br>
<!-- Cart Summary -->
			<div class="Cart-amount-summary">

				<h2>Summary</h2>
				<ul class="summary-table">
					
					<%= "${pageContext.request.contextPath}/${cart.cartMessage}" %>
					
				</ul>
				
			</div>	
		
		</body>	
</html>