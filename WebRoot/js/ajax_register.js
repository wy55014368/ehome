
$(function() {

	function toService(url, data, func) {
		$.ajax({
			url : url, //请求的url地址
			dataType : "json", //返回格式为json
			async : true, //请求是否异步，默认为异步，这也是ajax重要特性
			data : data, //参数值
			type : "POST", //请求方式
			beforeSend : function() {
				//请求前的处理
			},
			success : func,
			complete : function() {
				//请求完成的处理
			},
			error : function() {
				//请求出错处理
			}
		})
	}
	
	//用户姓名验证
	$('#username').blur(function() {
		var username = $(this).val();
		var checkName = /^[\u4e00-\u9fa5]+$/;
		if (username == null || username == "") {
			$('#vali_username').text("用户名不能为空");
		} else {
			if (!checkName.test(username)) {
				$('#vali_username').text("用户名只能是中文");

			} else {
				$('#vali_username').text("用户名合法");
			}
		}
	})

	// 密码输入验证
	$('#pwd').blur(function() {	
		var pwd = $(this).val();
		
		var checkPwd = /^[\da-zA-Z]*$/;
		if (pwd == null || pwd == "") {
			$('#vali_pwd').text("密码不能为空");
		} else {
			if (!checkPwd.test(pwd)) {
				$('#vali_pwd').text("密码只能是字母或数字");

			} else {
				if (pwd.length < 6 || pwd.length > 12) {
					$('#vali_pwd').text("密码必须在6-12字符之间");
				} else {
					$('#vali_pwd').text("密码合法");
				}

			}
		}
	})

	// 确认密码输入验证
	$('#rpwd').blur(function() {
		var rpwd = $(this).val();
		var pwd = $('#pwd').val();
		var checkRpwd = /^[\da-zA-Z]*$/;
		if (rpwd == null || rpwd == "") {
			$('#vali_rpwd').text("密码不能为空");
		} else {
			if (!checkRpwd.test(rpwd)) {
				$('#vali_rpwd').text("密码只能是字母或数字");

			} else {
				if (rpwd.length < 6 || rpwd.length > 12) {
					$('#vali_rpwd').text("密码必须在6-12字符之间");
				} else {
					if (rpwd.toUpperCase() != pwd.toUpperCase()) {
						$('#vali_pwd').text("输入密码和确认密码不相同");
						$('#vali_rpwd').text("输入密码和确认密码不相同");
					} else {
						$('#vali_pwd').text("密码合法");
						$('#vali_rpwd').text("确认密码合法");
					}
				}

			}
		}
	})

	// 手机号码输入验证
	$('#phoneNumber').blur(function() {
		var phoneNumber = $(this).val();	
		var data = {"phoneNumber":phoneNumber};
		var checkPhoneNumber = /^1[358][\d]{9}$/;
		if (phoneNumber == null || phoneNumber == "") {
			$('#vali_phoneNumber').text("手机号码不能为空");
		} else {

				if (!checkPhoneNumber.test(phoneNumber)) {
					$('#vali_phoneNumber').text("手机号码不合法");

				} else {
					toService("/ehome/vali_phone",data,function(req){
						if(!req){
							$('#vali_phoneNumber').text("该用户已经注册过,请登录！");
						}else{
							$('#vali_phoneNumber').text("手机号码合法");
						}
					})
					
				}

			}
	})
	
	// 头像上传验证
	$('#headshot').mouseleave(function() {
		var headshot = $(this).val();
		var checkName = /^[\u4e00-\u9fa5]+$/;
		if (headshot == null || headshot == "") {
			$('#vali_headshot').text("头像上传不能为空");
		} else if(headshot.indexOf(".jpg")>=0||headshot.indexOf(".gif")>=0||headshot.indexOf(".png")>=0){
			
			$('span#vali_headshot').text("头像上传合法");
		}else{
			$('span#vali_headshot').text("头像后缀名必须是.jpg/.gif/.png");
		}
	})
	
	$('#validateCode').blur(function() {
		var validateCode = $(this).val();
		var data = {'code':$('#validateCode').val()};
		if (validateCode == null || validateCode == "") {
			$('#vali_validateCode').text("验证码不能为空");
		} else{
			toService('/ehome/vali_code',data,function(req){
				if(req){
					
					$('#vali_validateCode').text("验证码输入正确");
				}else{
					$('#vali_validateCode').text("验证码输入错误");
				}
			})
		}
	})

	
	//注册按钮提交验证
	$('.btn_user_register').click(function(){
		var validateCode = $('#validateCode').val();
		var headshot = $('#headshot').val();
		var phoneNumber = $('#phoneNumber').val();
		var rpwd = $('#rpwd').val();
		var pwd = $('#pwd').val();
		var username = $('#username').val();
		
		var vali_validateCode = $('#vali_validateCode').text();
		var vali_headshot = $('#vali_headshot').text();
		var vali_phoneNumber = $('#vali_phoneNumber').text();
		var vali_rpwd = $('#vali_rpwd').text();
		var vali_pwd = $('#vali_pwd').text();
		var vali_username = $('#vali_username').text();
		 if (vali_validateCode != "验证码输入正确"
			||vali_headshot != "头像上传合法"
			||vali_phoneNumber != "手机号码合法" 
			||vali_rpwd != "确认密码合法"
			||vali_pwd != "密码合法"
			||vali_username != "用户名合法") {
			//$('#vali_success').text("注册失败");
			alert("注册失败")
		}else{
			var data = {'validateCode':validateCode,'headshot':headshot,
					'phoneNumber':phoneNumber,'rpwd':rpwd,
					'pwd':pwd,'username':username};
			toService('/ehome/register',data,function(req){
				if(req!=null){
					//$('#vali_success').text("注册成功,您的ID号是："+req);
					alert("注册成功,您的ID号是："+req)
				}else{
					//$('#vali_success').text("注册失败");
					alert("注册失败")
				}
			})
		}
			
		
		
	})
	

})


