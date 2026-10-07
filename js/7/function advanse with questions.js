/*
==============================================================
JAVASCRIPT PRACTICE ASSIGNMENTS
TOPIC: FUNCTIONS - CALLBACK, HIGHER-ORDER FUNCTION (HOF),
       CLOSURE AND CONSTRUCTOR FUNCTION
==============================================================

QUICK REFERENCE
---------------
Callback          : a function passed as an argument to another function.
                    operate(10, 5, add);

Higher-order      : a function that takes a function as an argument,
function (HOF)      or returns a function.
                    function operate(a, b, callback) { return callback(a, b); }
                    function makeMultiplier(f) { return function (n) { return n * f; }; }

Closure           : an inner function that remembers the variables of the
                    outer function even after the outer function has finished.
                    function createCounter() {
                      let count = 0;
                      return function () { count = count + 1; return count; };
                    }

Constructor       : a function (name starts with a capital letter) that
function            creates objects when called with "new". It uses "this".
                    function Student(name, marks) {
                      this.name = name;
                      this.marks = marks;
                    }
                    let s1 = new Student("Asha", 85);


##############################################################
PART 1: CALLBACK FUNCTIONS
##############################################################

--------------------------------------------------------------
*/
/*
Q1. Write a program in JavaScript to perform arithmetic operations using a callback function.
--------------------------------------------------------------
-> Create three named functions: add(a, b), subtract(a, b) and multiply(a, b), each returning its result.
-> Create a named function operate(a, b, callback) that calls callback(a, b) and returns the result.
-> In the main program, read two numbers and call operate three times, passing add, subtract and multiply by name (without brackets).
-> Catch each returned value and print it.

Sample input : Input two numbers : 10 5

Sample output :
Addition : 15
Subtraction : 5
Multiplication : 50


--------------------------------------------------------------
*/
// Q1. Arithmetic operations using callback
// --------------------------------------------------------------
function add(a, b) {
  return a + b;
}

function subtract(a, b) {
  return a - b;
}

function multiply(a, b) {
  return a * b;
}

function operate(a, b, callback) {
  return callback(a, b);
}

console.log("Q1");
console.log("Addition : " + operate(10, 5, add));
console.log("Subtraction : " + operate(10, 5, subtract));
console.log("Multiplication : " + operate(10, 5, multiply));

// --------------------------------------------------------------

/*
Q2. Write a program in JavaScript to greet and say goodbye to a user using callback functions.
--------------------------------------------------------------
-> Create two named functions sayHello(name) and sayGoodbye(name). Each one returns a message.
-> Create a named function processName(name, callback) that calls callback(name) and returns the message.
-> In the main program, read a name, call processName once with sayHello and once with sayGoodbye, and print both messages.

Sample input : Input your name : Asha

Sample output :
Hello, Asha!
Goodbye, Asha!


--------------------------------------------------------------
*/
// Q2. Greet and say goodbye using callback
// --------------------------------------------------------------
function sayHello(name) {
  return "Hello, " + name + "!";
}

function sayGoodbye(name) {
  return "Goodbye, " + name + "!";
}

function processName(name, callback) {
  return callback(name);
}

console.log("\nQ2");
console.log(processName("Asha", sayHello));
console.log(processName("Asha", sayGoodbye));

// --------------------------------------------------------------

/*
Q3. Write a program in JavaScript to apply a callback function to every element of an array.
--------------------------------------------------------------
-> Create two named functions: double(n) and square(n).
-> Create a named function applyToEach(arr, callback) that creates a new array, calls callback on every element using a loop, stores each result in the new array, and returns the new array.
-> In the main program, read n and then n numbers. Call applyToEach once with double and once with square.
-> Print both result arrays.

Sample input :
Input number of elements : 5
Input 5 elements : 1 2 3 4 5

Sample output :
Doubled : 2 4 6 8 10
Squared : 1 4 9 16 25


--------------------------------------------------------------
*/
// Q3. Apply callback to every element of an array
// --------------------------------------------------------------
function double(n) {
  return n * 2;
}

function square(n) {
  return n * n;
}

function applyToEach(arr, callback) {
  const result = [];
  for (let i = 0; i < arr.length; i++) {
    result.push(callback(arr[i]));
  }
  return result;
}

console.log("\nQ3");
const numbers = [1, 2, 3, 4, 5];
console.log("Doubled : " + applyToEach(numbers, double).join(" "));
console.log("Squared : " + applyToEach(numbers, square).join(" "));

