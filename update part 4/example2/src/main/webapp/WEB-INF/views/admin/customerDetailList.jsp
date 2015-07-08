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
<a href="registerCustomer">Register</a><br/>
<a href="backtoMain">Back</a>
<table class="table">
	
    <thead>
        <tr>
            <th>No.</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Address</th>
            <th>Identity Number</th>
            <th>Email</th>
            <th>Birth</th>
            <th>Gender</th>
            <th>Username</th>
            <th>Password</th>
            <th>Register Date</th>
            <th>Modify</th>
            <th>Delete</th>
            
          
        </tr>
        <c:forEach var="customer" varStatus="counter" items="${customerList}">
        
        
        <tr>       	
        	 <td>${counter.count}</td>
	         <td>${customer.name}</td>
	         <td>${customer.phone}</td>
	         <td>${customer.address}</td>
	         <td>${customer.id_no}</td>
	       	 <td>${customer.email}</td>
	       	 <td>${customer.birth}</td>
	       	 <td>
	       	 <c:choose>
		       	 <c:when test="${customer.gender == 1}">
		       	 		Male
		       	 </c:when>
		       	 <c:otherwise>
		       	 		FeMale
		       	 </c:otherwise>
	       	 </c:choose>
	       	 	
	       	 </td>
	       	 <td>${customer.username}</td>
	       	 <td>${customer.password}</td>
	       	 <td>${customer.register_date}</td>
	       	 <td><a href="${pageContext.request.contextPath}/admin/updatePerson?person_id=${customer.person_id}&customer_id=${customer.customer_id}">
	         <i class="fa fa-pencil-square-o"></i>
	         </a></td>
	         <td><a href="${pageContext.request.contextPath}/admin/deletePerson?person_id=${customer.person_id}&customer_id=${customer.customer_id}" onclick="return confirm('Are you sure to delete ${person.name} ?')">
	         <i class="fa fa-times"></i></a></td>
	       	
	       
        </tr>
        </c:forEach>
    </thead>
</table>

</body>
</html>