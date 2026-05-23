/* Q2. Create a Product class having fields productName and price.
 Initialize using a constructor.
 Write a method isDiscountEligible() that returns true if price > 500, else false.
 In main, print which products get discount.
Concepts Used:
 ✔ Constructor to set values
 ✔ Logical operator (>)
 ✔ Returning boolean
Explanation:
 Constructor loads product values; logical check decides discount eligibility. */
/* Q2. Create a Product class having fields productName and price.
   Initialize using a constructor.
   Write a method isDiscountEligible() that returns true if price > 500, else false.
*/

class Product 
{
    private String productName;
    private float price;

    // Parameterized constructor
    public Product(String productName, float price) 
	{
        this.productName = productName;
        this.price = price;
    }

    // Method to check discount eligibility
    public boolean isDiscountEligible() 
	{
        return price > 500;
    }

    // Display product info
    public void show() 
	{
        System.out.println(productName + " - Price: " + price);
    }
}

public class ProductTest_2 
{

    public static void main(String[] args) 
	{

        // Creating product objects
        Product[] products = new Product[3];

        products[0] = new Product("Laptop Bag", 450);
        products[1] = new Product("Headphones", 800);
        products[2] = new Product("Keyboard", 520);

        System.out.println("\n----- Discount Eligibility -----");

        // Normal for-loop
        for (int i = 0; i < products.length; i++) 
		{

            products[i].show();

            if (products[i].isDiscountEligible()) 
			{
                System.out.println("--> Eligible for Discount\n");
            } 
			else 
			{
                System.out.println("--> Not Eligible for Discount\n");
            }
        }
    }
}


/* Assignment using Constructor :-

Q1. Create a Student class with fields: name, marks.
 Use a parameterized constructor to initialize both fields.
 Write a method checkResult() that prints "Pass" if marks ≥ 35, otherwise "Fail".
 Create 3 student objects and print their results.
Concepts Used:
 ✔ Parameterized constructor
 ✔ If–else logic
Explanation:
The constructor sets the student’s name and marks.
Then you apply simple logical condition (≥ 35). */


class Student 
{
    private String name;
    private int marks;

    // Parameterized Constructor
    public Student(String name, int marks) 
	{
        this.name = name;
        this.marks = marks;
    }

    // Method to check result
    public void checkResult() 
	{
        if (marks >= 35)
            System.out.println(name + " : Pass");
        else
            System.out.println(name + " : Fail");
    }
}

public class StudentTest_1 
{
    public static void main(String[] args) 
	{

        // Creating 3 students (using constructor)
        Student s1 = new Student("Amit", 45);
        Student s2 = new Student("Riya", 30);
        Student s3 = new Student("Karan", 75);

        // Displaying results
        s1.checkResult();
        s2.checkResult();
        s3.checkResult();
		
    }
}
/* 
java StudentTest_1.java
Amit : Pass
Riya : Fail
Karan : Pass */