// --------------------------------------------------------------

/*
Q4. Write a program in JavaScript to run different callback functions depending on a condition.
--------------------------------------------------------------
-> Create two named functions onEven(n) and onOdd(n). Each one prints a message by itself.
-> Create a named function checkNumber(n, onEven, onOdd) that calls onEven(n) if the number is even, otherwise calls onOdd(n).
-> In the main program, read one number and call checkNumber(n, onEven, onOdd).

Sample input 1 : Input any number : 8
Sample output 1 : 8 is an even number

Sample input 2 : Input any number : 7
Sample output 2 : 7 is an odd number


--------------------------------------------------------------
*/
// Q4. Run callback depending on number parity
// --------------------------------------------------------------
function onEven(n) {
  console.log(n + " is an even number");
}

function onOdd(n) {
  console.log(n + " is an odd number");
}

function checkNumber(n, onEvenFn, onOddFn) {
  if (n % 2 === 0) {
    onEvenFn(n);
  } else {
    onOddFn(n);
  }
}

console.log("\nQ4");
checkNumber(8, onEven, onOdd);
checkNumber(7, onEven, onOdd);

// --------------------------------------------------------------

/*
Q5. Write a program in JavaScript to calculate discounted prices by passing arrow functions directly as callbacks.
--------------------------------------------------------------
-> Create a named function applyDiscount(price, discountFn) that returns discountFn(price).
-> In the main program, read the price.
-> Call applyDiscount twice, writing the arrow function directly inside the call (do not store it in a variable first):
     student discount : price x 0.90
     festival discount : price x 0.80
-> Print both prices.

Sample input : Input price : 1000

Sample output :
Student price : 900
Festival price : 800


##############################################################
PART 2: HIGHER-ORDER FUNCTIONS
##############################################################

--------------------------------------------------------------
*/
// Q5. Discount callback using arrow functions
// --------------------------------------------------------------
function applyDiscount(price, discountFn) {
  return discountFn(price);
}

console.log("\nQ5");
console.log("Student price : " + applyDiscount(1000, price => price * 0.90));
console.log("Festival price : " + applyDiscount(1000, price => price * 0.80));

// ==============================================================
// PART 2: HIGHER-ORDER FUNCTIONS
// ==============================================================

// --------------------------------------------------------------

/*
Q6. Write a program in JavaScript to create your own filter function.
--------------------------------------------------------------
-> Create two named functions: isPositive(n) and isEven(n), each returning true or false.
-> Create a named higher-order function filterArray(arr, testFn) that goes through the array using a loop and returns a new array containing only the elements for which testFn returns true.
-> In the main program, read n and then n numbers. Call filterArray with isPositive and with isEven.
-> Print both result arrays.

Sample input :
Input number of elements : 6
Input 6 elements : 12 -5 8 -3 7 0

Sample output :
Positive numbers : 12 8 7
Even numbers : 12 8 0


--------------------------------------------------------------
*/
// Q6. Custom filter function
// --------------------------------------------------------------
function isPositive(n) {
  return n > 0;
}

function isEven(n) {
  return n % 2 === 0;
}

function filterArray(arr, testFn) {
  const result = [];
  for (let i = 0; i < arr.length; i++) {
    if (testFn(arr[i])) {
      result.push(arr[i]);
    }
  }
  return result;
}

console.log("\nQ6");
const arr6 = [12, -5, 8, -3, 7, 0];
console.log("Positive numbers : " + filterArray(arr6, isPositive).join(" "));
console.log("Even numbers : " + filterArray(arr6, isEven).join(" "));

// --------------------------------------------------------------

/*
Q7. Write a program in JavaScript to create your own reduce function.
--------------------------------------------------------------
-> Create a named higher-order function reduceArray(arr, reducer, initial). It starts with total = initial, then for every element sets total = reducer(total, element), and finally returns total.
-> Create three reducer functions (any type): sum, product, and largest (returns the bigger of two numbers).
-> In the main program, read n and then n numbers. Call reduceArray three times:
     sum      with initial 0
     product  with initial 1
     largest  with initial arr[0]
-> Print the three results.

Sample input :
Input number of elements : 5
Input 5 elements : 1 2 3 4 5

Sample output :
Sum : 15
Product : 120
Largest : 5


--------------------------------------------------------------
*/
// Q7. Custom reduce function
// --------------------------------------------------------------
function reduceArray(arr, reducer, initial) {
  let total = initial;
  for (let i = 0; i < arr.length; i++) {
    total = reducer(total, arr[i]);
  }
  return total;
}

