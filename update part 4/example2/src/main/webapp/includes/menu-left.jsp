<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  	
<div>

<div id="MainMenu">
  <div class="list-group panel">
    <a href="#demo3" class="list-group-item list-group-item-success" data-toggle="collapse" data-parent="#MainMenu">Item 3</a>
    <div class="collapse" id="demo3">
      <a href="#SubMenu1" class="list-group-item" data-toggle="collapse" data-parent="#SubMenu1">Subitem 1 <i class="fa fa-caret-down"></i></a>
      <div class="collapse list-group-submenu" id="SubMenu1">
        <a href="#" class="list-group-item" data-parent="#SubMenu1">Subitem 1 a</a>
        <a href="#" class="list-group-item" data-parent="#SubMenu1">Subitem 2 b</a>
        <a href="#SubSubMenu1" class="list-group-item" data-toggle="collapse" data-parent="#SubSubMenu1">Subitem 3 c <i class="fa fa-caret-down"></i></a>
        <div class="collapse list-group-submenu list-group-submenu-1" id="SubSubMenu1">
          <a href="#" class="list-group-item" data-parent="#SubSubMenu1">Sub sub item 1</a>
          <a href="#" class="list-group-item" data-parent="#SubSubMenu1">Sub sub item 2</a>
        </div>
        <a href="#" class="list-group-item" data-parent="#SubMenu1">Subitem 4 d</a>
      </div>
      <a href="javascript:;" class="list-group-item">Subitem 2</a>
      <a href="javascript:;" class="list-group-item">Subitem 3</a>
    </div>
    <a href="#demo4" class="list-group-item list-group-item-success" data-toggle="collapse" data-parent="#MainMenu">Item 4</a>
    <div class="collapse" id="demo4">
      <a href="" class="list-group-item">Subitem 1</a>
      <a href="" class="list-group-item">Subitem 2</a>
      <a href="" class="list-group-item">Subitem 3</a>
    </div>
  </div>
  <input type="button" id="json" value="JSON" /><br/><br/>
  <div id="faqResponse" class="col-md-12"></div><br/>
  <c:import url="category1"></c:import>

</div>
<script type="text/javascript">
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
 