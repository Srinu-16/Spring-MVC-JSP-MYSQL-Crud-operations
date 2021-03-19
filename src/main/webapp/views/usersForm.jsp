<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Add User</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/jobseekerValidation.js"></script>
</head>
<body>
	<div class="container">
		<h1>Add User</h1>
		<hr>
		<br> <br>
		<form method="post" modelAttribute="userList" class="form-horizontal"
			action="Add-User" onsubmit="return validation()">
			<form:hidden path="userId" />
			<div class="form-group">
				<label class="control-label col-sm-2" for="firstName">First
					Name :</label>
				<div class="col-lg-8">
					<input type="text" name="firstName" class="form-control my-2 p-3"
						placeholder=" Enter Your First Name" id="fname">
						<span style="color:red;">${error}</span>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="lastName">Last
					Name :</label>
				<div class="col-lg-8">
					<input type="text" name="lastName" class="form-control my-2 p-3"
						placeholder="Enter Your Last Name" id="lname">
						<span style="color:red;">${error}</span>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="gender">Gender :</label>
				<div class="col-lg-8">
					<select class="form-control" name="gender" id="gender">
						<option value="Select Gender">Select Gender</option>
						<option>Male</option>
						<option>Female</option>
					</select>
					<span style="color:red;">${error}</span>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">City :</label>
				<div class="col-lg-8">
					<input type="text" name="city" class="form-control my-2 p-3"
						placeholder="Enter Your city" id="city">
						<span style="color:red;">${error}</span>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Phone Number :</label>
				<div class="col-lg-8">
					<input type="number" name="phoneNumber"
						class="form-control my-2 p-3" placeholder="Phone Number" id="phno">
						<span style="color:red;">${error}</span>
				</div>
			</div>
			<div class="form-group">
				<div class=" col-lg-offset-2 col-lg-8">
					<input type="submit" class="btn1 btn-lg btn-block" value=" Save " />
				</div>
			</div>
		</form>
	</div>

</body>
</html>