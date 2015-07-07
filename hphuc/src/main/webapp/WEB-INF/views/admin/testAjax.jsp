<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function(){
		

		$("#json").click(function(){
			$.ajax({
				type:'GET',
				header:{
					Accept :"application/json; charset=utf-8",
					"Content-Type": "application/json;charset=utf-8"
				},
				url: '${pageContext.request.contextPath}/json/listJson',
				success:function(data)
				{
					var result ="";
					for(var i=0;i<data.length;i++)
						{
							result += "<br/>" + data[i].id + " - " + data[i].name;
						}
					$(".result").html(result);
				},
				error:function(data,status,er) { 
			        alert("error: "+data+" status: "+status+" er:"+er);
			    }
			});
		});
		
	});
	
	
</script>
</head>
<body>
<input type="button" value="JSON" id="json"/><br/>
<div class="result"></div>
</body>
</html>