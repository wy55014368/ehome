$(function () {
    $('#person_c1').click(function () {
        //alert(1)
        //$(this).css('borderTop','3px solid lightBlue')
        $('#form_c1').slideDown(80)
        $('#form_c2').slideUp(80)
    })
    $('#person_c2').click(function () {
        //alert(1)
        //$(this).css('borderTop','3px solid lightBlue')
        $('#form_c1').slideUp(80)
        $('#form_c2').slideDown(80)
    })


    $('#save').click(function () {
        //    ����л��������Ϻ��޸�����


        $.ajax({

            url: "http://mockjs",
            dataType: "json",
            async: 'true',
            type:'get',
            data :{},

            beforeSend :function(){

            },

            success: function (rep) {
                //alert(1)
                $('input').eq(0).val(rep.name)
                $('input').eq(1).val(rep.number)
                $('input').eq(2).val(rep.id)
            },
            complete: function() {
                //������ɵĴ���
                //alert(1)
            },
            error: function() {
                //���������
                alert(1)
            }
    })


    })








})