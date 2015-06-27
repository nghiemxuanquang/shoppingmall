<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Role List</title>
</head>
<body class="container">
<a href="roleAdd">Add New Role</a>
<table class="table">
	
    <thead>
        <tr>
            <th>No.</th>
            <th>Position</th>
            <th>Modify</th>
            <th>Remove</th>
        </tr>
        <c:forEach var="role" varStatus="counter" items="${roleList}">
        <tr>       	
        	 <td>${counter.count}</td>
	         <td>${role.position}</td>
	         <td><a href="${pageContext.request.contextPath}/admin/modifyRole?role_id=${role.role_id}">
	         <i class="fa fa-pencil-square-o"></i>
	         </a></td>
	         <td><a href="${pageContext.request.contextPath}/admin/removeRole?role_id=${role.role_id}" onclick="return confirm('Are you sure to delete ${role.position} ?')">
	         <i class="fa fa-times"></i></a></td>
        </tr>
        </c:forEach>
    </thead>
</table>


</body>
</html>