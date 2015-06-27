<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/taglibs.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1.0"/>
<title>
Shopping Home - <decorator:title default="Welcome!" />
</title>


<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/lib/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/lib/bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/toTop.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/shophomepage.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/lib/font-awesome-4.3.0/css/font-awesome.min.css">
<script src="${pageContext.request.contextPath}/resources/lib/jquery/1.11.3/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/lib/bootstrap/js/bootstrap.min.js"></script>




</head>
<body>
   <div class="col-md-12">
      	<%@ include file="/includes/header.jsp"%>
      	  
   </div>
   <div id="container" class="container" style="margin-top: 30px">
   	<div class="row" style="padding-top: 20px]">      
      <div class="col-md-12">
      	<%@ include file="/includes/slideShow.jsp"%>
      </div>
      
      <div class="col-md-3">
      	<%@ include file="/includes/menu-left.jsp"%>  
       
      </div>
      
      <div id="content" class="col-md-9">
         <decorator:body />
      </div>
      <div class="col-md-12">
      	 <%@ include file="/includes/footer.jsp"%>
      </div>
      <div>
      	<a href="#" id="toTop" style="display: inline;">
      	<span id="toTopHover" style="opacity: 0;"></span>
      	To Top
      	</a>
      
      </div>
     
   	</div>
 
   </div>
</body>
</html>