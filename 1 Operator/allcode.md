# Java Operator and Assignment Programs

This document contains Java programs covering arithmetic operators, relational operators, logical operators, ternary conditions, and basic input/output tasks.

## Table of Contents

- [1. Write a java program to enter two numbers and perform all arithmetic operations.](#1-write-a-java-program-to-enter-two-numbers-and-perform-all-arithmetic-operations)
- [2. Write a Java program that takes an alphabet character and toggles its case using ASCII values and operators. · Example: a → A, Z → z.](#2-write-a-java-program-that-takes-an-alphabet-character-and-toggles-its-case-using-ascii-values-and-operators-example-a-a-z-z)
- [3. Write a Java program to check whether character is alphabetic or not.](#3-write-a-java-program-to-check-whether-character-is-alphabetic-or-not)
- [4. Write a java program to enter two angles of a triangle and find the third angle.](#4-write-a-java-program-to-enter-two-angles-of-a-triangle-and-find-the-third-angle)
- [5. Write a java program to enter length and breadth of a rectangle and find its area. Formula - area= length * breadth;](#5-write-a-java-program-to-enter-length-and-breadth-of-a-rectangle-and-find-its-area-formula-area-length-breadth)
- [6. Write a Java program to print the ASCII value of a given character.](#6-write-a-java-program-to-print-the-ascii-value-of-a-given-character)
- [7. Write a java program to input all basic data types and print its output.](#7-write-a-java-program-to-input-all-basic-data-types-and-print-its-output)
- [8. Write a java program to enter radius of a circle and find its diameter,area and circumference. Formula :- diameter=2 * radius;circumference = 2 * 3.14 * radius; area = 3.14 * radius * radius;](#8-write-a-java-program-to-enter-radius-of-a-circle-and-find-its-diameterarea-and-circumference-formula-diameter2-radiuscircumference-2-314-radius-area-314-radius-radius)
- [9. Write a java program to enter temperature in Fahrenheit and convert to Celsius. Formula :- cel = (fah - 32) * 5 / 9;](#9-write-a-java-program-to-enter-temperature-in-fahrenheit-and-convert-to-celsius-formula-cel-fah-32-5-9)
- [10. Write a java program to input any character and check whether it is alphabet, digit or special character.](#10-write-a-java-program-to-input-any-character-and-check-whether-it-is-alphabet-digit-or-special-character)
- [11. Write a java program to input any alphabet and check whether it is vowel or consonant.](#11-write-a-java-program-to-input-any-alphabet-and-check-whether-it-is-vowel-or-consonant)
- [12. Write a java program to accept two integers and check whether they are equal or not.](#12-write-a-java-program-to-accept-two-integers-and-check-whether-they-are-equal-or-not)
- [13. Write a Java program to check whether a number is a multiple of both 3 and 5 using logical AND (&&) operator. Input: 15 Output: Multiple of both 3 and 5](#13-write-a-java-program-to-check-whether-a-number-is-a-multiple-of-both-3-and-5-using-logical-and-andand-operator-input-15-output-multiple-of-both-3-and-5)
- [14. Write a java program to calculate the compound intrest.](#14-write-a-java-program-to-calculate-the-compound-intrest)
- [15. Write a java program to enter length in centimeter and convert into meter and kilometer](#15-write-a-java-program-to-enter-length-in-centimeter-and-convert-into-meter-and-kilometer)
- [16. Write a Java program that reads a number and display the cube.](#16-write-a-java-program-that-reads-a-number-and-display-the-cube)
- [17. Take two integers m and n. Use the ternary operator to print whether the absolute difference between them is greater than 10 or not. Example Input: m = 25, n = 12](#17-take-two-integers-m-and-n-use-the-ternary-operator-to-print-whether-the-absolute-difference-between-them-is-greater-than-10-or-not-example-input-m-25-n-12)
- [18. Write a java program to display message "This is first java program".](#18-write-a-java-program-to-display-message-this-is-first-java-program)
- [19. Write a Java program to check whether a number is divisible by 5 and 11 or not.](#19-write-a-java-program-to-check-whether-a-number-is-divisible-by-5-and-11-or-not)
- [20. Write a Java program to check whether a number is even or odd.](#20-write-a-java-program-to-check-whether-a-number-is-even-or-odd)
- [21. Write a java program to calculate area of an equilateral triangle.](#21-write-a-java-program-to-calculate-area-of-an-equilateral-triangle)
- [22. Write a program to calculate sum of first and last digit of a number without using loop. Input : 123 Output : 4](#22-write-a-program-to-calculate-sum-of-first-and-last-digit-of-a-number-without-using-loop-input-123-output-4)
- [23. Write a program to find first and last digit of a number without using loop in three digit.](#23-write-a-program-to-find-first-and-last-digit-of-a-number-without-using-loop-in-three-digit)
- [24. Write a program to find first and last digit of a number without using loop in three digit.](#24-write-a-program-to-find-first-and-last-digit-of-a-number-without-using-loop-in-three-digit)
- [25. Take a three-digit number and print the larger digit among first and last digit using ternary operator.](#25-take-a-three-digit-number-and-print-the-larger-digit-among-first-and-last-digit-using-ternary-operator)
- [26. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.](#26-given-a-score-out-of-100-print-excellent-90-good-75-average-50-poor-50-using-nested-ternary-operators)
- [27. Write a java program to input basic salary of an employee and calculate its Gross salary according to following. Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%](#27-write-a-java-program-to-input-basic-salary-of-an-employee-and-calculate-its-gross-salary-according-to-following-basic-salary-10000-hra-20-da-80-basic-salary-20000-hra-25-da-90-basic-salary-20000-hra-30-da-95)
- [28. Write a Java program to check whether a year is leap year or not.](#28-write-a-java-program-to-check-whether-a-year-is-leap-year-or-not)
- [29. Write a java program to enter marks of five subjects and calculate total marks and percentage.](#29-write-a-java-program-to-enter-marks-of-five-subjects-and-calculate-total-marks-and-percentage)
- [30. Write a java program to find maximum between three numbers.](#30-write-a-java-program-to-find-maximum-between-three-numbers)
- [31. Write a java program to find the maximum between two numbers.](#31-write-a-java-program-to-find-the-maximum-between-two-numbers)
- [32. Take a three-digit number and print whether the middle digit is greater than the sum of the first and last digits using the ternary operator. Example: Input: num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater Input: num = 853 → Middle digit 5 vs (8+3)=11 → Not Greater](#32-take-a-three-digit-number-and-print-whether-the-middle-digit-is-greater-than-the-sum-of-the-first-and-last-digits-using-the-ternary-operator-example-input-num-572-middle-digit-7-vs-527-equal-or-not-greater-input-num-853-middle-digit-5-vs-8311-not-greater)
- [33. Problem: Write a Java program using the conditional (ternary) operator to find the middle value among three distinct integers p, q, and r. Example Input: p = 10, q = 20, r = 15](#33-problem-write-a-java-program-using-the-conditional-ternary-operator-to-find-the-middle-value-among-three-distinct-integers-p-q-and-r-example-input-p-10-q-20-r-15)
- [34. Write a java program to find the minimum between two numbers.](#34-write-a-java-program-to-find-the-minimum-between-two-numbers)
- [35. Write a java program to find a minimum between three numbers.](#35-write-a-java-program-to-find-a-minimum-between-three-numbers)
- [36. Write a java program to check whether number is neon or not. Input : 9 Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.](#36-write-a-java-program-to-check-whether-number-is-neon-or-not-input-9-output-neon-number-explanation-square-is-99-81-and-sum-of-the-digits-of-the-square-is-9)
- [37. Write a Java expression using arithmetic and assignment operators to calculate net salary if: basicSalary = 35000 taxRate = 12% Find netSalary.](#37-write-a-java-expression-using-arithmetic-and-assignment-operators-to-calculate-net-salary-if-basicsalary-35000-taxrate-12-find-netsalary)
- [38. Write a Java program to check whether a number is positive , negative or zero.](#38-write-a-java-program-to-check-whether-a-number-is-positive-negative-or-zero)
- [39. Write a java program to check whether number is palindrome or not.](#39-write-a-java-program-to-check-whether-number-is-palindrome-or-not)
- [40. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.](#40-given-a-students-score-print-pass-if-its-40-or-above-otherwise-print-fail)
- [41. Take percentage and income of a student: If percentage >= 75 AND income < 200000, print "Eligible" Else "Not Eligible"](#41-take-percentage-and-income-of-a-student-if-percentage-75-and-income-200000-print-eligible-else-not-eligible)
- [42. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.](#42-given-a-number-print-perfect-square-if-its-square-root-is-an-integer-otherwise-not-perfect-square-using-ternary-operators)
- [43. Write a Java program to input cost price and selling price of a product and check profit or loss.](#43-write-a-java-program-to-input-cost-price-and-selling-price-of-a-product-and-check-profit-or-loss)
- [44. Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators. Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2](#44-given-two-integers-write-a-java-program-to-find-the-quotient-and-remainder-using-only-arithmetic-operators-input-dividend-20-divisor-3-output-quotient-6-remainder-2)
- [45. Question: If performance rating > 8, give 15% bonus; else if rating > 5, give 10% bonus; otherwise, no bonus. Use relational operators to implement logic.](#45-question-if-performance-rating-8-give-15-bonus-else-if-rating-5-give-10-bonus-otherwise-no-bonus-use-relational-operators-to-implement-logic)
- [46. Write a Java program to reverse a number without using loop. Input a number: 123 Reverse number: 321](#46-write-a-java-program-to-reverse-a-number-without-using-loop-input-a-number-123-reverse-number-321)
- [47. Write a Java program to convert seconds to hours, minutes and seconds](#47-write-a-java-program-to-convert-seconds-to-hours-minutes-and-seconds)
- [48. Write a Java program to calculate the net salary of an employee. Input: basic salary, HRA %, DA %, and tax %.](#48-write-a-java-program-to-calculate-the-net-salary-of-an-employee-input-basic-salary-hra-da-and-tax)
- [49. Write a java program to calculate the simple intrest.](#49-write-a-java-program-to-calculate-the-simple-intrest)
- [50. Write a java program to Check Number Is Spy Number or Not. Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits. Input : 1412 Output : Spy Number](#50-write-a-java-program-to-check-number-is-spy-number-or-not-example-a-number-is-said-to-be-a-spy-number-if-the-sum-of-all-the-digits-is-equal-to-the-product-of-all-digits-input-1412-output-spy-number)
- [51. Write a Java program and compute the sum of an integer's digits. Input : 123 Output : 6](#51-write-a-java-program-and-compute-the-sum-of-an-integers-digits-input-123-output-6)
- [52. Write a java program swap two number using third variable.](#52-write-a-java-program-swap-two-number-using-third-variable)
- [53. Write a java program swap two number without using third variable.](#53-write-a-java-program-swap-two-number-without-using-third-variable)
- [54. Write a Java program to check whether a triangle is valid or not.](#54-write-a-java-program-to-check-whether-a-triangle-is-valid-or-not)
- [55. Write a Java program to check whether a triangle is equilateral , isoscale or scalene.](#55-write-a-java-program-to-check-whether-a-triangle-is-equilateral-isoscale-or-scalene)
- [56. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.](#56-write-a-java-program-to-read-the-age-of-a-candidate-and-determine-whether-he-is-eligible-to-cast-hisher-own-vote)
- [57. Write a Java program to convert days to years, month and week.](#57-write-a-java-program-to-convert-days-to-years-month-and-week)

## 1. Write a java program to enter two numbers and perform all arithmetic operations.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class AOAPP
{

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your first number: ");
        int a = sc.nextInt();

        System.out.println("enter your second number: ");
        int b = sc.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a*b;
        double div = (double)a/b;

        System.out.println("The addition of "+ a + " & " + b + " is "+add);
        System.out.println("The substraction of "+ a + " & " + b + " is "+sub);
        System.out.println("The multiplication of "+ a + " & " + b + " is "+mul);
        System.out.println("The division of "+ a + " & " + b + " is "+div);

    }

}
```

## 2. Write a Java program that takes an alphabet character and toggles its case using ASCII values and operators. · Example: a → A, Z → z.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet character: ");
        char ch = sc.next().charAt(0);

        // Toggle case using XOR with 32 (ASCII trick)
        char toggled = (char)(ch ^ 32);

        System.out.println("Toggled case: " + toggled);
    }
}
```

## 3. Write a Java program to check whether character is alphabetic or not.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class Alpha
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character: ");
        char msg = sc.next().charAt(0);

        if(msg>='a' && msg<='z' || msg>='A' && msg<='Z')
        {
            System.out.println("it is alphabetical character");
        }
        else
        {
            System.out.println("it is not alphabetical character");
        }
    }
}
```

## 4. Write a java program to enter two angles of a triangle and find the third angle.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class Angle
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the angle first: ");
        int ang1 = sc.nextInt();

        System.out.println("enter the angle second: ");
        int ang2 = sc.nextInt();

        int ang3 = 180 - (ang1 + ang2);
        System.out.println("Third angle is: "+ang3);

    }
}
```

## 5. Write a java program to enter length and breadth of a rectangle and find its area. Formula - area= length * breadth;

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class Area
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length: ");
        int len = sc.nextInt();

        System.out.println("enter the breadth: ");
        int bre = sc.nextInt();

        int totalArea = len*bre;
        System.out.println("The total area is "+totalArea);

    }
}
```

## 6. Write a Java program to print the ASCII value of a given character.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;
        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);
    }
}
```

## 7. Write a java program to input all basic data types and print its output.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;

public class BasicDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input all basic data types
        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();

        System.out.print("Enter a short value: ");
        short s = sc.nextShort();

        System.out.print("Enter an int value: ");
        int i = sc.nextInt();

        System.out.print("Enter a long value: ");
        long l = sc.nextLong();

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        System.out.print("Enter a char value: ");
        char c = sc.next().charAt(0);

        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = sc.nextBoolean();

        // Print all values
        System.out.println("\n--- You Entered ---");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}
```

## 8. Write a java program to enter radius of a circle and find its diameter,area and circumference. Formula :- diameter=2 * radius;circumference = 2 * 3.14 * radius; area = 3.14 * radius * radius;

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class Calcu
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the radius: ");
        float radius = sc.nextFloat();

        float area =(float) 3.14 * radius * radius;
        System.out.println("The Area is "+area);

        float diameter =(float) 2.0*radius;
        System.out.println("The Diameter is "+diameter);

        float circumference =(float) (2.0 * 3.14 * radius);
        System.out.println("The Circumference is "+circumference);

    }
}
```

## 9. Write a java program to enter temperature in Fahrenheit and convert to Celsius. Formula :- cel = (fah - 32) * 5 / 9;

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class Celsius
{
 public static void main(String x[])
 {
    Scanner sc = new Scanner(System.in);
	
    System.out.println("enter the temperature in fahrenheit: ");
	double fah = sc.nextDouble();
	
	double cel =(fah-32) * 5/9;
	
	System.out.println("In Celsius: "+cel);
	
	
 }
}
```

## 10. Write a java program to input any character and check whether it is alphabet, digit or special character.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class CheckADS
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input: ");
        char input = sc.next().charAt(0);

        if(input>='a' && input<='z')
        {
            System.out.println("Alphabet");
        }
        else if(input>='0' && input<='9')
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Character");
        }

    }

}
```

## 11. Write a java program to input any alphabet and check whether it is vowel or consonant.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class CheckChar
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character: ");
        char c = sc.next().charAt(0);

        if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' || c=='A' || c=='E' ||c=='I' ||c=='O' ||c=='U')
        {
            System.out.println("It is a vowel");
        }
        else
        {
            System.out.println("It is a consonant");
        }
    }
}
```

## 12. Write a java program to accept two integers and check whether they are equal or not.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class CheckEqual
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("enter the second number: ");
        int num2 = sc.nextInt();
        if(num1 == num2)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}
```

## 13. Write a Java program to check whether a number is a multiple of both 3 and 5 using logical AND (&&) operator. Input: 15 Output: Multiple of both 3 and 5

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class CheckMulOperator
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");

        double num = sc.nextDouble();

        if((num%3 == 0) && (num%5 == 0))
        {
            System.out.println("Multiple of both 3 and 5");
        }
        else
        {
            System.out.println("Not Multiple of both 3 and 5");
        }
    }
}
```

## 14. Write a java program to calculate the compound intrest.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
import java.lang.*;
public class CompoundInterest
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the principal: ");
        double principal = sc.nextDouble();

        System.out.println("enter the rate: ");
        double rate = sc.nextDouble();

        System.out.println("enter the timePeriod in years: ");
        double time = sc.nextDouble();

        System.out.println("enter no of times interest per years: ");
        double timeInt = sc.nextDouble();

        double finalAmount = principal * Math.pow((1+ (rate/100.0)/timeInt),(timeInt*time));

        double compoundInterest = finalAmount - principal;

        System.out.println("The total interest is: "+compoundInterest);
        System.out.println("Total Amount after Interest is "+finalAmount);

    }
}
```

## 15. Write a java program to enter length in centimeter and convert into meter and kilometer

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class Convert
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length in centimeter: ");
        float cm = sc.nextFloat();

        float meter = cm/100;
        float km = cm/100000;

        System.out.println("In meter: "+meter);
        System.out.println("In Kilometer: "+km);
    }
}
```

## 16. Write a Java program that reads a number and display the cube.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class Cube
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        num = num*num*num;
        System.out.println("The Cube of Number is: "+num);
    }
}
```

## 17. Take two integers m and n. Use the ternary operator to print whether the absolute difference between them is greater than 10 or not. Example Input: m = 25, n = 12

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class DiffGreater
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number: ");
        int m = sc.nextInt();

        System.out.println("enter the second number: ");
        int n = sc.nextInt();

        String dif =(m-n>=10)?"Greater than 10":"Not Greater than 10";
        System.out.println(dif);
    }
}
```

## 18. Write a java program to display message "This is first java program".

[Back to top](#java-operator-and-assignment-programs)


```java
public class Display
{
    public static void main(String x[])
    {
        System.out.println("This is first java Program.");
    }
}
```

## 19. Write a Java program to check whether a number is divisible by 5 and 11 or not.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class Division
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number: ");
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println("The Number is divisible by 5 & 11");
        }
        else
        {
            System.out.println("The Number is not divisibleble by 5 & 11");
        }
    }
}
```

## 20. Write a Java program to check whether a number is even or odd.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class EOAPP
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number :");
        int num = sc.nextInt();
        if(num%2 == 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}
```

## 21. Write a java program to calculate area of an equilateral triangle.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
import java.lang.Math;
public class Equilateral
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the side of triangle: ");
        double side = sc.nextDouble();

        double area = (double)(Math.sqrt(3)/ (4) * Math.pow(side, 2));
        System.out.println("The area of Equilateral Trianle is: "+area);
    }
}
```

## 22. Write a program to calculate sum of first and last digit of a number without using loop. Input : 123 Output : 4

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class FLNumSum
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int no = sc.nextInt();

        int rem1 = no/100;
        int rem2 = no%10;
        System.out.println("First & Last Digit Number is:"+(rem1+rem2));

    }
}
```

## 23. Write a program to find first and last digit of a number without using loop in three digit.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class FLNumber
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int no = sc.nextInt();

        int rem1 = no/100;
        int rem2 = no%10;
        System.out.println("First & Last Digit Number is:"+rem1+ "," +rem2);

    }
}
```

## 24. Write a program to find first and last digit of a number without using loop in three digit.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class FLNumber
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int no = sc.nextInt();

        int rem1 = no/100;
        int rem2 = no%10;
        System.out.println("First & Last Digit Number is:"+rem1+ "," +rem2);

    }
}
```

## 25. Take a three-digit number and print the larger digit among first and last digit using ternary operator.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class FirstLastDigit
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three digit number: ");
        int number = sc.nextInt();

        int lastDigit = number%10;
        int firstDigit = number/100;

        int msg = (firstDigit > lastDigit) ? firstDigit : lastDigit;
        System.out.println("Largest Number is: "+msg);

    }
}
```

## 26. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class Grade
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the score out of 100: ");
        int score = sc.nextInt();

        String msg = (score>=90)?"Excellent":(score>=75)?"Good":(score>=50)?"Average":"Poor";
        System.out.println(msg);

    }
}
```

## 27. Write a java program to input basic salary of an employee and calculate its Gross salary according to following. Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class GrossSalary
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the basic salary: ");
        double salary = sc.nextDouble();

        double hra = (salary<=10000)?(0.20*salary):(salary<=20000)?(0.25*salary):(0.30*salary);
        double da = (salary<=10000)?(0.80*salary):(salary<=20000)?(0.90*salary):(0.95*salary);

        double grossSalary = salary + hra + da;

        System.out.println("Basic Salary: "+salary);
        System.out.println("hra: "+hra);
        System.out.println("da: "+da);
        System.out.println("Gross Salary: "+grossSalary);

    }
}
```

## 28. Write a Java program to check whether a year is leap year or not.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if(year < 1)
        {
            System.out.println("Invalid Year");
        }
        else if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println("This is a Leap Year");
        }
        else
        {
            System.out.println("This is not a Leap Year");
        }
    }
}
```

## 29. Write a java program to enter marks of five subjects and calculate total marks and percentage.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class Marks
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the marks of following subject:");
        System.out.println("PHYSICS: ");
        int phy = sc.nextInt();
        System.out.println("CHEMISTRY: ");
        int chem = sc.nextInt();
        System.out.println("MATHS: ");
        int math = sc.nextInt();
        System.out.println("BIOLOGY: ");
        int bio = sc.nextInt();
        System.out.println("ENGLISH: ");
        int eng = sc.nextInt();

        int totalMarks = phy+chem+math+bio+eng;
        float percentage = (totalMarks*100)/500;

        System.out.println("The Total Marks is: "+totalMarks);
        System.out.println("Toatal Percentage is: "+percentage);

    }
}
```

## 30. Write a java program to find maximum between three numbers.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;

public class MaxThreeNum
{
    public static void main(String x[])
    {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        n1 = sc.nextInt();
        System.out.println("enter the second number: ");
        n2 = sc.nextInt();
        System.out.println("enter the third number: ");
        n3 = sc.nextInt();

        if(n1>n2 && n1>n3)
        {
            System.out.println("The maxumum number is: "+n1);
        }
        else if(n2>n3 && n2>n1)
        {
            System.out.println("The maxumum number is: "+n2);
        }
        else
        {
            System.out.println("The maxumum number is: "+n3);
        }
    }
}
```

## 31. Write a java program to find the maximum between two numbers.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class MaxTwoNum
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.println("enter the number 2: ");
        int num2 = sc.nextInt();

        if(num1>num2)
        {
            System.out.println("The maximum number is: "+num1);
        }
        else
        {
            System.out.println("The maximum number is: "+num2);
        }
    }
}
```

## 32. Take a three-digit number and print whether the middle digit is greater than the sum of the first and last digits using the ternary operator. Example: Input: num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater Input: num = 853 → Middle digit 5 vs (8+3)=11 → Not Greater

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class MiddleDigitGreater
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first digit number: ");
        int num = sc.nextInt();

        int firstDigit = num/100;
        int midDigit = (num/10)%10;
        int lastDigit = num%10;

        String msg =(midDigit > (firstDigit+lastDigit))?"Greater":(midDigit == (firstDigit+lastDigit))?"Equal":"Not Greater";
        System.out.println(msg);

    }
}
```

## 33. Problem: Write a Java program using the conditional (ternary) operator to find the middle value among three distinct integers p, q, and r. Example Input: p = 10, q = 20, r = 15

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class MiddleValue
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the p: ");
        int p = sc.nextInt();//9

        System.out.println("enter the q: ");
        int q = sc.nextInt();//5

        System.out.println("enter the r: ");
        int r = sc.nextInt();//8

        int middle = ((p>q)&&(p<r))?p:((q>p)&&(q<r))?q:r;

        System.out.println("Middle Value: "+middle);

    }
}
```

## 34. Write a java program to find the minimum between two numbers.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class MinNum
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.println("enter the number 2: ");
        int num2 = sc.nextInt();

        if(num1<num2)
        {
            System.out.println("The minimnum number is: "+num1);
        }
        else
        {
            System.out.println("The minimnum number is: "+num2);
        }
    }
}
```

## 35. Write a java program to find a minimum between three numbers.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class MinThreeNum
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.println("enter the number 2: ");
        int num2 = sc.nextInt();
        System.out.println("enter the number 3: ");
        int num3 = sc.nextInt();

        if(num1<num2 && num1<num3)
        {
            System.out.println("The minimnum number is: "+num1);
        }
        else if(num2<num1 && num2<num3)
        {
            System.out.println("The minimnum number is: "+num2);
        }
        else
        {
            System.out.println("The minimnum number is: "+num3);
        }

    }
}
```

## 36. Write a java program to check whether number is neon or not. Input : 9 Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class Neon
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        int sq = num * num;
        int neon = (sq%10) + sq / 10;

        String res = (neon == num )? "Neon" : "Non-Neon";
        System.out.println(res);
    }
}
```

## 37. Write a Java expression using arithmetic and assignment operators to calculate net salary if: basicSalary = 35000 taxRate = 12% Find netSalary.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class NetSalaryAAO
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the basic salary: ");
        int basic = sc.nextInt();

        System.out.println("enter the basic tax rate: ");
        int tax = sc.nextInt();

        int grossSalary = basic*tax/100;
        int netSalary = basic - grossSalary;
        System.out.println("Net Salary after tax deduction: "+netSalary);
    }
}
```

## 38. Write a Java program to check whether a number is positive , negative or zero.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class PNZ
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number: ");
        int num = sc.nextInt();

        if(num > 0)
        {
            System.out.println("Positive");
        }
        else if(num < 0)
        {
            System.out.println("Negative");
        }
        else if( num == 0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Invalid Choice! Please enter the number");
        }

    }
}
```

## 39. Write a java program to check whether number is palindrome or not.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class Palindrome
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        int pal = num%10*100 + ((num/10)%10)*10 + num / 100;
        String res = (pal == num )? "Palindrome" : "Not - Palindrome";
        System.out.println(res);

    }
}
```

## 40. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class PassFail
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the score: ");
        int score = sc.nextInt();

        if(score>=40)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
```

## 41. Take percentage and income of a student: If percentage >= 75 AND income < 200000, print "Eligible" Else "Not Eligible"

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class PercentIncome
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the percentage: ");
        int percent = sc.nextInt();

        System.out.println("enter the income: ");
        int income = sc.nextInt();

        if(percent>=75 && income<200000)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }
}
```

## 42. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class PerfectNumber
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        int sqr = (int)Math.sqrt(num);
        String msg =(sqr*sqr==num)?"Perfect Square":"Not Perfect Square";
        System.out.println(msg);
    }
}
```

## 43. Write a Java program to input cost price and selling price of a product and check profit or loss.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class ProfitLoss
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price: ");
        int cost = sc.nextInt();

        System.out.println("enter the selling price: ");
        int sell = sc.nextInt();

        if(cost > sell)
        {
            System.out.println("Loss");
        }
        else
        {
            System.out.println("Profit");
        }

    }
}
```

## 44. Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators. Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class QR
{
    public static void main(String x[])
    {
        int dividend,divisor,quotient,remainder;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dividend: ");
        dividend = sc.nextInt();

        System.out.println("enter the divisor: ");
        divisor = sc.nextInt();

        quotient = dividend/divisor;
        remainder = dividend%divisor;

        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder: "+remainder);

    }
}
```

## 45. Question: If performance rating > 8, give 15% bonus; else if rating > 5, give 10% bonus; otherwise, no bonus. Use relational operators to implement logic.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class Rating
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the performance rating out of 10: ");
        int rating = sc.nextInt();

        if(rating>8)
        {
            System.out.println("15% bonus");
        }
        else if(rating>5)
        {
            System.out.println("8% bonus");
        }
        else
        {
            System.out.println("no bonus");
        }
    }
}
```

## 46. Write a Java program to reverse a number without using loop. Input a number: 123 Reverse number: 321

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class Reverse
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = sc.nextInt();
        System.out.println("Before Reverse Number is: "+no);
        no = (no%10)*100 + ((no/10)%10)*10 + no/100;
        System.out.println("After Reverse Number is: "+no);
    }
}
```

## 47. Write a Java program to convert seconds to hours, minutes and seconds

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class SHM
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the seconds: ");
        int sec = sc.nextInt();

        int hour =  sec/3600;
        sec = sec - hour*3600;
        int min = sec/60;
        sec = sec - min*60;

        System.out.println("In Hours: "+hour);
        System.out.println("In Minutes: "+min);
        System.out.println("In Seconds: "+sec);

    }
}
```

## 48. Write a Java program to calculate the net salary of an employee. Input: basic salary, HRA %, DA %, and tax %.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class SalaryEmp
{
    public static void main(String x[])
    {
        int salary,hra,da,tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the basic salary: ");
        salary = sc.nextInt();

        System.out.println("enter the hra: ");
        hra = sc.nextInt();

        System.out.println("enter the da: ");
        da = sc.nextInt();

        System.out.println("enter the tax: ");
        tax = sc.nextInt();

        int grossSalary = salary + salary*hra/100 + salary*da/100;
        int netSalary = grossSalary - grossSalary*tax/100;

        System.out.println("Total NetSalary: "+netSalary);

    }
}
```

## 49. Write a java program to calculate the simple intrest.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the principal: ");
        int principal = sc.nextInt();

        System.out.println("enter the rate: ");
        int rate = sc.nextInt();

        System.out.println("enter the timePeriod in years: ");
        int time = sc.nextInt();

        int simpleInterest = (principal*rate*time)/100;
        System.out.println("The total interest is "+simpleInterest);

        int totalAmt = simpleInterest + principal;
        System.out.println("Total Amount after Interest is "+totalAmt);

    }
}
```

## 50. Write a java program to Check Number Is Spy Number or Not. Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits. Input : 1412 Output : Spy Number

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class SpyNumber
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        int sum = (num/1000) + ((num/100)%10) + ((num/10)%10) + (num%10);
        int product = (num/1000) * ((num/100)%10) * ((num/10)%10) * (num%10);
        /*
        if(sum == product)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
        */
        String msg = (sum == product)? "Spy Number":"Not Spy Number";
        System.out.println(msg);

    }
}
```

## 51. Write a Java program and compute the sum of an integer's digits. Input : 123 Output : 6

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class SumInt
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        int sum = (num/1000) + ((num/100)%10) + ((num/10)%10) + (num%10);
        System.out.println("The sum of integer: "+sum);

    }
}
```

## 52. Write a java program swap two number using third variable.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class Swap
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first variable: ");
        int a = sc.nextInt();

        System.out.println("enter the second variable: ");
        int b = sc.nextInt();

        int temp = b;
        b = a;
        a = temp;

        System.out.println("After the swap: " +a+ "," +b);

    }
}
```

## 53. Write a java program swap two number without using third variable.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class SwapWt
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first variable: ");
        int a = sc.nextInt();

        System.out.println("enter the second variable: ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After the swap: " +a+ "," +b);

    }
}
```

## 54. Write a Java program to check whether a triangle is valid or not.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class Triangle
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the side a: ");
        double a = sc.nextDouble();

        System.out.println("enter the side b: ");
        double b = sc.nextDouble();

        System.out.println("enter the side c: ");
        double c = sc.nextDouble();

        if ( a + b > c && b + c > a && a + c > b)
        {
            System.out.println("Triangle is valid");
        }
        else
        {
            System.out.println("Triangle is not valid");
        }

    }
}
```

## 55. Write a Java program to check whether a triangle is equilateral , isoscale or scalene.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class TriangleEIS
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the side a: ");
        double a = sc.nextDouble();

        System.out.println("enter the side b: ");
        double b = sc.nextDouble();

        System.out.println("enter the side c: ");
        double c = sc.nextDouble();

        if(a==b && b==c)
        {
            System.out.println("equilateral");
        }
        else if(a==b || b==c || c==a)
        {
            System.out.println("isoscale");
        }
        else
        {
            System.out.println("scalene");
        }
    }
}
```

## 56. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.*;
public class Vote
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age: ");
        int age = sc.nextInt();

        if(age >=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }
    }
}
```

## 57. Write a Java program to convert days to years, month and week.

[Back to top](#java-operator-and-assignment-programs)


```java
import java.util.Scanner;
public class YMW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
    }
}
```
