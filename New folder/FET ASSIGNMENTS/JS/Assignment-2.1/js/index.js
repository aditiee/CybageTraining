
document.write("Using While Loop <br>");
function whileLoop() {
    let i = 1;
    while (i < 101) {
        document.write(i + " ");
        if (i % 10 == 0) {
            document.write("<br> ");
        }
        i++;

    }
}
whileLoop();


document.write("<br> Using Do While Loop<br>")
function DoWhileLoop() {
    var i = 1;
    do {
        document.write(i + " ");
        if (i % 10 == 0) {
            document.write("<br> ")
        }
        i++;
    }
    while (i < 101);
}

DoWhileLoop();