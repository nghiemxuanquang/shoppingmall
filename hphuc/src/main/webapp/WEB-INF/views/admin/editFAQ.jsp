<%@page import="com.ckeditor.CKEditorConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New FAQ</title>
</head>
<body class="container">
	<h4>Edit FAQ</h4>
	<form action="modifyFAQ" method="post">
		<% 
			  	CKEditorConfig settings = new CKEditorConfig();
			  	settings.addConfigValue("width", "700");
			  	settings.addConfigValue("language", "en");
				Map<String, String> attr = new HashMap<String, String>();
				attr.put("rows", "8");
				attr.put("cols", "50");
		%>
		<div class="form-group">
			<label class="control-label" for="question">Question: </label><br/>
			<ckeditor:editor textareaAttributes="<%=attr %>"  basePath="/ckeditor/" editor="question" value="${editFAQ.question}" config="<%=settings %>" />
		</div>
		<div class="form-group">
			<label class="control-label" for="answer">Answer: </label><br/>
			<ckeditor:editor textareaAttributes="<%=attr %>"  basePath="/ckeditor/" editor="answer" value="${editFAQ.answer}" config="<%=settings %>" />
		</div>
	   <input type="hidden" name="faqs_id" value="${editFAQ.faqs_id}">
	   <button type="submit" class="btn btn-default">Submit</button>
	</form>

 
  
 
</body>
</html>