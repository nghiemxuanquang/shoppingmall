<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New Supplier</title>
</head>
<body class="container">
	<h4>Add New Supplier</h4>
	<form action="supplierAdd" method="post">
		
		<div class="form-group">
			<label class="control-label">Name: </label>
			<input type="text" name="supplier_name">
			
			<label class="control-label">Address: </label>
			<input type="text" name="supplier_address">
			
			<label class="control-label">Tel: </label>
			<input type="text" name="supplier_tel">
		</div>
	   <button type="submit" class="btn btn-default">Add New</button>
	</form>
</body>
</html>