function compoundInterest(principal, interest ,nyear,ntime ) {
                 
    principal = document.getElementById("getPrincipalValue").value;
    interest = document.getElementById("getInterestRate").value;
    nyear = document.getElementById("getYear").value;
              
     

  var CI  = ( principal* Math.pow((1 + (interest/(100))), nyear));

    document.getElementById("CI").innerHTML = "Compound Interest is :  " + CI;
}