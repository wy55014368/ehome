<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'order_manager.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>运单详情</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="css/AdminLTE.min.css">
<!-- AdminLTE Skins. We have chosen the skin-blue for this starter
        page. However, you can choose any other skin. Make sure you
        apply the skin class to the body tag so the changes take effect.
  -->
<link rel="stylesheet" href="css/skin-blue.min.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="../js/html5shiv.min.js"></script>
  <script src="../js/respond.min.js"></script>
  <![endif]-->

</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

	<!-- Main Header -->
	<header class="main-header"> <!-- Logo --> <!--<a href="index2.html" class="logo">-->
	<a href="#" class="logo" style="background-color: #DD4B39"> <!-- mini logo for sidebar mini 50x50 pixels -->
		<span class="logo-mini"><b>物</b>流</span> <!-- logo for regular state and mobile devices -->
		<span class="logo-lg"><b>用户物流</b>查询系统</span>
	</a> <!-- Header Navbar --> <nav class="navbar navbar-static-top"
		style="background-color:#DD4B39" role="navigation"> <!-- Sidebar toggle button-->
	<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
		role="button"> <span class="sr-only">Toggle navigation</span>
	</a> <!-- Navbar Right Menu -->
	<div class="navbar-custom-menu">
		<ul class="nav navbar-nav">
			<!-- Messages: style can be found in dropdown.less-->
			<li class="dropdown messages-menu">
				<!-- Menu toggle button --> <!--            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-envelope-o"></i>
              <span class="label label-success">4</span>
            </a>-->
				<ul class="dropdown-menu" style="background-color: #DD4B39">
					<li>
						<!-- inner menu: contains the messages -->
						<ul class="menu">
							<li>
								<!-- start message --> <a href="#">
									<div class="pull-left">
										<!-- User Image -->
										<img src="img/user7-128x128.jpg" class="img-circle"
											alt="User Image">
									</div> <!-- Message title and timestamp -->
									<h4>
										Support Team <small><i class="fa fa-clock-o"></i> 5
											mins</small>
									</h4> <!-- The message -->
									<p>Why not buy a new awesome theme?</p>
							</a>
							</li>
							<!-- end message -->
						</ul> <!-- /.menu -->
					</li>
					<li class="footer"><a href="#">See All Messages</a></li>
				</ul>
			</li>
			<!-- /.messages-menu -->

			<!-- Notifications Menu -->
			<li class="dropdown notifications-menu">
				<!-- Menu toggle button --> <!--<a href="#" class="dropdown-toggle" data-toggle="dropdown">-->
				<!--<i class="fa fa-bell-o"></i>--> <!--<span class="label label-warning">10</span>-->
				<!--</a>-->
				<ul class="dropdown-menu">
					<li class="header">You have 10 notifications</li>
					<li>
						<!-- Inner Menu: contains the notifications -->
						<ul class="menu">
							<li>
								<!-- start notification --> <a href="#"> <i
									class="fa fa-users text-aqua"></i> 5 new members joined today
							</a>
							</li>
							<!-- end notification -->
						</ul>
					</li>
					<li class="footer"><a href="#">View all</a></li>
				</ul>
			</li>
			<!-- Tasks Menu -->
			<li class="dropdown tasks-menu">
				<!-- Menu Toggle Button --> <!--<a href="#" class="dropdown-toggle" data-toggle="dropdown">-->
				<!--<i class="fa fa-flag-o"></i>--> <!--<span class="label label-danger">9</span>-->
				<span style="line-height: 50px;color: #fff;">客服电话：028-85184953</span>
				<!--</a>-->
				<ul class="dropdown-menu">
					<li class="header">You have 9 tasks</li>
					<li>
						<!-- Inner menu: contains the tasks -->
						<ul class="menu">
							<li>
								<!-- Task item --> <a href="#"> <!-- Task title and progress text -->
									<h3>
										Design some buttons <small class="pull-right">20%</small>
									</h3> <!-- The progress bar -->
									<div class="progress xs">
										<!-- Change the css width attribute to simulate progress -->
										<div class="progress-bar progress-bar-aqua" style="width: 20%"
											role="progressbar" aria-valuenow="20" aria-valuemin="0"
											aria-valuemax="100">
											<span class="sr-only">20% Complete</span>
										</div>
									</div>
							</a>
							</li>
							<!-- end task item -->
						</ul>
					</li>
					<li class="footer"><a href="#">View all tasks</a></li>
				</ul>
			</li>
			<!-- User Account Menu -->

			<li class="dropdown user user-menu">
				<!-- Menu Toggle Button --> <a href="#" class="dropdown-toggle"
				data-toggle="dropdown" style="background-color: #DD4B39"> <!-- The user image in the navbar-->
					<img src="img/user7-128x128.jpg" class="user-image"
					alt="User Image"> <!-- hidden-xs hides the username on small devices so only the image appears. -->
					<span class="hidden-xs">13568981610</span>
			</a>

				<ul class="dropdown-menu">
					<!-- The user image in the menu -->
					<li class="user-header" style="background-color: #DD4B39"><img
						src="img/user7-128x128.jpg" class="img-circle" alt="User Image">

						<!--<p>--> <!--Alexander Pierce - Web Developer--> <!--<small>Member since Nov. 2012</small>-->
						<!--</p>-->
						<p>13568981610</p></li>
					<li class="user-body">
						<div class="row">
							<div
								style="float: right;border: 1px solid black;width:50px;
                height: 50px;font-size: 20px;line-height: 50px;text-align: center;">
								<a href="page/login_user.html">关闭</a>
							</div>
						</div> <!-- Menu Body --> <!--<li class="user-body">--> <!--<div class="row">-->
						<!--<div class="col-xs-4 text-center">--> <!--<a href="#">Followers</a>-->
						<!--</div>--> <!--<div class="col-xs-4 text-center">--> <!--<a href="#">Sales</a>-->
						<!--</div>--> <!--<div class="col-xs-4 text-center">--> <!--<a href="#">Friends</a>-->
						<!--</div>--> <!--</div>--> <!--&lt;!&ndash; /.row &ndash;&gt;-->
						<!--</li>--> <!--&lt;!&ndash; Menu Footer&ndash;&gt;--> <!--<li class="user-footer">-->
						<!--<div class="pull-left">--> <!--<a href="#" class="btn btn-default btn-flat">Profile</a>-->
						<!--</div>--> <!--<div class="pull-right">--> <!--<a href="#" class="btn btn-default btn-flat">Sign out</a>-->
						<!--</div>--> <!--</li>-->
				</ul>

			</li>
			<!-- Control Sidebar Toggle Button -->
			<!--<li>
            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
          </li>-->
		</ul>
	</div>
	</nav> </header>
	<!-- Left side column. contains the logo and sidebar -->
	<aside class="main-sidebar" style="background-color: white"> <!-- sidebar: style can be found in sidebar.less -->
	<!--<section class="sidebar">--> <!-- Sidebar user panel (optional) -->
	<!--<div class="user-panel">
        &lt;!&ndash;<div class="pull-left image">
          &lt;!&ndash;<img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">&ndash;&gt;
          &lt;!&ndash;<div class="img-circle">导航</div>&ndash;&gt;
        </div>&ndash;&gt;
        <div class="pull-left info">
          &lt;!&ndash;<p>Alexander Pierce</p>&ndash;&gt;
          &lt;!&ndash; Status &ndash;&gt;
          &lt;!&ndash;<a href="#">&lt;!&ndash;<i class="fa fa-circle text-success"></i>&ndash;&gt; 导航</a>&ndash;&gt;
          &lt;!&ndash;<div style="height: 20px">导航</div>&ndash;&gt;
        </div>
      </div>--> <!-- search form (Optional) --> <!--<form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          &lt;!&ndash;<input type="text" name="q" class="form-control" placeholder="Search...">&ndash;&gt;
              &lt;!&ndash;<span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>&ndash;&gt;
        </div>
      </form>--> <!-- /.search form --> <!--<div style="color: white">导航</div>-->
	<!-- Sidebar Menu --> <section class="sidebar">
	<ul class="sidebar-menu">
		<!--<li class="header">HEADER</li>-->
		<li class="header" style="background-color: white">导航</li>
		<!-- Optionally, you can add icons to the links -->
		<li class="active" style="background-color: white;"><a
			href="page/yonghuyundan.html"><i class="fa fa-files-o"></i><span
				style="font-weight:bold;">订单列表</span></a></li>
		<li><a href="#"><i class="fa  fa-gear"></i> <span
				class="back" style="font-weight:bold;">退出</span></a></li>
		<li class="treeview">
			<!--<a href="#"><i class="fa fa-link"></i> &lt;!&ndash;<span>Multilevel</span>&ndash;&gt;-->
			<!-- <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>--> <!--<ul class="treeview-menu">
            <li><a href="#">Link in level 2</a></li>
            <li><a href="#">Link in level 2</a></li>
          </ul>-->
		</li>
	</ul>
	<!-- /.sidebar-menu --> </section> <!-- /.sidebar --> </aside>

	<!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper">
		<!-- Content Header (Page header) -->
		<section class="content-header"> <!-- <h1>
        Page Header
        <small>Optional description</small>
      </h1>-->
		<ol class="breadcrumb">
			<li><a href="page/yonghuyundan.html"><i class="fa fa-home"></i>
					首页</a></li>
			<li class="active"><a href="page/yonghuyundan.html">运单详情</a></li>
		</ol>
		</section>
			<span style="font-size: 24px;margin-left: 10px;">运单管理</span>

		<!-- Main content -->
		<section class="content">
		<div
			style="width:95%;height:750px;background-color: white;margin-left: 10px;border:1px solid gray;">
			<div style="width: 120px;font-size: 22px;margin-left: 5px;">运单详情</div>
			<button style="margin-top: 10px;display: block;margin-left: 42px;"
				class="list_return">返回列表</button>
			<ul style="font-size: 18px;list-style-type: none;width: 65%;height:90%;float:left;display: inline-block;">
				<li style="margin-top: 10px;"><span style="font-weight: bold">订单信息</span>
					<hr style="margin: 0" /> 
					系统订单号：<span class="sp1">YT20161224100338</span>
					<span style="margin-left: 160px;">运单号：<span>${wbMap.goodsWaybillId }</span></span><br />
					运单状态：<span class="sp2">等待配送</span><br />
					下单时间：<span class="sp3">2016-12-24 10:03</span><br />
					 仓储区域：红区<br />
					  即日达时效：15点截单时间22:00之前送达<br />
					备注：<br />
				</li>
				<li style="margin-top: 10px;"><span style="font-weight: bold">货物信息</span>
					<hr style="margin: 0" />
					分类：粮油副食&nbsp;货品：葵花籽油&nbsp;数量：1<br />
					分类：个人护理&nbsp;货品：染发        &nbsp;数量：1<br />
					分类：护肤美妆&nbsp;货品：香水套装&nbsp;数量：1<br />
					分类：其他        &nbsp;货品：尿不湿    &nbsp;数量：1<br />
					<span style="margin-left: 500px;">重量：<span>1.0</span>kg</span><br />
				</li>
				<li style="margin-top: 10px;"><span style="font-weight: bold">配送人信息</span>
					<hr style="margin: 0" /> 
					姓名：<span>${wbMap.wayPersonName }</span>
					<span style="margin-left: 300px;">电话：<span>${wbMap.wayPersonNumber }</span></span><br />
					送达位置：<br />
				</li>
				<li style="margin-top: 10px;"><span style="font-weight: bold">收货人信息</span>
					<hr style="margin: 0" />
					 姓名：<span>${wbMap.consigneeName }</span>
					 <span style="margin-left: 300px;">电话：<span>${wbMap.consigneeNum }</span></span><br />
					  地址：<span>${wbMap.consigneeAddress }</span><br />
				</li>
				<li style="margin-top: 10px;"><span style="font-weight: bold">发货人信息</span>
					<hr style="margin: 0" />
					 姓名： <span>${wbMap.consignerName }</span>
					<span style="margin-left: 300px;">电话：<span>${wbMap.consignerNumber }</span></span><br />
					 地址：<span>${wbMap.consignerAddress }</span><br />
				</li>
			</ul>
			<ul style="font-size: 18px;width: 35%;height: 90%;/*border:1px solid red;*/float:right; display: inline-block;">
				<span>物流信息</span>
				<li class="li1"><span class="sp4">原始配送</span><br />
					原始运单号：<span class="sp5" style="color: red;">YT201612233214307</span>
					<br class="br1" />
					操作员：李敏&nbsp;&nbsp;&nbsp;工号：；KF001<br />
					2016-12-24 10:03:51<br />
				</li>
			</ul>
		</div>
		<!-- Your Page Content Here --> </section>
		<!-- /.content -->
	</div>
	<!-- /.content-wrapper -->

	<!-- Main Footer -->
	<footer class="main-footer"> <!-- To the right -->
	<div class="pull-right hidden-xs">Anything you want</div>
	<!-- Default to the left --> <strong>Copyright &copy; 2016 <a
		href="#">Company</a>.
	</strong> All rights reserved. </footer>

	<!-- Control Sidebar -->
	<aside class="control-sidebar control-sidebar-dark"> <!-- Create the tabs -->
	<ul class="nav nav-tabs nav-justified control-sidebar-tabs">
		<li class="active"><a href="#control-sidebar-home-tab"
			data-toggle="tab"><i class="fa fa-home"></i></a></li>
		<li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i
				class="fa fa-gears"></i></a></li>
	</ul>
	<!-- Tab panes -->
	<div class="tab-content">
		<!-- Home tab content -->
		<div class="tab-pane active" id="control-sidebar-home-tab">
			<h3 class="control-sidebar-heading">Recent Activity</h3>
			<ul class="control-sidebar-menu">
				<li><a href="javascript::;"> <i
						class="menu-icon fa fa-birthday-cake bg-red"></i>

						<div class="menu-info">
							<h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

							<p>Will be 23 on April 24th</p>
						</div>
				</a></li>
			</ul>
			<!-- /.control-sidebar-menu -->

			<h3 class="control-sidebar-heading">Tasks Progress</h3>
			<ul class="control-sidebar-menu">
				<li><a href="javascript::;">
						<h4 class="control-sidebar-subheading">
							Custom Template Design <span class="pull-right-container">
								<span class="label label-danger pull-right">70%</span>
							</span>
						</h4>

						<div class="progress progress-xxs">
							<div class="progress-bar progress-bar-danger" style="width: 70%"></div>
						</div>
				</a></li>
			</ul>
			<!-- /.control-sidebar-menu -->

		</div>
		<!-- /.tab-pane -->
		<!-- Stats tab content -->
		<div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab
			Content</div>
		<!-- /.tab-pane -->
		<!-- Settings tab content -->
		<div class="tab-pane" id="control-sidebar-settings-tab">
			<form method="post">
				<h3 class="control-sidebar-heading">General Settings</h3>

				<div class="form-group">
					<label class="control-sidebar-subheading"> Report panel
						usage <input type="checkbox" class="pull-right" checked>
					</label>

					<p>Some information about this general settings option</p>
				</div>
				<!-- /.form-group -->
			</form>
		</div>
		<!-- /.tab-pane -->
	</div>
	</aside>
	<!-- /.control-sidebar -->
	<!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
	<div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->

<!-- jQuery 2.2.3 -->
<script src="js/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="js/app.min.js"></script>
<!-- 添加json数据 -->
<script src="js/change.js"></script>
<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. Slimscroll is required when using the
     fixed layout. -->
</body>
</html>
