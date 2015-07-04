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
<a href="personAdd">Add New Person</a>
<table class="table">
	
    <thead>
        <tr>
            <th>No.</th>
            <th>Name</th>
            <th>Phone</th>
            <th>IndentityNumber</th>
            <th>Modify</th>
            <th>Delete</th>
          
        </tr>
        <c:forEach var="person" items="${personList}">
        <tr>       	
        	 <td>${person.person_id}</td>
	         <td>${person.name}</td>
	         <td>${person.phone}</td>
	         <td>${person.ID_no}</td>
	         <td><a href="${pageContext.request.contextPath}/admin/modifyPerson?person_id=${person.person_id}">
	         <i class="fa fa-pencil-square-o"></i>
	         </a></td>
	         <td><a href="${pageContext.request.contextPath}/admin/removePerson?person_id=${person.person_id}" onclick="return confirm('Are you sure to delete ${person.name} ?')">
	         <i class="fa fa-times"></i></a></td>
        </tr>
        </c:forEach>
    </thead>
</table>

</body>
</html>