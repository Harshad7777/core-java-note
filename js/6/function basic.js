// Ques 1. Simple Function Declaration
function greetUser() {
    console.log("Hello, welcome to the JavaScript world!");
}

greetUser();

// ------------------------------------------------------------------

// Ques 2. Function for Squaring a Number
function squareNumber() {
    let num = 7;
    let result = num * num;
    console.log("The square is: " + result);
}

squareNumber();

// ------------------------------------------------------------------

// Ques 3. Function for Area Calculation
function calculateRectangleArea(length, width) {
    let area = length * width;
    console.log("A rectangle of " + length + "x" + width + " has an area of " + area + ".");
}

calculateRectangleArea(5, 10);

// ------------------------------------------------------------------

// Ques 4. Function for Voter Eligibility check
function checkVoterEligibility(age) {
    if (age >= 18) {
        console.log("Eligible to vote.");
    } else {
        console.log("Not yet eligible to vote.");
    }
}

checkVoterEligibility(20);
checkVoterEligibility(16);

// ------------------------------------------------------------------

// Ques 5. Function for Factorial Calculation
function calculateFactorial(n) {
    let result = 1;
    for (let i = 1; i <= n; i++) {
        result = result * i;
    }
    console.log(result);
}

calculateFactorial(5);
