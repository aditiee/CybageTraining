var canvas = document.getElementById("canvas");
if (canvas.getContext) {
  var ctx = canvas.getContext("2d");

  ctx.fillStyle = "yellow";
  ctx.beginPath();
  ctx.arc(75, 75, 50, 0, Math.PI * 2, true);
  ctx.fill();
  ctx.moveTo(110, 75);
  ctx.fillStyle = "black";
  ctx.beginPath();
  ctx.arc(75, 75, 35, 0, Math.PI, false);
  ctx.stroke();
  ctx.moveTo(65, 65);
  ctx.beginPath();
  ctx.arc(60, 65, 5, 0, Math.PI * 2, true);
  ctx.fill();
  ctx.moveTo(95, 65);
  ctx.beginPath();
  ctx.arc(90, 65, 5, 0, Math.PI * 2, true);
  ctx.fill();
}
