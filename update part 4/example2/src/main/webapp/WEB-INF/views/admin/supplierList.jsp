<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Supplier List</title>
</head>
<body class="container">
<a href="supplierAdd">Add New Supplier</a>
<table class="table">
	
    <thead>
        <tr>
            <th>No.</th>
            <th>Supplier Name</th>
            <th>Supplier Address</th>
            <th>Supplier Tel</th>
            <th>Edit</th>
            <th>Remove</th>
        </tr>
        <c:forEach var="supplier" varStatus="counter" items="${supplierList}">
        <tr>       	
        	 <td>${counter.count}</td>
	         <td>${supplier.supplier_name}</td>
	         <td>${supplier.supplier_address}</td>
	         <td>${supplier.supplier_tel}</td>
	         <td><a href="${pageContext.request.contextPath}/admin/modifySupplier?supplier_id=${supplier.supplier_id}">
	         <i class="fa fa-pencil-square-o"></i>
	         </a></td>
	         <td><a href="${pageContext.request.contextPath}/admin/deleteSupplier?supplier_id=${supplier.supplier_id}" onclick="return confirm('Are you sure to delete ${supplier.supplier_name} ?')">
	         <i class="fa fa-times"></i></a></td>
        </tr>
        </c:forEach>
    </thead>
</table>


</body>
</html>