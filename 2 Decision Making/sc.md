# Switch Case Programs

## Table of Contents

- [1. Write a Java program that takes two numbers and an operator (+, -, *, /) as input and performs the](#1-write-a-java-program-that-takes-two-numbers-and-an-operator-as-input-and-performs-the)
- [2. Write a Java program that takes an integer (1-7) as input and prints the corresponding day of the week using switch-case.](#2-write-a-java-program-that-takes-an-integer-1-7-as-input-and-prints-the-corresponding-day-of-the-week-using-switch-case)
- [3. Write a Java program that takes a single character as input and determines whether it is a vowel (a, e, i, o, u) or](#3-write-a-java-program-that-takes-a-single-character-as-input-and-determines-whether-it-is-a-vowel-a-e-i-o-u-or)
- [4. Write a Java program that takes a temperature value and a choice:](#4-write-a-java-program-that-takes-a-temperature-value-and-a-choice)
- [5. Write a Java program that takes an integer (1-12)](#5-write-a-java-program-that-takes-an-integer-1-12)

## 1. Write a Java program that takes two numbers and an operator (+, -, *, /) as input and performs the

[Back to top](#switch-case-programs)

```java
import java.util.*;
public class Example1
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
        System.out.println("Substraction: "+(n1-n2));
		break;
   case 3:
        System.out.println("Multiplication: "+(n1*n2));
		break;
   case 4:
        System.out.println("Division: "+(n1/n2));
		break;
	
	default:
	    System.out.println("Invalid input");
  }
 }
}
```

## 2. Write a Java program that takes an integer (1-7) as input and prints the corresponding day of the week using switch-case.

[Back to top](#switch-case-programs)

```java
import java.util.*;
public class Example2
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number(1-7)");
  int num = sc.nextInt();
  
  switch(num)
  {
    case 1:
       System.out.println("Monday");
	   break;
	case 2:
       System.out.println("Tuesday");
	   break;
	case 3:
       System.out.println("Wednsday");
	   break;
	case 4:
       System.out.println("Thursday");
	   break;
	case 5:
       System.out.println("Friday");
	   break;
	case 6:
       System.out.println("Saturday");
	   break;
	case 7:
       System.out.println("Sunday");
	   break;
    
	default:
	   System.out.println("Invalid Selection");
  
  
  }
  
 }
}
```

## 3. Write a Java program that takes a single character as input and determines whether it is a vowel (a, e, i, o, u) or

[Back to top](#switch-case-programs)

```java
import java.util.*;
public class Example3
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
	case 'A','E','I','O','U':
	    System.out.println("Vowels");
		break;
	
	default:
	    System.out.println("Consonant");
	
	  
   }
 }
}
```

## 4. Write a Java program that takes a temperature value and a choice:

[Back to top](#switch-case-programs)

```java
import java.util.*;
public class Example4
{
 public static void main(String x[])
 {
  double fah,cel;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter your choice \n1.Celsius to Fahrenheit \n2.Fahrenheit to Celsius");
  int choice = sc.nextInt();
  
  switch(choice)
  {
   case 1:
    System.out.println("enter the temperature in celsius: ");
	cel = sc.nextDouble();
    fah = (cel * 9 / 5) + 32;
	System.out.println("Fahrenheit: "+fah);
	break;
	
   case 2:
    System.out.println("enter the temperature in fahrenheit: ");
	fah = sc.nextDouble();
	cel =(fah-32) * 5/9;
	System.out.println("Celsius: "+cel);
	break;
	
   default:
    System.out.println("Invalid Selection");
	
  }
 }
}
```

## 5. Write a Java program that takes an integer (1-12)

[Back to top](#switch-case-programs)

```java
import java.util.*;
public class Example5
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter your choice (1-12)");
  int choice = sc.nextInt();
  
  switch(choice)
  {
   case 1:
    System.out.println("January");
	break;
   case 2:
    System.out.println("February");
	break;
   case 3:
    System.out.println("March");
	break;
   case 4:
    System.out.println("April");
	break;
   case 5:
    System.out.println("May");
	break;
   case 6:
    System.out.println("June");
	break;
   case 7:
    System.out.println("July");
	break;
   case 8:
    System.out.println("August");
	break;
   case 9:
    System.out.println("September");
	break;
   case 10:
    System.out.println("October");
	break;
   case 11:
    System.out.println("November");
	break;
   case 12:
    System.out.println("December");
	break;
	
   default:
	System.out.println("Invalid Selection");
	
  }
 }
}
```

