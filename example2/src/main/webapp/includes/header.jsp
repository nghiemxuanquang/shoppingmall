<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>

 <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/shop"><span class="glyphicon glyphicon-home"></span>&nbsp;Home Shopping</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="admin/index"><span class="glyphicon glyphicon-book"></span>&nbsp;About</a>
                    </li>
                    <li>
                        <a href="#"><span class="glyphicon glyphicon-wrench"></span>&nbsp;Services</a>
                    </li>
                    <li>
                        <a href="login"><span class="glyphicon glyphicon-phone"></span>&nbsp;Contact</a>
                    </li>
                              
       
                </ul>
                
                <div class="navbar-right">
        
               	  
               	  <button class="btn btn-danger navbar-btn" onclick="location.href='register'"><span class="glyphicon glyphicon-plus-sign"></span>&nbsp;Register</button>
                  <button class="btn btn-info navbar-btn" onclick="location.href='login'"><span class="glyphicon glyphicon-user" ></span>&nbsp;Login</button>
             
              
                
                <!-- 
				<div class="btn-group">
  					<button type="button" class="btn btn-info navbar-btn dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
    					Account <span class="caret"></span>
  					</button>
				  <ul class="dropdown-menu" role="menu">
				    <li><a href="#">Login</a></li>
				    <li><a href="#">Register</a></li>
				   
				  </ul>
				</div>
                -->
               
                
                 <a href="#" style="color: white">
                       <span class="glyphicon glyphicon-shopping-cart"  title="Your Shopping Cart"></span>
                       
                       <span class="badge" style="width: 21px;background-color: red">0</span>
                 </a>
                
            	</div>
                
                
            </div>             
            <!-- /.navbar-collapse -->
            
            
            
        </div>
        <!-- /.container -->
    </nav>
