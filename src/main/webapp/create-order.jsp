<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>

<html>

<head>
	<title>Make your order</title>

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

	<h3>Add item to menu</h3>

	<form name="completeOrderForm" action="${pageContext.request.contextPath}/create-order" method="POST">
            <form name="addOrderItemForm" action="${pageContext.request.contextPath}/add-order-item" method="POST">


                <table>
                    <tbody>
                    <tr>
                        <td>
                            <select id="menuIt" name="menu">
                                <c:forEach var="MenuItem" items="${menu}">
                                    <option value="${MenuItem.name}">${MenuItem.name}</option>
                                </c:forEach>
                            </select>
                         </td>
                         <td>
                            <input type="number" id="quantity" name="quantity" min="1">
                         </td>
                    </tr>
                    <tr>
                        <td><label></label></td>
                        <td><input type="submit" value="Add item" class="save"/></td>
                    </tr>
                    </tbody>
                </table>
            </form>
            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Complete" class="save"/></td>
            </tr>
        </form>

	<div style="clear: both;"></div>
	<p>
		<a href='<c:url value="/menu" />'>Back to menu</a>
	</p>

</div>
</body>

</html>