$('#scanning').on('click',function(){
    $('#grandfather').fadeIn(1000)
})

$('.r_close').on('click',function(){
    $('#grandfather').fadeOut(100)
})
$('.x').on('click',function(){
    $('#grandfather').fadeOut(100)
})

$('#YDbtn').on('click',function(){
    $.ajax({
        url:"http://mockjs",    //���ӷ������ĵ�ַ
        dataType:"json",        //ָ�����صĸ�ʽΪ json
        async:true,             //�Ƿ�ʹ���첽��ʽ true ��  false ��
        data:{},                //����ֵ  �൱��  ID + password
        type:"GET",             //���������   GET   post
        beforeSend:function(){

        },
        success:function(rep){
            console.log(rep)
            var v= null
            for(name in rep.five)
                v = rep.five[name]
            var o=  $('<tr><td>'+rep.one+'</td><td>'+rep.two+'</td><td>'+rep.three+'</td><td>'+rep.four+'</td><td>'+v+'</td><td>'+rep.four+'</td><td>'+rep.seven+'</td><td>'+rep.eight+'</td><td><a href="../page/general.html">'+rep.ten+'</a></td></tr>')
            o.appendTo($('tbody'))
        },
        complete:function(){

        },
        error:function(){

        }
    })

})
