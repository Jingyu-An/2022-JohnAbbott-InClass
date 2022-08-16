console.log('Hello, World from TypeScrip!');
// variable_name:type
var message = 'Hello, World from TypeScrip!';
console.log(message);
var Greeting = /** @class */ (function () {
    function Greeting() {
    }
    Greeting.prototype.greet = function () {
        console.log('Hi again!!!');
    }; // end function greet
    return Greeting;
}()); // end class Greeting
var greeting1 = new Greeting();
greeting1.greet();
