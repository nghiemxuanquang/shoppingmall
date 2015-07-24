<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Login</title>

</head>
<body>

	<div class="example">
        <div class="container">
       	 <div class="col-md-8">
        	<div class="panel panel-default">
			  <div class="panel-heading" style="background: black;color: white">
			    <h3 class="panel-title" >Login</h3>
			  </div>
			  <div class="panel-body">
		
				<div class="row">
		               
		                <form class="form-horizontal">
		                    <div class="form-group">
		                        <label class="control-label col-xs-2">Email</label>
		                        <div class="col-xs-9">
		                            <input type="email" class="form-control" placeholder="Email">
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="control-label col-xs-2">Password</label>
		                        <div class="col-xs-9">
		                            <input type="password" class="form-control" placeholder="Password">
		                        </div>  
		                    </div>
		                    <!-- switch checkbox -->
		                    
		                    <div style="margin-left: 127px;margin-bottom: 15px">
		                    	<div>
								<input type="checkbox" id="switch1" name="switch1" class="switch" />
								<label for="switch1">Remember Me</label>
								</div>
		              

		                    </div>
		                    
		                 	
		                    <div class="form-group">
		                        <div class="col-xs-offset-2 col-xs-10">   
		                            <button type="submit" class="btn btn-primary">Login</button>
		                            
		                             <a href="#">Forget your account?</a>
		                        </div>
		                       
		                    </div>   
		                </form>
		            </div>
		
			  </div>
			</div>
        
         </div>
        	
        
          
        </div>
    </div>
	
</body>
</html>