
var currentdate = new Date(); 
var weekday = new Array(7);
weekday[0] = "Sunday";
weekday[1] = "Monday";
weekday[2] = "Tuesday";
weekday[3] = "Wednesday";
weekday[4] = "Thursday";
weekday[5] = "Friday";
weekday[6] = "Saturday";
var month = new Array();
month[0] = "January";
month[1] = "February";
month[2] = "March";
month[3] = "April";
month[4] = "May";
month[5] = "June";
month[6] = "July";
month[7] = "August";
month[8] = "September";
month[9] = "October";
month[10] = "November";
month[11] = "December";
var hours = currentdate.getHours();
var greet = "";
var time = "";
if(hours <=12){
    time = "AM";
}else{
    time = "PM";
}

if(hours<12){
    greet = " Good Morning";
    time = "AM"
}
else if(hours >= 12 && hours <=17){
    greet = "Good Afternoon";
}
else if(hours >17){
    greet = "Good Night";
}
var datetime = weekday[currentdate.getDay()] + " " 
                + month[currentdate.getMonth()]+" " 
                + currentdate.getDate() + " "
                + currentdate.getFullYear() + "  "  
                + currentdate.getHours() + ":"  
                + currentdate.getMinutes() + ":" 
                + currentdate.getSeconds() + " " 
                + time;

document.querySelector(".date").innerHTML = datetime;
document.querySelector(".msg").innerHTML = greet;

