# Decision Making in Java

This document contains Java programs that use decision-making statements such as `if`, `if-else`, and `switch`.

## Table of Contents

- [Q1. Write a Java program to check whether a number is even or odd.](#q1-write-a-java-program-to-check-whether-a-number-is-even-or-odd)
- [Q10. Write a java program to input any character and check whether it is alphabet, digit or special character.](#q10-write-a-java-program-to-input-any-character-and-check-whether-it-is-alphabet-digit-or-special-character)
- [Q11. Write a java program to find a maximum between three numbers.](#q11-write-a-java-program-to-find-a-maximum-between-three-numbers)
- [Q12. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.](#q12-write-a-java-program-to-read-the-age-of-a-candidate-and-determine-whether-he-is-eligible-to-cast-hisher-own-vote)
- [Q13. Write a java program to accept two integers and check whether they are equal or not.](#q13-write-a-java-program-to-accept-two-integers-and-check-whether-they-are-equal-or-not)
- [Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.](#q14-write-a-java-program-to-input-the-basic-salary-of-an-employee-and-calculate-its-gross-salary-according-to-the-following)
- [Q15. Write a java program to find the minimum between two numbers.](#q15-write-a-java-program-to-find-the-minimum-between-two-numbers)
- [Q16. Write a java program to find a minimum between three numbers.](#q16-write-a-java-program-to-find-a-minimum-between-three-numbers)
- [Q17. Write a java program to find the maximum between two numbers.](#q17-write-a-java-program-to-find-the-maximum-between-two-numbers)
- [Q18. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.](#q18-given-a-students-score-print-pass-if-its-40-or-above-otherwise-print-fail)
- [Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.](#q19-given-a-score-out-of-100-print-excellent-90-good-75-average-50-poor-50-using-nested-ternary-operators)
- [Q2. Write a Java program to check whether a triangle is valid or not.](#q2-write-a-java-program-to-check-whether-a-triangle-is-valid-or-not)
- [Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.](#q19-given-a-score-out-of-100-print-excellent-90-good-75-average-50-poor-50-using-nested-ternary-operators)
- [Q21. Write a java program to check whether a number is neon or not.](#q21-write-a-java-program-to-check-whether-a-number-is-neon-or-not)
- [Q22. Write a java program to check whether a number is palindrome or not.](#q22-write-a-java-program-to-check-whether-a-number-is-palindrome-or-not)
- [Q23. Write a java program to Check Number Is Spy Number or Not.](#q23-write-a-java-program-to-check-number-is-spy-number-or-not)
- [Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.](#q24-write-a-java-program-to-check-whether-a-character-is-uppercase-or-lowercase-alphabet)
- [Q25.Write a java program to find the total number of notes in a given amount.](#q25write-a-java-program-to-find-the-total-number-of-notes-in-a-given-amount)
- [Q26.Write a java program to accept the height of a person in centimeters and categorize the person according to their height.](#q26write-a-java-program-to-accept-the-height-of-a-person-in-centimeters-and-categorize-the-person-according-to-their-height)
- [Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,](#q27-write-a-java-program-to-input-marks-of-five-subjects-physics-chemistry-biology)
- [Q28. Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in java programming.](#q28-write-a-java-program-to-find-all-roots-of-a-quadratic-equation-using-if-else-how-to-find-all-roots-of-a-quadratic-equation-using-if-else-in-java-programming)
- [Q29. Write a Java program to calculate total electricity bill according to given conditions](#q29-write-a-java-program-to-calculate-total-electricity-bill-according-to-given-conditions)
- [Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.](#q3-write-a-java-program-to-check-whether-a-triangle-is-equilateral-isoscale-or-scalene)
- [Q30. Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java programming.](#q30-write-a-java-program-to-enter-month-number-between1-12-and-print-number-of-days-in-month-using-if-else-how-to-print-the-number-of-days-in-a-given-month-using-if-else-in-java-programming)
- [Q31. Write a java program to input week number(1-7) and print the corresponding day of week name using if else. How to print day of week using if else in java programming.](#q31-write-a-java-program-to-input-week-number1-7-and-print-the-corresponding-day-of-week-name-using-if-else-how-to-print-day-of-week-using-if-else-in-java-programming)
- [Q32. An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:](#q32-an-automobile-company-manufactures-both-a-two-wheeler-tw-and-a-four-wheeler-fw-a-company-manager-wants-to-make-the-production-of-both-types-of-vehicle-according-to-the-given-data-below)
- [Q33. There are a total n number of monkeys sitting on the branches of a huge tree. As travelers offer bananas and peanuts, the monkeys jump down the tree. If every Monkey can eat k Bananas and j Peanuts. If the total m number of Bananas and p number of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree after some of them jumped down to eat.](#q33-there-are-a-total-n-number-of-monkeys-sitting-on-the-branches-of-a-huge-tree-as-travelers-offer-bananas-and-peanuts-the-monkeys-jump-down-the-tree-if-every-monkey-can-eat-k-bananas-and-j-peanuts-if-the-total-m-number-of-bananas-and-p-number-of-peanuts-are-offered-by-travelers-calculate-how-many-monkeys-remain-on-the-tree-after-some-of-them-jumped-down-to-eat)
- [Q34. Check whether a given employee is eligible for bonus:](#q34-check-whether-a-given-employee-is-eligible-for-bonus)
- [Q35. Check if a person is a child, teenager, adult, or senior based on age.](#q35-check-if-a-person-is-a-child-teenager-adult-or-senior-based-on-age)
- [Q36. Compare two numbers: greater, smaller, or equal.](#q36-compare-two-numbers-greater-smaller-or-equal)
- [Q37. Check whether the month number is valid and display season.](#q37-check-whether-the-month-number-is-valid-and-display-season)
- [Q38. Check whether a student is eligible for scholarship:](#q38-check-whether-a-student-is-eligible-for-scholarship)
- [Q39. Calculate commission based on sales amount:](#q39-calculate-commission-based-on-sales-amount)
- [Q4. Write a Java program to check whether a number is positive , negative or zero.](#q4-write-a-java-program-to-check-whether-a-number-is-positive-negative-or-zero)
- [Q40. Classify temperature reading:](#q40-classify-temperature-reading)
- [Q41. Employee salary hike based on performance and years of service:](#q41-employee-salary-hike-based-on-performance-and-years-of-service)
- [Q42. Mobile plan billing system:](#q42-mobile-plan-billing-system)
- [Q43. Calculate fine for library book return:](#q43-calculate-fine-for-library-book-return)
- [Q5. Write a Java program to check whether a number is divisible by 5 and 11 or not.](#q5-write-a-java-program-to-check-whether-a-number-is-divisible-by-5-and-11-or-not)
- [Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month. Consider leap year for February.](#q51-write-a-java-program-using-a-switch-case-to-input-a-month-number-1-12-and-display-the-number-of-days-in-that-month-consider-leap-year-for-february)
- [Q52: Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.](#q52-create-a-java-program-to-simulate-a-simple-calculator-using-a-switch-case-it-should-take-two-numbers-and-an-operator-as-input-and-perform-the-corresponding-operation)
- [Q53. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:](#q53-write-a-program-that-takes-a-grade-a-b-c-d-f-as-input-and-displays-the-corresponding-remark-using-switch)
- [Q54. Develop a Java program using switch to print the day type for an input day number (1-7):](#q54-develop-a-java-program-using-switch-to-print-the-day-type-for-an-input-day-number-1-7)
- [Q55. Write a program to input a character and check whether it is a vowel or consonant using a switch case.](#q55-write-a-program-to-input-a-character-and-check-whether-it-is-a-vowel-or-consonant-using-a-switch-case)
- [Q56. Create a Java program using switch to convert a given number (1-5) to its word equivalent (One, Two, ..., Five). If the number is not between 1 and 5, display “Invalid number”.](#q56-create-a-java-program-using-switch-to-convert-a-given-number-1-5-to-its-word-equivalent-one-two-five-if-the-number-is-not-between-1-and-5-display-invalid-number)
- [Q57. Write a program to input an employee level (1-3) and display the salary range:](#q57-write-a-program-to-input-an-employee-level-1-3-and-display-the-salary-range)
- [Q58. Develop a program to simulate a basic banking menu:](#q58-develop-a-program-to-simulate-a-basic-banking-menu)
- [Q59. Write a program using switch that takes a number (1-4) and displays a season:](#q59-write-a-program-using-switch-that-takes-a-number-1-4-and-displays-a-season)
- [Q6. Write a Java program to check whether a character is alphabetic or not.](#q6-write-a-java-program-to-check-whether-a-character-is-alphabetic-or-not)
- [Q60. Create a Java program to simulate a basic food ordering system using switch:](#q60-create-a-java-program-to-simulate-a-basic-food-ordering-system-using-switch)
- [Q61. Write a menu-driven program in java using switch case.](#q61-write-a-menu-driven-program-in-java-using-switch-case)
- [Q62. Write a menu-driven program in java using switch case.](#q62-write-a-menu-driven-program-in-java-using-switch-case)
- [Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.](#q7-write-a-java-program-to-input-cost-price-and-selling-price-of-a-product-and-check-profit-or-loss)
- [Q8. Write a Java program to check whether a year is a leap year or not.](#q8-write-a-java-program-to-check-whether-a-year-is-a-leap-year-or-not)
- [Q9. Write a java program to input any alphabet and check whether it is vowel or consonant.](#q9-write-a-java-program-to-input-any-alphabet-and-check-whether-it-is-vowel-or-consonant)

## Q1. Write a Java program to check whether a number is even or odd.

```java
import java.util.*;
public class Example1
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number :");
        int num = sc.nextInt();
        if(num %2 == 0)
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

## Q10. Write a java program to input any character and check whether it is alphabet, digit or special character.

```java
import java.util.*;
public class Example10
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
        else if(input>=0 || input<=0)
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

## Q11. Write a java program to find a maximum between three numbers.

```java
import java.util.*;

public class Example11
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

## Q12. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.

```java
import java.util.*;
public class Example12
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

## Q13. Write a java program to accept two integers and check whether they are equal or not.

```java
import java.util.*;
public class Example13
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

## Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.

> Basic Salary <= 10000 : HRA = 20%, DA = 80%
> Basic Salary <= 20000 : HRA = 25%, DA = 90%
> Basic Salary > 20000 : HRA = 30%, DA = 95%

```java
import java.util.*;
public class Example14
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

## Q15. Write a java program to find the minimum between two numbers.

```java
import java.util.*;
public class Example15
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

## Q16. Write a java program to find a minimum between three numbers.

```java
import java.util.*;
public class Example16
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

## Q17. Write a java program to find the maximum between two numbers.

```java
import java.util.*;
public class Example17
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

## Q18. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.

```java
import java.util.*;
public class Example18
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

## Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.

```java
import java.util.*;
public class Example19
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the score out of 100: ");
        int score = sc.nextInt();

        if(score>=90)
        {
            System.out.println("Excellent");
        }
        else if(score>=75)
        {
            System.out.println("Good");
        }
        else if(score>=50)
        {
            System.out.println("Average");
        }
        else
        {
            System.out.println("Poor");
        }

    }
}
```

## Q2. Write a Java program to check whether a triangle is valid or not.

```java
import java.util.*;
public class Example2
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

## Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.

```java
import java.util.*;
public class Example20
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        int sqr = (int)Math.sqrt(num);

        if(sqr*sqr==num)
        {
            System.out.println("Perfect Square");
        }
        else
        {
            System.out.println("Not Perfect Square");
        }

    }

}
```

## Q21. Write a java program to check whether a number is neon or not.

> Input : 9
> Output : Neon Number
> Explanation: square is 9*9 = 81 and
> The sum of the digits of the square is 9.

```java
import java.util.Scanner;
public class Example21
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        int sq = num * num;
        int neon = (sq%10) + sq / 10;

        if(neon == num)
        {
            System.out.println("Neon");
        }
        else
        {
            System.out.println("Non-Neon");
        }

    }
}
```

## Q22. Write a java program to check whether a number is palindrome or not.

```java
import java.util.Scanner;
public class Example22
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        int pal = num%10*100 + ((num/10)%10)*10 + num / 100;

        if(pal == num)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not-Palindrome");
        }

    }
}
```

## Q23. Write a java program to Check Number Is Spy Number or Not.

```java
import java.util.*;
public class Example23
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        int sum = (num/1000) + ((num/100)%10) + ((num/10)%10) + (num%10);
        int product = (num/1000) * ((num/100)%10) * ((num/10)%10) * (num%10);

        if(sum == product)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }

    }
}
```

## Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.

```java
import java.util.*;
public class Example24
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character: ");
        char c = sc.next().charAt(0);

        if(c>='a' && c<='z')
        {
            System.out.println("Character is Lowecase");
        }
        else if(c>='A' && c<='Z')
        {
            System.out.println("Character is Uppercase");
        }
        else
        {
            System.out.println("Invalid Character");
        }

    }
}
```

## Q25.Write a java program to find the total number of notes in a given amount.

> Enter the amount: 2528
> Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1

```java
import java.util.*;
public class Example25
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount: ");
        int amt = sc.nextInt();

        int fiveHund = amt/500;
        amt = amt%500;

        int hund = amt/100;
        amt = amt%100;

        int fifty = amt/50;
        amt = amt%50;

        int twenty = amt/20;
        amt = amt%20;

        int ten = amt/10;
        amt = amt%10;

        int five = amt/5;
        amt = amt%5;

        int two = amt/2;
        amt = amt%2;

        int one = amt/1;
        amt = amt%1;

        System.out.println("500:"+fiveHund);
        System.out.println("100:"+hund);
        System.out.println("50:"+fifty);
        System.out.println("20:"+twenty);
        System.out.println("10:"+ten);
        System.out.println("5:"+five);
        System.out.println("2:"+two);
        System.out.println("1:"+one);

    }
}
```

## Q26.Write a java program to accept the height of a person in centimeters and categorize the person according to their height.

> PerHeight < 150.0  : The person is Dwarf.
> PerHeight >= 150.0 && PerHeight < 165.0  :   The person is  average heighted.
> PerHeight >= 165.0 && PerHeight <= 195.0 :  The person is taller.
> Test Data : 135
> Expected Output : The person is Dwarf.

```java
import java.util.*;
public class Example26
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height of a person in centimeters: ");
        float height = sc.nextFloat();

        if(height<150)
        {
            System.out.println("The person is Dwarf.");
        }
        else if(height>=150.0 && height<165.0)
        {
            System.out.println("The person is  average heighted.");
        }
        else if(height>=165.0 && height<195.0)
        {
            System.out.println("The person is taller.");
        }
        else
        {
            System.out.println("Invalid.");
        }

    }
}
```

## Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,

> Mathematics and Computer, calculate percentage and grade according to given conditions:
> percentage >= 90% : Grade A
> percentage >= 80% : Grade B
> percentage >= 70% : Grade C
> percentage >= 60% : Grade D
> percentage >= 40% : Grade E
> percentage < 40% : Grade F

```java
import java.util.*;
public class Example27
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
        System.out.println("COMPUTER: ");
        int eng = sc.nextInt();

        int totalMarks = phy+chem+math+bio+eng;
        float percentage = (totalMarks*100)/500;

        System.out.println("Total Percentage: "+percentage);

        if(percentage >= 90)
        {
            System.out.println("Grade A");
        }
        else if(percentage >= 80)
        {
            System.out.println("Grade B");
        }
        else if(percentage >= 70)
        {
            System.out.println("Grade C");
        }
        else if(percentage >= 60)
        {
            System.out.println("Grade D");
        }
        else if(percentage >= 40)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Grade F");
        }

    }
}
```

## Q28. Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in java programming.

> Example
> Input a: 8 ,  b: -4 , c: -2
> Output Root1: 0.80
> Root2: -0.30

```java
import java.util.*;
public class Example28
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        double a = sc.nextDouble();

        System.out.println("enter second number: ");
        double b = sc.nextDouble();

        System.out.println("enter third number: ");
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Root1: %.2f\nRoot2: %.2f\n", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root1 = Root2: %.2f\n", root);
        } else {
            System.out.println("No Real Roots (Complex roots exist)");
        }

    }
}
```

## Q29. Write a Java program to calculate total electricity bill according to given conditions

```java
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total units consumed: ");
        double unit = sc.nextDouble();
        double bill = 0, surcharge = 0, total;

        if (unit > 250) {
            bill += (unit - 250) * 1.50;
            unit = 250;
        }
        if (unit > 150) {
            bill += (unit - 150) * 1.20;
            unit = 150;
        }
        if (unit > 50) {
            bill += (unit - 50) * 0.75;
            unit = 50;
        }
        if (unit <= 50) {
            bill += unit * 0.50;
        }

        surcharge = bill * 0.20;
        total = bill + surcharge;

        System.out.println("Bill before surcharge: Rs. " + bill);
        System.out.println("Additional surcharge (20%): Rs. " + surcharge);
        System.out.println("Total Bill to Pay: Rs. " + total);
    }
}
```

## Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.

```java
import java.util.*;
public class Example3
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

## Q30. Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java programming.

```java
import java.util.*;
public class Example30
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: ");
        int month = sc.nextInt();

        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10|| month==12)
        {
            System.out.println("31 days");
        }
        else if(month==2)
        {
            System.out.println("28/29 days");
        }
        else
        {
            System.out.println("30 days");
        }
    }
}
```

## Q31. Write a java program to input week number(1-7) and print the corresponding day of week name using if else. How to print day of week using if else in java programming.

```java
import java.util.*;
public class Example31
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number(1-7): ");
        int day = sc.nextInt();

        if(day==1)
        {
            System.out.println("Monday");
        }
        else if(day==2)
        {
            System.out.println("Tuesday");
        }
        else if(day==3)
        {
            System.out.println("Wednsday");
        }
        else if(day==4)
        {
            System.out.println("Thursday");
        }
        else if(day==5)
        {
            System.out.println("Friday");
        }
        else if(day==6)
        {
            System.out.println("Saturday");
        }
        else if(day==7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid Input");
        }

    }

}
```

## Q32. An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

> • 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
> • 2nd data, Total number of wheels = W
> The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
> Example :
> Input : • 200 -> Value of V
> • 540 -> Value of W
> Output : • TW =130   FW=70
> Explanation: 130+70 = 200 vehicles (70*4)+(130*2)= 540 wheels

```java
import java.util.*;
public class Example32
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        int t,f,v,w;
        System.out.println("enter total number of vehicles: ");
        v = sc.nextInt();

        System.out.println("enter total number of wheels: ");
        w = sc.nextInt();

        f = (w/2)-v;
        t = v-f;

        System.out.println("TV: "+t);
        System.out.println("TW: "+f);

    }
}
```

## Q33. There are a total n number of monkeys sitting on the branches of a huge tree. As travelers offer bananas and peanuts, the monkeys jump down the tree. If every Monkey can eat k Bananas and j Peanuts. If the total m number of Bananas and p number of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree after some of them jumped down to eat.

> At a time one Monkey gets down and finishes eating and goes to the other side of the road. The Monkey who climbed down does not climb up again after eating until the other Monkeys finish eating.
> Monkeys can either eat k Bananas or j Peanuts. If for the last monkey there are less than k Bananas left on the ground or less than j Peanuts left on the ground, only that Monkey can eat Bananas(<j).
> Write code to take inputs as n, m, p, k, j and return the number of Monkeys left on the Tree.
> Where,
> n= Total no of Monkeys
> k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
> j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
> m = Total number of Bananas
> p = Total number of Peanuts
> Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero.
> Example : Input Values 20  2  3  12  12
> Output Values Number of Monkeys left on the tree : 10

```java
import java.util.*;
public class Example33
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total no of Monkeys: ");
        int n = sc.nextInt();

        System.out.println("Number of eatable Bananas by Single Monkey: ");
        int k = sc.nextInt();

        System.out.println("Number of eatable Peanuts by single Monkey: ");
        int j = sc.nextInt();

        System.out.println("Total number of Bananas: ");
        int m = sc.nextInt();

        System.out.println("Total number of Peanuts: ");
        int p = sc.nextInt();

        int mb = m/k;
        if(m%k !=0)
        {
            mb++;
        }

        int mp = p/j;

        if(p%j !=0)
        {
            mp++;
        }

        int total =  n - mb - mp;
        System.out.println("Number of Monkeys left on the tree: "+total);

    }
}
```

## Q34. Check whether a given employee is eligible for bonus:

> Input: Years of service and salary.
> Logic: If service > 5 years, give 5% bonus.
> Output: Display bonus amount or no bonus.

```java
import java.util.*;
public class Example34
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter years of service: ");
        int service = sc.nextInt();

        if(service>5)
        {
            System.out.println("enter the salary: ");
            int salary = sc.nextInt();
            int bonus = salary*5/100;
            System.out.println("Bonus Amount: "+bonus);
        }
        else
        {
            System.out.println("No Bonus");
        }
    }
}
```

## Q35. Check if a person is a child, teenager, adult, or senior based on age.

> Input: Age
> Logic: if-else if
> Output: Age category.

```java
import java.util.*;
public class Example35
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age: ");
        int age = sc.nextInt();

        if(age<7)
        {
            System.out.println("child");
        }
        else if(age<18)
        {
            System.out.println("teenager");
        }
        else if(age>=18 && age<60)
        {
            System.out.println("adult");
        }
        else
        {
            System.out.println("senior");
        }

    }
}
```

## Q36. Compare two numbers: greater, smaller, or equal.

> Input: Two integers
> Logic: if-else if
> Output: Greater, smaller, or equal.

```java
import java.util.*;
public class Example36
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1: ");
        int n1 = sc.nextInt();
        System.out.println("enter the number 2: ");
        int n2 = sc.nextInt();

        if(n1>n2)
        {
            System.out.println("N1 is Greater");
        }
        else if(n1<n2)
        {
            System.out.println("N1 is Smaller");
        }
        else
        {
            System.out.println("Equal");
        }

    }
}
```

## Q37. Check whether the month number is valid and display season.

> Input: 1 to 12
> Logic: if-else if to map to Winter/Spring/Summer/Autumn.
> Output: Season.

```java
import java.util.*;
public class Example37
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month number: ");
        int month = sc.nextInt();

        if(month>=1 && month<=3)
        {
            System.out.println("Spring");
        }
        else if(month>=4 && month<=6)
        {
            System.out.println("Summer");
        }
        else if(month>=7 && month<=9)
        {
            System.out.println("Winter");
        }
        else if(month>=10 && month<=12)
        {
            System.out.println("Autumn");
        }
        else
        {
            System.out.println("Invalid!");
        }
    }
}
```

## Q38. Check whether a student is eligible for scholarship:

> Attendance >= 75% and marks >= 80**
> Input: Attendance %, marks
> Logic: if-else
> Output: Eligible or not.

```java
import java.util.*;
public class Example38
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ennter the attendance: ");
        int at = sc.nextInt();

        System.out.println("ennter the marks: ");
        int mr = sc.nextInt();

        if(at>=75 && mr>=80)
        {
            System.out.println("student is eligible for scholarship");
        }
        else
        {
            System.out.println("student is not eligible for scholarship");
        }

    }
}
```

## Q39. Calculate commission based on sales amount:

> Input: Sales amount
> Logic:
> Sales < 5000 → 2% commission
> Sales 5000–10000 → 5% commission
> Sales > 10000 → 10% commission
> Output: Display commission amount.

```java
import java.util.*;
public class Example39
{
    public static void main(String x[])
    {
        int cmmAmt;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sales amount: ");
        int sales = sc.nextInt();

        if(sales<5000)
        {
            cmmAmt = sales*2/100;
            System.out.println("commission amount:"+cmmAmt);
        }
        else if(sales>5000 && sales<10000)
        {
            cmmAmt = sales*5/100;
            System.out.println("commission amount:"+cmmAmt);
        }
        else if(sales>10000)
        {
            cmmAmt = sales*10/100;
            System.out.println("commission amount:"+cmmAmt);
        }
        else
        {
            System.out.println("No Commision");
        }
    }
}
```

## Q4. Write a Java program to check whether a number is positive , negative or zero.

```java
import java.util.*;
public class Example4
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

## Q40. Classify temperature reading:

> Input: Temperature in Celsius
> Logic:
> <0 → Freezing
> 0–20 → Cold
> 21–35 → Warm
> 35 → Hot
> Output: Display weather type.

```java
import java.util.*;
public class Example40
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature in Celsius:");
        float temp = sc.nextFloat();

        if(temp<0)
        {
            System.out.println("Freezing");
        }
        else if(temp>0 && temp<20)
        {
            System.out.println("Cold");
        }
        else if(temp>=21 && temp<=35)
        {
            System.out.println("Warm");
        }
        else
        {
            System.out.println("Hot");
        }

    }
}
```

## Q41. Employee salary hike based on performance and years of service:

> Input: Basic salary, Years of service, Performance rating (1–5)
> Logic:
> If rating >= 4 and service > 5 yrs → 20% hike
> Else if rating >= 3 → 10%
> Else → 5%
> Output: New salary.

```java
import java.util.*;
public class Example41
{
    public static void main(String x[])
    {
        int salary,service,rating,newSalary;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the basic salary: ");
        salary = sc.nextInt();

        System.out.println("enter the years of service: ");
        service = sc.nextInt();

        System.out.println("enter the rating(1-5): ");
        rating = sc.nextInt();

        if(rating>=4 && service>5)
        {
            newSalary = salary*20/100 + salary;
            System.out.println("New Salary: "+newSalary);
        }
        else if(rating>=3)
        {
            newSalary = salary*10/100 + salary;
            System.out.println("New Salary: "+newSalary);
        }
        else
        {
            newSalary = salary*5/100 + salary;
            System.out.println("New Salary: "+newSalary);
        }

    }
}
```

## Q42. Mobile plan billing system:

> Input: Minutes used in a month
> Logic:
> Up to 100 mins → Base ₹199
> 101–300 mins → ₹199 + ₹1/min for extra
> 301–500 mins → ₹199 + ₹1.5/min for extra
> Above 500 mins → ₹199 + ₹2/min for extra
> Output: Total monthly bill.

```java
import java.util.*;

public class Example42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the minutes used in month: ");
        int minutes = sc.nextInt();

        double totalBill = 199; // base charge

        if (minutes <= 100)
        {
            totalBill = 199;
        }
        else if(minutes <= 300)
        {
            totalBill += (minutes - 100) * 1.0;  // 101–300 mins → ₹1 per min
        }
        else if(minutes <= 500)
        {
            totalBill += (200 * 1.0) + (minutes - 300) * 1.5; // 101–300 @₹1 + rest @₹1.5
        }
        else
        {
            totalBill += (200 * 1.0) + (200 * 1.5) + (minutes - 500) * 2.0; // 101–300 @₹1 + 301–500 @₹1.5 + rest @₹2
        }

        System.out.println("Total monthly bill: Rs. " + totalBill);

    }
}
```

## Q43. Calculate fine for library book return:

> Input: Number of days late
> Logic:
> Up to 5 days → ₹2/day
> 6–10 days → ₹3/day
> 11–30 days → ₹5/day
> More than 30 days → Membership canceled + ₹500 fine
> Output: Total fine + membership status.

```java
import java.util.*;
public class Example43
{
    public static void main(String x[])
    {
        int fine,days;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of days late: ");
        days = sc.nextInt();

        if(days>=0 && days<=5)
        {
            fine = days*2;
            System.out.println("Total fine: "+fine);
            System.out.println("Membership Status:actives");
        }
        else if(days>=6 && days<=10)
        {
            fine = days*3;
            System.out.println("Total fine: "+fine);
            System.out.println("Membership Status:active");
        }
        else if(days>=11 && days<=30)
        {
            fine = days*5;
            System.out.println("Total fine: "+fine);
            System.out.println("Membership Status:Membership active");
        }
        else
        {
            fine = days*5 + 500;
            System.out.println("Total fine: "+fine);
            System.out.println("Membership Status:Membership canceled");
        }
    }
}

import java.util.*;
public class Example44
{
    public static void main(String x1[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("price for A Cab Service:");
        int x = sc.nextInt();
        System.out.println("price for B Cab Service:");
        int y = sc.nextInt();

        if(x<y)
        {
            System.out.println("First");
        }
        else if(x>y)
        {
            System.out.println("Second");
        }
        else
        {
            System.out.println("Any");
        }
    }
}

import java.util.*;
public class Example45
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        int currentVolume = 0;

        System.out.println("enter the Current Volume:");
        int vol = sc.nextInt();//50

        System.out.println("enter the increase or decrease Volume:");
        int incdre = sc.nextInt();//54

        int inc = vol-incdre;
        int dec = incdre-vol;

        if(vol>incdre)
        {
            System.out.println(inc);
        }
        else
        {
            System.out.println(dec);
        }

    }
}

import java.util.*;
public class Example46
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your balance: ");
        int balance = sc.nextInt();

        System.out.println("enter amount to withdraw: ");
        int amt = sc.nextInt();

        int show = balance - amt;
        double FinalAmt = show-0.5;

        if(amt>balance)
        {
            System.out.println("Insufficient Funds");
            System.out.println("Balance: "+balance);
        }
        else if(amt%5==0)
        {

            System.out.println("Successful Transaction");
            System.out.println("Balance: "+FinalAmt);
        }
        else
        {
            System.out.println("Incorrect Withdrawal Amount (not multiple of 5)");
            System.out.println("Balance: "+balance);
        }

    }
}

import java.util.*;
public class Example47
{
    public static void main(String x1[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of guards Ezio can control: ");
        int x = sc.nextInt();

        System.out.println("enter the number of guards present: ");
        int y = sc.nextInt();

        if(x>=y)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}

import java.util.*;
public class Example48
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your CRED points:");
        int cred = sc.nextInt();

        if(cred>750)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

import java.util.*;
public class Example49
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students to enroll: ");
        int nn = sc.nextInt();

        System.out.println("enter the maximum capacity of students: ");
        int mm = sc.nextInt();

        System.out.println("enter the number of students who have already register: ");
        int kk= sc.nextInt();

        int space = nn+kk;

        if(space<=mm)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
```

## Q5. Write a Java program to check whether a number is divisible by 5 and 11 or not.

```java
import java.util.*;
public class Example5
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

import java.util.*;
public class Example50
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Chef's IQ");
        int n = sc.nextInt();

        int m = n+7;//After learning a musical instrument

        if(m>=170)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
```

## Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month. Consider leap year for February.

> Explanation:
> Use a switch for month numbers. For February, check if the year is a leap year using an if condition inside the case.

```java
import java.util.*;
public class Example51
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month number(1-12): ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("31 days");
            break;
            case 2:
            System.out.println("enter the year: ");
            int year = sc.nextInt();
            if(year%4==0 && year%400==0)
            {
                System.out.println("29 days");
            }
            else
            {
                System.out.println("28 days");
            }

            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("30 days");
            break;

            default:
            System.out.println("Wrong Input");

        }
    }
}
```

## Q52: Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.

> Explanation:
> Use a switch on the operator to handle different arithmetic operations. Add default to handle invalid operators.

```java
import java.util.*;
public class Example52
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice \n1.+ \n2.- \n3.* \n4./");
        int choice = sc.nextInt();
        System.out.println("enter the first number: ");
        int n1 = sc.nextInt();

        System.out.println("enter the second number: ");
        int n2 = sc.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println("Addition: "+(n1+n2));
            break;
            case 2:
            System.out.println("Addition: "+(n1-n2));
            break;
            case 3:
            System.out.println("Addition: "+(n1*n2));
            break;
            case 4:
            System.out.println("Addition: "+(n1/n2));
            break;

            default:
            System.out.println("Invalid input");
        }
    }
}
```

## Q53. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:

> A: Excellent
> B: Good
> C: Average
> D: Poor
> F: Fail
> Explanation:
> Use a char or string in switch to match grades and print remarks.

```java
import java.util.*;
public class Example53
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the grade (A, B, C, D, F): ");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case 'A':
            System.out.println("Excellent");
            break;
            case 'B':
            System.out.println("Good");
            break;
            case 'C':
            System.out.println("Average");
            break;
            case 'D':
            System.out.println("Poor");
            break;
            case 'F':
            System.out.println("Fail");
            break;

            default:
            System.out.println("Enter valid grade (A, B, C, D, F)");
        }

    }
}
```

## Q54. Develop a Java program using switch to print the day type for an input day number (1-7):

> 1 for Monday, …, 7 for Sunday.
> For 1-5, display “Weekday”; for 6-7, display “Weekend”.

```java
import java.util.*;
public class Example54
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input day number(1-7): ");
        int day = sc.nextInt();

        switch(day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Weekday");
            break;
            case 6:
            case 7:
            System.out.println("Weekend");
            break;
            default:
            System.out.println("Invalid Input");
        }
    }
}
```

## Q55. Write a program to input a character and check whether it is a vowel or consonant using a switch case.

> Explanation:
> Switch on the lowercase character. Use cases for 'a', 'e', 'i', 'o', 'u'; default for consonant.

```java
import java.util.*;
public class Example55
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character: ");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case 'a','e','i','o','u':
            System.out.println("Vowels");
            break;
            default:
            System.out.println("Consonant");
        }

    }
}
```

## Q56. Create a Java program using switch to convert a given number (1-5) to its word equivalent (One, Two, ..., Five). If the number is not between 1 and 5, display “Invalid number”.

> Explanation:
> Switch with cases 1 to 5; default to handle invalid numbers.

```java
import java.util.*;
public class Example56
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number(1-5)");
        int num = sc.nextInt();

        switch(num)
        {
            case 1:
            System.out.println("One");
            break;
            case 2:
            System.out.println("Two");
            break;
            case 3:
            System.out.println("Three");
            break;
            case 4:
            System.out.println("Four");
            break;
            case 5:
            System.out.println("Five");
            break;
            default:
            System.out.println("Invalid Number");

        }
    }
}
```

## Q57. Write a program to input an employee level (1-3) and display the salary range:

> 1: Junior (20,000 - 30,000)
> 2: Mid (31,000 - 50,000)
> 3: Senior (51,000 - 80,000)

```java
import java.util.*;
public class Example57
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the employee level (1-3)");
        int emp = sc.nextInt();

        switch(emp)
        {
            case 1:
            System.out.println("Salary range: 20,000 - 30,000");
            break;
            case 2:
            System.out.println("Salary range: 31,000 - 50,000");
            break;
            case 3:
            System.out.println("Salary range: 51,000 - 80,000");
            break;
            default:
            System.out.println("Invalid Number");
        }

    }
}
```

## Q58. Develop a program to simulate a basic banking menu:

> 1: Deposit
> 2: Withdraw
> 3: Check Balance
> 4: Exit
> Use a switch to handle user choice and print appropriate messages.
> Explanation:
> Switch on user choice. Use variables for balance and update accordingly.

```java
import java.util.*;
public class Example58
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the balance: ");
        int balance = sc.nextInt();
        int totalbalance=0;
        System.out.println("choice the \n1: Deposit \n2: Withdraw \n3: Check Balance \n4: Exit");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println("Please enter the amount for deposit");
            int dep = sc.nextInt();
            totalbalance = balance + dep;
            System.out.println("total balance is: "+totalbalance);
            break;
            case 2:
            System.out.println("Please enter the amount for withdraw");
            int with = sc.nextInt();
            totalbalance = balance - with;
            System.out.println("total balance is: "+totalbalance);
            break;
            case 3:
            System.out.println("Availadbale Balance: "+balance);
            break;
            case 4:
            System.out.println("Thank you");
            break;

            default:
            System.out.println("Invalid Number");
        }
    }
}
```

## Q59. Write a program using switch that takes a number (1-4) and displays a season:

> 1: Spring
> 2: Summer
> 3: Autumn
> 4: Winter
> Explanation:
> Simple switch with four cases and default for invalid input.

```java
import java.util.*;
public class Example59
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number (1-4)");
        int num = sc.nextInt();

        switch(num)
        {
            case 1:
            System.out.println("Spring");
            break;
            case 2:
            System.out.println("Summer");
            break;
            case 3:
            System.out.println("Autumn");
            break;
            case 4:
            System.out.println("Winter");
            break;

            default:
            System.out.println("Invalid Number");

        }
    }
}
```

## Q6. Write a Java program to check whether a character is alphabetic or not.

```java
import java.util.*;
public class Example6
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

## Q60. Create a Java program to simulate a basic food ordering system using switch:

> 1: Burger
> 2: Pizza
> 3: Pasta
> 4: Sandwich
> Display the price for the selected item.
> Explanation:
> Switch on food item number. Print item name and price. Default for invalid selection.

```java
import java.util.*;
public class Example60
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the choice \n1: Burger \n2: Pizza \n3: Pasta \n4: Sandwich");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println("Item Name: Burger");
            System.out.println("Price: 99rs");
            break;
            case 2:
            System.out.println("Item Name: Pizza");
            System.out.println("Price: 199rs");
            break;
            case 3:
            System.out.println("Item Name: Pasta");
            System.out.println("Price: 149rs");
            break;
            case 4:
            System.out.println("Item Name: Sandwich");
            System.out.println("Price: 49rs");
            break;
            default:
            System.out.println("Invalid Selection");
        }
    }
}
```

## Q61. Write a menu-driven program in java using switch case.

> 1.Addition
> 2.Subtraction
> 3.Multiplication
> 4.Division

```java
import java.util.*;
public class Example61
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the choice	\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
        int choice = sc.nextInt();

        System.out.println("enter the two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println("Addition: "+(a+b));
            break;
            case 2:
            System.out.println("Subtraction: "+(a-b));
            break;
            case 3:
            System.out.println("Multiplication: "+(a*b));
            break;
            case 4:
            System.out.println("Division: "+(a/b));
            break;

        }

    }
}
```

## Q62. Write a menu-driven program in java using switch case.

> 1.Check Number is positive , negative or zero.
> 2.Check Number is even or odd.
> 3.Write a c program to find the max number using 2 numbers.

```java
import java.util.*;
public class Example62
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: \n1.Check Number is positive, negative or zero. \n2.Check Number is even or odd. \n3.find the max number using 2 numbers.");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println("Enter the Number:");
            int a = sc.nextInt();
            if(a>0)
            {
                System.out.println("Positive");
            }
            else if(a<0)
            {
                System.out.println("Negative");
            }
            else
            {
                System.out.println("Zero");
            }
            break;

            case 2:
            System.out.println("Enter the Number:");
            int a1 = sc.nextInt();
            if(a1%2==0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
            break;

            case 3:
            System.out.println("Enter the first Number:");
            int a2 = sc.nextInt();

            System.out.println("Enter the second Number:");
            int b = sc.nextInt();

            if(a2>b)
            {
                System.out.println("Max Number: "+a2);
            }
            else
            {
                System.out.println("Max Number: "+b);
            }
            break;

            default:
            System.out.println("Invalid Selection");
        }

    }
}
```

## Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.

```java
import java.util.*;
public class Example7
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

## Q8. Write a Java program to check whether a year is a leap year or not.

```java
import java.util.*;
public class Example8
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year: ");
        int year = sc.nextInt();

        if(year < 4)
        {
            System.out.println("Invalid Year");
        }
        else if(year % 4 == 0 || year % 400 == 0 && year %100 !=0)
        {
            System.out.println("This is Leap Year");
        }
        else
        {
            System.out.println("This is not Leap Year");
        }

    }
}
```

## Q9. Write a java program to input any alphabet and check whether it is vowel or consonant.

```java
import java.util.*;
public class Example9
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
