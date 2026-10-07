// Q1. Armstrong Number using while loop
let num1 = Number(prompt("Enter a number for Armstrong check:"));
let original1 = num1;
let temp1 = num1;
let digits1 = 0;
let sum1 = 0;

while (temp1 > 0) {
    digits1++;
    temp1 = Math.floor(temp1 / 10);
}

temp1 = num1;

while (temp1 > 0) {
    let digit = temp1 % 10;
    sum1 += Math.pow(digit, digits1);
    temp1 = Math.floor(temp1 / 10);
}

if (sum1 === original1) {
    console.log(original1 + " is an Armstrong number");
} else {
    console.log(original1 + " is not an Armstrong number");
}

// ------------------------------------------------------------------

// Q2. Strong Number using while loop
let num2 = Number(prompt("Enter a number for Strong check:"));
let original2 = num2;
let sum2 = 0;

while (num2 > 0) {
    let digit = num2 % 10;
    let factorial = 1;
    let i = 1;

    while (i <= digit) {
        factorial *= i;
        i++;
    }

    sum2 += factorial;
    num2 = Math.floor(num2 / 10);
}

if (sum2 === original2) {
    console.log(original2 + " is a strong number");
} else {
    console.log(original2 + " is not a strong number");
}

// ------------------------------------------------------------------

// Q3. Automorphic Number using while loop
let num3 = Number(prompt("Enter a number for Automorphic check:"));
let square3 = num3 * num3;
let temp3 = num3;
let divisor3 = 1;

while (temp3 > 0) {
    divisor3 *= 10;
    temp3 = Math.floor(temp3 / 10);
}

let lastPart3 = square3 % divisor3;

if (lastPart3 === num3) {
    console.log(num3 + " is an automorphic number.");
} else {
    console.log(num3 + " is not an automorphic number.");
}

// ------------------------------------------------------------------

// Q4. Disarium Number using while loop
let num4 = Number(prompt("Enter a number for Disarium check:"));
let original4 = num4;
let temp4 = num4;
let digits4 = 0;
let sum4 = 0;

while (temp4 > 0) {
    digits4++;
    temp4 = Math.floor(temp4 / 10);
}

temp4 = num4;

while (temp4 > 0) {
    let digit = temp4 % 10;
    sum4 += Math.pow(digit, digits4);
    digits4--;
    temp4 = Math.floor(temp4 / 10);
}

if (sum4 === original4) {
    console.log(original4 + " is a Disarium number.");
} else {
    console.log(original4 + " is not a Disarium number.");
}
