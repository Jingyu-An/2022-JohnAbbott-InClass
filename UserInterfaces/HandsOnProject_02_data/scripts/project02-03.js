/*    JavaScript 
      Project 02-03

      Application to return the shape of a clicked object
      Author: Jingyu An
      Date:   2022-08-02

      Filename: project02-03.js
 */

const sq = document.getElementById('square');
const tr = document.getElementById('triangle');
const cir = document.getElementById('circle');

sq.onmouseover = function () {
    pickShape(this);
}

sq.onmouseout = function () {
    dropShape();
}

tr.onmouseover = function () {
    pickShape(this);
}

tr.onmouseout = function () {
    dropShape();
}

cir.onmouseover = function () {
    pickShape(this);
}

cir.onmouseout = function () {
    dropShape();
}

function pickShape(obj) {
    document.getElementById('feedback').innerText = "You're hovering over the " + obj.id;
}

function dropShape() {
    document.getElementById('feedback').innerText = "";
}