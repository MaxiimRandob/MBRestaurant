<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>

<html>

<head>
	<title>Save Target</title>

	<style>
		<%@include file='resources/css/menu-style.css' %>
	</style>
	<style>
		<%@include file='resources/css/add-item-style.css' %>
	</style>

</head>

<body>
<div id="wrapper">
	<div id="header">
		<h2>MBRestaurant</h2>
	</div>
</div>

<div id="container">

	<h3>Edit item from menu</h3>

	<form name="updateMenuItemForm" action="${pageContext.request.contextPath}/update-menu-item" method="POST">



		<table>
			<tbody>
			<tr>
				<td><label>Dish name:</label></td>
				<td><input type="text" name="name" class="form-Control" value="${name}"></td>
			</tr>

			<tr>
				<td><label>Cost:</label></td>
				<td><input type="text" name="price" class="form-Control" value="${price}"></td>
			</tr>

            <tr>
				<td><label>Id: ${id}</label></td>
				<td><input type="hidden" name="id" value="${item.id}"></td>
			</tr>

			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Save" class="save"/></td>
			</tr>


			</tbody>
		</table>
	</form>

	<div style="clear: both;"></div>
	<p>
		<a href='<c:url value="/menu" />'>Back to menu</a>
	</p>

</div>
</body>

</html>