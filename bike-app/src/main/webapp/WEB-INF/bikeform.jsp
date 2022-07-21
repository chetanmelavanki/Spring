<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BIKE</title>
<style type="text/css">
form {
	margin-left: 450px;
	margin-top: 150px;
	height: 400px;
	width: 600px;
	padding: 1%;
	border: 5px solid rgb(35, 6, 6);
	background-color: rgb(229, 229, 54);
	text-align: center;
}

ul {
	list-style: none;
	padding: 0;
	margin: 0;
}

body {
	background-image: url("/WEB-INF/main.jpeg");
	background-color: black;
}

li {
	padding: 5px 10px;
}

input[type=text] {
	width: 80%;
	padding: 5px 10px;
	margin: 3px 0;
	box-sizing: border-box;
}

.size {
	width: 20%;
	font-size: 16px;
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
			<li><input class="size" type="button" value="submit">&nbsp;&nbsp;&nbsp;&nbsp;<input class="size"
				type="button" value="reset"></li>
		</ul>
	</form>
</body>
</html>