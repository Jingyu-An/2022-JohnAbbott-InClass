/*    JavaScript 
      Project 02-01

      Celsius <-> Farenheit Coverter
      Author: Jingyu An
      Date:   2022-08-02

      Filename: project02-01.js
 */

document.getElementById('fValue').onchange = function () {
    let fDegree;
    fDegree = this.value;
    console.log(fDegree);
    FahrenheitToCelsius(fDegree);
}

document.getElementById('cValue').onchange = function () {
    let cDegree;
    cDegree = this.value;
    CelsiusToFahrenheit(cDegree);
}

function FahrenheitToCelsius(f) {
    let degree;
    degree = (f - 32) / 1.8;
    document.getElementById('cValue').value = degree;
}

function CelsiusToFahrenheit(c) {
    let degree;
    degree = (c * 1.8) + 32;
    document.getElementById('fValue').value = degree;
}