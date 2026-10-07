// Example 1: Comments
// This is a single-line comment.

/*
  This is a multi-line comment.
  JavaScript ignores both kinds of comments.
*/

// Example 2: Variable declaration and initialization
{
  let score;
  score = 10;

  console.log("Initial score:", score);
}

// Example 3: var, let, and const
{
  var city = "London";
  var city = "Paris"; // var allows redeclaration in the same scope.
  console.log("var:", city);

  let color = "blue";
  color = "green"; // let allows reassignment.
  console.log("let:", color);

  const country = "Japan";
  console.log("const:", country);
  // A const variable cannot be reassigned.
}

// Example 4: var is function-scoped
function showVarScope() {
  if (true) {
    var message = "var is available throughout this function";
  }

  console.log(message);
}

showVarScope();

// Example 5: let is block-scoped
{
  let blockMessage = "let is available inside this block";
  console.log(blockMessage);
}

// blockMessage is not available outside the block above.

// Example 6: var hoisting
{
  console.log("Value before assignment:", hoistedName);
  var hoistedName = "Ravindra";
  console.log("Value after assignment:", hoistedName);
}

// Example 7: Checking data types with typeof
{
  let value = "Ravindra";
  console.log("String type:", typeof value);

  value = 10;
  console.log("Number type:", typeof value);
  console.log("Function type:", typeof function () {});
}

// Example 8: Maximum safe integer
console.log("Maximum safe integer:", Number.MAX_SAFE_INTEGER);

// Example 9: Strings
{
  const doubleQuoted = "Hello";
  const singleQuoted = "Hello";
  const templateLiteral = `Hello`;

  console.log(doubleQuoted, singleQuoted, templateLiteral);
}

// Example 10: null
{
  const emptyValue = null;
  console.log("Value:", emptyValue);
  console.log("typeof null:", typeof emptyValue); // JavaScript returns "object".
}

// Example 11: Symbols are unique
{
  const firstSymbol = Symbol(10);
  const secondSymbol = Symbol(10);

  console.log("Symbols are equal:", firstSymbol === secondSymbol);
}

// Example 12: BigInt stores large integers
{
  const largeNumber = 123456765434567876543n;
  console.log("BigInt:", largeNumber);
}
