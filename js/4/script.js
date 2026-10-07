// Example 1: Change the case of a string
{
  const name = "Ravindra";

  console.log("Uppercase:", name.toUpperCase());
  console.log("Lowercase:", name.toLowerCase());
}

// Example 2: Repeat a string
{
  const word = "Hello ";

  console.log(word.repeat(3));
}

// Example 3: Remove whitespace from a string
{
  const text = "  Hello JavaScript  ";

  console.log("Trim start:", text.trimStart());
  console.log("Trim end:", text.trimEnd());
  console.log("Trim both ends:", text.trim());
}

// Example 4: Get part of a string with slice()
{
  const text = "Hello JavaScript";

  console.log(text.slice(6, 16)); // The end index is not included.
}

// Example 5: Get part of a string with substr()
{
  const text = "Hello JavaScript";

  console.log(text.substr(6, 10)); // The second argument is the character count.
}

// Example 6: Get part of a string with substring()
{
  const text = "Hello JavaScript";

  console.log(text.substring(6, 16)); // The end index is not included.
}

// Example 7: Pad a string
{
  const number = "42";

  console.log("Pad start:", number.padStart(5, "0"));
  console.log("Pad end:", number.padEnd(5, "0"));
}

// Example 8: Get input with prompt()
// Uncomment these lines to try the browser prompt.
// const userName = prompt("Enter your name:");
// console.log("Name:", userName);
// console.log("Input type:", typeof userName);

// Example 9: Read a value from an HTML textbox
// Add <input id="userName" type="text"> to the HTML, then uncomment:
// const userNameInput = document.querySelector("#userName");
// console.log("Textbox value:", userNameInput.value);

// Example 10: Simple if statement
{
  const number = 8;

  if (number > 0) {
    console.log("The number is positive.");
  }
}

// Example 11: Check whether a number is even or odd
{
  const number = 7;

  if (number % 2 === 0) {
    console.log("The number is even.");
  } else {
    console.log("The number is odd.");
  }
}

// Example 12: Nested if statement for ID and password
{
  const correctId = 1001;
  const correctPassword = 1010;
  const enteredId = 1001;
  const enteredPassword = 1010;

  if (enteredId === correctId) {
    if (enteredPassword === correctPassword) {
      console.log("Welcome.");
    } else {
      console.log("Incorrect password.");
    }
  } else {
    console.log("Incorrect ID.");
  }
}

// Example 13: Display the day using an if-else-if ladder
{
  const dayNumber = 3;

  if (dayNumber === 1) {
    console.log("Monday");
  } else if (dayNumber === 2) {
    console.log("Tuesday");
  } else if (dayNumber === 3) {
    console.log("Wednesday");
  } else if (dayNumber === 4) {
    console.log("Thursday");
  } else if (dayNumber === 5) {
    console.log("Friday");
  } else if (dayNumber === 6) {
    console.log("Saturday");
  } else if (dayNumber === 7) {
    console.log("Sunday");
  } else {
    console.log("Invalid input.");
  }
}
