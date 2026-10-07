// Que 1: Display first n odd natural numbers and their sum
let n1 = Number(prompt("Enter a number:"));
let sum1 = 0;
let oddNumbers1 = "";

for (let i = 1; i <= n1; i++) {
    let odd = 2 * i - 1;
    oddNumbers1 += odd + " ";
    sum1 += odd;
}

console.log("The odd numbers are :" + oddNumbers1.trim());
console.log("The Sum of odd Natural Number upto " + n1 + " terms : " + sum1);

// ------------------------------------------------------------------

// Que 2: Find first and last digit of a number
let n2 = Number(prompt("Enter a number:"));
let lastDigit2 = n2 % 10;
let firstDigit2 = n2;
while (firstDigit2 >= 10) {
    firstDigit2 = Math.floor(firstDigit2 / 10);
}
console.log("last digit is : " + lastDigit2);
console.log("first digit is : " + firstDigit2);

// ------------------------------------------------------------------

// Que 3: Fibonacci series up to n terms
let n3 = Number(prompt("Enter a number:"));
let a3 = 0;
let b3 = 1;
let fib3 = "";

for (let i = 1; i <= n3; i++) {
    fib3 += a3 + " ";
    let next = a3 + b3;
    a3 = b3;
    b3 = next;
}

console.log(fib3.trim());

// ------------------------------------------------------------------

// Que 4: Harmonic series up to n terms
let n4 = Number(prompt("Enter a number:"));
let sum4 = 1;
let series4 = "1";

for (let i = 2; i <= n4; i++) {
    sum4 += 1 / i;
    series4 += " + 1/" + i;
}

console.log(series4 + " = " + sum4.toFixed(2));

// ------------------------------------------------------------------

// Que 5: Special series
let n5 = Number(prompt("Enter a number:"));
let series5 = "";

for (let i = 1; i <= n5; i++) {
    if (i % 3 === 0) {
        series5 += (i * 3) + " ";
    } else {
        series5 += i + " ";
    }
}

console.log(series5.trim());

// ------------------------------------------------------------------

// Que 6: Alternating series 1 - 2 + 3 - 4 + 5 ...
let n6 = Number(prompt("Enter a number:"));
let sum6 = 0;
let series6 = "";

for (let i = 1; i <= n6; i++) {
    if (i % 2 === 0) {
        sum6 -= i;
        series6 += " - " + i;
    } else {
        sum6 += i;
        series6 += " + " + i;
    }
}

console.log(series6.trim() + " = " + sum6);

// ------------------------------------------------------------------

// Que 7: Square natural numbers and their sum
let n7 = Number(prompt("Enter the number of terms:"));
let sum7 = 0;
let squares7 = "";

for (let i = 1; i <= n7; i++) {
    let square = i * i;
    squares7 += square + " ";
    sum7 += square;
}

console.log("The square natural upto " + n7 + " terms are :" + squares7.trim());
console.log("The Sum of Square Natural Number upto " + n7 + " terms = " + sum7);

// ------------------------------------------------------------------

// Que 8: Decimal to binary
let n8 = Number(prompt("Enter a number:"));
let binary8 = "";
for (let i = n8; i > 0; i = Math.floor(i / 2)) {
    binary8 = (i % 2) + binary8;
}
console.log(binary8 || "0");

// ------------------------------------------------------------------

// Que 9: Print number with leading zeroes (based on digit count)
let n9 = Number(prompt("Enter a number:"));
let str9 = String(n9);
let result9 = "";

for (let i = 0; i < str9.length; i++) {
    result9 += str9[i];
}

console.log(result9);

// ------------------------------------------------------------------

// Que 10: Find the position of a digit in a number
let n10 = Number(prompt("Enter a number:"));
let search10 = Number(prompt("Enter search digit:"));
let str10 = String(n10);

for (let i = 0; i < str10.length; i++) {
    if (Number(str10[i]) === search10) {
        console.log(search10 + " in " + (i + 1) + " position");
    }
}
