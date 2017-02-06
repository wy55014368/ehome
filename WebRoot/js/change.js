$(function(){
     $('span.sp5').on('click',function(){
         var content = $(this).text()
         if(content == 'YT201612233214307'){
            $(this).text('YT20161224100338')
             $('.sp1').text('YT20161223214307')
             $('.sp2').text('系统已经生成新的运单(YT20161224100338)')
             $('.sp3').text('2016-12-23 09:43')
             $('.sp4').text('生成新运单')
             $('.sp4').css({'color':'red'})
             var input1 = $('<input class="input1" style="display: block;width:300px;" type="text" value="换地址"/>')
             input1.insertAfter($('.br1'))
             var li2 = $('<li class="li2" style="margin-top: 15px;">派送点已收到退货<br/>操作员:李敏 工号:KF001<br/>2016-12-24 10:02:20</li>')
             li2.insertAfter($('.li1'))
             var li3 = $('<li class="li3" style="margin-top: 15px;"><span style="color: red;">用户拒收</span><br/><input class="input2" style="display: block;width:300px;" type="text" value="不在家"/>' +
                 '<br/>操作员:杨森 工号:KD001<br/>2016-12-24 10:01:50</li>')
             li3.insertAfter($('.li2'))
             var li4 = $('<li class="li4" style="margin-top: 15px;">开始配送<br/>操作员:杨森 工号:KD0011<br/>2016-12-24 10:01:26</li>')
             li4.insertAfter($('.li3'))
             var li5 = $('<li class="li5" style="margin-top: 15px;">等待配送<br/><span style="color: red;">原始运单号：YT201612233214307</span><br/>操作员:李敏 工号:KF0011<br/>2016-12-23 09:43:28</li>')
             li5.insertAfter($('.li4'))
         }
         if(content == 'YT20161224100338'){
             $(this).text('YT201612233214307')
             $('.sp1').text('YT20161224100338')
             $('.sp2').text('等待配送')
             $('.sp3').text('2016-12-24 10:03')
             $('.sp4').text('原始配送')
             $('.sp4').css({'color':'black'})
             $('.input1').remove()
             $('.li2').remove()
             $('.li3').remove()
             $('.li4').remove()
             $('.li5').remove()

         }
     })
    $('.back').on('click',function(){
        window.location.href='../page/login_user.html';
    })
    
     $('.list_return').on('click',function(){
        window.location.href='../page/yonghuyundan.html';
    })
})