function sum(total, value) {
  return total + value;
}

function product(total, value) {
  return total * value;
}

function largest(a, b) {
  return a > b ? a : b;
}

console.log("\nQ7");
const arr7 = [1, 2, 3, 4, 5];
console.log("Sum : " + reduceArray(arr7, sum, 0));
console.log("Product : " + reduceArray(arr7, product, 1));
console.log("Largest : " + reduceArray(arr7, largest, arr7[0]));

// --------------------------------------------------------------

/*
Q8. Write a program in JavaScript to create a higher-order function that returns a function.
--------------------------------------------------------------
-> Create a named function makeMultiplier(factor) that returns a new function. The returned function takes one number and returns that number multiplied by factor.
-> In the main program, create two functions: double = makeMultiplier(2) and triple = makeMultiplier(3).
-> Read one number, call both functions with it and print the results.

Sample input : Input any number : 5

Sample output :
Double : 10
Triple : 15


--------------------------------------------------------------
*/
// Q8. Higher-order function returns another function
// --------------------------------------------------------------
function makeMultiplier(factor) {
  return function (number) {
    return number * factor;
  };
}

console.log("\nQ8");
const doubleFn = makeMultiplier(2);
const tripleFn = makeMultiplier(3);
const num8 = 5;
console.log("Double : " + doubleFn(num8));
console.log("Triple : " + tripleFn(num8));

// --------------------------------------------------------------

/*
Q9. Write a program in JavaScript to repeat an action a given number of times using a higher-order function.
--------------------------------------------------------------
-> Create a function printSquare(n) that prints "Square of n is n x n" by itself.
-> Create a named higher-order function repeat(times, action) that uses a loop to call action(i) for i = 1, 2, ... times.
-> In the main program, read the number of times and call repeat(times, printSquare).

Sample input : Input number of times : 3

Sample output :
Square of 1 is 1
Square of 2 is 4
Square of 3 is 9


--------------------------------------------------------------
*/
// Q9. Repeat an action using a higher-order function
// --------------------------------------------------------------
function printSquare(n) {
  console.log("Square of " + n + " is " + (n * n));
}

function repeat(times, action) {
  for (let i = 1; i <= times; i++) {
    action(i);
  }
}

console.log("\nQ9");
repeat(3, printSquare);

// --------------------------------------------------------------

/*
Q10. Write a program in JavaScript to combine two functions into one using a higher-order function.
--------------------------------------------------------------
-> Create two functions: doubleIt(n) returns n x 2, and addTen(n) returns n + 10.
-> Create a named higher-order function combine(f, g) that returns a new function. The new function takes one value x and returns g(f(x)) (first f, then g).
-> In the main program, create doubleThenAdd = combine(doubleIt, addTen) and addThenDouble = combine(addTen, doubleIt).
-> Read one number, call both new functions and print the results.

Sample input : Input any number : 5

Sample output :
Double then add ten : 20
Add ten then double : 30


##############################################################
PART 3: CLOSURES
##############################################################

--------------------------------------------------------------
*/
// Q10. Combine two functions into one
// --------------------------------------------------------------
function doubleIt(n) {
  return n * 2;
}

function addTen(n) {
  return n + 10;
}

function combine(f, g) {
  return function (x) {
    return g(f(x));
  };
}

console.log("\nQ10");
const doubleThenAdd = combine(doubleIt, addTen);
const addThenDouble = combine(addTen, doubleIt);
const num10 = 5;
console.log("Double then add ten : " + doubleThenAdd(num10));
console.log("Add ten then double : " + addThenDouble(num10));

// ==============================================================
// PART 3: CLOSURES
// ==============================================================

// --------------------------------------------------------------

/*
Q11. Write a program in JavaScript to create a counter with a private variable using a closure.
--------------------------------------------------------------
-> Create a named function createCounter() that has a local variable count = 0 and returns a function.
-> The returned function increases count by 1 and returns the new value.
-> In the main program, create two counters: counter1 and counter2.
-> Call counter1 three times and counter2 once. Print every returned value.
-> The count variable must not be accessible directly from the main program.

Sample input : (no input)

Sample output :
Counter 1 : 1
Counter 1 : 2
Counter 1 : 3
Counter 2 : 1


--------------------------------------------------------------
*/
// Q11. Counter with private variable
// --------------------------------------------------------------
function createCounter() {
  let count = 0;

  return function () {
    count += 1;
    return count;
  };
}

