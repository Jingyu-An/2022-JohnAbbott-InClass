var customerOrder = {
    "cusomerName": "Jingyu",
    "phoneNumber": "123456",
    "items": ["cellphone", "laptop"]
};

console.log(customerOrder);
console.log(customerOrder.cusomerName);
console.log(customerOrder.phoneNumber);
console.log(customerOrder.items[0]);
console.log(customerOrder.items[1]);

var json = JSON.stringify(customerOrder);

console.log(json);

var customerOrderDeserialized = JSON.parse(json);

console.log(customerOrderDeserialized);
