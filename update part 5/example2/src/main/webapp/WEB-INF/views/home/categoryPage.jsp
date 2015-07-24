<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page import="java.util.*"%>  
<%@page import="com.exp.model.Category"%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body class="container">
<%!
public String dequy(List<Category> list,int parent)
{
	String name ="";
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).getParent_id()  == parent)
		{
			name = list.get(i).getCategory_name();
			int id = list.get(i).getCategory_id();
			dequy(list, id);
	
		
		}
	}
	return name;

}
%>
<div id="MainMenu">
  <div class="list-group panel">
  <c:forEach var="category" varStatus="counter"  items="${cateList}">
    <c:if test="${category.parent_id ==0}">
    <a href="#demo${category.category_id}" class="list-group-item list-group-item-success" data-toggle="collapse" data-parent="#MainMenu">${category.category_name}</a>
    </c:if>
     <c:forEach var="category1" varStatus="counter"  items="${cateList}">
        <c:if test="${category1.parent_id ==category.category_id}">
   			 <div class="collapse" id="demo${category.category_id}">
   			 	  <a href="showProduct?cate_id=${category1.category_id}" class="list-group-item">${category1.category_name}</a>
   			 </div>
  		</c:if>
	    
	    
	      
  
     </c:forEach>
    
   </c:forEach>  
  </div>
  

  
</div>

 
  
   
    

   		
  


	


</body>
</html>