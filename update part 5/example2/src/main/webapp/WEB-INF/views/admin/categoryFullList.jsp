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
<a href="#">New Category</a><br/>
<a href="backtoMain">Back</a>
<!--${cateList[0].category_name}  -->
<table class="table">
	
    <thead>
        <tr>
            <th>No.</th>
            <th>Category ID</th>
            <th>Category Name</th>
            <th>Parent_id</th>
            <th>Parent Category</th>
            <th>Modify</th>
            <th>Delete</th>
            
          
        </tr>
        <c:forEach var="category" varStatus="counter" items="${cateList}">
      
	        <tr>       	
	        	 <td>${counter.count}</td>
	        	 <td>${category.category_id}</td>
		         <td>${category.category_name}</td>
		         <td>${category.parent_id}</td>
		         
		         <td>
		   
		       	 <c:choose>
			       	 <c:when test="${not empty category.parent_name }">
			       	 		<span>${category.parent_name}</span>
			       	 </c:when>
			       	 <c:otherwise>
			       	 		<span>Parent Category</span>
			       	 </c:otherwise>
		       	 </c:choose>
		      
		       	 </td>
		       
		       	 <td><a href="${pageContext.request.contextPath}/admin/updateCategory?cate_id=${category.category_id}">
		         <i class="fa fa-pencil-square-o"></i>
		         </a></td>
		         <td><a href="${pageContext.request.contextPath}/admin/deleteCategory?cate_id=${category.category_id}" onclick="return confirm('Are you sure to delete ${person.name} ?')">
		         <i class="fa fa-times"></i></a></td>
		       	
		       
	        </tr>
	       
        </c:forEach>
    </thead>
</table>

</body>
</html>