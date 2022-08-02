/*  JavaScript 
    Hands-On Project 1-4

    Author: Jingyu An
    Date:   2022-08-01

    Filename: project01-04.js
*/

//define variables for home and work addresses

let homeStreet = "1 main St.";
let homeCity = "Sicilia";
let homeState = "MA";
let homeCode = '02103';

let workStreet = '15 Oak Ln.';
let workCity = 'Central City';
let workState = "MA";
let workCode = '02104';

function setAddress(option) {
    if (option === 'home') {
        document.getElementById('street').value = homeStreet;
        document.getElementById('city').value = homeCity;
        document.getElementById('state').value = homeState;
        document.getElementById('code').value = homeCode;
    }
    else if (option === 'work') {
        document.getElementById('street').value = workStreet;
        document.getElementById('city').value = workCity;
        document.getElementById('state').value = workState;
        document.getElementById('code').value = workCode;
    }
}