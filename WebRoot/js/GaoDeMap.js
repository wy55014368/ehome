var map = new AMap.Map('mapShow', {
    zoom: 13,
    center: [103.835456, 30.047251],
    resizeEnable: true
});

map.plugin(["AMap.ToolBar"], function () {
    map.addControl(new AMap.ToolBar());
})

if (location.href.indexOf('&guide=1') !== -1) {
    map.setStatus({scrollWheel: false})
}


AMap.service(["AMap.PlaceSearch"], function () {
    var placeSearch = new AMap.PlaceSearch({ //构造地点查询类
        pageSize: 5,
        pageIndex: 1,
       /* city: 028, //城市*/ 
       map: map,
        panel: "panel"
    });
    //关键字查询
    $('#BtnSearch').on('click', function () {
       var search = $('#search').val()
        placeSearch.search(search);
    })

});


/*var polygonArr = new Array();//多边形覆盖物节点坐标数组
 polygonArr.push([104.100426, 30.677367]);
 polygonArr.push([104.131325, 30.686816]);
 polygonArr.push([104.145745, 30.644291]);
 polygonArr.push([104.090813, 30.633066]);
 polygonArr.push([104.074334, 30.667327]);

 var  polygon = new AMap.Polygon({
 path: polygonArr,//设置多边形边界路径
 strokeColor: "#FF33FF", //线颜色
 strokeOpacity: 0.2, //线透明度
 strokeWeight: 3,    //线宽
 fillColor: "#1791fc", //填充色
 fillOpacity: 0.35//填充透明度
 });
 polygon.setMap(map);*/

    //红色区域
    var polygonArr = new Array();//多边形覆盖物节点坐标数组
    polygonArr.push([103.850981,30.075022]);
    polygonArr.push([103.866983,30.075115]);
    polygonArr.push([103.870684,30.074697]);
    polygonArr.push([103.87459,30.073565]);
    polygonArr.push([103.887658,30.067845]);
    polygonArr.push([103.89388,30.066211]);
    polygonArr.push([103.884611,30.056331]);
    polygonArr.push([103.879718,30.053842]);
    polygonArr.push([103.878559,30.052096]);
    polygonArr.push([103.880276,30.050536]);
    polygonArr.push([103.879332,30.050276]);
    polygonArr.push([103.878216,30.051131]);
    polygonArr.push([103.874397,30.050833]);
    polygonArr.push([103.87547,30.048753]);
    polygonArr.push([ 103.868989,30.036847]);
    polygonArr.push([ 103.871264,30.036308]);
    polygonArr.push([103.865985,30.032221]);
    polygonArr.push([103.866543,30.029769]);
    polygonArr.push([103.865299,30.027503]);
    polygonArr.push([ 103.863067,30.027094]);
    polygonArr.push([ 103.85457,30.02728]);
    polygonArr.push([103.853561,30.027484]);
    polygonArr.push([103.846223,30.035101]);
    polygonArr.push([ 103.844807,30.035992]);
    polygonArr.push([ 103.850128,30.044091]);
    polygonArr.push([ 103.85075,30.049552]);
    polygonArr.push([103.842639,30.04957]);
    polygonArr.push([103.835987,30.051316]);
    polygonArr.push([103.840408,30.053359]);
    polygonArr.push([103.848218,30.065654]);
    polygonArr.push([103.850793,30.066397]);
    var polygon = new AMap.Polygon({
        path: polygonArr,//设置多边形边界路径
        strokeColor: "#F0202F", //线颜色
        strokeOpacity: 0.8, //线透明度
        strokeWeight: 5,    //线宽
        fillColor: "red", //填充色
        fillOpacity: 0.41//填充透明度
    });
    polygon.setMap(map);

    //绿色区域
    var polygonArr_green = new Array();
    polygonArr_green.push([103.803449,  30.02355]);
    polygonArr_green.push([103.791347,  30.029941]);
    polygonArr_green.push([103.802054,  30.048851]);
    polygonArr_green.push([103.801625,  30.051562]);
    polygonArr_green.push([103.799866,  30.053494]);
    polygonArr_green.push([103.791969,  30.054608]);
    polygonArr_green.push([103.791883,  30.055834]);
    polygonArr_green.push([103.797548,  30.055723]);
    polygonArr_green.push([103.803771,  30.053197]);
    polygonArr_green.push([103.805745,  30.053383]);
    polygonArr_green.push([103.807032,  30.061517]);
    polygonArr_green.push([103.804372,  30.064377]);
    polygonArr_green.push([103.806646,  30.067274]);
    polygonArr_green.push([103.835829,  30.051302]);
    polygonArr_green.push([103.831451,  30.047328]);
    polygonArr_green.push([103.827246,  30.046176]);
    polygonArr_green.push([103.825357,  30.043464]);
    polygonArr_green.push([103.820422,  30.040604]);
    polygonArr_green.push([103.811496,  30.033248]);
    var polygon_green = new AMap.Polygon({
        path: polygonArr_green,//设置多边形边界路径
        strokeColor: "#089A72", //线颜色
        strokeOpacity: 0.8, //线透明度
        strokeWeight: 5,    //线宽
        fillColor: "green", //填充色
        fillOpacity: 0.49//填充透明度
    });
    polygon_green.setMap(map);

    //黄色区域
    var polygonArr_yellow = new Array();
    polygonArr_yellow.push([103.836022,  30.051302]);
    polygonArr_yellow.push([103.806882,  30.067237]);
    polygonArr_yellow.push([103.808685,  30.076076]);
    polygonArr_yellow.push([103.809672,  30.076429]);
    polygonArr_yellow.push([103.817633,  30.074832]);
    polygonArr_yellow.push([103.850935,  30.074869]);
    polygonArr_yellow.push([103.850763,  30.066438]);
    polygonArr_yellow.push([103.84821,  30.065677]);
    polygonArr_yellow.push([103.84041,  30.053373]);
    var polygon_yellow = new AMap.Polygon({
        path: polygonArr_yellow,//设置多边形边界路径
        strokeColor: "#FFCC02", //线颜色
        strokeOpacity: 0.8, //线透明度
        strokeWeight: 5,    //线宽
        fillColor: "yellow", //填充色
        fillOpacity: 0.39//填充透明度
    });
    polygon_yellow.setMap(map);

    //蓝色区域
    var polygonArr_blue = new Array();
    polygonArr_blue.push([103.835957, 30.051287]);
    polygonArr_blue.push([103.831505, 30.047247]);
    polygonArr_blue.push([103.827277, 30.04616]);
    polygonArr_blue.push([103.825378, 30.04343]);
    polygonArr_blue.push([103.820647, 30.040671]);
    polygonArr_blue.push([103.811592, 30.033167]);
    polygonArr_blue.push([103.803438, 30.023469]);
    polygonArr_blue.push([103.821377, 30.016595]);
    polygonArr_blue.push([103.821934, 30.018527]);
    polygonArr_blue.push([103.829144, 30.027742]);
    polygonArr_blue.push([103.832191, 30.03064]);
    polygonArr_blue.push([103.832835, 30.032275]);
    polygonArr_blue.push([103.833135, 30.033687]);
    polygonArr_blue.push([103.83777, 30.034281]);
    polygonArr_blue.push([103.840345, 30.036399]);
    polygonArr_blue.push([103.840946, 30.037588]);
    polygonArr_blue.push([103.844637, 30.035805]);
    polygonArr_blue.push([103.850087, 30.044126]);
    polygonArr_blue.push([103.850731, 30.049476]);
    polygonArr_blue.push([103.842727, 30.049513]);
    var polygon_blue = new AMap.Polygon({
        path: polygonArr_blue,//设置多边形边界路径
        strokeColor: "#19A4EB", //线颜色
        strokeOpacity: 0.8, //线透明度
        strokeWeight: 5,    //线宽
        fillColor: "blue", //填充色
        fillOpacity: 0.37//填充透明度
    });
    polygon_blue.setMap(map);


//设置标记
var marker = new AMap.Marker({
    position: map.getCenter()
});
marker.setMap(map);
// 设置鼠标划过点标记显示的文字提示
marker.setTitle('我是marker的title');

// 设置label标签
marker.setLabel({//label默认蓝框白底左上角显示，样式className为：amap-marker-label
    offset: new AMap.Pixel(20, 20),//修改label相对于maker的位置
    content: "伊藤洋华堂"
});



//点击选择区域
map.setFitView();
polygon.on('click', function() {
    alert('红');
});
polygon_yellow.on('click', function() {
    alert('黄');
});
polygon_blue.on('click', function() {
    alert('蓝');
});
polygon_green.on('click', function() {
    alert('绿');
});
/*
 var polygon = new AMap.Polygon({
 path: polygonArr,//设置多边形边界路径
 strokeColor: "#FF33FF", //线颜色
 strokeOpacity: 0.2, //线透明度
 strokeWeight: 3,    //线宽
 fillColor: "#1791fc", //填充色
 fillOpacity: 0.35//填充透明度
 });
 polygon.setMap(map);*/



