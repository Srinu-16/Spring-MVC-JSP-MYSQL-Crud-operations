<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>List Of Users</title>
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

</head>
<body>
	<div class="container">
		<input type="button" value="Add User"
			onclick="window.location.href='Users-Form'; return false;"
			class="btn btn-primary" /> <br /> <br />
		<div class="panel panel-info">
			<div class="panel-heading">
				<div class="panel-title">List Of Users</div>
			</div>
			<div class="panel-body">
				<table class="table table-striped table-bordered">
					<caption>Fetching data</caption>
					<tr>
						<th id="id">ID</th>
						<th id="First Name">First Name</th>
						<th id="Last Name">Last Name</th>
						<th id="Gender">Gender</th>
						<th id="city">city</th>
						<th id="phone">phone number</th>
						<th id="Action">Action</th>
					</tr>
					<c:forEach items="${usersList}" var="localUserVariable">
						<c:url var="updateLink" value="Update-User">
							<c:param name="userId" value="${localUserVariable.userId}" />
						</c:url>
						<c:url var="deleteLink" value="Delete-User">
							<c:param name="userId" value="${localUserVariable.userId}" />
						</c:url>
						<tr>
							<td>${localUserVariable.userId}</td>
							<td>${localUserVariable.firstName}</td>
							<td>${localUserVariable.lastName}</td>
							<td>${localUserVariable.gender}</td>
							<td>${localUserVariable.city}</td>
							<td>${localUserVariable.phoneNumber}</td>
							<td><a href="${updateLink}"> <span
									class="fa fa-edit fa-lg"></span>
							</a> <a href="${deleteLink}"
								onclick="if (!(confirm('Are you sure you want to delete this User?'))) return false">
									<span class="fa fa-trash fa-lg"></span>
							</a></td>
						</tr>

					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>