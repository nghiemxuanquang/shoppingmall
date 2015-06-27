<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin</title>
</head>
<body>
<ul class="nav nav-tabs" id="myTab" >
  <li role="presentation"><a href="roleList" >Role Management</a></li>
  <li role="presentation"><a href="employeeFullList">Employee Management</a></li>
  <li role="presentation"><a href="customerFullList" >Customer Management</a></li>
  <li role="presentation"><a href="categoryFullList" >Category Management</a></li>
  <li role="presentation"><a href="faqList" >FAQ Management</a></li>
  <li role="presentation"><a href="supplierList">Supplier Management</a></li>
</ul>

<script >
/*$('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
	  //alert(e.target);// newly activated tab
	  var url = $(e.target).attr('href');
	  alert($(e.target).attr('href'));
	  e.relatedTarget // previous active tab

	  window.location.href = url;
	  $('#myTab a[href="'+ url	+'"]').tab('show');
	
	
})*/
$('ul.nav nav-tabs li a').click(function(e)
{
	 $('ul.nav-tabs li.active').removeClass('active')
	 $(this).parent('li').addClass('active')
})

</script>
</body>
</html>