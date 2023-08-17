
 //************ */
 
//************* */
const header = document.createElement("h1")
header.innerHTML = "The Best Game Ever"
header.style.color = "#c0392b"
header.style.fontFamily = "Helvetica"
document.body.appendChild(header)
/******************* */

const subHeader = document.createElement("h2")
subHeader.innerHTML = "Let's Play !!!!"
subHeader.setAttribute("class","sub")
document.body.appendChild(subHeader)
//*** Moving The Ball */
const ball = document.getElementById("ball")
const playingField = document.getElementById("playing-field");

const moveUp = function(){
  let up = parseInt(ball.style.top) || 0
  up -= 15 
  const maxTop = 0;
  if (up < maxTop) {
    up = maxTop;
  }
  ball.style.top = up +"px"

}

const moveDown = function(){
  let down = parseInt(ball.style.top) || 0
  
  down += 15 
  const maxDown= playingField.offsetHeight - ball.offsetHeight
  if(down>maxDown){
    down = maxDown
  }
  ball.style.top = down +"px"

}
//********* */
const moveRight = function(){
  let right = parseInt(ball.style.left) || 0
  right += 15
  const maxRight = playingField.offsetWidth - ball.offsetWidth
  if (right > maxRight) {
    right = maxRight
  }
  ball.style.left = right + "px"
}
//********* */
const moveLeft = function(){
  let left = parseInt(ball.style.left) || 0
  left -= 15
  const maxLeft = 0
  if(left <maxLeft){
    left= maxLeft
  }
  ball.style.left = left + "px"
}