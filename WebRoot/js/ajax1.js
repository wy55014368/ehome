/**
 * Created by jkj on 2017/1/4.
 */
$(function () {
    $('#fanHui').click(function () {
        $.ajax({
            url: "http://mockjs",
            dataType: "json",
            async: true,
            data: {},
            type: "GET",
            beforeSend: function () {

            },
            success: function (add) {
                var a=null;
                for(i in add.zhuangtai){
                    a=add.zhuangtai[i]
                }
                var b=null
                for(j in add.qu){
                    b=add.qu[j]
                }
                var c=null
                for(k in add.jishida){
                    c=add.jishida[k]
                }
                var d=null
                for(k in add.huowu){
                    d=add.huowu[k]
                }
                var e=null
                for(k in add.huopin){
                    e=add.huowu[k]
                }
                var f=null
                for(k in add.name){
                    f=add.name[k]
                }
                $('.p1').text(add.regexp)
                $('.p2').text(add.danhao)
                $('.p3').text(a)
                $('.p4').text(add.date)
                $('.p5').text(b)
                $('.p6').text(c)
                $('.p8').text(d)
                $('.p9').text(e)
                $('.p10').text(add.shuliang)
                $('.p11').text(d)
                $('.p12').text(e)
                $('.p13').text(add.shuliang)
                $('.p14').text(f)
                $('.p15').text(add.phone)
                $('.p16').text(add.name1)
                $('.p17').text(add.phone1)
                $('.p18').text(add.dizhi)
                $('.p19').text(add.name1)
                $('.p20').text(add.phone)
                $('.p21').text(add.dizhi)
                $('.p22').text(f)
                $('.p23').text(add.gonghao)
                $('.p24').text(add.date)


            },
            complete: function () {
                //请求完成的处理
            },
            error: function () {
                //请求出错处理
                alert("出错了")
            }
        })
    })
})