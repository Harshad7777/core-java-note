/* Q11. Create a class Product with:
Fields: productId, name, price, category


Constructors:


Default constructor (assign temporary values)
Parameterized constructor (assign all fields)

Task Logic:
Write a method getFinalPrice() that applies:


if category = "Electronics" → 18% GST + 10% discount
if category = "Clothing" → 5% GST + 20% discount
otherwise → only 5% GST


Create 3 objects using all three constructors and find the final price for each.

Expected Learning: Constructor chaining + conditional logic. */

import java.util.*;

class Product
{
	//instance variabl
	private int productId;
	private String name;
	private double price;
	private String category;
	
	//Default constructor (temporary values)
	//This constructor gives temporary values.
	//Instead of writing separate assignments, we call another constructor using: this(...)
	//This is called constructor chaining.
	//So default constructor internally becomes:
	/* productId = 0
       name = Temp
	   price = 0.0
	   category = General */

	
	public Product()
	{
		  this.productId=0;
		  this.name="null";
		  this.price=0.0;
		  this.category="null";
		  
		   /* this(0, "Temp", 0.0, "General");   // constructor chaining */
		
	}
	
	//Paremeterized Constructor
	/* This constructor sets real product values. */
	public Product(int productId, String name, double price, String category)
	{
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	//method to calculate final price
	public double getFinalPrice()
	{
		double gst = 0;
		double discount	= 0;
		
		if(category.equals("Electronics"))
		{
			gst = 0.18*price;  //18% Gst
			discount = 0.10*price; //10% discount
		}
		else if(category.equals("Clothing"))
		{
			gst = 0.05 * price; //5% GST
			discount = 0.20*price; // 20% discount
		}
		else
		{
			gst = 0.05*price;  // 5% GST
			discount = 0.0;    // no discount
		}
		return price + gst - discount;
	}
		public void show()
		{
			System.out.println(productId + "  "+ name + "  " + category + "  " + 
			" Final Price = "+ getFinalPrice());
		}
}

public class Product_11
{
	public static void main(String x[])
	{
		/* Here we create 3 objects. */
		//using default constructor
		Product p1 = new Product();
		
		//using parameterized constructor
		Product p2 = new Product(101, "laptop",500000,"Electronics");
		
		//Another parameterized
		Product p3 = new Product(202, "Shirt", 1500, "clothing");
		
		p1.show();
		p2.show();
		p3.show();
	}
}

/* java Product_11.java
0  Temp  General   Final Price = 0.0
101  laptop  Electronics   Final Price = 540000.0
202  Shirt  clothing   Final Price = 1275.0 */

/* 
| Step                | Meaning                                     |
| ------------------- | ------------------------------------------- |
| Constructors        | Load values into object                     |
| Default constructor | Uses constructor chaining                   |
| getFinalPrice()     | Calculates GST + discount                   |
| Electronics         | 18% GST + 10% discount                      |
| Clothing            | 5% GST + 20% discount                       |
| Others              | Only 5% GST                                 |
| Main                | Creates 3 products and displays final price |
 */