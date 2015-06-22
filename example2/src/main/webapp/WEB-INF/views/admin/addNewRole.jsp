<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New Role</title>
</head>
<body class="container">
	<h4>Add New Role</h4>
	<form action="roleAdd" method="post">
		
		<div class="form-group">
			<label class="control-label">Position: </label>
			<input type="text" name="position">
		</div>
	   <button type="submit" class="btn btn-default">Submit</button>
	</form>
</body>
</html>