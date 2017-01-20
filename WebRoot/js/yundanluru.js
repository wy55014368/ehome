num=10

$('.kuang ol>li').on('click',function(){
    $('body>div').eq($(this).index()).fadeIn(100)
    $('body>div').eq($(this).index()).css({"z-index":num})

   var o= $('<ul><div>进口食品</div><li>休闲零食</li><li>休闲零食</li><li>休闲零食</li>休闲零食<li>休闲零食</li><li>休闲零食</li></ul>')
    o.appendTo( $('body>div').eq($(this).index()))
})