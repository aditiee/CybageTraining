$('document').ready(() => {
    // alert("jQUERY LOADED!!!")
    var allDivs = $('div');
    console.log(allDivs);
    var twoClassdiv = $('.one.two');
    console.log(twoClassdiv);

    var id = $('id1');
    console.log(id);

    var Byclass = $('.one');
    console.log(Byclass);

    var jqRows = $('tr:even');
    console.log(jqRows);

    var jqRows = $('tr:odd');
    console.log(jqRows);

    var a = $('[href^="www"]');
    console.log(a);

    var ahref = $('[href$="com"]');
    console.log(ahref);

    var desc = $('#id1').find('input[name="HELLO"]');
    console.log(desc);

    var DIRECT= $('section').children('div');
    console.log(DIRECT);

    var para= $( "li.item-a" ).parent().css( "background-color", "red" );
    console.log(para);

    var list =$( "li" ).find( "li" ).css( "background-color", "gray" );
    console.log(list);

    //eq () returns the element as a jQuery object
    var eqMethod=$('li').eq(2);
    console.log(eqMethod);

    var EQ = $('li').eq(2).css("background-color","orange");
    console.log(EQ);

    //get method return HTML
    var GET= $('div').get(2);
    console.log(GET)

    $('input').val("Aditi");
    console.log($('input').val());

    var color =$('.one').css('color');
    console.log($('.one').css('color',"gold"))

    var Mutiple=$('.one').css('color');
    console.log($('.one').css(
        {'color':"gold",
    'font-weight':"bold"}
    ))

    var html= $('.two').html();
    $('.two').html(html);

    //adding class
    $('button').click(()=>
    {
        $('div#id1').addClass("three");
    })
   
    //adding class using toggle method
    //toggle() - will hide and show
    $('button').click(()=>
        {
            $('div#id4').toggleClass("three");
            $('div#id4').toggle();

        })


});