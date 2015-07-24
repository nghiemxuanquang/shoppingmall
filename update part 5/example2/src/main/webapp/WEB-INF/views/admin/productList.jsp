<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Product</title>
</head>
<body class="container">

<table class="table">
	
    <thead>
        <tr>
            <th>No.</th>
            <th>Category_id</th>
            <th>Supplier_id</th>
            <th>Product Name</th>
            <th>Detail Short</th>
            <th>Detail Full</th>
            <th>Import Price</th>
            <th>Sale Price</th>
            <th>Status</th>
            <th>Date Added</th>
            <th>Last Modified</th>        
          
        </tr>
        <c:forEach var="product" varStatus="counter" items="${productList}">
        <tr>       	
        	 <td>${counter.count}</td>
	         <td>${product.category_id}</td>
	         <td>${product.supplier_id}</td>
	         <td>${product.product_name}</td>
	    	 <td>${product.product_detailshort}</td>
	    	 <td>${product.product_detailfull}</td>
	    	 <td>${product.product_importprice}</td>
	    	 <td>${product.product_saleprice}</td>
	    	 <td>${product.product_status}</td>
	    	 <td>${product.date_added}</td>
	    	 <td>${product.last_modified}</td>
	    	 <td><a href="${pageContext.request.contextPath}/admin/updateProductImage?product_id=${product.product_id}">
	         <i class="fa fa-pencil-square-o"></i>
	         </a></td>
	    	 <td><a href="${pageContext.request.contextPath}/admin/updateProduct?product_id=${product.product_id}">
	         <i class="fa fa-pencil-square-o"></i>
	         </a></td>
	         <td><a href="${pageContext.request.contextPath}/admin/deleteProduct?product_id=${product.product_id}" onclick="return confirm('Are you sure to delete this product ?')">
	         <i class="fa fa-times"></i></a></td>
        </tr>
        </c:forEach>
    </thead>
</table>
<br/>
 
<table class="table">
	
    <thead>
        <tr>
            <th>No.</th>
            <th>Category </th>
            <th>Supplier </th>
            <th>Product Name</th>
            
            <th>Detail Short</th>
            <th>Detail Full</th>
            <th>Import Price</th>
            <th>Sale Price</th>
            <th>Status</th>
            <th>Date Added</th>
            <th>Last Modified</th>        
          
        </tr>
        <c:forEach var="product1" varStatus="counter" items="${productDetailList}">
        <tr>       	
        	 <td>${counter.count}</td>
	         <td>${product1.Category}</td>
	         <td>${product1.Supplier}</td>
	         <td>${product1.ProductName}</td>
	
	         <td>${product1.ShortDetail}</td>
	         <td>${product1.FullDetail}</td>
	         <td>${product1.ImportPrice}</td>
	         <td>${product1.SalePrice}</td>
	         <td>${product1.Status}</td>
	         <td><fmt:formatDate value="${product1.Created}" pattern="dd-MM-yyyy" /></td>
	         <td><fmt:formatDate value="${product1.Last_modified}" pattern="dd-MM-yyyy" /></td>
	       
        </tr>
        </c:forEach>
    </thead>
</table>
</body>
</html>