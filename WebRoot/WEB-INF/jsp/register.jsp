<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.ehome.controller.CreateCode" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
     <title>register</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
 
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="css/AdminLTE.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="css/blue.css">

  </head>
  
<body class="hold-transition register-page">
<div class="register-box">
  <div class="register-logo"></div>

  <div class="register-box-body">
    <p class="login-box-msg">用户注册</p>

    <form id="register_myForm">
      <div class="form-group has-feedback">
        <input type="text" id="username" name="username" value="" class="form-control" placeholder="用户姓名">
        <span id="vali_username"></span>
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" id="pwd" name="pwd" value="" class="form-control" placeholder="密码">
        <span id="vali_pwd"></span>
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" id="rpwd" name="rpwd" value="" class="form-control" placeholder="确认密码">
        <span id="vali_rpwd"></span>
        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="text" id="phoneNumber" name="phoneNumber" value="" class="form-control" placeholder="手机号码">
        <span id="vali_phoneNumber"></span>
        <span class="glyphicon glyphicon-phone form-control-feedback"></span>
      </div>
      <div class="input-group">
            <!-- /btn-group -->
            <input type="text" id="validateCode" name="validateCode" value="" class="form-control pre_number" placeholder="验证码">
			<div class="input-group-btn">
				<!-- <button type="button" class="btn btn-danger get_check" style="color:black;background-color:#F4F4F4;border:1px solid black;">获取验证码</button> -->
				<div style="width:60px;height:34px;">
					<img src="code" onclick="_click(this)" style="width:60px;height:34px;background-size: cover;">
				</div>
            </div>
      </div>
      <span id="vali_validateCode"></span>
      <div class="form-group has-feedback" style="margin-top: 20px;">
      	头像：<input style="display:inline;" type="file" id="headshot" name="headshot" value="" placeholder="头像">
      
      </div>
       <span id="vali_headshot"></span>
       <span style="color:red;display:block;" id="vali_success"></span>
      <div class="row">
        <div class="col-xs-8"> 
          <div class="checkbox icheck">
            <!--<label>
              <input type="checkbox"> I agree to the <a href="#">terms</a>
            </label>-->
          </div>
        </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="button" class="btn btn-primary btn-block btn-flat btn_user_register">注册</button>
        </div>
        <div class="col-xs-4"  style="margin-top: -24px;" >
<!--           <button style="top:-34px;float:left;position:relative;" class="btn btn-primary btn-block btn-flat btn_user_register">登录</button>
 -->     <a href="${pageContext.request.contextPath}/userServlet?m=login">登录</a> 
 		</div>
        <!-- /.col -->
      </div>
    </form>

    <!--<div class="social-auth-links text-center">
      <p>- OR -</p>
      <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-facebook"></i> Sign up using
        Facebook</a>
      <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-google-plus"></i> Sign up using
        Google+</a>
    </div>-->

    <!--<a href="login.html" class="text-center">I already have a membership</a>-->
  </div>
  <!-- /.form-box -->
</div>
<!-- /.register-box -->


</body> 

<!-- jQuery 2.2.3 -->
<script src="js/jquery-2.2.3.min.js"></script>
<!-- Ajax提交表单数据 -->
<script src="js/ajax_register.js"></script> 
<!-- Bootstrap 3.3.6 -->
<script src="js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="js/icheck.min.js"></script> 

<!-- <script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' // optional
    });
  });
</script> -->
<script type="text/javascript">
  	function _click(o){
  		o.src = o.src+"?count=1";
  	}
  </script>
</html>
