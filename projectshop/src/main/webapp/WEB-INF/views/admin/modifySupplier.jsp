<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Supplier</title>
</head>
<body class="container">
	<h4>Edit Supplier </h4>
	<form action="modifySupplier" method="post">
		
		<div class="form-group">
			<label class="control-label">Name: </label>
			<input type="text" name="supplier_name" value="${editSupplier.supplier_name}">
			
			<label class="control-label">Address: </label>
			<input type="text" name="supplier_address" value="${editSupplier.supplier_address}">
			
			<label class="control-label">Tel: </label>
			<input type="text" name="supplier_tel" value="${editSupplier.supplier_tel}">
		</div>
		<input type="hidden" name="supplier_id" value="${editSupplier.supplier_id}">
	   <button type="submit" class="btn btn-default">Save</button>
	</form>
</body>
</html>