<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="leftcolumn">
	<dl class="dropdown">
		<dt id="one-ddheader" class="upperdd" onmouseover="ddMenu('one',1)"
			onmouseout="ddMenu('one',-1)">Dropdown One</dt>
		<dd id="one-ddcontent" onmouseover="cancelHide('one')"
			onmouseout="ddMenu('one',-1)">
			<ul>
				<li><a href="#" class="underline">Navigation Item 1</a></li>
				<li><a href="#" class="underline">Navigation Item 2</a></li>
				<li><a href="#">Navigation Item 3</a></li>
			</ul>
		</dd>
	</dl>
	<dl class="dropdown">
		<dt id="two-ddheader" class="upperdd" onmouseover="ddMenu('two',1)"
			onmouseout="ddMenu('two',-1)">Dropdown Two</dt>
		<dd id="two-ddcontent" onmouseover="cancelHide('two')"
			onmouseout="ddMenu('two',-1)">
			<ul>
				<li><a href="#" class="underline">Navigation Item 1</a></li>
				<li><a href="#" class="underline">Navigation Item 2</a></li>
				<li><a href="#" class="underline">Navigation Item 3</a></li>
				<li><a href="#" class="underline">Navigation Item 4</a></li>
				<li><a href="#">Navigation Item 5</a></li>
			</ul>
		</dd>
	</dl>
	<dl class="dropdown">
		<dt id="three-ddheader" class="upperdd">Menu Item Three</dt>
	</dl>
	<dl class="dropdown">
		<dt id="four-ddheader" onmouseover="ddMenu('four',1)"
			onmouseout="ddMenu('four',-1)">Dropdown Four</dt>
		<dd id="four-ddcontent" onmouseover="cancelHide('four')"
			onmouseout="ddMenu('four',-1)">
			<ul>
				<li><a href="#" class="underline">Navigation Item 1</a></li>
				<li><a href="#">Navigation Item 2</a></li>
			</ul>
		</dd>
	</dl>
</div>

<!-- <div>

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
</div>
</div> -->
