// Example 1: Arithmetic operators
{
  const firstNumber = 10;
  const secondNumber = 3;

  console.log("Addition:", firstNumber + secondNumber);
  console.log("Subtraction:", firstNumber - secondNumber);
  console.log("Multiplication:", firstNumber * secondNumber);
  console.log("Division:", firstNumber / secondNumber);
  console.log("Remainder:", firstNumber % secondNumber);
  console.log("Exponent:", firstNumber ** secondNumber);
}

// Example 2: Increment and decrement operators
{
  let count = 5;

  count++;
  console.log("After increment:", count);

  count--;
  console.log("After decrement:", count);
}

// Example 3: Assignment operators
{
  let total = 10;

  total += 5;
  console.log("After += 5:", total);

  total -= 2;
  console.log("After -= 2:", total);

  total *= 2;
  console.log("After *= 2:", total);

  total /= 4;
  console.log("After /= 4:", total);

  total %= 3;
  console.log("After %= 3:", total);
}

// Example 4: Comparison operators
{
  console.log('10 == "10":', 10 == "10"); // Loose equality converts types.
  console.log('10 === "10":', 10 === "10"); // Strict equality checks type and value.
  console.log("10 > 5:", 10 > 5);
  console.log("10 <= 10:", 10 <= 10);
  console.log('10 !== "10":', 10 !== "10");
}

// Example 5: Logical and nullish coalescing operators
{
  const age = 20;
  const hasTicket = true;

  console.log("Can enter:", age >= 18 && hasTicket);
  console.log("Needs permission:", age < 18 || !hasTicket);

  const username = null;
  console.log("Name:", username ?? "user");
}

// Example 6: Convert a string to a number
{
  const numericText = "20";
  const number = +numericText;

  console.log("Unary plus result:", number);
  console.log("Result type:", typeof number);
}

// Example 7: Convert a number to a string
{
  const number = 10;
  const text = number.toString();

  console.log("String result:", text);
  console.log("Result type:", typeof text);
}

// Example 8: Parse integer and decimal values from strings
{
  const value = "123.45px";

  console.log("Parsed integer:", Number.parseInt(value, 10));
  console.log("Parsed decimal:", Number.parseFloat(value));
}

// Example 9: Invalid number conversion
{
  const result = Number("hello");

  console.log("Invalid conversion:", result);
  console.log("Is NaN:", Number.isNaN(result));
}

// Example 10: Number formatting methods
{
  const value = 10.5456789;

  console.log("toFixed(2):", value.toFixed(2));
  console.log("toPrecision(4):", value.toPrecision(4));
}

// Example 11: Convert a value to a boolean
{
  console.log('Boolean("0"):', Boolean("0"));
  console.log("Boolean(0):", Boolean(0));
  console.log("Boolean(\"\"):", Boolean(""));
}

// Example 12: Concatenation and template strings
{
  const language = "JavaScript";

  console.log("Hello, I am learning " + language);
  console.log("Hello, I am learning", language);
  console.log(`Hello, I am learning ${language}`);
}

// Example 13: String properties and methods
{
  const text = "Hello";

  console.log("Length:", text.length);
  console.log("Character at index 0:", text.charAt(0));
  console.log("Character code at index 0:", text.charCodeAt(0));
  console.log('Starts with "H":', text.startsWith("H"));
  console.log('Includes "e":', text.includes("e"));
  console.log('First index of "l":', text.indexOf("l"));
  console.log('Last index of "l":', text.lastIndexOf("l"));
}

// Example 14: Replace characters in a string
{
  const text = "Hello";
  const updatedText = text.replace("H", "h");
  const replacedAll = updatedText.replaceAll("l", "z");

  console.log("After replace:", updatedText);
  console.log("After replaceAll:", replacedAll);
}
