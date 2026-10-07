/*
  Title: Interactive Tea Stall Experience

  Introduction:

  Imagine strolling down a charming street,
  enticed by the inviting aroma of freshly brewed beverages.

  You arrive at a cozy tea stall, greeted by a
  friendly attendant. Prepare for an interactive
  journey through the Tea Stall Counter!

  Scenario:

  Welcome and Menu:

  You enter the tea stall, warmly welcomed by the attendant:
  Attendant: "Welcome to our Tea Stall Counter! Our menu:"

  Tea --------------------- Rs. 10
  Coffee ------------------ Rs. 20
  Cold coffee ------------- Rs. 50
  Exit

  Attendant: "Choose by entering a number (1-4):"

  [User enters choice]

  Customize Order:

  Based on your choice, the attendant guides you:

  [If choice is 1:]
  Attendant: "How many cups of refreshing tea?"

  [If choice is 2:]
  Attendant: "How many cups of aromatic coffee?"

  [If choice is 3:]
  Attendant: "How many cups of chilled cold coffee?"

  [User enters quantity]

  Total and Payment:

  The attendant shares your order total and awaits payment:

  Attendant: "Total for [quantity] cup(s): Rs. [total_price]."
  Attendant: "Enter your payment amount: Rs."

  [User enters amount_paid]

  Attendant: "Change: Rs. [change]."

  Continuation or Farewell:

  Choose to explore more or conclude your visit:

  Attendant: "Explore more or finalize? (Type 'Y' for Yes or 'N' for No):"

  [User enters order_again]

  [If user wants to continue:]
  Attendant: "Certainly, let's explore."

  [If user doesn't want to continue:]
  Attendant: "Thank you for visiting! We look forward to serving you again soon!"
*/

// Example 1: Use switch to select a drink and its price.
function getDrink(choice) {
  switch (choice) {
    case 1:
      return { name: "tea", prompt: "How many cups of refreshing tea?", price: 10 };
    case 2:
      return {
        name: "coffee",
        prompt: "How many cups of aromatic coffee?",
        price: 20,
      };
    case 3:
      return {
        name: "cold coffee",
        prompt: "How many cups of chilled cold coffee?",
        price: 50,
      };
    default:
      return null;
  }
}

// Example 2: Calculate the order total.
function calculateTotal(price, quantity) {
  return price * quantity;
}

// Example 3: Calculate the change after payment.
function calculateChange(amountPaid, total) {
  return amountPaid - total;
}

// Example 4: Run the tea stall and allow the customer to place more orders.
function runTeaStall() {
  let orderAgain = true;

  while (orderAgain) {
    const choiceInput = prompt(
      "Welcome to our Tea Stall Counter! Our menu:\n" +
        "Tea --------------------- Rs. 10\n" +
        "Coffee ------------------ Rs. 20\n" +
        "Cold coffee ------------- Rs. 50\n" +
        "Exit\n" +
        "Choose by entering a number (1-4):",
    );

    if (choiceInput === null) {
      break;
    }

    const choice = Number(choiceInput);

    if (choice === 4) {
      alert("Thanks for visiting.");
      break;
    }

    const drink = getDrink(choice);

    if (drink === null) {
      alert("Enter a valid choice.");
      continue;
    }

    const quantityInput = prompt(drink.prompt);

    if (quantityInput === null) {
      break;
    }

    const quantity = Number(quantityInput);

    if (!Number.isInteger(quantity) || quantity <= 0) {
      alert("Enter a valid quantity.");
      continue;
    }

    const total = calculateTotal(drink.price, quantity);
    let amountPaid;

    while (true) {
      const paymentInput = prompt(
        `Total for ${quantity} cup(s) of ${drink.name}: Rs. ${total}\n` +
          "Enter your payment amount:",
      );

      if (paymentInput === null) {
        return;
      }

      amountPaid = Number(paymentInput);

      if (Number.isFinite(amountPaid) && amountPaid >= total) {
        break;
      }

      alert(`Payment must be at least Rs. ${total}.`);
    }

    alert(`Change: Rs. ${calculateChange(amountPaid, total)}.`);
    orderAgain = confirm("Do you want to explore more?");
  }

  alert("Thank you for visiting! We look forward to serving you again soon!");
}

runTeaStall();
