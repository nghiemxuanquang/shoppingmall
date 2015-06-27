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
<a href="createNewEmployee">Create New Employee</a><br/>
<a href="backtoMain">Back</a>
<table class="table">
	
    <thead>
        <tr>
            <th>No.</th>
            <th>Name</th>
            <th>Position</th>
            <th>Phone</th>
            <th>Address</th>
            <th>Identity Number</th>
            <th>Email</th>
            <th>Birth</th>
            <th>Gender</th>
            <th>Username</th>
            <th>Password</th>
            
          
        </tr>
        <c:forEach var="employee" varStatus="counter" items="${employeeList}">
        
        
        <tr>       	
        	 <td>${counter.count}</td>
	         <td>${employee.name}</td>
	         <td>${employee.position}</td>
	         <td>${employee.phone}</td>
	         <td>${employee.address}</td>
	         <td>${employee.id_no}</td>
	       	 <td>${employee.email}</td>
	       	 <td>${employee.birth}</td>
	       	 <td>
	       	 <c:choose>
		       	 <c:when test="${employee.gender == 1}">
		       	 		Male
		       	 </c:when>
		       	 <c:otherwise>
		       	 		FeMale
		       	 </c:otherwise>
	       	 </c:choose>
	       	 	
	       	 </td>
	       	 <td>${employee.username}</td>
	       	 <td>${employee.password}</td>
	       	 <td><a href="${pageContext.request.contextPath}/admin/updateEmployee?person_id=${employee.person_id}&employee_id=${employee.emp_id}">
	         <i class="fa fa-pencil-square-o"></i>
	         </a></td>
	          <td><a href="${pageContext.request.contextPath}/admin/deleteEmployee?person_id=${employee.person_id}&employee_id=${employee.emp_id}" onclick="return confirm('Are you sure to delete ${employee.name} ?')">
	         <i class="fa fa-times"></i></a></td>
	       	
	       
        </tr>
        </c:forEach>
    </thead>
</table>

</body>
</html>