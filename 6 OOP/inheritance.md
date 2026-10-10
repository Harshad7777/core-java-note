# Inheritance Programs in Java

## Code Links

1. [Q1. Employee Bonus Calculation (Manager & Developer)](#q1-employee-bonus-calculation-manager--developer)
2. [Q2. Runtime Polymorphism with Employee Bonus Calculation](#q2-runtime-polymorphism-with-employee-bonus-calculation)
3. [Q3. Compare Numbers with Tight Coupling](#q3-compare-numbers-with-tight-coupling)
4. [Q4. Difference Calculation with Tight Coupling](#q4-difference-calculation-with-tight-coupling)
5. [Q5. Square of Sum Calculation with Tight Coupling](#q5-square-of-sum-calculation-with-tight-coupling)
6. [Q6. Integer Average Calculation with Tight Coupling](#q6-integer-average-calculation-with-tight-coupling)
7. [Q7. Remainder Calculation with Tight Coupling](#q7-remainder-calculation-with-tight-coupling)
8. [Q8. Discount System with Loose Coupling](#q8-discount-system-with-loose-coupling)
9. [Q9. Shape Area Calculation with Loose Coupling](#q9-shape-area-calculation-with-loose-coupling)
10. [Q10. Telecom User Plan Bill Calculation with Loose Coupling](#q10-telecom-user-plan-bill-calculation-with-loose-coupling)
11. [Q11. Full-Time and Part-Time Employee Salary with Loose Coupling](#q11-full-time-and-part-time-employee-salary-with-loose-coupling)
12. [Q12. Bank Account Interest Calculation](#q12-bank-account-interest-calculation)
13. [Q13. Product Price Discount Calculation](#q13-product-price-discount-calculation)
14. [Q14. Student Result Evaluation (Pass/Fail)](#q14-student-result-evaluation-passfail)
15. [Q15. Staff Salary Increment (Teaching vs Non-Teaching)](#q15-staff-salary-increment-teaching-vs-non-teaching)
16. [Q16. Order Billing System (COD vs Online Payment)](#q16-order-billing-system-cod-vs-online-payment)
17. [Q17. Ticket Price Calculation with Tax (Movie vs Bus)](#q17-ticket-price-calculation-with-tax-movie-vs-bus)
18. [Q18. Loan EMI Calculation (Home Loan vs Car Loan)](#q18-loan-emi-calculation-home-loan-vs-car-loan)
19. [Q19. Product Tax Calculation (Luxury vs Essential)](#q19-product-tax-calculation-luxury-vs-essential)
20. [Q20. Vehicle Superclass with Bus and Truck Subclasses](#q20-vehicle-superclass-with-bus-and-truck-subclasses)
21. [Q21. College Management System (Person with Student & Faculty)](#q21-college-management-system-person-with-student--faculty)


## Q1. Employee Bonus Calculation (Manager & Developer)

**Problem Statement:**  
Create a base class `Employee` with fields `name` and `salary`. Create subclasses `Manager` and `Developer`.  
- `Manager`: Gets a 20% bonus on salary.  
- `Developer`: Gets a 10% bonus on salary.  
Write a program to calculate and display the total salary (`base + bonus`) for each employee.

**Explanation:**  
Tests how to use inheritance to share fields/methods and override logic for bonus calculations.

```java
class Employee
{
	String name;
	int salary;
	void setEmp(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	int getSalary()
	{
		return 0;
	}
}
class Manager extends Employee
{
	int getSalary()
	{
		int	bonus=salary*20/100;
		return salary+bonus;
	}
}
class Developer extends Employee
{
	int getSalary()
	{
		int	bonus=salary*10/100;
		return salary+bonus;
	}
}
public class Q1
{
	public static void main(String x[])
	{
		Employee e = null;
		e = new Manager();
		e.setEmp("Shri",5000);
		int res = e.getSalary();
		System.out.println("Manager: "+res);
		e = new Developer();
		e.setEmp("Dhruv",3500);
		res = e.getSalary();
		System.out.println("Developer: "+res);
	}
}
```

## Q2. Runtime Polymorphism with Employee Bonus Calculation

**Problem Statement:**  
Create a base class `Employee` with method `calculateBonus()`.  
- `PermanentEmployee`: bonus = 25% of salary.  
- `ContractEmployee`: bonus = 10% of salary.  
Print bonus using a common reference to demonstrate runtime polymorphism.

**Explanation:**  
Tests dynamic method dispatch where base-class reference holds subclass objects.

```java
class Employee
{
	int salary;
	void setEmployee(int salary)
	{
		this.salary=salary;
	}
	
	int calculateBonus()
	{
		return salary;
	}
}

class PermanentEmployee extends Employee
{
	int calculateBonus()
	{
		int bonus = salary*25/100;
		return salary+bonus;
	}
}

class ContractEmployee extends Employee
{
	int calculateBonus()
	{
		int bonus = salary*10/100;
		return salary+bonus;
	}
}

public class Q10
{
	public static void main(String x[])
	{
		Employee e = new PermanentEmployee();
		e.setEmployee(6000);
		System.out.println("Permanent Employee: "+e.calculateBonus());
		
		e = new ContractEmployee();
		e.setEmployee(3000);
		System.out.println("Contract Employee: "+e.calculateBonus());
	}
}
```

## Q3. Compare Numbers with Tight Coupling

**Problem Statement:**  
Create a class `Compare` that extends a base class `Value` and overrides `getResult()` to return the greater of two numbers. Create another class `Check` that accepts only a `Compare` object and displays the result. Demonstrate tight coupling by passing only `Compare` object to `Check`.

```java
class Value
{
	int x,y;
	void setValue(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	int getResult()
	{
		return x;
	}
}

class Compare extends Value
{
	int getResult()
	{
		if(x > y)
			return x;
		else
			return y;
	}
}

class Check
{
	void show(Compare c)
	{
		int res = c.getResult();
		System.out.println("Greater number is "+res);
	}
}

public class Q11
{
	public static void main(String x[])
	{
		Check ch = new Check();
		Compare c =  new Compare();
		c.setValue(12,7);
		ch.show(c);	
	}
}
```

## Q4. Difference Calculation with Tight Coupling

**Problem Statement:**  
Create a class `Difference` that extends `Value` and overrides `getResult()` to return the absolute difference between `x` and `y`. Create a `Processor` class that accepts only a `Difference` object and prints the result.

```java
class Value
{
	int x,y;
	void setValue(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	int getResult()
	{
		return 0;
	}
}

class Difference extends Value
{
	int getResult()
	{
		if(x > y)
			return x - y;
		else
			return y - x;
	}
}

class Processor
{
	void show(Difference d)
	{
		int res = d.getResult();
		System.out.println("Difference is "+res);
	}
}

public class Q12
{
	public static void main(String x[])
	{
		Processor p = new Processor();
		Difference d = new Difference();
		d.setValue(5,10);
		p.show(d);
	}
}
```

## Q5. Square of Sum Calculation with Tight Coupling

**Problem Statement:**  
Create a class `SquareSum` extending `Value` and overriding `getResult()` to return `(x + y) * (x + y)` (square of sum). Create a `Display` class that accepts only a `SquareSum` object.

```java
class Value
{
	int x,y;
	void setValue(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	int getResult()
	{
		return 0;
	}
}

class SquareSum extends Value
{
	int getResult()
	{
		return (x + y) * (x + y);
	}
}

class Display
{
	void show(SquareSum ss)
	{
		int res = ss.getResult();
		System.out.println("Square of sum is "+res);
	}
}	

public class  Q13
{
	public static void main(String x[])
	{
		Display d = new Display();
		SquareSum ss = new SquareSum();
		ss.setValue(3,2);
		d.show(ss);
	}
}
```

## Q6. Integer Average Calculation with Tight Coupling

**Problem Statement:**  
Create a class `Average` that extends `Value` and overrides `getResult()` to return the integer average of `x` and `y`. Create a class `Evaluate` that accepts only an `Average` object and prints the result.

```java
class Value
{
	int x,y;
	void setValue(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	int getResult()
	{
		return 0;
	}
}

class Average extends Value
{
	int getResult()
	{
		int avg = (x + y) / 2;
		return avg;
	}
	
}

class Evaluate
{
	void show(Average a)
	{
		int res = a.getResult();
		System.out.print("Average is "+res);
	}
}

public class Q14
{
	public static void main(String x[])
	{
		Evaluate e = new Evaluate();
		Average a = new Average();
		a.setValue(20,30);
		e.show(a);
	}
}
```

## Q7. Remainder Calculation with Tight Coupling

**Problem Statement:**  
Create a class `Remainder` extending `Value` and overriding `getResult()` to return the remainder when `x` is divided by `y`. Create a `Compute` class that accepts only a `Remainder` object and displays the result.

```java
class Value
{
	int x,y;
	void setValue(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	int getResult()
	{
		return 0;
	}
}

class Remainder extends Value
{
	int getResult()
	{
		return x%y;
	}
}

class Compute
{
	void show(Remainder r)
	{
		int res = r.getResult();
		System.out.print("Remainder is "+res);
	}
}

public class Q15
{
	public static void main(String x[])
	{	
		Compute c = new Compute();
		Remainder r = new Remainder();
		r.setValue(16,4);
		c.show(r);
	}
}
```

## Q8. Discount System with Loose Coupling

**Problem Statement:**  
A shopping application has two discount types: `FestivalDiscount` and `RegularDiscount`. Design a system where the main class depends only on parent class reference `Discount` so objects can be swapped easily (Loose Coupling).

**Explanation:**  
The main method refers to `Discount d = new FestivalDiscount();` and later switches to `new RegularDiscount()` without changing any other code.

```java
class Discount
{
	int price;
	void setDiscount(int price)
	{
		this.price=price;
	}
	
	int getResult()
	{
		return price;
	}
}

class FestivalDiscount extends Discount
{
	int getResult()
	{
		int discountPrice = price*20/100;
		return price - discountPrice;
	}
}

class RegularDiscount extends Discount
{
	int getResult()
	{
		int discountPrice = price*5/100;
		return price - discountPrice;
	}
}

public class Q16
{
	public static void main(String x[])
	{
		Discount d = new FestivalDiscount();
		d.setDiscount(1000);
		int res = d.getResult();
		System.out.println("Final Price after Festival Discount: "+res);
		
		d = new RegularDiscount();
		d.setDiscount(1000);
		res = d.getResult();
		System.out.println("Final Price after Regular Discount: "+res);
	}
}
```

## Q9. Shape Area Calculation with Loose Coupling

**Problem Statement:**  
A geometry tool calculates the area of either `Circle` or `Rectangle`. Use one parent class `Shape` so that the main code can switch shapes easily (`Shape s = new Circle()`).

```java
class Shape
{
	double radius, width, length;
	
	void setRad(double radius)
	{this.radius=radius;
	}
	void setWidth(double width)
	{this.width=width;
	}
	void setLength(double length)
	{this.length=length;
	}
	
	double getResult()
	{
		return 0;
	}
}

class Circle extends Shape
{
	double getResult()
	{
		double area = (double)radius*radius*3.14;
		return area;
	}
}

class Rectangle extends Shape
{
	double getResult()
	{
		double area = (double)length*width;
		return area;
	}
}

public class Q17
{
	public static void main(String x[])
	{
		Shape s = new Circle();
		s.setRad(5);
		double res = s.getResult();
		System.out.println("Area of Circle: "+res);
		
		s = new Rectangle();
		s.setLength(4.5);
		s.setWidth(5.4);
		res = s.getResult();
		System.out.println("Area of Rectangle: "+res);
	}
}
```

## Q10. Telecom User Plan Bill Calculation with Loose Coupling

**Problem Statement:**  
A telecom company has plans for `Prepaid` and `Postpaid` users. Create parent class `UserPlan` and child classes `Prepaid` and `Postpaid`. Use parent reference to calculate total bill.

```java
class UserPlan
{
	int callused, rate;
	void setPlan(int callused, int rate)
	{
		this.callused=callused;
		this.rate=rate;
	}
	
	int getResult()
	{
		return 0;
	}
}

class Prepaid extends UserPlan
{
	int getResult()
	{
		int planCharge = callused*rate;
		return planCharge;
	}
}

class Postpaid extends UserPlan
{
	int getResult()
	{
		int planCharge = callused*rate;
		return planCharge;
	}
}

public class Q18
{
	public static void main(String x[])
	{
		UserPlan u = new Prepaid();
		u.setPlan(120,1);
		int res = u.getResult();
		System.out.println("Total Bill for Prepaid User: "+res);
		
		u = new Postpaid();
		u.setPlan(140,2);
		res = u.getResult();
		System.out.println("Total Bill for Postpaid User: "+res);
	}
}
```

## Q11. Full-Time and Part-Time Employee Salary with Loose Coupling

**Problem Statement:**  
A company has `FullTimeEmployee` and `PartTimeEmployee`. Create parent class `Employee` and calculate salary using parent reference (`Employee emp = new PartTimeEmployee()`).

```java
class Employee
{
	int hoursWork, rate;
	void setEmp(int hoursWork, int rate)
	{
		this.hoursWork=hoursWork;
		this.rate=rate;
	}
	
	int getResult()
	{
		return 0;
	}
}

class FullTimeEmployee extends Employee
{
	int getResult()
	{
		return hoursWork*rate;
	}
}

class PartTimeEmployee extends Employee
{
	int getResult()
	{
		return hoursWork*rate;
	}
}

public class Q19
{
	public static void main(String x[])
	{
		
		Employee e = new FullTimeEmployee();
		e.setEmp(10,150);
		int res = e.getResult();
		System.out.println("Salary for Full-Time Employee: "+res);
		
		e = new PartTimeEmployee();
		e.setEmp(5,100);
		res = e.getResult();
		System.out.println("Salary for Part-Time Employee: "+res);
	}
}
```

## Q12. Bank Account Interest Calculation

**Problem Statement:**  
Create a class `BankAccount` with a method `calculateInterest()`. Create subclasses `SavingsAccount` (interest rate 5%) and `CurrentAccount` (interest rate 3%). Calculate interest for different account types and display it.

```java
class BankAccount
{
	int p;
	void setBank(int p)
	{
		this.p=p;
	}
	
	int calculateInterest()
	{
		return 0;
	}
}
class SavingsAccount extends BankAccount
{
	int calculateInterest()
	{
		
		return p*5/100;
	}
}
class CurrentAccount extends BankAccount
{
	int calculateInterest()
	{
		return p*3/100;
	}
}
public class Q2
{
	public static void main(String x[])
	{
		BankAccount ba = null;
		ba = new SavingsAccount();
		ba.setBank(4000);
		int res = ba.calculateInterest();
		System.out.println("Savings Account: "+res);
		ba = new CurrentAccount();
		ba.setBank(6000);
		res = ba.calculateInterest();
		System.out.println("Current Account: "+res);
	}
}
```

## Q13. Product Price Discount Calculation

**Problem Statement:**  
Create a base class `Product` with fields `id`, `name`, and `price`. Create subclasses `Electronics` (10% discount) and `Clothing` (20% discount). Calculate and print final prices after applying discounts.

```java
class Product
{
	int id;
	String name;
	int price;
	Product(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	int getFinalPrice()
	{
		return price;
	}
}

class Electronics extends Product
{
	Electronics(int id,String name,int price)
	{
		super(id,name,price);
	}
	
	int getFinalPrice()
	{
		int dis = price*10/100;
		return price-dis;
	}
}
class Clothing extends Product
{
	Clothing(int id,String name,int price)
	{
		super(id,name,price);
	}
	
	int getFinalPrice()
	{
		int dis = price*5/100;
		return price-dis;
	}
}
public class Q3
{
	public static void main(String x[])
	{
		Product p = null;
		p = new Electronics(1,"Dhruv",500);
	
		int res = p.getFinalPrice();
		System.out.println("Electronics: "+res);
		
		p = new Clothing(2,"Ram",150);
		res = p.getFinalPrice();
		System.out.println("Clothing: "+res);
	}
}
```

## Q14. Student Result Evaluation (Pass/Fail)

**Problem Statement:**  
Create a class `Student` with fields `name` and `marks`. Create subclasses `EngineeringStudent` and `MedicalStudent`. If `marks >= 50`, student passes, otherwise fails. Display results using overridden methods.

```java
class Student
{
	String name;
	int marks;
	void setStudent(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	String getResult()
	{	
		if(marks >= 50)
			return "pass";
		else
			return "fail";
	}
}

class EngineeringStudent extends Student
{
	String getResult()
	{	
		if(marks >= 50)
			return "pass";
		else
			return "fail";
	}
}

class MedicalStudent extends Student
{
	String getResult()
	{	
		if(marks >= 50)
			return "pass";
		else
			return "fail";
	}
}

public class Q4
{
	public static void main(String x[])
	{
		Student s = null;
		s = new EngineeringStudent();
		s.setStudent("Dhruv",55);
		System.out.println("Engineering Student: "+s.getResult());
		
		s = new MedicalStudent();
		s.setStudent("Shri",15);
		System.out.println("Medical Student: "+s.getResult());
	}
}
```

## Q15. Staff Salary Increment (Teaching vs Non-Teaching)

**Problem Statement:**  
Create a base class `Staff` with a method `incrementSalary()`. For `TeachingStaff`, salary increases by 15%. For `NonTeachingStaff`, salary increases by 10%. Print new salaries using method overriding.

```java
class Staff
{
	int salary;
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	int incrementSalary()
	{
		return 0;
	}
}

class TeachingStaff extends Staff
{
	int incrementSalary()
	{
		int inc = salary*15/100;
		return salary+inc;
	}
}

class NonTeachingStaff extends Staff
{
	int incrementSalary()
	{
		int inc = salary*10/100;
		return salary+inc;
	}
}

public class Q5
{
	public static void main(String x[])
	{
		Staff s = new TeachingStaff();
		s.setSalary(4000);
		System.out.println("Teaching Staff: "+s.incrementSalary());
		
		s = new NonTeachingStaff();
		s.setSalary(10000);
		System.out.println("NonTeaching Staff: "+s.incrementSalary());
	}
}
```

## Q16. Order Billing System (COD vs Online Payment)

**Problem Statement:**  
Create a base class `Order` with fields `orderId` and `amount`. Subclass `CODOrder` adds a fixed delivery charge of ₹50. Subclass `OnlinePaymentOrder` adds no delivery charge but gives 5% cashback. Calculate final bill amount using overridden methods.

```java
class Order
{
	int orderId;
	int amount;
	void setOrder(int orderId,int amount)
	{
		this.orderId=orderId;
		this.amount=amount;
	}
	
	int getFinalBill()
	{
		return 0;
	}
}

class CODOrder extends Order
{
	int getFinalBill()
	{
		return amount+50;
	}
}

class OnlinePaymentOrder extends Order
{
	int getFinalBill()
	{
		int cb = amount*5/100;
		return amount-cb;
	}
}

public class Q6
{
	public static void main(String x[])
	{
		Order o = new CODOrder();
		o.setOrder(1,400);
		System.out.println("CODOrder final bill: "+o.getFinalBill());
		
		o = new OnlinePaymentOrder();
		o.setOrder(2,400);
		System.out.println("OnlinePaymentOrder final bill: "+o.getFinalBill());
	}
}
```

## Q17. Ticket Price Calculation with Tax (Movie vs Bus)

**Problem Statement:**  
Create a class `Ticket` with method `calculatePrice()`. `MovieTicket` has 18% GST. `BusTicket` has 5% GST. Print ticket price including tax using overridden methods.

```java
class Ticket
{
	int price;
	void setTicket(int price)
	{
		this.price=price;
	}
	
	int calculatePrice()
	{
		return price;
	}
}

class MovieTicket extends Ticket
{
	int calculatePrice()
	{
		int tax = price*18/100;
		return price+tax;
	}
}

class BusTicket extends Ticket
{
	int calculatePrice()
	{
		int tax = price*5/100;
		return price+tax;
	}
}

public class Q7
{
	public static void main(String x[])
	{
		Ticket t = new MovieTicket();
		t.setTicket(100);
		System.out.println("Movie Ticket after Tax: "+t.calculatePrice());
		
		t = new BusTicket();
		t.setTicket(100);
		System.out.println("Bus Ticket after Tax: "+t.calculatePrice());
	}
}
```

## Q18. Loan EMI Calculation (Home Loan vs Car Loan)

**Problem Statement:**  
Create a base class `Loan` with fields `amount` and `years`. `HomeLoan` has an interest rate of 7%. `CarLoan` has an interest rate of 9%. Calculate and print EMI for both loans.

```java
class Loan
{
	double amount;
	int years;
	void setLoan(double amount,int years)
	{
		this.amount=amount;
		this.years=years;
	}
	
	double getEMI()
	{
		return 0;
	}
}

class HomeLoan extends Loan
{
	double getEMI()
	{
	
		return ;
	}
}

class CarLoan extends Loan
{
	double getEMI()
	{
		
		return ;
	}
}

public class Q8
{
	public static void main(String x[])
	{
		Loan l = new HomeLoan();
		l.setLoan(75000,8);
		System.out.println("EMI for Home Loan: "+l.getEMI());
		
		l = new CarLoan();
		l.setLoan(45000,4);
		System.out.println("EMI for Car Loan: "+l.getEMI());
	}
}
```

## Q19. Product Tax Calculation (Luxury vs Essential)

**Problem Statement:**  
Create base class `Product` with fields `id`, `name`, and `basePrice`. `LuxuryProduct` adds 20% tax. `EssentialProduct` adds 5% tax. Write a program to print final price using polymorphism.

```java
class Product
{
	int id;
	String name;
	int basePrice;
	void setProduct(int id,String name,int basePrice)
	{
		this.id=id;
		this.name=name;
		this.basePrice=basePrice;
	}
	
	int getFinalPrice()
	{
		return 0;
	}
}

class LuxuryProduct extends Product
{
	int getFinalPrice()
	{
		int fp = basePrice*20/100;
		return fp+basePrice;
	}
}

class EssentialProduct extends Product
{
	int getFinalPrice()
	{
		int fp = basePrice*5/100;
		return fp+basePrice;
	}
}

public class Q9
{
	public static void main(String x[])
	{
		Product p = new LuxuryProduct();
		p.setProduct(1,"BMW",50000);
		System.out.println("Luxury Product after tax: "+p.getFinalPrice());
		
		p = new EssentialProduct();
		p.setProduct(2,"TATA",25000);
		System.out.println("Essential Product after tax: "+p.getFinalPrice());
	}
}
```


## Q20. Vehicle Superclass with Bus and Truck Subclasses

**Problem Statement:**  
Write a Java program to implement the concept of inheritance for different types of vehicles using four classes:  
- `Vehicle` (Superclass): `model`, `registrationNumber`, `speed`, `fuelCapacity`, `fuelConsumption`, `fuelNeeded(distance)`, `distanceCovered(time)`, `display()`.  
- `Truck` (Subclass of `Vehicle`): Adds `cargoWeightLimit` and overrides `display()` using `super.display()`.  
- `Bus` (Subclass of `Vehicle`): Adds `numberOfPassengers` and overrides `display()` using `super.display()`.  
- `Transport` (Driver Class): Main method demonstrating constructors with `super()`, method overriding, and polymorphism.

```java
class Vehicle 
{
	private String model;
	private String registrationNumber;
	private double speed;
	private double fuelCapacity;
	private double fuelConsumption;
	Vehicle(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption)
	{
		this.model=model;
		this.registrationNumber=registrationNumber;
		this.speed=speed;
		this.fuelCapacity=fuelCapacity;
		this.fuelConsumption=fuelConsumption;
	}
	
	String getModel()
	{
		return model;
	}
	String getRN()
	{
		return registrationNumber;
	}
	double getSpeed()
	{
		return speed;
	}
	double getFC()
	{
		return fuelCapacity;
	}
	double getFconsumed()
	{
		return fuelConsumption;
	}
	
	
	double fuelNeeded(double distance)
	{	
		return distance/fuelConsumption;
	}
	
	double distanceCovered(double time)
	{
		return speed*time;
	}
	
	void display()
	{
		System.out.println("Model: " + model);
        System.out.println("Reg No: " + registrationNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Fuel Consumption: " + fuelConsumption);
	}
}

class Bus extends Vehicle
{
	private int numberOfPassengers;
	Bus(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption, int numberOfPassengers)
	{
		super(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
		this.numberOfPassengers = numberOfPassengers;
	}
	
	void display()
	{
		super.display();
		System.out.println("Number of Passengers: " + numberOfPassengers);
	}
	
}

class Truck extends Vehicle
{
	private double cargoWeightLimit;
	Truck(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption, double cargoWeightLimit)
	{
		super(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
		this.cargoWeightLimit = cargoWeightLimit;
	}
	
	
	void display()
	{
		super.display();
		System.out.println("Cargo Weight Limit: " + cargoWeightLimit + " kg");
	}
	
}

public class Transport 
{
	public static void main(String x[])
	{
		Vehicle bus = new Bus("Volvo", "MH17", 80, 150, 6, 50);
		Vehicle truck = new Truck("TATA", "MH15", 60, 200, 5, 15000);
		
		System.out.println("----- Bus -----");
        System.out.println("Fuel Needed: " + bus.fuelNeeded(500));
        System.out.println("Distance Covered: " + bus.distanceCovered(5));
        bus.display();
		
		System.out.println();
		
		System.out.println("----- Truck -----");
        System.out.println("Fuel Needed: " + truck.fuelNeeded(500));
        System.out.println("Distance Covered: " + truck.distanceCovered(5));
        truck.display();
		
	}
}
```

## Q21. College Management System (Person with Student & Faculty)

**Problem Statement:**  
Design a College Management System with one parent class and two child classes:  
- `Person` (Parent Class): `id`, `name`, `address`, `contactNo`, `addDetails()`, `displayDetails()`, `updateAddress()`, `deleteContact()`, `showBasicInfo()`.  
- `Student` (Child Class 1): `courseName`, `marks[3]`, `percentage`, `enterMarks()`, `calculatePercentage()`.  
- `Faculty` (Child Class 2): `subject`, `salary`, `experience`, `assignSubject()`, `calculateIncrement()`, `displayFacultyInfo()`.  
Demonstrate 10 sequential operations in `main()` using constructors with `super()` and method overriding.

```java
import java.util.*;
class Person
{
	Scanner sc = new Scanner(System.in);
	
	int id;
	String name, address, contactNo;
	Person(int id, String name, String address, String contactNo)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.contactNo=contactNo;
	}
	
	
	void addDetails()
	{
		System.out.print("enter the id: ");
		id = sc.nextInt();
		System.out.print("enter the name: ");
		name = sc.next();
		System.out.print("enter the address: ");
		address = sc.next();
		System.out.print("enter the contact: ");
		contactNo = sc.next();
	}
	
	void displayDetails()
	{
		System.out.println("--Display Person Detail--");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Contact: "+contactNo);
		System.out.println("---------------------------");
	}
	
	void updateAddress()
	{
		System.out.print("enter the new address: ");
		address = sc.next();
		System.out.println("Updated Address...");
	}
	
	void updateContact()
    {
        System.out.print("Enter new contact number: ");
        contactNo = sc.next();
        System.out.println("Contact updated...");
    }
	
	void deleteContact() 
	{
		contactNo = null;
		System.out.println("Contact is deleted successfully...");
	}
	
	void deleteAddress()
    {
        address = null;
        System.out.println("Address deleted...");
    }
	
	void showBasicInfo() 
	{
		System.out.println("---Display Basic info---");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Contact: "+contactNo);
		System.out.println("---------------------------");
	}
	
}

class Student extends Person
{
	String courseName;
	int marks[] = new int[3];
	double percentage;
	
	Student(int id, String name, String address, String contactNo)
	{
		super(id,name,address,contactNo);
	}
	
	
	void enterMarks()
	{
		System.out.print("enter the course name: ");
		courseName = sc.next();
		
		System.out.print("enter the marks of 3 subject: ");
		for(int i=0; i<marks.length; i++)
		{
			marks[i]=sc.nextInt();
		}
	}
	
	void calculatePercentage()
	{
		int total=0;
		for(int i=0; i<marks.length; i++)
		{
			total+=marks[i];
		}
		
		percentage = total / 3.0;
		//System.out.printf("Percentage: %.2f\n", percentage);
		
	}
	
	void displayDetails()
    {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact No: " + contactNo);
        System.out.println("Course: " + courseName);
		System.out.println("Percentage: "+percentage);
		System.out.println("---------------------------");
    }
}

class Faculty extends Person
{
	String subject;
	double salary;
	int experience;
	Faculty(int id, String name, String address, String contactNo)
	{
		super(id,name,address,contactNo);
	}
	
	void assignSubject()
	{
		System.out.print("enter the subjuct name for faculty: ");
		subject = sc.next();
	}
	
	void calculateIncrement() 
	{
		System.out.print("enter the salary: ");
		salary = sc.nextDouble();
		
		System.out.print("enter the experience in years: ");
		experience = sc.nextInt();
		
		if(experience > 5)
		{
			salary +=salary*10/100;
			System.out.println("10% Increment Applied!");
		}
	}
	
	void displayFacultyInfo()
	{
		System.out.println("--Display Faculty Detail--");
		System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact No: " + contactNo);
		System.out.println("Subject: "+subject);
		System.out.println("Salary: "+salary);
		System.out.println("Experience: "+experience);
		System.out.println("---------------------------");
	}

}

public class CollegeManagement
{
	public static void main(String x[])
	{
		//student object
		Student s = new Student(1,"","","");
		
		s.addDetails();
		
		s.enterMarks();
		
		s.calculatePercentage();
		
		s.updateContact();
		
		s.displayDetails();
		
		
		//faculty object
		Faculty f = new Faculty(1,"","","");
			
		f.addDetails();
		
		f.assignSubject();
		
		f.calculateIncrement() ;
		
		f.deleteAddress();
		
		f.displayFacultyInfo();
		
	}
}
```
