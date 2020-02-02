<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Menu</title>
	<style>
		<%@include file='resources/css/menu-style.css' %>
	</style>
</head>

<body>

<div id="wrapper">
	<div id="header">
		<h2> Menu </h2>
	</div>
</div>

<div id="container">

	<div id=content">
		<input type="button" value="Add MenuItem"
			   onclick="window.location.href='<c:url value="/add-menu-item" />'; return false;"
			   class="add-button"
		/>
		<table>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<c:forEach var="MenuItem" items="${menu}">

				<c:url var="updateLink" value="/update-menu-item">
					<c:param name="id" value="${MenuItem.id}"/>
				</c:url>

				<c:url var="deleteLink" value="/delete-menu-item">
					<c:param name="id" value="${MenuItem.id}"/>
				</c:url>

				<tr>
					<td> ${MenuItem.name} </td>
					<td> ${MenuItem.price} </td>
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