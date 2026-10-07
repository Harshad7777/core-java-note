// Ques 1. Basic Function Expression Syntax
const calculateSquare = function (num) {
    return num * num;
};

console.log(calculateSquare(9));

// ------------------------------------------------------------------

// Ques 2. Function Expression with Parameters and return
let isEven = function (num) {
    return num % 2 === 0;
};

console.log(isEven(14));

// ------------------------------------------------------------------

// Ques 3. Basic Arrow Function Syntax (No Parameters)
const sayHello = () => {
    console.log("Arrow function deployed!");
};

sayHello();

// ------------------------------------------------------------------

// Ques 4. Arrow Function with Single Parameter (No Parentheses)
const calculateTriple = x => x * 3;

console.log(calculateTriple(4));

// ------------------------------------------------------------------

// Ques 5. Arrow Function with Multiple Parameters (Explicit Return)
const getDifference = (a, b) => {
    return a - b;
};

console.log(getDifference(20, 12));

// ------------------------------------------------------------------

// Ques 6. Implicit Return (Single Line Body)
const isPositive = num => num > 0;

console.log(isPositive(-10));
