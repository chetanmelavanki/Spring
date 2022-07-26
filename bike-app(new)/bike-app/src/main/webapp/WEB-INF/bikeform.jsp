<html>
<head>
<meta charset="ISO-8859-1">
<title>BIKE</title>
<style>
table, th, td {
	border: 1px solid black;
	margin-left: auto;
	margin-right: auto;
}

body {
	text-align: center;
	background: silver;
}
</style>

</head>
<body>
	<form action="readForm">
		<ul type="none">
			<li><label><h1>Bike List</h1></label></li>
			<li><label>Enter Bike Name</label> <input type="text"
				name="bikeName" placeholder="enter name"> <b
				style="color: red">${errorName}</b></li>
			<li><label>Enter Bike Color</label> <input type="text"
				name="bikeColor" placeholder="enter color"> <b
				style="color: red">${errorColor}</b></li>
			<li><label>Enter Bike Brand</label> <input type="text"
				name="bikeBrand" placeholder="enter brand"> <b
				style="color: red">${errorBrand}</b></li>
			<li><label>Enter Bike Cost&nbsp&nbsp</label> <input type="text"
				name="bikeCost" placeholder="enter cost"> <b
				style="color: red">${errorCost}</b></li>
			<li><label>Enter Bike Type&nbsp</label> <input type="text"
				name="bikeType" placeholder="enter type"> <b
				style="color: red">${errorType}</b></li>
			<br>
			<li><input class="size" type="submit"submit">&nbsp;&nbsp;&nbsp;&nbsp;<input
				class="size" type="button" value="reset"></li>
		</ul>
	</form>
	<br>

	<h1>Enter bike name to search bike</h1>
	<h4 style="color: red">${errorBikeName}</h4>
	<form action="searchBike">
		<input type="text" name="bikeName" placeholder="enter bike name.."><input
			type="submit" value="Search">
	</form>
	<table>
		<tr>
			<th>bike_id</th>
			<th>bike_color</th>
			<th>bike_brand</th>
			<th>bike_cost</th>
			<th>bike_type</th>
		</tr>
		<tr>
			<td>${BikeName}</td>
			<td>${BikeColor}</td>
			<td>${BikeBrand}</td>
			<td>${BikeCost}</td>
			<td>${BikeType}</td>
		</tr>
	</table>
	
	<a href="getAllbike">Get all bike datails</a>
	<table>
		<tr>
			<th>bike_id</th>
			<th>bike_color</th>
			<th>bike_brand</th>
			<th>bike_cost</th>
			<th>bike_type</th>
		</tr>
	</table>
</body>
</html>