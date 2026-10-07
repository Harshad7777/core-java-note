// Ex 1.
// Write a program to print Fibonacci series up to n terms.
// Input: Enter a number: 5
// Expected Output: 0 1 1 2 3

let n = parseInt(prompt("Enter the number:"));
let output = "";
let a = 0;
let b = 1;

if (n >= 1) {
  output += a + " ";
}

if (n >= 2) {
  output += b + " ";
}

for (let i = 3; i <= n; i++) {
  let c = a + b;
  output += c + " ";
  a = b;
  b = c;
}

console.log(output.trim());

// -------------------------------------------------------------------

// Ex 2.
// Write a program to print the given pattern.
//
//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *

let rows = 9;
let cols = 9;
let str = "";
let start = Math.floor(cols / 2);
let end = Math.floor(cols / 2);

for (let i = 1; i <= rows; i++) {
  for (let j = 1; j <= cols; j++) {
    if (j >= start && j <= end) {
      str += " * ";
    } else {
      str += "   ";
    }
  }

  if (i <= rows / 2) {
    start--;
    end++;
  } else {
    start++;
    end--;
  }

  str += "\n";
}

console.log(str);