<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body class="container">
<h4>Modify Person</h4>
	<form action="createNewEmployee" method="post">
		
		<div class="form-group">
			<label class="control-label">Name: </label>
			<input type="text" name="name" >
		</div>
		<div class="form-group">
			<label class="control-label">Phone : </label>
			<input type="text" name="phone"  >
		</div>
		<div class="form-group">
			<label class="control-label">Identity Number : </label>
			<input type="text" name="ID_no" >
		</div>
		<div class="form-group">
			<label class="control-label">Email : </label>
			<input type="text" name="email" >
		</div>
		<div class="form-group">
			<label class="control-label">Address : </label>
			<input type="text" class="form-group" name="address" >
		</div>
		<div class="form-group">
			<label class="control-label">Birth : </label>
			<input type="text" class="form-group" name="birth" >
		</div>
		<div class="form-group">
			<label class="control-label">Gender : </label>
			<input type="text" class="form-group" name="gender" >
		</div>
		<div class="form-group">
			<label class="control-label">Username : </label>
			<input type="text" class="form-group" name="username">
		</div>
		<div class="form-group">
			<label class="control-label">Password : </label>
			<input type="password" class="form-group" name="password" >
		</div>
		<div class="form-group">
			<label class="control-label">Position : </label>
			<input type="text" class="form-group" name="role_id" >
		</div>

	   <button type="submit" class="btn btn-default">Submit</button>
	</form>

</body>
</html>