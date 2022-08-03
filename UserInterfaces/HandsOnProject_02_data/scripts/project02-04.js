/*    JavaScript 
      Project 02-04

      Application to calculate the cost of a restaurant order plus tax
      Author: Jingyu An
      Date:   2022-08-02

      Filename: project02-04.js
 */

const CHICKEN_PRICE = 10.95;
const HALIBUT_PRICE = 13.95;
const BURGER_PRICE = 9.95;
const SALMON_PRICE = 18.95;
const SALAD_PRICE = 7.95;

const SALES_TAX = 0.07;

document.addEventListener("change", calcTotal)

function calcTotal() {

    let cost = 0;
    let tax;
    let totalCost;

    let buyChicken, buyHalibut, buyBurger, buySalmon, buySalad;

    buyChicken = document.getElementById('chicken').checked;
    buyHalibut = document.getElementById('halibut').checked;
    buyBurger = document.getElementById('burger').checked;
    buySalmon = document.getElementById('salmon').checked;
    buySalad = document.getElementById('salad').checked;

    cost = (buyChicken ? CHICKEN_PRICE : 0) + (buyHalibut ? HALIBUT_PRICE : 0) +
        (buyBurger ? BURGER_PRICE : 0) + (buySalmon ? SALMON_PRICE : 0) + (buySalad ? SALAD_PRICE : 0);

    document.getElementById('foodTotal').innerText = formatCurrency(cost);

    tax = cost * SALES_TAX;
    document.getElementById('foodTax').innerText = formatCurrency(tax);

    totalCost = cost + tax;
    document.getElementById('totalBill').innerText = formatCurrency(totalCost);
}

// Function to display a numeric value as a text string in the format $##.## 
 function formatCurrency(value) {
    return "$" + value.toFixed(2);
 }
