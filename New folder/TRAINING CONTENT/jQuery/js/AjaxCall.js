//var button=$('button');

// $('button').click(() => {
//     console.log("CLICKED...");
//     $.ajax({
//         url: "https://reqres.in/api/users/5",
//         method: "GET",
//         success: (x) => {
//             console.log("Data=>", x);

//             $("span#id1").append(x.data.first_name + " " + x.data.last_name);
//             $("span#id2").append(x.data.email);

//             var image = x.data.avatar;
//             var drawing = "<img src='" + image + " '/>";
//             $("div#img").append(drawing)
//         },
//         error: (e) => {
//             alert("Error : " + e)
//         },
//         complete: () => {
//             //alert("Ajax GET Call is Completed!!");
//         }
//     })

// })

$("button").click(() => {
    console.log("CLICKED...");
    $.ajax({
        url: "https://reqres.in/api/users",
        method: "POST",
        data: {
            "name": $('#name').val(),
            "job": $('#job').val()
        },
        success: (x) => {
            alert(x.name + " POSTED!!");
            console.log(x);
        },
        error: (e) => {
            alert("Error!" + e)
        }, complete: () => {
            alert("Ajax POST Call is Completed!!");
        }
    })
}

)