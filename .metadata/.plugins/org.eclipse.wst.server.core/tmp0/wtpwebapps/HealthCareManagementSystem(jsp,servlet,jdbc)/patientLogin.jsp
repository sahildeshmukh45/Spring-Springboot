<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Patient Login</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<background-image href></background-image>
<style>
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	background: url(resources/images/patientlogin.jpg) no-repeat center center
		fixed;
	background-size: cover;
}

.login-container {
	border-radius: 10px;
	width: 100%;
	max-width: 400px;
	padding: 15px;
	background-color: rgb(172, 213, 172);
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.btn:hover {
	background-color: green;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light fixed-top bg-info">
		<div class="container">
			<a class="navbar-brand" href="index.jsp">Healthcare Management
				System</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="adminlogin.jsp">Admin
							Login</a></li>
					<li class="nav-item"><a class="nav-link"
						href="patientLogin.jsp">Patient Login</a></li>
					<li class="nav-item"><a class="nav-link"
						href="doctorlogin.jsp">Doctor Login</a></li>
				</ul>
			</div>
		</div>
	</nav>
    
	<div class="login-container">
		<h3 class="text-center">Patient Login</h3>
		<%String msg=(String)request.getAttribute("login"); 
    if(msg=="no"){%>
		<h5 style="color:red">Incorrect email or password try again.....!</h5><%} %>
		<form action="patientlogin" method="post">
			<div class="form-group">
				<label for="Email">Email</label> <input type="email"
					class="form-control" id="Email" placeholder="Email" name="email">
			</div>
			<div class="form-group">
				<label for="patientPassword">Password</label> <input type="password"
					class="form-control" id="patientPassword" placeholder="Password"
					name="pass">
			</div>
			<button type="submit" class="btn btn-primary btn-block">Login</button>
			<a href="register_patient.jsp">Don't have account?Register</a>
		</form>

</div>
	
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
