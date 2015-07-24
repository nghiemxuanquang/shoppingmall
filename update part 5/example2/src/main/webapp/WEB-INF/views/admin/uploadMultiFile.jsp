<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h3>Upload Image For Product : </h3>
  
 	<h4>Product Name :<label style="color: red" >${product.product_name}</label></h4>
    <form method="POST" action="doUpload" enctype="multipart/form-data">
        File to upload (1): <input type="file" name="file"><br />      
        File to upload (2): <input type="file" name="file"><br />  
        File to upload (3): <input type="file" name="file"><br />  
        File to upload (4): <input type="file" name="file"><br />  
        File to upload (5): <input type="file" name="file"><br />   
        <input type="hidden" value="${product.product_id}"  name="product_id"/>
        <input type="submit" value="Upload">
    </form>
</body>
</html>