console.log("\nQ11");
const counter1 = createCounter();
const counter2 = createCounter();
console.log("Counter 1 : " + counter1());
console.log("Counter 1 : " + counter1());
console.log("Counter 1 : " + counter1());
console.log("Counter 2 : " + counter2());

// --------------------------------------------------------------

/*
Q12. Write a program in JavaScript to create a bank account with a private balance using a closure.
--------------------------------------------------------------
-> Create a named function createAccount(openingBalance) with a local variable balance.
-> It returns an object with three functions: deposit(amount), withdraw(amount) and getBalance().
-> withdraw returns "Insufficient balance" (and does not change the balance) if amount is more than balance; otherwise it reduces the balance.
-> In the main program, read the opening balance, deposit amount and withdraw amount. Call the functions in that order and print the messages and the final balance.

Sample input 1 :
Input opening balance : 1000
Input deposit amount : 500
Input withdraw amount : 200

Sample output 1 : Balance : 1300

Sample input 2 :
Input opening balance : 1000
Input deposit amount : 500
Input withdraw amount : 5000

Sample output 2 :
Insufficient balance
Balance : 1500


--------------------------------------------------------------
*/
// Q12. Bank account with closure
// --------------------------------------------------------------
function createAccount(openingBalance) {
  let balance = openingBalance;

  return {
    deposit(amount) {
      balance += amount;
      return balance;
    },
    withdraw(amount) {
      if (amount > balance) {
        return "Insufficient balance";
      }
      balance -= amount;
      return balance;
    },
    getBalance() {
      return balance;
    }
  };
}

console.log("\nQ12");
const account1 = createAccount(1000);
console.log("Balance : " + account1.deposit(500));
console.log(account1.withdraw(200));
console.log("Balance : " + account1.getBalance());

const account2 = createAccount(1000);
account2.deposit(500);
console.log(account2.withdraw(5000));
console.log("Balance : " + account2.getBalance());

// --------------------------------------------------------------

/*
Q13. Write a program in JavaScript to generate unique IDs with a prefix using a closure.
--------------------------------------------------------------
-> Create a named function createIdGenerator(prefix) with a private variable number = 0.
-> It returns a function that increases number by 1 and returns prefix + number (for example "EMP1").
-> In the main program, create an employee generator with prefix "EMP" and a student generator with prefix "STU".
-> Call the employee generator three times and the student generator once. Print every ID.

Sample input : (no input)

Sample output :
EMP1
EMP2
EMP3
STU1


--------------------------------------------------------------
*/
// Q13. Unique ID generator with prefix
// --------------------------------------------------------------
function createIdGenerator(prefix) {
  let number = 0;

  return function () {
    number += 1;
    return prefix + number;
  };
}

console.log("\nQ13");
const employeeGenerator = createIdGenerator("EMP");
const studentGenerator = createIdGenerator("STU");
console.log(employeeGenerator());
console.log(employeeGenerator());
console.log(employeeGenerator());
console.log(studentGenerator());

// --------------------------------------------------------------

/*
Q14. Write a program in JavaScript to welcome a user only once using a closure.
--------------------------------------------------------------
-> Create a named function createWelcome(name) with a private variable welcomed = false.
-> It returns a function. The first time it is called, it sets welcomed to true and returns "Welcome, <name>!". Every later call returns "Already welcomed".
-> In the main program, read the name, create the welcome function and call it twice. Print both returned values.

Sample input : Input your name : Asha

Sample output :
Welcome, Asha!
Already welcomed


--------------------------------------------------------------
*/
// Q14. Welcome user only once
// --------------------------------------------------------------
function createWelcome(name) {
  let welcomed = false;

  return function () {
    if (!welcomed) {
      welcomed = true;
      return "Welcome, " + name + "!";
    }
    return "Already welcomed";
  };
}

console.log("\nQ14");
const welcome = createWelcome("Asha");
console.log(welcome());
console.log(welcome());

// --------------------------------------------------------------

/*
Q15. Write a program in JavaScript to track a spending budget using a closure.
--------------------------------------------------------------
-> Create a named function createExpenseTracker(budget) with a private variable remaining = budget.
-> It returns a function spend(amount). If amount is less than or equal to remaining, it reduces remaining and returns "Remaining : <remaining>". Otherwise it returns "Budget exceeded" and does not change remaining.
-> In the main program, read the budget and three expense amounts, call spend for each, and print the returned messages.

Sample input :
Input budget : 1000
Input 3 expenses : 400 500 300

Sample output :
Remaining : 600
Remaining : 100
Budget exceeded


--------------------------------------------------------------
*/
// Q15. Spending budget tracker
// --------------------------------------------------------------
function createExpenseTracker(budget) {
  let remaining = budget;

  return function spend(amount) {
    if (amount <= remaining) {
      remaining -= amount;
      return "Remaining : " + remaining;
    }
    return "Budget exceeded";
  };
}

