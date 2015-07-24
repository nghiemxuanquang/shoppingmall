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
            <th>Emp ID</th>
            <th>Role ID</th>
            <th>Person ID</th>
           
        </tr>
        <c:forEach var="employee" varStatus="counter" items="${employeeList}">
        <tr>       	
        	 <td>${employee.employee_id}</td>
	         <td>${employee.role_id}</td>
	         <td>${employee.person_id}</td>
	         
        </tr>
        </c:forEach>
    </thead>
</table>


</body>
</html>