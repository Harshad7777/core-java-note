/*
Que 1 :
--------
Write a C program to display the n terms of odd natural numbers and their sum.
Input :
	Enter a number : 10
Expected Output :
The odd numbers are :1 3 5 7 9 11 13 15 17 19
The Sum of odd Natural Number upto 10 terms : 100
*/
// Answer
{
  const n = Number(prompt("Enter a number:"));
  let sum = 0;
  let oddNumbers = "";

  for (let i = 1; i <= n; i++) {
    const odd = 2 * i - 1;
    oddNumbers += odd + " ";
    sum += odd;
  }

  console.log("The odd numbers are :" + oddNumbers.trim());
  console.log(
    "The Sum of odd Natural Number upto " + n + " terms : " + sum
  );
}

// ------------------------------------------------------------------

/*

Que 2 :
--------
Write a C program to find the first and last digit of user given number.

Input :
	Enter a number : 14567
Expected Output 
	last digit is : 7
	first digit is : 1
*/
// Answer
{
  const input = prompt("Enter a number:");
  const number = Math.abs(Number(input));
  let firstDigit = number;

  while (firstDigit >= 10) {
    firstDigit = Math.floor(firstDigit / 10);
  }

  const lastDigit = number % 10;
  console.log("last digit is : " + lastDigit);
  console.log("first digit is : " + firstDigit);
}

// ------------------------------------------------------------------

/*

Que 3 :
--------
Write a C program to print Fibonacci series up to n terms.

 Input :
	Enter a number : 5
Expected Output :
0 1 1 2 3 
*/
// Answer
{
  const n = Number(prompt("Enter a number:"));
  let first = 0;
  let second = 1;
  let series = "";

  for (let i = 1; i <= n; i++) {
    series += first + " ";
    const next = first + second;
    first = second;
    second = next;
  }

  console.log(series.trim());
}

// ------------------------------------------------------------------

/*

Que 4 :
--------
Write a C program to print harmonic series up to N terms.
Input :
	Enter a number : 5
Expected Output :
	1 + 1/1 + 1/2 + 1/3 + 1/4 + 1/5 = 3.28
*/
// Answer
{
  const n = Number(prompt("Enter a number:"));
  let sum = 1;
  let series = "1";

  for (let i = 1; i <= n; i++) {
    sum += 1 / i;
    series += " + 1/" + i;
  }

  console.log(series + " = " + sum.toFixed(2));
}

// ------------------------------------------------------------------

/*

Que 5 :
--------
Write a C program to below series up to N terms.
Input :
	Enter a number : 10
Expected Output :
		
	1 2 3 9 4 5 6 18 7 8 9 27 10
*/
// Answer
{
  const n = Number(prompt("Enter a number:"));
  let series = "";

  for (let i = 1; i <= n; i++) {
    series += i + " ";

    if (i % 3 === 0) {
      series += i * 3 + " ";
    }
  }

  console.log(series.trim());
}

// ------------------------------------------------------------------

/*

Que 6 :
--------
Write a C program to below series up to N terms.
Input :
	Enter a number : 5
Expected Output :
		1 - 2 + 3 - 4 + 5 = 3
*/
// Answer
{
  const n = Number(prompt("Enter a number:"));
  let sum = 0;
  let series = "";

  for (let i = 1; i <= n; i++) {
    if (i % 2 === 0) {
      sum -= i;
      series += " - " + i;
    } else {
      sum += i;
      series += (i === 1 ? "" : " + ") + i;
    }
  }

  console.log(series + " = " + sum);
}

// ------------------------------------------------------------------

/*

Que 7 :
--------
Write a C program that displays the n terms of square natural numbers and their sum.
1 4 9 16 ... n Terms
Test Data :
Input the number of terms : 5
Expected Output :
The square natural upto 5 terms are :1 4 9 16 25
The Sum of Square Natural Number upto 5 terms = 55
*/
// Answer
{
  const n = Number(prompt("Input the number of terms:"));
  let sum = 0;
  let squares = "";

  for (let i = 1; i <= n; i++) {
    const square = i * i;
    squares += square + " ";
    sum += square;
  }

  console.log("The square natural upto " + n + " terms are :" + squares.trim());
  console.log(
    "The Sum of Square Natural Number upto " + n + " terms = " + sum
  );
}

// ------------------------------------------------------------------

/*

Que 8 :
--------
Write a C program to convert decimal to binary number.
Input :
	Enter a number : 5
Expected Output :
		101 
*/
// Answer
{
  let decimal = Number(prompt("Enter a number:"));
  let binary = "";

  if (decimal === 0) {
    binary = "0";
  } else {
    while (decimal > 0) {
      binary = (decimal % 2) + binary;
      decimal = Math.floor(decimal / 2);
    }
  }

  console.log(binary);
}

// ------------------------------------------------------------------

/*

Que 9 :
--------
Write a C program to print below output.
Input :
	Enter a number : 100
Expected Output :
		001
Input :
	Enter a number : 12000
Expected Output :
		00021
*/
// Answer
{
  const number = prompt("Enter a number:");
  let reversed = "";

  for (let i = number.length - 1; i >= 0; i--) {
    reversed += number[i];
  }

  console.log(reversed);
}

// ------------------------------------------------------------------

/*

Que 10 :
-------
Write a C program to find the given digit position in given number.
Input :
	Enter a number : 987965
	Enter search digit : 9
Expected Output :
		9 in 1 position
		9 in 4 position
*/
// Answer
{
  const number = prompt("Enter a number:");
  const searchDigit = prompt("Enter search digit:");
  let found = false;

  for (let i = 0; i < number.length; i++) {
    if (number[i] === searchDigit) {
      console.log(searchDigit + " in " + (i + 1) + " position");
      found = true;
    }
  }

  if (!found) {
    console.log(searchDigit + " was not found in the number.");
  }
}

