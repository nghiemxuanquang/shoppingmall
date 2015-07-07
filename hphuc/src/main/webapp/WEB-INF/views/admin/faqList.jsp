<%@page import="com.ckeditor.CKEditorConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FAQ List</title>



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
  
 
  <br/>
  <%
  	CKEditorConfig settings = new CKEditorConfig();
  	settings.addConfigValue("width", "700");
  	settings.addConfigValue("language", "en");
  	
  %>
  
  
  <textarea name="question" id="question" ></textarea>
  
  <input type="button" value="click" id="click"/><br/>
  <br/><br/>
  <textarea rows="10" cols="100" name="answer" id="answer"></textarea>
  
  <ckeditor:replace replace="question" basePath="/ckeditor/" config="<%=settings %>"/>
  
  
  <a  id="link1" onclick="hide()">aaaaaa</a><a id="link2" onclick="show()" style="display:none">bbbbbbb</a>
  
  <input type="button" id="json" value="JSON" /><br/><br/>
  <div id="faqResponse" class="col-md-12"></div><br/>
  <div class="container">
  <h2>Loaded Data through ajax after page Load</h2>
  <table id="example" class="display" width="100%">
   <thead>
    <tr>
     <th align="left">No.</th>
     <th align="left"></th>
     <th align="left">Question</th>
     <th align="left">Answer</th>
     </tr>
   </thead>
   <tbody>
    <tr>
     <td></td>
     <td></td>
     <td></td>
     </tr>
   </tbody>
  </table>
 </div>
  
  <script type="text/javascript">
  	$(document).ready(function(){
  		
  		$('#example').DataTable({
  			"Processing":true,
  			"JQueryUI":true,
  			"ajax" : "${pageContext.request.contextPath}/admin/getFAQtable",
  			"columnDefs": [
  			             {
  			                 "targets": [ 1 ],
  			                 "visible": false,
  			                 "searchable": false
  			             }
  			             ]
  		});
  		
	  	var table = $('#example').DataTable();
	  	 
	    $('#example tbody').on( 'click', 'tr', function () {
	          if ( $(this).hasClass('selected') ) {
	              $(this).removeClass('selected');
	          }
	          else {
	              table.$('tr.selected').removeClass('selected');
	              $(this).addClass('selected');
	              var selected = table.row('.selected').data();
	      	      alert(selected[1]);
	          }
	      } );
	    
	  
  	});
  </script>
  <script>
  $("#click").click(function()
  {
	  var stringtext = CKEDITOR.instances.question.getData();
	  alert(stringtext);
  });
  
  
  $("#json").click(function(){
	
		$.ajax({
			
			type:'GET',
			header:{	
				Accept :"application/json; charset=utf-8",
				"Content-Type": "application/json;charset=utf-8"
			},
			url: '${pageContext.request.contextPath}/admin/getFAQlist',
			success:function(data)
			{
				
				var result ="";
				for(var i=0;i<data.length;i++)
					{
						result +=  "<br/>"+ data[i].question + " - " + data[i].answer;
					}
				$("#faqResponse").html(result);
			},
			error:function(data,status,er) { 
		        alert("error: "+data+" status: "+status+" er:"+er);
		    }
			
		});
		
		
	});
  </script>
 
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
				//$('#question').val(string[0]);
				CKEDITOR.instances.question.setData =string[0];
				$('#answer').val(string[1]);
			
				//$("#test1").val(mydata.getQuestion());
			}
		});
	}
function doAjax2()
{
	var id =$("#sel1").val();
	$.ajax({
		url:'${pageContext.request.contextPath}/admin/getFAQlist',
		type: 'GET',
		dataType :'json',
		data: "{\"id\" : id}",
	    contentType: 'application/json;charset=utf-8',
	    
		success:function(data)
		{
			
			alert("ok");
			

		},
		error:function(data,status,er) { 
	        alert("error: "+data+" status: "+status+" er:"+er);
	    }
	});
}	
	$("#sel1").change(doAjax);	
	
</script>


</body>
</html>