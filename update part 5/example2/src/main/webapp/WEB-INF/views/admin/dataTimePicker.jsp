<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class='col-sm-6'>
            <div class="form-group">
                <div class='input-group date' id='datetimepicker1'>
                    <input type='text' id="datetimepicker" class="form-control" />
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            $(function () {
            	$("#datetimepicker").datepicker();
            	$("#datetimepicker").datepicker("setDate", "0");
            	$("#datetimepicker").datepicker( "option", "dateFormat", "yy-mm-dd" );
            	$("#datetimepicker").datepicker( "option", "showAnim", "clip" );
            });
        </script>
    </div>
</div>
</body>
</html>