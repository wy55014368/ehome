$(function(){
    $('.btn_manager_login').on('click',function(){
        var admin_id = $('.admin_id').val()
        var admin_pwd = $('.admin_pwd').val()
        if(admin_id == 123){
            if(admin_pwd == 123){
                //alert('登入成功')
                $('.inn').css({'display':'block'})
				$('.inn_image').css({'background-image':'url("../img/true.png")'})
                $('.inn_text').text('登入成功')
                window.location.href='../page/yundanluru.html';
            }else{
                $('.inn').css({'display':'block'})
                $('.inn_image').css({'background-image':'url("../img/no.png")'})
                $('.inn_text').text('密码输入错误')
                //alert('密码输入错误')
            }
        }else{
            //alert('没有该用户')
            $('.inn').css({'display':'block'})
            $('.inn_image').css({'background-image':'url("../img/no.png")'})
            $('.inn_text').text('没有该用户')
        }

    })
})
