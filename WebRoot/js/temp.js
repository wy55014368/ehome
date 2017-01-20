$('#YDbtn').on('click',function(){
    $.ajax({
        url:"http://mockjs",    //连接服务器的地址
        dataType:"json",        //指定返回的格式为 json
        async:true,             //是否使用异步方式 true 是  false 否
        data:{},                //参数值  相当于  ID + password
        type:"GET",             //请求的类型   GET   post
        beforeSend:function(){

        },
        success:function(rep){
            console.log(rep)
            var v= null
            for(name in rep.five)
                v = rep.five[name]
           var o=  $('<tr><td>'+rep.one+'</td><td>'+rep.two+'</td><td>'+rep.three+'</td><td>'+rep.four+'</td><td>'+v+'</td><td>'+rep.six+'</td><td>'+rep.seven+'</td><td>'+rep.eight+'</td><td>'+rep.nine+'</td><td><a href="../page/top-nav.html">'+rep.ten+'</a></td></tr>')
            o.appendTo($('tbody'))
        },
        complete:function(){

        },
        error:function(){

        }
    })

})

function addLieBiao(){

}