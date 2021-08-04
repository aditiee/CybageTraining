
if(!window.jquery)
{
    
}
$('document').ready(() => {
    $('button').click(() => {
        $('header').width("100%");
        $('header').height("100px");
        $('header').css({ "background-color": "gray", "text-align": "center", "font-weight": "bold", "padding": "20px;" });

        $('section').find('div')
            .height("250px")
            .width("33%")
            .css({
                "background-color": "salmon",
                "float": "left",
                "text-align": "center",
                "font-weight": "bold",

            })

        $('footer').width("100%");
        $('footer').height("100px");
        $('footer').css({
            "background-color": "gray",
            "text-align": "center",
            "font-weight": "bold",
            "padding": "20px;"
        })

        //APPEND:puts data inside an element at the last index
        $('header').append('<div> APPEND DIV </div>');

        //prepend: puts the prepending element at first index
        $('header').prepend('<div> PREPEND DIV </div>');

        //BEFORE:puts the elements before 
        $('section').before('<div> BEFORE DIV </div>');

        //AFTER: puts the elements after
        $('section').after('<div> AFTER DIV </div>');
    })
})

$("button").click(function () {
    $(this).parent().slideUp("slow", function () {
        $("#msg").text($("button", this).text() + " has completed.");
    });
});