console.log("\nQ15");
const tracker = createExpenseTracker(1000);
console.log(tracker(400));
console.log(tracker(500));
console.log(tracker(300));

// --------------------------------------------------------------

/*
Q16. Write a program in JavaScript to create an array of functions in a loop where each function remembers its own value.
--------------------------------------------------------------
-> Create an empty array called functions.
-> Using a for loop with let i from 0 to 2, store a function in functions[i]. Each function returns (i + 1) x 10.
-> Using another loop, call each stored function and print the result.
-> Each function must remember its own i (10, 20, 30), not the final value of the loop.

Sample input : (no input)

Sample output :
Function 1 : 10
Function 2 : 20
Function 3 : 30


##############################################################
PART 4: CONSTRUCTOR FUNCTIONS
##############################################################

--------------------------------------------------------------
*/
// Q16. Array of functions with private loop values
// --------------------------------------------------------------
console.log("\nQ16");
const functions = [];
for (let i = 0; i < 3; i++) {
  functions.push(function () {
    return (i + 1) * 10;
  });
}

for (let i = 0; i < functions.length; i++) {
  console.log("Function " + (i + 1) + " : " + functions[i]());
}

// ==============================================================
// PART 4: CONSTRUCTOR FUNCTIONS
// ==============================================================

// --------------------------------------------------------------

/*
Q17. Write a program in JavaScript to create student objects using a constructor function.
--------------------------------------------------------------
-> Create a constructor function Student(name, rollNo, marks) that stores the three values using this.
-> In the main program, read the details of two students and create two objects using new.
-> Print the details of both students using their properties.

Sample input :
Input student 1 (name rollNo marks) : Asha 1 85
Input student 2 (name rollNo marks) : Ravi 2 72

Sample output :
Name : Asha, Roll No : 1, Marks : 85
Name : Ravi, Roll No : 2, Marks : 72


--------------------------------------------------------------
*/
// Q17. Student constructor
// --------------------------------------------------------------
function Student(name, rollNo, marks) {
  this.name = name;
  this.rollNo = rollNo;
  this.marks = marks;
}

console.log("\nQ17");
const student1 = new Student("Asha", 1, 85);
const student2 = new Student("Ravi", 2, 72);
console.log("Name : " + student1.name + ", Roll No : " + student1.rollNo + ", Marks : " + student1.marks);
console.log("Name : " + student2.name + ", Roll No : " + student2.rollNo + ", Marks : " + student2.marks);

// --------------------------------------------------------------

/*
Q18. Write a program in JavaScript to create a Rectangle constructor with methods.
--------------------------------------------------------------
-> Create a constructor function Rectangle(length, width) that stores both values using this.
-> Inside the constructor, add two methods: this.area (returns length x width) and this.perimeter (returns 2 x (length + width)).
-> In the main program, read the length and width, create an object using new and call both methods.
-> Print the results.

Sample input :
Input length : 10
Input width : 5

Sample output :
Area : 50
Perimeter : 30


--------------------------------------------------------------
*/
// Q18. Rectangle constructor with methods
// --------------------------------------------------------------
function Rectangle(length, width) {
  this.length = length;
  this.width = width;

  this.area = function () {
    return this.length * this.width;
  };

  this.perimeter = function () {
    return 2 * (this.length + this.width);
  };
}

console.log("\nQ18");
const rect = new Rectangle(10, 5);
console.log("Area : " + rect.area());
console.log("Perimeter : " + rect.perimeter());

// --------------------------------------------------------------

