
<%@page import="com.ckEditorConfig.ckEditorConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New FAQ</title>
</head>
<body class="container">
	<h4>Edit FAQ</h4>
	<form action="modifyFAQ" method="post">
		
		<div class="form-group">
			<label class="control-label" for="question">Question: </label><br/>
			<textarea cols="50" id="editor1" name="question" rows="10" >${editFAQ.question}</textarea>
			<ckeditor:replace replace="editor1" basePath="/ckeditor/" config="<%=ckEditorConfig.createConfig()%>"/>
			
		</div>
		<div class="form-group">
			<label class="control-label" for="answer">Answer: </label><br/>
			<textarea cols="50" id="editor2" name="answer" rows="10" >${editFAQ.answer}</textarea>
			<ckeditor:replace replace="editor2" basePath="/ckeditor/" config="<%=ckEditorConfig.createConfig() %>"/>
			
		</div>
	   <input type="hidden" name="faqs_id" value="${editFAQ.faqs_id}">
	   <p style="text-align: center">
	   	<button type="submit" class="btn btn-default">Edit</button>
	   	<a class="btn btn-primary" id="cancel" href="faqList" role="button">Cancel</a>
	   </p>
	</form>

 
  
 
</body>
</html>