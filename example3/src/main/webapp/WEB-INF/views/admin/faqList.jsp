<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Role List</title>
<script type="text/javascript"  src="http://code.jquery.com/jquery-1.11.3.min.js"></script>

</head>
<body class="container">
<a href="faqAdd">Add New FAQ</a><br/>
<a href="backtoMain">Back</a>
<table class="table">
	
    <thead>
        <tr>
            <th>No.</th>
            <th>FAQs_id</th>
            <th>Question</th>
            <th>Answer</th>
        </tr>
        <c:forEach var="list" varStatus="counter" items="${faqList}">
        <tr>       	
        	 <td>${counter.count}</td>
	         <td>${list.faqs_id}</td>
	         <td>${list.question }</td>
	         <td>${list.answer}</td>
	         <td><a href="${pageContext.request.contextPath}/admin/modifyFAQ?faqs_id=${list.faqs_id}">
	         <i class="fa fa-pencil-square-o"></i>
	         </a></td>
	         <td><a href="${pageContext.request.contextPath}/admin/faqDetele?faqs_id=${list.faqs_id}" onclick="return confirm('Are you sure to delete ${person.name} ?')">
	         <i class="fa fa-times"></i></a></td>
	         
	  
	      
        </tr>
        </c:forEach>
    </thead>
</table>
<div class="form-group" style="width:100px">
  <label for="sel1">Select list:</label>
  	<script>
		 var list = new Array();
	</script>
   <c:set var="list" value='${faqList}' />
  <select class="form-control" id="sel1">
	<option value="none" selected>Choose</option>
	  <c:forEach var="listFAQ" items="${faqList}" varStatus="counter" begin="0">
	   	<option value="${listFAQ.faqs_id}">${listFAQ.faqs_id}</option>
	     	<script>
	     	list.push('${listFAQ}');
	    	</script>
	   </c:forEach>
  </select>
  
 
  
  <textarea rows="10" cols="100" name="question" id="question"></textarea>
  <textarea rows="10" cols="100" name="answer" id="answer"></textarea>
  
  <a  id="link1" onclick="hide()">aaaaaa</a><a id="link2" onclick="show()" style="display:none">bbbbbbb</a>
</div>
<script>
/*function display()
{
	var id = $( "#sel1" ).val();
	$.get()

	$("#test3").text(list.length);
	$("#test1").val(list[0][14]);
}
   	$("#sel1").change(display);
   	display();
		
	*/
function hide()
	{
		$("#link1").click(function(){
			$("#link2").show();
			$("#link1").hide();
		})
	}
function show()
{
	$("#link2").click(function(){
		$("#link2").hide();
		$("#link1").show();
	})
}
function doAjax()
	{
		
		$.ajax({
			url:'getFAQ',
			data: ({id :  $("#sel1").val()}),
		
			success:function(mydata)
			{
				
				//alert(mydata);
				var string = mydata.split('|');
				$('#question').val(string[0]);
				$('#answer').val(string[1]);
			
				//$("#test1").val(mydata.getQuestion());
			}
		});
	}
	$("#sel1").change(doAjax);	
	
</script>


</body>
</html>