/*
Q19. Write a program in JavaScript to create a Car constructor that changes its own speed.
--------------------------------------------------------------
-> Create a constructor function Car(brand, model) that stores both values and sets this.speed = 0.
-> Add three methods inside the constructor: accelerate(amount) increases the speed, brake(amount) decreases the speed (the speed must never go below 0), and getSpeed() returns the speed.
-> In the main program, read the brand and model, create the car and read two acceleration values and one brake value.
-> After each action, print the speed.

Sample input :
Input brand : Honda
Input model : City
Input 2 acceleration values : 50 30
Input brake value : 100

Sample output :
Honda City speed : 50
Honda City speed : 80
Honda City speed : 0


--------------------------------------------------------------
*/
// Q19. Car constructor with speed control
// --------------------------------------------------------------
function Car(brand, model) {
  this.brand = brand;
  this.model = model;
  this.speed = 0;

  this.accelerate = function (amount) {
    this.speed += amount;
    console.log(this.brand + " " + this.model + " speed : " + this.speed);
  };

  this.brake = function (amount) {
    this.speed = Math.max(0, this.speed - amount);
    console.log(this.brand + " " + this.model + " speed : " + this.speed);
  };

  this.getSpeed = function () {
    return this.speed;
  };
}

console.log("\nQ19");
const car = new Car("Honda", "City");
car.accelerate(50);
car.accelerate(30);
car.brake(100);

// --------------------------------------------------------------

/*
Q20. Write a program in JavaScript to create a BankAccount constructor.
--------------------------------------------------------------
-> Create a constructor function BankAccount(holderName, balance) that stores both values using this.
-> Add methods inside the constructor: deposit(amount) increases the balance, and withdraw(amount) reduces the balance, or returns "Insufficient balance" if the amount is more than the balance.
-> In the main program, read the details, create the object, deposit once and withdraw twice. Print the balance after the deposit, the message or balance after each withdrawal.

Sample input :
Input holder name : Asha
Input opening balance : 1000
Input deposit amount : 500
Input 2 withdraw amounts : 2000 300

Sample output :
Balance after deposit : 1500
Insufficient balance
Balance after withdrawal : 1200


--------------------------------------------------------------
*/
// Q20. BankAccount constructor
// --------------------------------------------------------------
function BankAccount(holderName, balance) {
  this.holderName = holderName;
  this.balance = balance;

  this.deposit = function (amount) {
    this.balance += amount;
    console.log("Balance after deposit : " + this.balance);
  };

  this.withdraw = function (amount) {
    if (amount > this.balance) {
      console.log("Insufficient balance");
      return;
    }
    this.balance -= amount;
    console.log("Balance after withdrawal : " + this.balance);
  };
}

console.log("\nQ20");
const account = new BankAccount("Asha", 1000);
account.deposit(500);
account.withdraw(2000);
account.withdraw(300);

// --------------------------------------------------------------

/*
Q21. Write a program in JavaScript to create a Book constructor for a library.
--------------------------------------------------------------
-> Create a constructor function Book(title) that stores the title and sets this.isIssued = false.
-> Add two methods inside the constructor:
     issueBook()  : if the book is not issued, mark it issued and return "<title> has been issued". Otherwise return "<title> is already issued".
     returnBook() : mark it not issued and return "<title> has been returned".
-> In the main program, read the title, create the book, then call issueBook, issueBook, returnBook in that order. Print each returned message.

Sample input : Input book title : Atomic Habits

Sample output :
Atomic Habits has been issued
Atomic Habits is already issued
Atomic Habits has been returned


--------------------------------------------------------------
*/
// Q21. Book constructor
// --------------------------------------------------------------
function Book(title) {
  this.title = title;
  this.isIssued = false;

  this.issueBook = function () {
    if (!this.isIssued) {
      this.isIssued = true;
      return this.title + " has been issued";
    }
    return this.title + " is already issued";
  };

  this.returnBook = function () {
    this.isIssued = false;
    return this.title + " has been returned";
  };
}

console.log("\nQ21");
const book = new Book("Atomic Habits");
console.log(book.issueBook());
console.log(book.issueBook());
console.log(book.returnBook());

// --------------------------------------------------------------

/*
Q22. Write a program in JavaScript to create an Employee constructor with a salary raise.
--------------------------------------------------------------
-> Create a constructor function Employee(name, monthlySalary) that stores both values using this.
-> Add two methods inside the constructor: getAnnualSalary() returns monthlySalary x 12, and giveRaise(percent) increases monthlySalary by that percent.
-> In the main program, read the name, monthly salary and raise percent. Create the object, print the annual salary, give the raise and print the annual salary again.

Sample input :
Input employee name : Asha
Input monthly salary : 30000
Input raise percent : 10

Sample output :
Name : Asha
Annual salary : 360000
Annual salary after 10% raise : 396000


--------------------------------------------------------------
*/
// Q22. Employee constructor with salary raise
// --------------------------------------------------------------
function Employee(name, monthlySalary) {
  this.name = name;
  this.monthlySalary = monthlySalary;

  this.getAnnualSalary = function () {
    return this.monthlySalary * 12;
  };

  this.giveRaise = function (percent) {
    this.monthlySalary += this.monthlySalary * (percent / 100);
  };
}

