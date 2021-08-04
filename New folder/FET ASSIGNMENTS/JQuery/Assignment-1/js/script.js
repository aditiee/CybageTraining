$(document).ready(function () {
   
    $.ajax({
        type: "Get",
        url: "https://jsonplaceholder.typicode.com/photos",
        success: function (data) {
            console.log(data[0].thumbnailUrl);
            var divs = "";
            for (let i = 0; i < data.length; i++) {
            
                divs += `<div class="product">
                            <img src="${data[i].thumbnailUrl}" alt="" id="image">
                            <p id="title">${data[i].title}</p>
                            <div id="price">${data[i].id}</div>
                            <button class="btn">Add to cart</button>
                        </div>`;
                
            }
            console.log(divs);
            $(".product-container").html(divs);
        }
    });
});