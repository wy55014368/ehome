Mock.mock(
    'http://mockjsa', {
        "userName" : '@name',    
        "age|1-100":100,          
        "color"    : "@color",    
        "date"     : "@date('yyyy-MM-dd HH:mm:ss')",  
        "url"      : "@url()",     
        "content"  : "@cparagraph()", 
        "boolean|1-2": true,
        "id1":'@string("upper", 8)', //运单号字母部分
        "id2":'@string("number", 5)', //运单号数字部分
        "user_id1":'@string("upper", 2)',//客服人员编号
        "user_id2":'@string("number", 4)',
        "weight|1-12":10,//重量
        "phone":'@string("number", 8)',//电话号码
        "address":'@county(true)',//收获地址
        "add":'@county(true)',//运货状态
    }
);