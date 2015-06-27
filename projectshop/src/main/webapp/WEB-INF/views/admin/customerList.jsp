<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body class="container">

<table class="table">
	
    <thead>
        <tr>
            <th>No.</th>
            <th>Person ID</th>
            <th>Register Date</th>
            
          
        </tr>
        <c:forEach var="customer" items="${customerList}">
        
        
        <tr>       	
        	 <td>${customer.customer_id}</td>
	         <td>${customer.person_id}</td>
	         <td>${customer.reg_date}</td>
	       
	       
        </tr>
        </c:forEach>
    </thead>
</table>

</body>
</html>