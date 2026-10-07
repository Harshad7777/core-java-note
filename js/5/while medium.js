// Q1. Multiplication Table
let num1 = Number(prompt("Enter a number:"));
let i1 = 1;

while (i1 <= 10) {
    console.log(num1 + " x " + i1 + " = " + (num1 * i1));
    i1++;
}

// ------------------------------------------------------------------

// Q2. Palindrome Number
let num2 = Number(prompt("Enter an integer:"));
let original2 = num2;
let reverse2 = 0;

while (num2 > 0) {
    let digit = num2 % 10;
    reverse2 = reverse2 * 10 + digit;
    num2 = Math.floor(num2 / 10);
}

if (original2 === reverse2) {
    console.log(original2 + " is palindrome number.");
} else {
    console.log(original2 + " is not palindrome number.");
}

// ------------------------------------------------------------------

// Q3. Prime Number
let num3 = Number(prompt("Enter an integer:"));
let i3 = 2;
let isPrime = true;

if (num3 <= 1) {
    isPrime = false;
}

while (i3 < num3) {
    if (num3 % i3 === 0) {
        isPrime = false;
        break;
    }
    i3++;
}

if (isPrime) {
    console.log(num3 + " is prime number.");
} else {
    console.log(num3 + " is not prime number.");
}

// ------------------------------------------------------------------

// Q4. Convert Each Digit Into Words
let num4 = Number(prompt("Enter a number:"));
let temp4 = num4;
let reverse4 = 0;

while (temp4 > 0) {
    let digit = temp4 % 10;
    reverse4 = reverse4 * 10 + digit;
    temp4 = Math.floor(temp4 / 10);
}

while (reverse4 > 0) {
    let digit = reverse4 % 10;

    if (digit === 0) console.log("zero");
    else if (digit === 1) console.log("one");
    else if (digit === 2) console.log("two");
    else if (digit === 3) console.log("three");
    else if (digit === 4) console.log("four");
    else if (digit === 5) console.log("five");
    else if (digit === 6) console.log("six");
    else if (digit === 7) console.log("seven");
    else if (digit === 8) console.log("eight");
    else if (digit === 9) console.log("nine");

    reverse4 = Math.floor(reverse4 / 10);
}

// ------------------------------------------------------------------

// Q5. Spy Number Using Function
function checkSpyNumber(num) {
    let sum = 0;
    let product = 1;

    while (num > 0) {
        let digit = num % 10;
        sum += digit;
        product *= digit;
        num = Math.floor(num / 10);
    }

    if (sum === product) {
        console.log("Is spy number");
    } else {
        console.log("Is not spy number");
    }
}

let num5 = Number(prompt("Enter a number:"));
checkSpyNumber(num5);

// ------------------------------------------------------------------

// Q6. Perfect Number
let num6 = Number(prompt("Enter a number:"));
let i6 = 1;
let sum6 = 0;

while (i6 < num6) {
    if (num6 % i6 === 0) {
        sum6 += i6;
    }
    i6++;
}

if (sum6 === num6) {
    console.log(num6 + " is a perfect number.");
} else {
    console.log(num6 + " is not a perfect number.");
}

// ------------------------------------------------------------------

// Q7. Neon Number
let num7 = Number(prompt("Enter a number:"));
let square7 = num7 * num7;
let sum7 = 0;

while (square7 > 0) {
    let digit = square7 % 10;
    sum7 += digit;
    square7 = Math.floor(square7 / 10);
}

if (sum7 === num7) {
    console.log(num7 + " is a Neon number.");
} else {
    console.log(num7 + " is not a Neon number.");
}

// ------------------------------------------------------------------

// Q8. Alternate Digit Sum
let num8 = Number(prompt("Enter a number:"));
let position8 = 1;
let sum1 = 0;
let sum2 = 0;

while (num8 > 0) {
    let digit = num8 % 10;

    if (position8 % 2 === 1) {
        sum1 += digit;
    } else {
        sum2 += digit;
    }

    num8 = Math.floor(num8 / 10);
    position8++;
}

if (sum1 === sum2) {
    console.log("Alternate digit sum is same.");
} else {
    console.log("Alternate digit sum is not same.");
}

// ------------------------------------------------------------------

// Q9. Step Number
let num9 = Number(prompt("Enter a number:"));
let temp9 = num9;
let isStep = true;

while (temp9 >= 10) {
    let digit1 = temp9 % 10;
    let digit2 = Math.floor(temp9 / 10) % 10;
    let difference = Math.abs(digit1 - digit2);

    if (difference !== 1) {
        isStep = false;
        break;
    }

    temp9 = Math.floor(temp9 / 10);
}

if (isStep) {
    console.log(num9 + " is a step number.");
} else {
    console.log(num9 + " is not a step number.");
}

// ------------------------------------------------------------------

// Q10. Print Odd Numbers Between Two Numbers
let a10 = Number(prompt("Enter first number:"));
let b10 = Number(prompt("Enter second number:"));
let i10 = a10;

console.log("The odd numbers between a and b:");

while (i10 <= b10) {
    if (i10 % 2 !== 0) {
        console.log(i10);
    }
    i10++;
}

// ------------------------------------------------------------------

// Q11. Keep Adding Digits Until Single Digit
let num11 = Number(prompt("Enter a number:"));

while (num11 >= 10) {
    let sum = 0;

    while (num11 > 0) {
        let digit = num11 % 10;
        sum += digit;
        num11 = Math.floor(num11 / 10);
    }

    num11 = sum;
}

console.log("Result is : " + num11);

// ------------------------------------------------------------------

// Q12. Sum of Squares of Digits
let num12 = Number(prompt("Enter a number:"));
let sum12 = 0;

while (num12 > 0) {
    let digit = num12 % 10;
    sum12 += (digit * digit);
    num12 = Math.floor(num12 / 10);
}

console.log(sum12);

// ------------------------------------------------------------------

// Q13. Count Occurrence of a Digit
let num13 = Number(prompt("Enter a number:"));
let search13 = Number(prompt("Enter a number you want to search:"));
let count13 = 0;

while (num13 > 0) {
    let digit = num13 % 10;

    if (digit === search13) {
        count13++;
    }

    num13 = Math.floor(num13 / 10);
}

console.log(search13 + " occurs " + count13 + " times.");

// ------------------------------------------------------------------

// Q14. Find Smallest Digit
let num14 = Number(prompt("Enter a number:"));
let smallest = 9;

while (num14 > 0) {
    let digit = num14 % 10;

    if (digit < smallest) {
        smallest = digit;
    }

    num14 = Math.floor(num14 / 10);
}

console.log("Smallest number is : " + smallest);
