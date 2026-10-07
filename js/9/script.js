// ==============================================================
// ARRAY METHODS AND HIGHER-ORDER FUNCTIONS: REFERENCE NOTES
// ==============================================================
/*
     Arrays
        Array methods

        1. push()
            - adds the element to the end of arrays
        2. pop()
            - pop removes the last element and returns that element
        3. unshift()
            - unshift add the element to start of the array (0 index)
        4. shift()
            - shoft removes the element from the start and returns that element
        5. join()
            - it converts the array into string based on delimeter
        6. toString()
            - it converts the array into string
        8. indexOf()
            - returns the index of the element else -1
        9. lastIndexOf()
            - returns the last index of the element
        10. reverse()
            - it reverse the array it modifies the original array
        11. splice()
            - it adds or removes the elements from the specific position
                startIndex , deletecount, restparameters(to add in the array)
        12. slice()
            - returns the part of the array from the given index
            startIndex, endIndex

        13. flat()
            - it converts all the nested arrays into single array

    HOF
        1. filter()
            - filters the array based on the given condition and returns the new array
            - it takes the callback function as parameter (predicate)
        2. sort()
            - sorts the element in asce or desc order
            - it takes the callback function as parameter to sort the number array
            - it modifies the original array

        3. map()
            - transforms the array element and returns new array
        4. reduce()
            - converts the array into single value
        5. some()
            - returns true if some of the element matches to the condition(predicate)
        6. every()
            - returns true of all the elements matches to the condition (predicate)
        7. forEach()
            - traverse over the array
            - forEach does not return any value



    Objects in JavaScript
        Object is collection of key value pairs
        we can store the data in the form of key and value pairs

        constructor functions


    OOP using JS


 




*/
// ==============================================================
// ARRAY METHODS: USAGE EXAMPLE
// ==============================================================
/*
let arr = [];
arr.push(100);
arr.push(20);
arr.push(2000);
// console.log(arr.pop());
arr.unshift(1);
arr.unshift(3);
// console.log(arr.shift());
// console.log(arr.join("/"));
// arr.splice(3, 1);
// console.log(arr.indexOf(50));
// arr.reverse();

arr.push([1, 2, 3, 4, [5, 6, 7, 8]]);

const flattenArray = arr.flat().flat();
console.log(flattenArray);

const evenArr = flattenArray.filter((element) => element % 2 !== 0);
console.log(evenArr);

// flattenArray.sort((a, b) => a - b);

// span <span> 3 </span>

// console.log(flattenArray.map((e) => `<span> ${e} </span>`));
// let sum = flattenArray.reduce((p, c, i) => p + c);
// console.log(sum);
let arr1 = [1, 3, 5, 7];
// let isEven = flattenArray.some((e) => e % 2 === 0);
// let isEven = arr1.every((e) => e % 2 !== 0);
// console.log(isEven);
arr.forEach((element, index) => {
  console.log(element + "  ");
});

*/

// ==============================================================
// ARRAY EXERCISES
// ==============================================================
/*
    examples:

*/

// --------------------------------------------------------------
// Example 1: Move zeroes to the start of the array
// Input: 1 0 3 0 3 4 5 6 0 5 0 6
// --------------------------------------------------------------
/*
let arr = [1, 0, 3, 0, 3, 4, 5, 6, 0, 5, 0, 6];

arr = arr.filter((element) => element === 0)
  .concat(arr.filter((element) => element !== 0));

console.log(arr);
*/

// --------------------------------------------------------------
// Example 2: Convert array elements to HTML list items
// --------------------------------------------------------------
/*
const listOfFruits = ["apple", "banana", "cherry", "orange", "mango"];

const listItems = listOfFruits.map((item) => `<li>${item}</li>`);

listItems.forEach((item) => {
  listOfFruit.innerHTML += item;
});
*/

// --------------------------------------------------------------
// Example 3: Check whether a string is a palindrome
// --------------------------------------------------------------
/*
const str = "madam";
const isPalindrome = str.split("").reverse().join("") === str;

if (isPalindrome) {
  console.log("The string is palindrome");
} else {
  console.log("The string is not palindrome");
}
*/

// --------------------------------------------------------------
// Example 4: Separate values by data type
// --------------------------------------------------------------
/*
const mixedArr = [1, 2, 4, "a", "s", "d", "a", 324, 45, "et", "et"];

const stringArr = mixedArr.filter((element) => typeof element === "string");
const numberArr = mixedArr.filter((element) => typeof element === "number");

console.log(stringArr);
console.log(numberArr);
*/

// --------------------------------------------------------------
// Example 5: Search for an element using array search methods
// --------------------------------------------------------------
/*
Q7. Write a program in JavaScript to search an element using indexOf(), lastIndexOf() and includes().
-> Read an array of numbers and the element to search.
-> Use includes() to check whether the element is present. If it is not present, print a "not present" message.
-> If it is present, use indexOf() for its first index and lastIndexOf() for its last index, and print both.

Sample input 1 :
Input elements : 5 10 20 10 30
Input element to search : 10

Sample output 1 :
Present in array : Yes
First index : 1
Last index : 3

Sample input 2 :
Input elements : 5 10 20 10 30
Input element to search : 99

Sample output 2 : Element 99 is not present
*/

/*
const arr = [5, 10, 20, 10, 30];
const searchElement = 10;

if (arr.includes(searchElement)) {
  console.log("Present in array : Yes");
  console.log("First index : " + arr.indexOf(searchElement));
  console.log("Last index : " + arr.lastIndexOf(searchElement));
} else {
  console.log("Element " + searchElement + " is not present");
}
*/