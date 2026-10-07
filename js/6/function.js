// Functions
// Functions are reusable blocks of code that can be executed multiple times.
// They are non-primitive data types in JavaScript because they can be stored in variables
// and returned from other functions.

// Functions are first-class citizens in JavaScript because they can be treated as values.

// Functions are declared using the function keyword and an identifier.
//
// Syntax:
// declaration
// function functionName(parameterList) {
//   // function body
// }
//
// caller
// functionName(arguments);

// Parameters are function-local variables declared in the function signature.
// Arguments are the actual values passed when the function is called.

// Procedural programming: code executes only once.
// Functional programming: reusable blocks of code executed multiple times.

// Events
// OOP
// Object-based
// Functional

// Function declaration
function greetUser() {
  console.log("Hello from function");
}

// Function calling
greetUser();
greetUser();
greetUser();

// Using function in buttons
// Every HTML tag is itself an object in JavaScript.
// Objects have different properties and behaviors.
// A textbox has a property called value which gives the value inserted in it.

// username is the id of the textbox
function greetUserFromInput() {
  let user = username.value;
  alert("Welcome " + user + " !");
}

// Sum of two numbers
// 1. Read the input from the HTML textbox
// 2. On click of the button, perform the addition operation
// 3. Display the result on the webpage

function addition() {
  let a = first.value;
  let b = second.value;
  let c = Number(a) + Number(b);
  out.innerText = c;
}

// Functions as values
// Functions are objects.
// When we store a function in another variable, the reference is stored.
// When we copy a function from one variable to another, the reference is copied.

function createAddition() {
  let a = 10;
  let b = 20;

  return function getAddition() {
    return a + b;
  };
}

let add = createAddition();
console.log(add());

// Types of functions: Global execution context and function execution context