console.log("\nQ22");
const emp = new Employee("Asha", 30000);
console.log("Name : " + emp.name);
console.log("Annual salary : " + emp.getAnnualSalary());
emp.giveRaise(10);
console.log("Annual salary after 10% raise : " + emp.getAnnualSalary());

// --------------------------------------------------------------

/*
Q23. Write a program in JavaScript to create a Product constructor with a default value.
--------------------------------------------------------------
-> Create a constructor function Product(name, price, quantity = 1) that stores the three values using this. Quantity defaults to 1.
-> Add a method getTotal() inside the constructor that returns price x quantity.
-> In the main program, create the first product with only a name and price, and the second product with name, price and quantity.
-> Print the total of each product.

Sample input :
Input product 1 (name price) : Pen 10
Input product 2 (name price quantity) : Notebook 50 4

Sample output :
Pen total : 10
Notebook total : 200


##############################################################
PART 5: SCENARIO-BASED QUESTIONS (MIXED CONCEPTS)
##############################################################

--------------------------------------------------------------
*/
// Q23. Product constructor with default quantity
// --------------------------------------------------------------
function Product(name, price, quantity = 1) {
  this.name = name;
  this.price = price;
  this.quantity = quantity;

  this.getTotal = function () {
    return this.price * this.quantity;
  };
}

console.log("\nQ23");
const product1 = new Product("Pen", 10);
const product2 = new Product("Notebook", 50, 4);
console.log("Pen total : " + product1.getTotal());
console.log("Notebook total : " + product2.getTotal());

// ==============================================================
// PART 5: SCENARIO-BASED QUESTIONS (MIXED CONCEPTS)
// ==============================================================

// --------------------------------------------------------------

/*
Q24. Write a program in JavaScript to find passed students and toppers using a constructor and a higher-order function.
--------------------------------------------------------------
-> Create a constructor function Student(name, marks).
-> Create callback functions isPassed(student) (marks 40 or more) and isTopper(student) (marks 75 or more), each returning true or false.
-> Create a higher-order function filterStudents(students, testFn) that returns a new array of the students for whom testFn returns true.
-> In the main program, read the number of students, then read each name and marks and store the Student objects in an array.
-> Call filterStudents with isPassed and with isTopper, and print the names of the students in each result.

Sample input :
Input number of students : 3
Input student 1 (name marks) : Asha 85
Input student 2 (name marks) : Ravi 32
Input student 3 (name marks) : Meena 60

Sample output :
Passed students : Asha Meena
Toppers : Asha


--------------------------------------------------------------
*/
// Q24. Passed students and toppers using constructor + HOF
// --------------------------------------------------------------
function StudentRecord(name, marks) {
  this.name = name;
  this.marks = marks;
}

function isPassed(student) {
  return student.marks >= 40;
}

function isTopper(student) {
  return student.marks >= 75;
}

function filterStudents(students, testFn) {
  const result = [];
  for (let i = 0; i < students.length; i++) {
    if (testFn(students[i])) {
      result.push(students[i].name);
    }
  }
  return result;
}

console.log("\nQ24");
const studentRecords = [
  new StudentRecord("Asha", 85),
  new StudentRecord("Ravi", 32),
  new StudentRecord("Meena", 60)
];
console.log("Passed students : " + filterStudents(studentRecords, isPassed).join(" "));
console.log("Toppers : " + filterStudents(studentRecords, isTopper).join(" "));

// --------------------------------------------------------------

/*
Q25. Write a program in JavaScript to build a login system that locks after wrong attempts using a closure.
--------------------------------------------------------------
-> Create a named function createLogin(correctPassword, maxAttempts) with private variables for the number of wrong attempts made and a locked status.
-> It returns a function attempt(password):
     if already locked, return "Account locked"
     if the password is correct, return "Login successful"
     otherwise add one wrong attempt; if wrong attempts reach maxAttempts, lock the account and return "Account locked"; else return "Wrong password. Attempts left : <number>"
-> In the main program, read the correct password, the maximum attempts and 4 password attempts. Call the returned function for each attempt and print the messages.
-> Once the account is locked it stays locked, even for the correct password.

Sample input :
Input correct password : abc123
Input maximum attempts : 3
Input 4 password attempts : 111 222 333 abc123

Sample output :
Wrong password. Attempts left : 2
Wrong password. Attempts left : 1
Account locked
Account locked


--------------------------------------------------------------
*/
// Q25. Login system with closure and max attempts
// --------------------------------------------------------------
function createLogin(correctPassword, maxAttempts) {
  let wrongAttempts = 0;
  let locked = false;

  return function attempt(password) {
    if (locked) {
      return "Account locked";
    }

    if (password === correctPassword) {
      return "Login successful";
    }

    wrongAttempts += 1;

    if (wrongAttempts >= maxAttempts) {
      locked = true;
      return "Account locked";
    }

    return "Wrong password. Attempts left : " + (maxAttempts - wrongAttempts);
  };
}

