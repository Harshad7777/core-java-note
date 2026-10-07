// Example 1: Check whether a number is a Disarium number.
{
  const number = 89;
  let reversedNumber = 0;
  let temp = number;

  while (temp !== 0) {
    reversedNumber = reversedNumber * 10 + (temp % 10);
    temp = Math.trunc(temp / 10);
  }

  let sum = 0;
  temp = reversedNumber;
  let position = 1;

  while (temp !== 0) {
    const digit = temp % 10;
    sum += Math.pow(digit, position);
    position++;
    temp = Math.trunc(temp / 10);
  }

  if (sum === number) {
    console.log(`${number} is a Disarium number.`);
  } else {
    console.log(`${number} is not a Disarium number.`);
  }
}

// Example 2: Check whether a number is an automorphic number.
{
  const number = 25;
  const square = number * number;
  let digitCount = 0;
  let temp = number;

  while (temp !== 0) {
    digitCount++;
    temp = Math.trunc(temp / 10);
  }

  const divisor = Math.pow(10, digitCount);
  const endingDigits = square % divisor;

  if (endingDigits === number) {
    console.log(`${number} is an automorphic number.`);
  } else {
    console.log(`${number} is not an automorphic number.`);
  }
}
