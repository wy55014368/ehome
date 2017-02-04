
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
	

	
	//登录按钮提交验证
	$('.btn_user_login').click(function(){
		
		//验证码验证
		var validateCode = $("#validateCode").val();
		var data = {'code':validateCode};
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
		
		var id_phoneNumber = $('#id_phoneNumber').val();
		var pwd = $('#pwd').val();
		var data = {'id_phoneNumber':id_phoneNumber,'pwd':pwd}
		if (id_phoneNumber == null || id_phoneNumber == "") {
			$('#vali_id_phoneNumber').text("用户信息不能为空");
		} else{
			if (pwd == null || pwd == "") {
				$('#vali_pwd').text("密码不能为空");
				alert("登录失败");
			}else{
				toService('/ehome/login',data,function(req2){
					if(req2 != null){					
						$('#vali_id_phoneNumber').text("此用户存在");
						$('#vali_pwd').text("密码输入正确");
						var code = $('#vali_validateCode').text();
						if(code=="验证码输入正确"){
							alert("登录成功,"+req2+"您好！");
							window.location.href='/ehome/page/yonghuyundan.html';
						}else{
							alert("验证码输入错误,登录失败");
						}
					}else{
						$('#vali_id_phoneNumber').text("用户名或密码输入有误，请检查！");
						$('#vali_pwd').text("用户名或密码输入有误，请检查！");
						alert("登录失败");
						
					}
				})
			}
			
		}
		
	})
	

})

