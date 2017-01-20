Mock.mock(
    'http://mockjs', {
        "boolean|1-2": true,
        "one":'@integer',
        "two":'@integer',
        "three":'@cname',
        "four":/\d{11}/,
        "five|1":{
            "310000": "上海市",
            "320000": "江苏省",
            "330000": "浙江省",
            "340000": "安徽省"
        },
        "six":'@csentence(6)',
        "seven|1-2":true,
        "eight":'@now',
        "nine":'@cname',
        "ten":'详情'
    }
);