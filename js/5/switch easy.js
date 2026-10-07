// let n = parseInt(prompt());
// switch (n % 2 === 0) {
//   case true:
//     console.log("The number is even");
//     break;
//   case false:
//     console.log("The number is odd");
// }

/*

let month = parseInt(prompt("Enter the month int number (1-12)"));
switch (month) {
  case 1:
  case 3:
  case 5:
  case 7:
  case 8:
  case 10:
  case 12:
    console.log("The month has 31 days");
    break;

  case 4:
  case 6:
  case 9:
  case 11:
    console.log("The month has 30 days");
    break;

  case 2:
    let year = parseInt(prompt("Enter the year"));
    if ((year % 4 === 0 && year % 400 === 0) || year % 100 != 0) {
      console.log("The month has 29 days");
    } else {
      console.log("The month has 28 days");
    }
    break;
  default:
    console.log("please select a valid month");
}

*/

// Question 1: Print the day of the week for a number from 1 to 7.
function question1DayOfWeek() {
  const day = Number(prompt("Enter a number (1-7):"));

  switch (day) {
    case 1:
      console.log("Monday");
      break;
    case 2:
      console.log("Tuesday");
      break;
    case 3:
      console.log("Wednesday");
      break;
    case 4:
      console.log("Thursday");
      break;
    case 5:
      console.log("Friday");
      break;
    case 6:
      console.log("Saturday");
      break;
    case 7:
      console.log("Sunday");
      break;
    default:
      console.log("Invalid day. Enter a number from 1 to 7.");
  }
}

// Question 2: Convert a percentage to a grade using switch.
function question2Grade() {
  const percentage = Number(prompt("Enter student percentage (0-100):"));
  let grade;

  if (!Number.isInteger(percentage) || percentage < 0 || percentage > 100) {
    console.log("Invalid percentage.");
    return;
  }

  switch (true) {
    case percentage >= 90:
      grade = "A";
      break;
    case percentage >= 80:
      grade = "B";
      break;
    case percentage >= 70:
      grade = "C";
      break;
    case percentage >= 60:
      grade = "D";
      break;
    default:
      grade = "F";
  }

  console.log(`Grade: ${grade}`);
}

// Question 3: Perform arithmetic using the selected operator.
function question3Calculator() {
  const firstNumber = Number(prompt("Enter first number:"));
  const secondNumber = Number(prompt("Enter second number:"));
  const operator = prompt("Enter operator (+, -, *, /):");
  let result;

  switch (operator) {
    case "+":
      result = firstNumber + secondNumber;
      break;
    case "-":
      result = firstNumber - secondNumber;
      break;
    case "*":
      result = firstNumber * secondNumber;
      break;
    case "/":
      if (secondNumber === 0) {
        console.log("Cannot divide by zero.");
        return;
      }
      result = firstNumber / secondNumber;
      break;
    default:
      console.log("Invalid operator.");
      return;
  }

  console.log(`Result: ${result}`);
}

// Question 4: Check whether a character is a vowel or consonant.
function question4VowelOrConsonant() {
  const input = prompt("Enter a character:");

  if (input === null || input.length !== 1 || !/^[a-z]$/i.test(input)) {
    console.log("Please enter a single letter.");
    return;
  }

  switch (input.toLowerCase()) {
    case "a":
    case "e":
    case "i":
    case "o":
    case "u":
      console.log("Vowel");
      break;
    default:
      console.log("Consonant");
  }
}

// Question 5: Display a menu and continue until Exit is selected.
function question5MenuCalculator() {
  let continueProgram = true;

  while (continueProgram) {
    const option = Number(
      prompt(
        "1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\nSelect an option:",
      ),
    );

    if (option === 5) {
      console.log("Exiting calculator.");
      break;
    }

    if (option < 1 || option > 5 || !Number.isInteger(option)) {
      console.log("Invalid option.");
      continue;
    }

    const firstNumber = Number(prompt("Enter first number:"));
    const secondNumber = Number(prompt("Enter second number:"));
    let result;

    switch (option) {
      case 1:
        result = firstNumber + secondNumber;
        break;
      case 2:
        result = firstNumber - secondNumber;
        break;
      case 3:
        result = firstNumber * secondNumber;
        break;
      case 4:
        if (secondNumber === 0) {
          console.log("Cannot divide by zero.");
          continue;
        }
        result = firstNumber / secondNumber;
        break;
    }

    console.log(`Result: ${result}`);
    continueProgram = confirm("Would you like to perform another operation?");
  }
}

