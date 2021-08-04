var allowDrop = (ev) =>{
    ev.preventDefault();
  }
  
var drag=(ev) =>{
    ev.dataTransfer.setData("text", ev.target.id);
  }
  
var drop = (ev) =>{
    ev.preventDefault();
    var data = ev.dataTransfer.getData("text");
    ev.target.appendChild(document.getElementById(data));
  }