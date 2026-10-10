# Vector POJO Programs in Java

## Code Links

1. [Q1. Find Longest Word using ArrayList](#q1-find-longest-word-using-arraylist)
2. [Q2. Employee Management System using Vector and POJO](#q2-employee-management-system-using-vector-and-pojo)
3. [Q3. Product Inventory Management System using Vector and POJO](#q3-product-inventory-management-system-using-vector-and-pojo)
4. [Q4. Bank Account Management System using Vector and POJO](#q4-bank-account-management-system-using-vector-and-pojo)
5. [Q5. Book Library Management System using Vector and POJO](#q5-book-library-management-system-using-vector-and-pojo)


## Q1. Find Longest Word using ArrayList

**Problem Statement:**  
Store words in an `ArrayList` of strings and find the longest word.

*Example Input:* `["java", "collection", "map", "framework"]`
*Example Output:* `Longest Word = collection`
**Explanation:**  
Iterate through the `ArrayList` and compare word lengths to track the longest string.

```java
import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		ArrayList<String> al = new ArrayList<>(Arrays.asList("java", "collection", "map", "framework"));
		
		String longest = "";
		int len = 0;
		for(String a : al)
		{
			if(a.length() > len)
            {
                len = a.length();
                longest = a;
            }
		}
		
		System.out.println("Longest Word = "+longest);
	}
}
```

## Q2. Employee Management System using Vector and POJO

**Problem Statement:**  
Create an `Employee` POJO class (`empId`, `name`, `salary`) and manage employee records using `Vector`. Implement a menu-driven program to perform the following operations:  
- Increase salary by 10% for employees earning less than ₹50,000.  
- Search employee by `empId`.  
- Display employees earning more than ₹60,000.

```java
package com.vectorPojo;
import java.util.*;
class Employee{
	private int empId;
	private String name;
	private int salary;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	
}
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		
		v.add(new Employee(1,"Dhruv",10000));
		v.add(new Employee(2,"Ram",40000));
		v.add(new Employee(3,"Dhiraj",80000));
		v.add(new Employee(4,"Venki",120000));
		
		int newSalary=0;
		
		do 
		{
			System.out.println("1. Increase salary by 10% if salary < 50,000");
			System.out.println("2.Search employee by Id");
			System.out.println("3.Display employees earning more than 60,000");
			System.out.print("enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				for(Object obj : v)
				{
					Employee e = (Employee)obj;
					if(e.getSalary() < 50000)
					{
						newSalary = (int) (e.getSalary() + e.getSalary() * 0.1);
						e.setSalary(newSalary);
						 System.out.println("Updated Salary for "+e.getName() + ": "+newSalary);
					}
				}
				break;
			case 2:
				System.out.print("enter id to search: ");
				int id = sc.nextInt();
				boolean found = false;
				for(Object obj : v)
				{
					Employee e = (Employee)obj;
					if(id==e.getEmpId())
					{
						System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getSalary());
						found = true;
						break;
					}
				}
				
				if(!found)
					System.out.println("Emp Does not found");
				
				break;
			case 3:
				for(Object obj : v)
				{
					Employee e = (Employee)obj;
					if(e.getSalary() > 60000)
					{
						System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getSalary());
					}
				}
				break;
			default:
					System.out.println("Invalid Choice");
			}
		}while(true);
	}

}
```

## Q3. Product Inventory Management System using Vector and POJO

**Problem Statement:**  
Create a `Product` POJO class (`productId`, `name`, `price`, `quantity`) and manage inventory records using `Vector`. Implement a menu-driven program to perform the following operations:  
- Display out-of-stock products (`quantity == 0`).  
- Calculate total stock value (`price * quantity`).  
- Display products with total stock value greater than ₹10,000.

```java
package com.vectorPojo;

import java.util.*;

class Product {
	public Product(int productId, String name, int price, int quantity) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	private int productId;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getStockValue() {

		return price * quantity;
	}

	private String name;
	private int price;
	private int quantity;

}

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Vector v = new Vector();

		v.add(new Product(1, "Laptop", 50000, 5));
		v.add(new Product(2, "Mobile", 2000, 4));
		v.add(new Product(3, "TV", 30000, 12));
		v.add(new Product(4, "AC", 25000, 8));

		do {

			System.out.println("1.Display out-of-stock products");
			System.out.println("2.Calculate total stock value");
			System.out.println("3.Display products with stock value > 10,000");

			System.out.print("enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				for (Object obj : v) {
					Product p = (Product) obj;
					if (p.getQuantity() == 0) {
						System.out.println(p.getName() + "\t" + p.getQuantity());
					}
				}
				break;
			case 2:
				int totalStockValue = 0;
				for (Object obj : v) {
					Product p = (Product) obj;
					totalStockValue += p.getStockValue();
				}
				  System.out.println("Total Stock Value: " + totalStockValue);
				break;
			case 3:
				for (Object obj : v) {
					Product p = (Product) obj;
					if (p.getStockValue() > 10000) {
						System.out.println(p.getName());
					}
				}
				break;
			default:
				System.out.println("Invalid Choice");
			}
		} while (true);
	}

}
```

## Q4. Bank Account Management System using Vector and POJO

**Problem Statement:**  
Create a `BankAccount` POJO class (`accountNo`, `holderName`, `balance`) and manage bank accounts using `Vector`. Implement a menu-driven program to perform the following operations:  
- Deposit amount into an account by account number.  
- Withdraw amount from an account if sufficient balance is available.  
- Display accounts with balance less than ₹5,000.

```java
package com.vectorPojo;
import java.util.*;
class BankAccount 
{
	public BankAccount(int accountNo, String holderName, double balance) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.balance = balance;
	}
	private int accountNo;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private String holderName;
	private double balance;
	
}
public class Q4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Vector v = new Vector();
	
	v.add(new BankAccount(1,"Dhruv",6500.0));
	v.add(new BankAccount(2,"Ram",4000.0));
	v.add(new BankAccount(3,"Dhiraj",10000.0));
	v.add(new BankAccount(4,"Venki",1000.0));
	double newBalance = 0;
	
	do {
		System.out.println("1.Deposit amount to an account");
		System.out.println("2.Withdraw amount if balance is sufficient");
		System.out.println("3.Display accounts with balance < 5000");
		
		System.out.print("enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.print("Enter Amount: ");
			double amount = sc.nextDouble();
			System.out.print("enter account number: ");
			int ac = sc.nextInt();
			boolean found = false;
			for(Object obj : v)
			{
				BankAccount b = (BankAccount )obj;
				if(ac==b.getAccountNo())
				{
					newBalance = amount + b.getBalance();
					b.setBalance(newBalance);
					System.out.println("Deposit Successful");
					System.out.println("New Balance: "+b.getHolderName()+"\t"+newBalance);
					found = true;
					break;
				}
			}
			
			if(!found)
				System.out.println("Invalid Account Number");
			break;
			
		case 2:
			System.out.print("enter account number: ");
			ac = sc.nextInt();
			found=false;
			for(Object obj : v)
			{
				BankAccount b = (BankAccount)obj;
				if(ac==b.getAccountNo())
				{
					found=true;
					System.out.print("enter amount to withdraw: ");
					amount = sc.nextDouble();
					
					if(amount <= b.getBalance())
					{
						newBalance = b.getBalance() - amount;
						b.setBalance(newBalance);
						System.out.println("Withdrawal Successful");
						System.out.println("New Balance: "+b.getHolderName()+"\t"+newBalance);
						break;
					}
					else
					{
						System.out.println("Insufficient Balance");
						break;
					}
				}
			}
			if(!found)
				System.out.println("Id does not found");		
			break;
		case 3:
			for(Object obj : v)
			{
				BankAccount b = (BankAccount)obj;
				if(b.getBalance() < 5000)
				{
					System.out.println(b.getAccountNo()+"\t"+b.getHolderName()+"\t"+b.getBalance());
				}
			}
			break;
		default:
				System.out.println("Invalid Choice");
		}
		
	}while(true);
	
	}
}
```

## Q5. Book Library Management System using Vector and POJO

**Problem Statement:**  
Create a `Book` POJO class (`bookId`, `title`, `author`, `price`) and manage library book records using `Vector`. Implement a menu-driven program to perform the following operations:  
- Count total books in the library.  
- Search books by author.  
- Display books costing more than the average book price.

```java
package com.vectorPojo;
import java.util.*;
class Book
{
	public Book(int bookId, String title, String author, int price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	private int bookId;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	private String title;
	private String author;
	private int price;
	
	
}

public class Q5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Vector v = new Vector();
	
	v.add(new Book(1,"Engineer","Dhruv",100));
	v.add(new Book(2,"BGMI","Ram",49));
	v.add(new Book(3,"AAN","Dhiraj",400));
	v.add(new Book(4,"Noob","Venki",900));
	
	int count=0;
	double average=0;
	do
	{
		System.out.println("1.Count total books");
		System.out.println("2.Search books by author");
		System.out.println("3.Display books costing more than average price");
		
		System.out.print("enter choice: ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Count: "+v.size());
			break;
		case 2:
			System.out.print("enter author name: ");
			String name = sc.next();
			boolean flag = false;
			for(Object obj : v)
			{
				Book b = (Book)obj;
				if(b.getAuthor().equals(name))
				{
					System.out.println(b.getBookId()+"\t"+b.getTitle()+"\t"+b.getAuthor());
					flag = true;
					break;
				}
			}
			if(!flag)
				System.out.println("name does not found");
			break;
		case 3:
			int totalPrice = 0;
			for(Object obj : v)
			{
				Book b = (Book)obj;
				totalPrice += b.getPrice();
			}
			average = (double) totalPrice / v.size();
			
			for(Object obj : v)
			{
				Book b = (Book)obj;
				if(b.getPrice() > average)
				{
					System.out.println(b.getBookId()+"\t"+b.getTitle()+"\t"+b.getAuthor()+"\t"+b.getPrice());
				}
			}
			break;
		default:
				System.out.println("Invalid Choice");
		}
	}while(true);
	}

}
```
