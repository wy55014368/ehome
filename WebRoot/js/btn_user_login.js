$(function(){
    $('.btn_user_login').on('click',function(){
        var phoneNumber = $('.phoneNumber').val()
        var pre_number = $('.pre_number').val()

        if(phoneNumber == '123'){
            if(pre_number == '123'){
				$('.inn').css({'display':'block'})
				$('.inn_image').css({'background-image':'url("img/true.png")'})
                $('.inn_text').text('登入成功')
                window.location.href='page/yonghuyundan.html';
            }else{
				 $('.inn').css({'display':'block'})
                $('.inn_image').css({'background-image':'url("img/no.png")'})
                $('.inn_text').text('密码输入错误')
			}
        }else{
			$('.inn').css({'display':'block'})
            $('.inn_image').css({'background-image':'url("img/no.png")'})
            $('.inn_text').text('没有该用户')
		}
    })
	$('.get_check').on('click',function(){
		$('.inn').css({'display':'block'})
		$('.inn_image').css({'background-image':'url("img/true.png")'})
        $('.inn_text').text('获取验证码成功')
	})

    $('.btn_user_register').on('click',function(){
        window.location.href='/ehome/test2';
    })
	
})
