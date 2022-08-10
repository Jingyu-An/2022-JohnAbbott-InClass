const ITEM_1 = 239.99;
const ITEM_2 = 129.75;
const ITEM_3 = 99.95;
const ITEM_4 = 350.89;

const BASE_SALARY = 200.00;
const COMMISSION_RATE = 0.09;

let subTotalItem1 = 0;
let subTotalItem2 = 0;
let subTotalItem3 = 0;
let subTotalItem4 = 0;
let total = 0;

const calculateSubtotal = (item) => {
    let subtotal;
    let itemQuantity;
    let itemSubID;
    let itemValue;

    if (item === 'item1') {
        itemSubID = 'item1SubTotal'
        itemValue = ITEM_1;
    } else if (item === 'item2') {
        itemSubID = 'item2SubTotal'
        itemValue = ITEM_2;
    } else if (item === 'item3') {
        itemSubID = 'item3SubTotal'
        itemValue = ITEM_3;
    } else if (item === 'item4') {
        itemSubID = 'item4SubTotal'
        itemValue = ITEM_4;
    }

    itemQuantity = document.getElementById(item).value;
    if (itemQuantity <= 0) {
        itemQuantity = 0;
        document.getElementById(item).value = 0;
    }

    console.log(itemQuantity);

    subtotal = itemValue * itemQuantity;

    document.getElementById(itemSubID).innerHTML = '$' + subtotal.toFixed(2);

    if (item === 'item1') {
        subTotalItem1 = subtotal;
    } else if (item === 'item2') {
        subTotalItem2 = subtotal;
    } else if (item === 'item3') {
        subTotalItem3 = subtotal;
    } else if (item === 'item4') {
        subTotalItem4 = subtotal;
    }

    total = subTotalItem1 + subTotalItem2 + subTotalItem3 + subTotalItem4;

    document.getElementById('total').innerHTML = '$' + total.toFixed(2);
}

const lastWeekSalary = () => {

    let commission;
    commission = total * COMMISSION_RATE;

    document.getElementById('base').innerHTML = '$' + BASE_SALARY.toFixed(2);
    document.getElementById('commission').innerHTML = 'Commission <br />(9% of $' + total.toFixed(2) + ')';

    document.getElementById('commissionValue').innerHTML = '$' + commission.toFixed(2);

    document.getElementById('totalSalary').innerHTML = '$' + (BASE_SALARY + commission).toFixed(2);
}