document.addEventListener("DOMContentLoaded", function () {
  document.getElementById("main").innerHTML = "Jingyu_2228416";
});
document.addEventListener("DOMContentLoaded", function () {
  tick();
  setInterval(tick, 1000);
});

function tick() {
  document.getElementById("ticker").innerHTML = new Date().toLocaleTimeString();
}

// Initialize state variables and set element values/style appropriately window.addEventListener("load", function() {
if (!localStorage.clickCount) {
  localStorage.clickCount = 0;
}
document.getElementById("counter").innerHTML = localStorage.clickCount;
if (!sessionStorage.welcomeColour) {
  sessionStorage.welcomeColour = getComputedStyle(document.getElementById("main")).color;
} else {
  document.getElementById("main").style.color = sessionStorage.welcomeColour;
}

function changeColourAndCount() {
// ++localStorage.clickCount by itself works too, but including general approach // in case need to increment by more than 1 in some other use case in the future. localStorage.clickCount = Number(localStorage.clickCount) + 1; document.getElementById("counter").innerHTML = localStorage.clickCount;
  if (sessionStorage.welcomeColour === "rgb(0, 0, 255)") {
    sessionStorage.welcomeColour = "rgb(255, 0, 0)";
  } else {
    sessionStorage.welcomeColour = "rgb(0, 0, 255)";
  }
  document.getElementById("main").style.color = sessionStorage.welcomeColour;
}