// JavaScript source code
// gpsware.js 

// Script Date: August 2022


/* Function list
1. startup function - displays the current date
2. today function - returns the current date
3. calculatePrice - calculates the subtotal of
     products and quantity
    calculateShipping(shipOption) - calculates the shipping value
4. calculateTotal - calculates the total of placed order
5. validateForm - validates user data entry
*/

/**
 * displays the current date
 */
function startup() {
    // display the current date in the txtDateNow textbox
    // SYNTAX: object_name.property_name = expression
    // alert("I'm here");
    document.getElementById('txtDateNow').value = today();
} // end function startup


/**
 * returns the current date
 */
function today() {
    // create an instance of the Date object
    let currentDate = new Date();

    // extract from the current date variable the date, month, and year
    let thisDate = currentDate.getDate();
    let thisMonth = currentDate.getMonth() + 1;
    let thisYear = currentDate.getFullYear();
    
    // return the current date in the format mm/dd/yyyy
    let todayDate = thisMonth + '/' + thisDate + '/' + thisYear;
    return todayDate;
} // end function today


/**
 * calculates the subtotal of products and quantity
 */
function calculatePrice() {
    // declare product variables
    let product = document.getElementById('ddlProduct');
    let pIndex = product.selectedIndex;
    // alert(pIndex);

    // return the product value of the selected pIndex
    let productPrice = product.options[pIndex].value;
    // alert(productPrice);

    // declare quantity variables 
    let quantity = document.getElementById('ddlQuantity');
    let qIndex = quantity.selectedIndex;

    // return the quantity ordered of the selected product
    let quantityOrdered = quantity.options[qIndex].value;
    // alert(qIndex);

    // display the calculated price in the txtPrice textfiel
    document.getElementById('txtPrice').value =
        (productPrice * quantityOrdered).toFixed(2) ;
        
} // end function calculatePrice