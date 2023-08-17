const  container = document.getElementById("container")
const getRandomColor = function() {
    const niceColors = ["#8e44ad", "#3498db", "#c0392b", "#f1c40f", "#d35400", "#2ecc71", "#1abc9c", "#2c3e50", "#7f8c8d"]
    
    const randomPosition = Math.floor(Math.random() * niceColors.length);
    return niceColors[randomPosition];
  }
const creatBox = function(){
    //creat elment div that have class box
    const box = document.createElement("div")
    box.classList.add("box")
    // adding event listener to change the background color
    // when mouse enter 
    box.addEventListener("mouseenter", function(){
        this.style.backgroundColor = getRandomColor()
    })
    //add the box (element div) to the container div 
    container.appendChild(box)
}
// Ask the user for the number of boxes to create
const numberOfBoxes = parseInt(prompt("How many boxes do you want to create?"))
//Loop to create and addnumber of boxes
for (let i = 0; i < numberOfBoxes; i++) {
    creatBox();
}


/*
const box = document.getElementById("box")

const enterColor = function () {
    box.style.backgroundColor = "#c0392b"
    box.innerHTML = "AHH GO AWAY"
}

const leaveColor = function () {
    box.style.backgroundColor = "#1abc9c"
    box.innerHTML = "Hover over me!"
}
const clicks = function (){
    box.style.backgroundColor= "#8e44ad"
}
const list = document.getElementById("lis")
const addToLis = function(){
    const listParamter = document.createElement("li")
    listParamter.innerHTML = "Add New Item!"
    list.appendChild(listParamter)    
}
const box1 = document.createElement("div") // dynamically creating an element

box1.setAttribute("class","box")
box1.onclick = function(){       // adding an event to the new element
    box1.innerHTML ="imm aliveee"
}

document.getElementById("some").appendChild(box1) // now the box will be on the page, and will react to a click!

*/
