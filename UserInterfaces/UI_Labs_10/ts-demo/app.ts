/* var message:string = 'Hello World from TypeScript'
console.log(message)
*/
/*
class Greeting {
    greet():void {
        console.log('Hi again!!!')
    } // end function greet
} // end class Greeting

var greeting1 = new Greeting();
greeting1.greet();
*/
/*
var firstname:string = 'mary'
var lastname = 'rose'
var address = '123 green street'
let city
*/
/*
var name: string = "John" ;
var score1: number = 50 ;
var score2: number = 42.50
var sum = score1 + score2
console. log( "name" + name)
console. log( "first score: " + score1)
console. log( "second score: " + score2)
console. log( "sum of the scores: " + sum)
*/
/*
var num: number = "hello" // will result in a compilation error
*/

/*
var str = '1'
var str2:number = <number><any> str //str is now of type number
console.log(str2)
*/

/*
var num = 2 ; // data type inferred as number
console.log( "value of num " + num);
num = "12" ;
console. log(num);
*/

/* ************** */
/* Variable Scope: */
/* ************** */
var global_num = 12 //global variable
class MyNumbers {
    num_val = 13; //class variable
    static sval = 10; //static field
    storeNum(): void {
        var local_num = 14; //local variable
    } 
}// end class Numbers
console.log("Global num: " + global_num)
console.log(MyNumbers.sval) //static variable
var obj = new MyNumbers();
console.log("Global num: " + obj.num_val)