<%--
  Created by IntelliJ IDEA.
  User: madra
  Date: 26.11.2019
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Orders</title>
	<style>
		<%@include file='resources/css/order-list-style.css' %>
	</style>
</head>

<body>

<div id="wrapper">
	<div id="header">
		<h2> Orders </h2>
	</div>
</div>

<div id="container">

	<div id=content">
		<input type="button" value="Add Order"
			   onclick="window.location.href='<c:url value="/create-order" />'; return false;"
			   class="add-button"
		/>
		<table>
			<tr>
				<th>ID</th>
				<th>Total</th>
				<th>Date</th>
			</tr>
			<c:forEach var="Order" items="${orders}">

				<c:url var="updateLink" value="">
					<c:param name="MenuItemId" value="${Order.id}"/>
				</c:url>

				<c:url var="deleteLink" value=" ">
					<c:param name="MenuItemId" value="${Order.id}"/>
				</c:url>

				<tr>
					<td> ${Order.id} </td>
					<td> ${Order.total} </td>
					<td> ${Order.date} </td>
					<td>
						<a href="${updateLink}">Update</a>
						<a href="${deleteLink}" onclick="if (!(confirm('Are you sure you want to delete this one?'))) return false">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
</body>
</html>
