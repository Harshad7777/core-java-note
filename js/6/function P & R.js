// Ques 1. Function for Finding the Maximum of Two Numbers
function findMax(a, b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}

console.log(findMax(100, 50));

// ------------------------------------------------------------------

// Ques 2. Function Interaction (Chained Calculations)
function addTen(num) {
    return num + 10;
}

function doubleResult(num) {
    console.log(num * 2);
}

doubleResult(addTen(5));

// ------------------------------------------------------------------

// Ques 3. Function for Number Reversal (Loop integration)
function reverseNumber(n) {
    let reversed = 0;

    while (n > 0) {
        let digit = n % 10;
        reversed = reversed * 10 + digit;
        n = Math.floor(n / 10);
    }

    return reversed;
}

console.log(reverseNumber(456));

// ------------------------------------------------------------------

// Ques 4. Function for Logical Test (Leap Year)
function isLeapYear(year) {
    return (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
}

console.log(isLeapYear(2000));
console.log(isLeapYear(1900));

// ------------------------------------------------------------------

// Ques 5. Recursive Function (Basic Countdown)
function recursiveCountdown(n) {
    if (n < 1) {
        console.log("Done!");
        return;
    }

    console.log(n);
    recursiveCountdown(n - 1);
}

recursiveCountdown(3);

// ------------------------------------------------------------------

// Ques 6. Function with Multiple return Paths
function getTrafficLightState(color) {
    if (color === "red") {
        return "Stop";
    } else if (color === "yellow") {
        return "Caution";
    } else {
        return "Go";
    }
}

console.log(getTrafficLightState("green"));