console.log("\nQ25");
const login = createLogin("abc123", 3);
console.log(login("111"));
console.log(login("222"));
console.log(login("333"));
console.log(login("abc123"));

// --------------------------------------------------------------

/*
Q26. Write a program in JavaScript to calculate a shopping cart total using a constructor and callback discounts.
--------------------------------------------------------------
-> Create a constructor function Cart() with an empty array this.items.
-> Add two methods inside the constructor:
     addItem(name, price) : stores the item (name and price) at the end of the items array using index.
     getTotal(discountFn) : adds up all prices using a loop. If discountFn is given, return discountFn(total), otherwise return the total.
-> Create two arrow functions to be passed as callbacks: tenPercentOff (total x 0.90) and flat300Off (total - 300).
-> In the main program, read two items, add them to the cart and print the total without a discount, with tenPercentOff and with flat300Off.

Sample input :
Input item 1 (name price) : Shirt 500
Input item 2 (name price) : Shoes 1500

Sample output :
Total without discount : 2000
With 10% off : 1800
With flat 300 off : 1700


--------------------------------------------------------------
*/
// Q26. Shopping cart total with callback discounts
// --------------------------------------------------------------
function Cart() {
  this.items = [];

  this.addItem = function (name, price) {
    this.items.push({ name, price });
  };

  this.getTotal = function (discountFn) {
    let total = 0;
    for (let i = 0; i < this.items.length; i++) {
      total += this.items[i].price;
    }
    if (discountFn) {
      return discountFn(total);
    }
    return total;
  };
}

console.log("\nQ26");
const cart = new Cart();
cart.addItem("Shirt", 500);
cart.addItem("Shoes", 1500);
const tenPercentOff = total => total * 0.90;
const flat300Off = total => total - 300;
console.log("Total without discount : " + cart.getTotal());
console.log("With 10% off : " + cart.getTotal(tenPercentOff));
console.log("With flat 300 off : " + cart.getTotal(flat300Off));

// --------------------------------------------------------------

/*
Q27. Write a program in JavaScript to give employees unique IDs automatically using a closure and a constructor.
--------------------------------------------------------------
-> Create a named function createIdGenerator(prefix) that returns a closure which gives "EMP1", "EMP2", ... on each call (private counter).
-> In the main program, create the generator once with prefix "EMP".
-> Create a constructor function Employee(name) that stores the name and sets this.id by calling the generator.
-> In the main program, read 3 names, create 3 Employee objects with new and print each employee's ID and name.

Sample input : Input 3 employee names : Asha Ravi Meena

Sample output :
EMP1 - Asha
EMP2 - Ravi
EMP3 - Meena


==============================================================
END OF ASSIGNMENT: CALLBACK, HOF, CLOSURE, CONSTRUCTOR
==============================================================
*/
// Q27. Unique employee IDs using closure + constructor
// --------------------------------------------------------------
function createEmployeeIdGenerator(prefix) {
  let number = 0;

  return function () {
    number += 1;
    return prefix + number;
  };
}

function EmployeeWithId(name, generator) {
  this.name = name;
  this.id = generator();
}

console.log("\nQ27");
const employeeIdGenerator = createEmployeeIdGenerator("EMP");
const emp1 = new EmployeeWithId("Asha", employeeIdGenerator);
const emp2 = new EmployeeWithId("Ravi", employeeIdGenerator);
const emp3 = new EmployeeWithId("Meena", employeeIdGenerator);
console.log(emp1.id + " - " + emp1.name);
console.log(emp2.id + " - " + emp2.name);
console.log(emp3.id + " - " + emp3.name);

// ==============================================================
// END OF ASSIGNMENT: CALLBACK, HOF, CLOSURE, CONSTRUCTOR
// ==============================================================

