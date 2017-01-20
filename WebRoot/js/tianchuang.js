/**
 * Created by jkj on 2017/1/4.
 */
$(function(){
    $('.shibai').click(function(){
$("#father").css({"z-index": 998})
        $('.btn1').click(function(){
            $("#father").css({"z-index": -1})
        })
        $('#close').click(function(){
            $("#father").css({"z-index": -1})
        })
    })
})