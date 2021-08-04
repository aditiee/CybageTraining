var name="Cybage Software Pvt Ltd";
var x =prompt("ENTER A CHARACTER : ");
var y = name.indexOf(x);
if( y != -1){
    document.write("CHARACTER "+ x +" IS  FOUND AT INDEX "+ y +"<br>");
}
else{

    document.write("CHARACTER "+ x +" NOT FOUND<br>");
}

document.write("<br>Cybage Software Pvt Ltd is popularly known as "+ name.substring(0,15))
document.write("<br>"+ name.toLowerCase())
document.write("<br>"+ name.toUpperCase())