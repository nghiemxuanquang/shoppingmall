<%@page import="com.ckeditor.CKEditorConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FAQ List</title>



</head>
<body class="container">
<!--  
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
  <a  id="link1" onclick="hide()">aaaaaa</a><a id="link2" onclick="show()" style="display:none">bbbbbbb</a>
  
  <input type="button" id="json" value="JSON" /><br/><br/>
  <div id="faqResponse" class="col-md-12"></div><br/>
-->
  
  
 <div id="table-container" class="col-md-12">
  <a href="faqAdd">Add New FAQ</a><br/>
  <a href="backtoMain">Back</a>
  <h2>Loaded Data through ajax after page Load</h2>
  <table id="example" class="display" >
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
 <div id="table-detail" class="hidden" >
 	<a id="show_table" class="btn btn-primary" href="#" role="button"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;Back</a>
 	<div >
 	<div class="panel panel-default" style="margin-top:10px;text-align: left">
			  <div class="panel-heading" style="background: blue;color: white">
			    <h3 class="panel-title" style="font-weight: bolder;" >Question</h3>
			  </div>
			  <div class="panel-body">
					<div id="p_question" class="disable" style="margin:10px 0 10px 0"></div>
			  </div>	
	
	</div>
	<div class="panel panel-default" style="margin-top:10px;text-align: right">
			  <div class="panel-heading" style="background: orange;color: white">
			    <h3 class="panel-title" style="font-weight: bolder;" >Answer</h3>
			  </div>
			  <div class="panel-body">
					<div id="p_answer" class="disable" style="margin:10px 0 10px 0"></div>
			  </div>	
	
	</div>
 
 	
 	<p style="text-align: center">
 	<a class="btn btn-primary" id="editlink" role="button">Edit</a>
 	<a class="btn btn-warning" id="deletelink" role="button">Delete</a>
 	</p>

 	</div>
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
	              $("#p_question").html( selected[2]);
	              $("#p_answer").html( selected[3]);
	              $("#p_faqID").val(selected[1]);
	             
	              var url ="${pageContext.request.contextPath}/admin/modifyFAQ?faqs_id="+selected[1];
	              var delurl ="${pageContext.request.contextPath}/admin/faqDetele?faqs_id="+selected[1];
	              var onlick="return confirm('Are you sure to delete it?')";
	              $("#editlink").attr("href",url);
	              $("#deletelink").click(function(){
	            	 
	            	  return confirm('Are you sure to delete it?')
	              });
	              
	              $("#deletelink").attr("href",delurl);
	         
	              $("#table-container").hide();
	              $("#table-detail").removeClass('hidden');
	              $("#table-detail").show("slow");
	          }
	      } );
		$("#show_table").click(function()
		{ 
			$("#table-detail").hide();
			$("#table-container").show();
					
		});
	    
	  
  	});
  </script>
  <!-- 
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
 -->

</body>
</html>