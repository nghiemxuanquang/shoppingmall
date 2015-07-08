<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ckEditorConfig.ckEditorConfig"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New FAQ</title>

</head>
<body class="container">
	<h4>Add New FAQ</h4>
	<form action="faqAdd" method="post">
		
		<div class="form-group">
			<label class="control-label" for="question">Question: </label><br/>
			<textarea rows="10"  id="editor1" name="question"></textarea>
			<ckeditor:replace replace="editor1" basePath="/ckeditor/" config="<%=ckEditorConfig.createConfig()%>"/>
		</div>
		<div class="form-group">
			<label class="control-label">Answer: </label><br/>
			<textarea rows="10" id="editor2" name="answer"></textarea>
			<ckeditor:replace replace="editor2" basePath="/ckeditor/" config="<%=ckEditorConfig.createConfig() %>"/>
		</div>
	   <p style="text-align: center;">
	   	<button type="submit" class="btn btn-default">Add New</button>
	   	<a class="btn btn-primary" id="cancel" href="faqList" role="button">Cancel</a>
	   </p>
	</form>
</body>
</html>