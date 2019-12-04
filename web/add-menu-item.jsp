

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

	<h3>Save Target</h3>

	<form action="saveTarget" modelAttribute="target" method="POST">


		<table>
			<tbody>
			<tr>
				<td><label>Task name:</label></td>
				<td><input type="text" name="firstName" class="form-Control" value=/></td>
			</tr>

			<tr>
				<td><label>Progress:</label></td>
				<td></td>
			</tr>

			<tr>
				<td><label>Date of creation:</label></td>
				<td></td>
			</tr>

			<tr>
				<td><label>Oriented finish date:</label></td>
				<td></td>
			</tr>

			<tr>
				<td><label>In progress:</label></td>
				<td></td>
			</tr>

			<tr>
				<td><label>Description:</label></td>
				<td></td>
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
		<a href="/">Back to menu</a>
	</p>

</div>
</body>

</html>