<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'login_user.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>User | Log in</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="css/User.min.css">
<!-- iCheck -->
<link rel="stylesheet" href="css/blue.css">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="../js/html5shiv.min.js"></script>
  <script src="../js/respond.min.js"></script>
  <![endif]-->
</head>

<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo"></div>
  <div class="login-box-body" style="position: relative ;/*border:1px solid red;*/">
	<div class="inn" style="/*border: 1px solid red;*/width:250px;height: 60px;position: absolute;top: 140px;left:90px;display: none">
          <div class="inn_image" style="/*border: 1px solid red;*/float: left;width: 35px;
          height: 35px;margin-top: 15px;background-repeat: no-repeat;background-size: cover;"></div>
          <div class="inn_text" style=" font-size: 18px;/*border: 1px solid red;*/float: left;width: 200px;height: 35px;margin-top: 15px;line-height: 35px"></div>
    </div>
    <p class="login-box-msg">用户登录</p>
      <form action="/ehome/login" method="post">
      <div class="form-group has-feedback">
        <input type="text" class="form-control phoneNumber" placeholder="手机号/用户名">
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      	<span style="color:red;"></span>
      </div>
      
      <div class="form-group has-feedback">
        <input type="password" class="form-control phoneNumber" placeholder="密码">
        <span style="color:red;"></span>
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
        
      </div>
      <!--<div class="form-group has-feedback">
        <input type="password" class="form-control pre_number" style="width:200px;" placeholder="验证码">
        <!--<span class="glyphicon glyphicon-lock form-control-feedback"></span>-->
		<!--<div class="get_check" style="display:inline;border:1px solid #e6e6e6">获取验证码</div>-->
		<!--<input style="width:120px" id="get_check" class="form-control-feedback" type="button" value="获取验证码"/>
      </div>-->
	  <div class="input-group">
            <!-- /btn-group -->
            <input type="text" class="form-control pre_number" placeholder="验证码">
			<div class="input-group-btn">
				<!-- <button type="button" class="btn btn-danger get_check" style="color:black;background-color:#F4F4F4;border:1px solid black;">获取验证码</button> -->
				<div style="width:60px;height:34px;">
					<img src="code" onclick="_click(this)" style="width:60px;height:34px;background-size: cover;position:absolute;">
				</div>
            </div>
            
      </div>
      <span style="color:red;"></span>
      <div class="row">
          <div class="col-xs-8"></div>
          <div class="col-xs-4">
            <button type="submit" style="top:20px;float:left;position:relative;" class="btn btn-primary btn-block btn-flat">登录</button>
          </div>
        <div class="col-xs-4">
     		 <a href="${pageContext.request.contentType }/ehome/userServlet?m=register">注册</a>
        </div>
      </div>
      </form>
  </div>
  <br/>
  <div class="login-box-body range-query">
          <div>查询配送范围</div>
  </div>
</div>
</body>
<!-- jQuery 2.2.3 -->
<script src="js/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="js/icheck.min.js"></script>
<!-- <script src="js/btn_user_login.js"></script> -->
<script>
  $(function () {
    $('.btn_user_login').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' // optional
	  
    });
  });
</script>
  <script type="text/javascript">
  	function _click(o){
  		o.src = o.src+"?count=1";
  	}
  </script>
</html>