// Question 6: Print the word for a number from 1 to 10.
function question6NumberWord() {
  const number = Number(prompt("Enter a number between 1 and 10:"));

  switch (number) {
    case 1:
      console.log("One");
      break;
    case 2:
      console.log("Two");
      break;
    case 3:
      console.log("Three");
      break;
    case 4:
      console.log("Four");
      break;
    case 5:
      console.log("Five");
      break;
    case 6:
      console.log("Six");
      break;
    case 7:
      console.log("Seven");
      break;
    case 8:
      console.log("Eight");
      break;
    case 9:
      console.log("Nine");
      break;
    case 10:
      console.log("Ten");
      break;
    default:
      console.log("Invalid number.");
  }
}

// Question 7: Print the month name for a number from 1 to 12.
function question7MonthName() {
  const month = Number(prompt("Enter month number (1 to 12):"));

  switch (month) {
    case 1:
      console.log("January");
      break;
    case 2:
      console.log("February");
      break;
    case 3:
      console.log("March");
      break;
    case 4:
      console.log("April");
      break;
    case 5:
      console.log("May");
      break;
    case 6:
      console.log("June");
      break;
    case 7:
      console.log("July");
      break;
    case 8:
      console.log("August");
      break;
    case 9:
      console.log("September");
      break;
    case 10:
      console.log("October");
      break;
    case 11:
      console.log("November");
      break;
    case 12:
      console.log("December");
      break;
    default:
      console.log("Invalid month number.");
  }
}

// Question 8: Find the winner and the point difference.
function question8GameWinner() {
  const firstName = prompt("Enter first player name:");
  const firstScore = Number(prompt("Enter first player score:"));
  const secondName = prompt("Enter second player name:");
  const secondScore = Number(prompt("Enter second player score:"));

  switch (true) {
    case firstScore > secondScore:
      console.log(
        `${firstName} won the match by ${firstScore - secondScore} points.`,
      );
      break;
    case secondScore > firstScore:
      console.log(
        `${secondName} won the match by ${secondScore - firstScore} points.`,
      );
      break;
    default:
      console.log("The match is a tie.");
  }
}

// Question 9: Display a department based on the employee ID.
function question9Department() {
  const id = Number(prompt("Enter ID:"));

  switch (true) {
    case id >= 11 && id <= 15:
      console.log("Software department");
      break;
    case id >= 16 && id <= 20:
      console.log("Developer department");
      break;
    case id >= 21 && id <= 23:
      console.log("Management department");
      break;
    default:
      console.log("Invalid ID.");
  }
}

// Question 10: Check whether a number is even or odd.
function question10EvenOrOdd() {
  const number = Number(prompt("Enter a number:"));

  if (!Number.isInteger(number)) {
    console.log("Enter a valid integer.");
    return;
  }

  switch (number % 2) {
    case 0:
      console.log("Even");
      break;
    case 1:
    case -1:
      console.log("Odd");
      break;
  }
}

// Question 11: Find the maximum between two numbers using switch.
function question11Maximum() {
  const firstNumber = Number(prompt("Enter first number:"));
  const secondNumber = Number(prompt("Enter second number:"));

  switch (true) {
    case firstNumber > secondNumber:
      console.log(`${firstNumber} is max`);
      break;
    case secondNumber > firstNumber:
      console.log(`${secondNumber} is max`);
      break;
    default:
      console.log("Both numbers are equal.");
  }
}

// Run one solution at a time by uncommenting its function call:
// question1DayOfWeek();
// question2Grade();
// question3Calculator();
// question4VowelOrConsonant();
// question5MenuCalculator();
// question6NumberWord();
// question7MonthName();
// question8GameWinner();
// question9Department();
// question10EvenOrOdd();
// question11Maximum();