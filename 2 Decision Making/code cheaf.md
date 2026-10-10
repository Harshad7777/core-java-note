# Java Decision-Making Practice Programs

## Table of Contents

- [1. Display the month name for a number from 1 to 12 using switch-case](#1-display-the-month-name-for-a-number-from-1-to-12-using-switch-case)
- [2. Check whether CRED points exceed 750](#2-check-whether-cred-points-exceed-750)
- [3. Check whether Chef IQ reaches 170 after a 7-point increase](#3-check-whether-chef-iq-reaches-170-after-a-7-point-increase)
- [4. Choose the cheaper of two cab services](#4-choose-the-cheaper-of-two-cab-services)
- [5. Calculate the difference between current and target volume](#5-calculate-the-difference-between-current-and-target-volume)
- [6. Check whether course enrollment fits the maximum capacity](#6-check-whether-course-enrollment-fits-the-maximum-capacity)
- [7. Check whether Ezio can control all the guards](#7-check-whether-ezio-can-control-all-the-guards)
- [8. Check whether a character is a vowel or consonant](#8-check-whether-a-character-is-a-vowel-or-consonant)
- [9. Display the number of days in a month](#9-display-the-number-of-days-in-a-month)
- [10. Calculate the numbers of two-wheelers and four-wheelers](#10-calculate-the-numbers-of-two-wheelers-and-four-wheelers)
- [11. Check candy purchase and remaining stock](#11-check-candy-purchase-and-remaining-stock)
- [12. Estimate delivery time based on package weight](#12-estimate-delivery-time-based-on-package-weight)
- [13. Calculate how many monkeys remain on the tree](#13-calculate-how-many-monkeys-remain-on-the-tree)
- [14. Check whether a year is a leap year](#14-check-whether-a-year-is-a-leap-year)
- [15. Check whether three sides form a valid triangle](#15-check-whether-three-sides-form-a-valid-triangle)
- [16. Classify a triangle by its side lengths](#16-classify-a-triangle-by-its-side-lengths)
- [17. Calculate the third angle of a triangle](#17-calculate-the-third-angle-of-a-triangle)
- [18. Find the real roots of a quadratic equation](#18-find-the-real-roots-of-a-quadratic-equation)
- [19. Calculate an electricity bill from units consumed](#19-calculate-an-electricity-bill-from-units-consumed)
- [20. Calculate simple interest](#20-calculate-simple-interest)
- [21. Calculate compound interest](#21-calculate-compound-interest)
- [22. Display the day of the week for a number from 1 to 7](#22-display-the-day-of-the-week-for-a-number-from-1-to-7)

## 1. Display the month name for a number from 1 to 12 using switch-case

[Back to top](#java-decision-making-practice-programs)

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

## 2. Check whether CRED points exceed 750

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;

public class CRED 
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
```

## 3. Check whether Chef IQ reaches 170 after a 7-point increase

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;

public class ChefIQ
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

## 4. Choose the cheaper of two cab services

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;

public class ChefTravel
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
```

## 5. Calculate the difference between current and target volume

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;

public class ChefWatching 
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
```

## 6. Check whether course enrollment fits the maximum capacity

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;

public class CourseEnroll
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

## 7. Check whether Ezio can control all the guards

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;

public class Ezio
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
```

## 8. Check whether a character is a vowel or consonant

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example1
{
   public static void main(String x[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter your character: ");
     char c = sc.nextLine().charAt(0);

     if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' || c=='A' || c=='E' ||c=='I' ||c=='O' ||c=='U')
       {
        System.out.println(c+" is  vowel");
       }
     else
       {
        System.out.println(c+" is consonant ");
       }
   }
}
```

## 9. Display the number of days in a month

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example10
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
          System.out.println("28/29 days ");
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

## 10. Calculate the numbers of two-wheelers and four-wheelers

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example11
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

## 11. Check candy purchase and remaining stock

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example12
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   
   int n = 10;
   int k = 5;
   System.out.println("enter the number of candies u want: ");
   int c = sc.nextInt();
   
   int ca = n-c;
  
   if(c>0 || c<=5)
     {
      System.out.println("NUMBER OF CANDIES SOLD: "+c);
      System.out.println("NUMBER OF CANDIES AVAILABLE: "+ca);
     }
   else
     {
     System.out.println("INVALID INPUT");
     System.out.println("NUMBER OF CANDIES AVAILABLE: "+ca);
     }
  }
}
```

## 12. Estimate delivery time based on package weight

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example13
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the weight: ");
   int w = sc.nextInt();
   
   if(w==0)
     {
      System.out.println("Time Estimated: 0 minutes");
     }
   if(w<=2000)
     {
      System.out.println("Time Estimated: 25 minutes");
     }
   else if(w>2000 && w<=4000)
     {
      System.out.println("Time Estimated: 35 minutes");
     }
   else
     {      
      System.out.println("Time Estimated: 45 minutes");
     }
  }
}
```

## 13. Calculate how many monkeys remain on the tree

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example14
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

## 14. Check whether a year is a leap year

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example15
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the year: ");
   int year = sc.nextInt();

   if((year % 400 == 0) || (year%4==0 && year % 100 != 0))
     {
      System.out.println(year+" it is leap year");
     }
   else
     {
      System.out.println(year+" it is not leap year"); 
     }
  }
}
```

## 15. Check whether three sides form a valid triangle

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example2
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the first side: ");
   int a = sc.nextInt();
   
   System.out.println("enter the second side: ");
   int b = sc.nextInt();
  
   System.out.println("enter the third side: ");
   int c = sc.nextInt();

   if(a+b==c)
     {
      System.out.println("The triangle is valid");
     }
   else
     {
      System.out.println("The triangle is not valid");
     }
  }
}
```

## 16. Classify a triangle by its side lengths

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example3
{
   public static void main(String x[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first side: ");
    int a = sc.nextInt();
   
    System.out.println("enter the second side: ");
    int b = sc.nextInt();
  
    System.out.println("enter the third side: ");
    int c = sc.nextInt();

    if(a==b && b==c)
      {
       System.out.println("Triangle is equilateral triangle");
      }
    else if(a==b || b==c || c==a)
      {
       System.out.println("Triangle is isosceles triangle");
      }
    else
      {
       System.out.println("Triangle is scalene triangle");
      }

   }
}
```

## 17. Calculate the third angle of a triangle

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example4
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the first side: ");
   int a = sc.nextInt();
   
   System.out.println("enter the second side: ");
   int b = sc.nextInt();
    
   int c = 180-(a+b);

   System.out.println("The third angle is "+c);
 
  }
}
```

## 18. Find the real roots of a quadratic equation

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example5
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

## 19. Calculate an electricity bill from units consumed

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example6
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("electricity unit: ");
   double uc = sc.nextDouble();

   
   if(uc<=50)
     {
      double a = uc*0.50;
      double total1 = a + a*20/100;
      System.out.println("Total Electricity Bill is "+total1);
     }
   else if(uc>50 && uc<=150)
     {
      double b = uc*0.75;
      double total2 = b + b*20/100;
      System.out.println("Total Electricity Bill is "+total2);
     }
   else if(uc>150 && uc<=250)
     {
      double c = uc*1.20;   
      double total3 = c + c*20/100;
      System.out.println("Total Electricity Bill is "+total3);
     }
   else
     {
      double d = uc*1.50;
      double total4 = d + d*20/100;
      System.out.println("Total Electricity Bill is "+total4);
     }
  }
}
```

## 20. Calculate simple interest

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example7
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter the principle: ");
   float p = sc.nextFloat();
  
   System.out.println("enter the time: ");
   float t = sc.nextFloat();
   
   System.out.println("enter the interest rate: ");
   float r = sc.nextFloat();
  
   float si = (p*t*r)/100;
   System.out.println("Simple interest is: "+si);
  }
}
```

## 21. Calculate compound interest

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example8
{
  public static void main(String x[])
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("enter the principle: ");
   double p = sc.nextDouble();
  
   System.out.println("enter the time: ");
   double t = sc.nextDouble();
   
   System.out.println("enter the interest rate: ");
   double r = sc.nextDouble();
  

   double ci = p * Math.pow((1+ (r/100.0)),(t));  
  
   System.out.println("Compound interest is: "+ci);

  }
}
```

## 22. Display the day of the week for a number from 1 to 7

[Back to top](#java-decision-making-practice-programs)

```java
import java.util.*;
public class Example9
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number(1-7): ");
    int choice = sc.nextInt();

    switch(choice){
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
    default:
          System.out.println("Wrong Input");

    }
  }
}
```
