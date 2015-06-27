<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
			<textarea rows="10" cols="100" name="question"></textarea>
		</div>
		<div class="form-group">
			<label class="control-label">Answer: </label><br/>
			<textarea rows="10" cols="100" name="answer"></textarea>
		</div>
	   <input type="hidden" name="faqs_id" value="${editFAQ.faqs_id}">
	   <button type="submit" class="btn btn-default">Submit</button>
	</form>
</body>
</html>