// Example 1: Function with default parameters
/*
function addition(a = 0, b = 0) {
  console.log(a + b);
}
addition(10, 20);
*/

// ------------------------------------------------------------------

// Example 2: Find the maximum value using rest parameters
/*
function max(...n) {
  let maximum = n[0];
  for (let i of n) {
    if (i > maximum) {
      maximum = i;
    }
  }
  return maximum;
}

console.log(max(10, 20, 20, 40, 5, 24, 45, 24));
*/

// ------------------------------------------------------------------

// Example 3: Add values from HTML inputs and display the result
/*
function addition(a = 0, b = 0) {
  let sum = parseInt(a) + parseInt(b);
  out.innerText = sum;
}
*/

// ------------------------------------------------------------------

// Example 4: Check whether a number is even or odd
/*
function isEven(a) {
  return a % 2 === 0;
}

const number = 10;
if (isEven(number)) {
  console.log("Even");
} else {
  console.log("Odd");
}
*/

// ------------------------------------------------------------------

// Example 5: Student constructor with getters, setters, and addStudent
/*
function Student(id, name, course, fees) {
  this.name = name;
  this.id = id;
  this.course = course;
  this.fees = fees;

  this.getId = () => this.id;
  this.getName = () => this.name;
  this.getCourse = () => this.course;
  this.getFees = () => this.fees;

  this.setId = (id) => {
    this.id = id;
  };
  this.setName = (name) => {
    this.name = name;
  };
  this.setCourse = (course) => {
    this.course = course;
  };
  this.setFees = (fees) => {
    this.fees = fees;
  };

  this.addStudent = (id, name, course, fees) =>
    new Student(id, name, course, fees);
}

const student = new Student(0, "", "", 0);
const student1 = student.addStudent(101, "Ravindra", "Java", 12345);
console.log(student1.getName());
*/