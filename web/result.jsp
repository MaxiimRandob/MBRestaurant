<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
	<title>List Targets</title>

	<link type="text/css" rel="stylesheet" href="web/resources/css/style.css">
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
			   onclick="window.location.href=''; return false;"
			   class="add-button"
		/>

		<table>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<c:forEach var="MenuItem" items="${menuItems}">

				<c:url var="updateLink" value="">
					<c:param name="MenuItemId" value="${MenuItem.id}"/>
				</c:url>

				<c:url var="deleteLink" value=" ">
					<c:param name="MenuItemId" value="${MenuItem.id}"/>
				</c:url>

				<tr>
					<td> ${MenuItem.name} </td>
					<td> ${MenuItem.price} </td>
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