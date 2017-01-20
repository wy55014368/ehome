
$(function (){
    $('.d1').click(function (){

        $.ajax({
            url        : "http://mockjsa",    //请求的url地址
            dataType   : "json",   //返回格式为json
            async      : true, //请求是否异步，默认为异步，这也是ajax重要特性
            data       : {},    //参数值
            type       : "GET",   //请求方式
            beforeSend : function() {
                //请求前的处理
            },
            success: function(add) {  // 发送成功,并成功接收到来自服务器的回复消息
                //请求成功时处理 , req表示服务器回传的json数据(字符串形式)
                //req = eval('('+req+')')
                //得到的json数据,获取内容,进而判断
                /*console.log(req.boolean);
                if(req.boolean == true){
                    alert("登录成功")
                }else{
                    alert('登录失败,请检查用户名密码')
                }*/
                $('.inp1').val(add.id1+add.id2)
                $('.inp2').val('K'+add.user_id1+add.user_id2)
                $('.span1').text(add.id1+add.id2)
                if(add.boolean == true){
                    $('.span2').text('正在派送')
                    $('.span4').text('红区')
                }else{
                    $('.span2').text('货物已到达...')
                    $('.span4').text('蓝区')
                }
                $('.span3').text(add.date)
                $('.span5').text(add.weight)
                $('.span6').text(add.userName)
                $('.span7').text("184"+add.phone)
                $('.span8').text(add.address)
                $('.span9').text(add.add)

            },
            complete: function() {
                //请求完成的处理
            },
            error: function() {
                //请求出错处理
            }
        })
    })
})