<%@page import="com.ckEditorConfig.ckEditorConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert Product</title>
</head>
<body class="container">
<form action="insertProduct" method="post" >
 <label for="category_id" style="width: 20%">Category :</label>
 <select class="form-control" id="list_category" name="category_id" style="width: 30%">
	<option value="none" selected>Choose</option>
	<c:forEach var="listCategory" items="${category}">
		<option value="${listCategory.category_id}">${listCategory.category_name}</option>
	 
	</c:forEach>
  </select>
  <br/>
  <label for="supplier_id" style="width: 20%">Supplier :</label>
  <select class="form-control" id="list_supplier" name="supplier_id" style="width: 30%">
	<option value="none" selected>Choose</option>
	<c:forEach var="listSupplier" items="${supplier}">
		<option value="${listSupplier.supplier_id}">${listSupplier.supplier_name}</option>
	 
	</c:forEach>
  </select>
  <br/>
  <label for="product_name" style="width: 100%">Product Name :</label>
  <input id="product_name" name="product_name" size="50"/>
  <br/>
  <div style="width: 50%"> 
  	<label class="control-label" for="product_detailshort">Detail Short: </label><br/>
  
	<textarea cols="50" id="editor1" name="product_detailshort" rows="10" ></textarea>
	<ckeditor:replace replace="editor1" basePath="/ckeditor/" config="<%=ckEditorConfig.createConfig()%>"/>
  </div>
  
  <br/>
  <div style="width: 50%"> 
	  <label class="control-label" for="product_detailfull">Detail Full: </label><br/>
	  <textarea cols="50" id="editor2" name="product_detailfull" rows="15"></textarea>
	  <ckeditor:replace replace="editor2" basePath="/ckeditor/" config="<%=ckEditorConfig.createConfig()%>"/>
  </div>
  <br/>
  <label for="product_importprice" style="width: 100%">Import Price :</label>
  <input id="product_importprice" name="product_importprice" size="50"/>
  <br/>
  <label for="product_saleprice" style="width: 100%">Sale Price :</label>
  <input id="sale_price" name="product_saleprice" size="50"/>
  <br/>
  <label for="product_status" style="width: 100%">Status :</label>
  <input id="status" name="product_status" size="50"/>
  <br/>
  <button type="submit" class="btn btn-default">Submit</button>
 </form>
</body>
</html>