# Abstraction and Interface Programs in Java

## Code Links

1. [Q1. Bank Account System (Savings vs Current)](#q1-bank-account-system-savings-vs-current)
2. [Q2. Electricity Bill Calculation (Domestic vs Commercial)](#q2-electricity-bill-calculation-domestic-vs-commercial)
3. [Q3. Employee Salary System (Permanent vs Contract)](#q3-employee-salary-system-permanent-vs-contract)
4. [Q4. Exam Result Evaluation System](#q4-exam-result-evaluation-system)
5. [Q5. Loan Interest System (Home, Car, Personal)](#q5-loan-interest-system-home-car-personal)
6. [Q6. Online Payment System (Credit Card vs UPI)](#q6-online-payment-system-credit-card-vs-upi)
7. [Q7. Payment Discount System (Cash vs Card)](#q7-payment-discount-system-cash-vs-card)
8. [Q8. Salary Deduction Logic System (Developer vs Tester)](#q8-salary-deduction-logic-system-developer-vs-tester)
9. [Q9. Shape Area and Perimeter Calculator (Rectangle vs Circle)](#q9-shape-area-and-perimeter-calculator-rectangle-vs-circle)
10. [Q10. Vehicle Rental System (Car vs Bike)](#q10-vehicle-rental-system-car-vs-bike)


## Q1. Bank Account System (Savings vs Current)

**Problem Statement:**  
Create an abstract class `BankAccount` with fields `accountNo` and `balance`, and an abstract method `calculateInterest()`.  
Child classes:  
- `SavingsAccount`: 4% interest  
- `CurrentAccount`: 2% interest  
Calculate interest, add to balance, and display updated balance.

**Concepts Used:** Abstract class, runtime polymorphism.

```java
abstract class BankAccount
{
	protected int accountNo;
	protected double balance;
	void setBank(int accountNo, double balance)
	{
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	abstract double calculateInterest();
}

class SavingsAccount extends BankAccount
{
	double calculateInterest()
	{
		double interest = balance*0.04;
		return balance+interest;
	}
}

class CurrentAccount extends BankAccount
{
	double calculateInterest()
	{
		double interest = balance*0.02;
		return balance+interest;
	}
}

public class BankAccountSystem
{
	public static void main(String x[])
	{
		BankAccount ba = null;
		ba = new SavingsAccount();
		ba.setBank(121,1000);
		System.out.println("Saving Account: "+ba.calculateInterest());
		
		ba = new CurrentAccount();
		ba.setBank(55,2000);
		System.out.println("Current Account: "+ba.calculateInterest());
	}
}
```

## Q2. Electricity Bill Calculation (Domestic vs Commercial)

**Problem Statement:**  
Create an abstract class `ElectricityBill` with field `units` and abstract method `calculateBill()`.  
**Slab Rules:**  
- First 100 units → ₹3/unit  
- Next 100 units → ₹5/unit  
- Above 200 units → ₹8/unit  

**Subclasses:**  
- `Domestic`: Standard slab calculation  
- `Commercial`: Extra ₹500 fixed charge  

**Concepts Used:** Abstract class + slab logic.

```java
abstract class ElectricityBill
{
	protected int units;
	void setUnit(int units)
	{
		this.units=units;
	}
	
	abstract double calculateBill();
}

class Domestic extends ElectricityBill
{
	double calculateBill()
	{
		if(units > 0 && units <= 100)
		{
			return units*3;
		}
		else if(units >= 100 && units <= 200)
		{
			int rem = units-100;
			
			return 100*3 + rem*5;
		}
		else
		{
			int rem = units - 200;
			
			return 100*3 + 100*5 + rem*8;
		}
	}
}

class Commercial extends ElectricityBill
{
	double calculateBill()
	{
		if(units > 0 && units <= 100)
		{
			return units*3 + 500;
		}
		else if(units >= 100 && units <= 200)
		{
			int rem = units-100;
			
			return 100*3 + rem*5 + 500;
		}
		else
		{
			int rem = units - 200;
			
			return 100*3 + 100*5 + rem*8 + 500;
		}

	}
}

public class ElectricityBillCalcution
{
	public static void main(String x[])
	{
		ElectricityBill e = null;
		e = new Domestic();
		e.setUnit(250);
		System.out.println("Domestic Bill: "+e.calculateBill());
		
		e = new Commercial();
		e.setUnit(250);
		System.out.println("Commercial Bill: "+e.calculateBill());
	}
}
```

## Q3. Employee Salary System (Permanent vs Contract)

**Problem Statement:**  
Create an abstract class `Employee` with fields `empId`, `name`, `basicSalary`, and abstract method `calculateSalary()`.  
Subclasses:  
- `PermanentEmployee`: HRA 20%, DA 10%  
- `ContractEmployee`: HRA 10%, DA 5%  
Calculate total salary and display employee details.

**Concepts Used:** Abstract class, method overriding.

```java
abstract class Employee
{
	protected int empId;
	protected String name;
	protected int basicSalary;
	void setEmp(int empId,String name,int basicSalary)
	{
		this.empId=empId;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	abstract double calculateSalary();
	
}

class PermanentEmployee extends Employee
{
	double calculateSalary()
	{
		double hra = basicSalary*0.2;
		double da = basicSalary*0.1;
		
		return basicSalary+hra+da;
	}
}

class ContractEmployee extends Employee
{
	double calculateSalary()
	{
		double hra = basicSalary*0.1;
		double da = basicSalary*0.05;
		
		return basicSalary+hra+da;
	}
}

public class EmployeeSalarySystem
{
	public static void main(String x[])
	{
		Employee e = null;
		e = new PermanentEmployee();
		e.setEmp(1,"Dhruv",1000);
		System.out.println("Emp 1: "+e.calculateSalary());
		
		e = new ContractEmployee();
		e.setEmp(2,"Ram",2000);
		System.out.println("Emp 2: "+e.calculateSalary());
	}
}
```

## Q4. Exam Result Evaluation System

**Problem Statement:**  
Create an abstract class `Student` with fields `marks[]`, `total`, `percentage`, and abstract method `calculateResult()`.  
**Grading Rules:**  
- Any subject `< 35` → Fail  
- Percentage `≥ 75` → Distinction  
- `60–74` → First Class  
- `50–59` → Second Class  
- Else → Pass

**Concepts Used:** Abstract class + decision making.

```java
abstract class Student
{
	protected int[] marks;
	protected int total;
	protected double percentage;
	
	Student(int[] marks)
	{
		this.marks=marks;
	}
	
	abstract String calculateResult();
}

class Information extends Student
{
	
	Information(int[] marks)
	{
		super(marks);
	}
	
	String calculateResult()
	{
		
		for(int i=0; i<marks.length; i++)
		{
			if(marks[i] < 35)
			{
				return "fail";
			}
			
			total+=marks[i];
		}
		
		percentage = (double) total / marks.length;
		
		if(percentage >=75)
			return "Distinction";
		else if(percentage >=60 && percentage <75)
			return "First Class";
		else if(percentage >=50 && percentage <60)
			return "Second Class";
		else
			return "Pass";
	}

}

public class ExamResultEvaluation
{
	public static void main(String x[])
	{
		int marks[] = {78, 65, 82, 70, 60};
		
		Student s = new Information(marks);
		String result = s.calculateResult();
		
		System.out.println("Total: "+s.total);
		System.out.println("Percentage: "+s.percentage);
		System.out.println("Result: "+result);
		
	}
}
```

## Q5. Loan Interest System (Home, Car, Personal)

**Problem Statement:**  
Create an abstract class `Loan` with fields `amount`, `years`, and abstract method `calculateInterest()`.  
**Loan Rates:**  
- `HomeLoan` → 7%  
- `CarLoan` → 9%  
- `PersonalLoan` → 12%  
If `years > 5` → reduce interest rate by 1%.

**Concepts Used:** Abstract class + financial logic.

```java
abstract class Loan
{	
	protected int amount;
	protected int years;
	void setDetails(int amount,int years)
	{
		this.amount=amount;
		this.years=years;
	}
	
	abstract double calculateInterest();
	
}

class HomeLoan extends Loan
{
	double calculateInterest()
	{
		double rate = 0.07;
		
		if(years > 5)
		{
			rate = rate - 0.01;
		}
		
		return amount*rate*years;
	}
}

class CarLoan extends Loan
{
	double calculateInterest()
	{
		double rate = 0.09;
		
		if(years > 5)
		{
			rate = rate - 0.01;
		}
		
		return amount*rate*years;
	}
}

class PersonalLoan extends Loan
{
	double calculateInterest()
	{
		double rate = 0.12;
		
		if(years > 5)
		{
			rate = rate - 0.01;
		}
		
		return amount*rate*years;
	}
}

public class LoanInterestSystem
{
	public static void main(String x[])
	{
		Loan l = null;
		
		l = new HomeLoan();
		l.setDetails(20000,5);
		System.out.println("HomeLoan Interest: "+l.calculateInterest());
		
		l = new CarLoan();
		l.setDetails(50000,7);
		System.out.println("CarLoan Interest: "+l.calculateInterest());
		
		l = new PersonalLoan();
		l.setDetails(25000,10);
		System.out.println("PersonalLoan Interest: "+l.calculateInterest());
	}
}
```

## Q6. Online Payment System (Credit Card vs UPI)

**Problem Statement:**  
Create an interface `Payment` with method `makePayment(double amount)`.  
Implementing classes:  
- `CreditCardPayment`: 2% transaction charge  
- `UPIPayment`: 1% transaction charge  
Calculate and return final amount paid.

**Concepts Used:** Interface, multiple implementations.

```java
interface Payment
{	
	
	public double makePayment(double amount);
}

class CreditCardPayment implements Payment
{
	public double makePayment(double amount)
	{
		double charge = (double)amount*0.02;
		return amount+charge;
	}
}

class UPIPayment implements Payment
{
	public double makePayment(double amount)
	{
		double charge = (double)amount*0.01;
		return amount+charge;
	}
}

public class OnlinePaymentSystem
{
	public static void main(String x[])
	{
		Payment p = null;
		p = new CreditCardPayment();
		System.out.println("Final Amount: "+p.makePayment(1000));
		
		p = new UPIPayment();
		System.out.println("Final Amount: "+p.makePayment(1000));
	}
}
```

## Q7. Payment Discount System (Cash vs Card)

**Problem Statement:**  
Create an interface `Payment` with method `payAmount(double amount)`.  
Implementing classes:  
- `CashPayment`: 5% discount if amount `> 5000`  
- `CardPayment`: 2% discount if amount `> 10000`

**Concepts Used:** Interface + conditional logic.

```java
interface Payment
{
	 public double payAmount(double amount);
}

class CashPayment implements Payment
{
	public double payAmount(double amount)
	{
		if(amount > 5000)
			return amount-amount*0.05;
		else 
			return amount;
	}
}

class CardPayment implements Payment
{
	public double payAmount(double amount)
	{
		if(amount > 10000)
			return amount-amount*0.02;
		else 
			return amount;
	}
}

public class PaymentDiscountSystem
{
	public static void main(String x[])
	{
		Payment p = null;
		
		p = new CashPayment();
		System.out.println("Total Cash: "+p.payAmount(12000));
		
		p = new CardPayment();
		System.out.println("Total Card: "+p.payAmount(12000));

	}
}
```

## Q8. Salary Deduction Logic System (Developer vs Tester)

**Problem Statement:**  
Create an abstract class `Employee` with fields `empId`, `salary`, `workingDays`, and abstract method `calculateNetSalary()`.  
**Deduction Rules:**  
- `workingDays ≥ 26` → No deduction  
- `workingDays` between `20–25` → 10% deduction  
- `workingDays < 20` → 20% deduction  

**Subclass Bonuses:**  
- `Developer` → ₹5000 bonus  
- `Tester` → ₹3000 bonus

**Concepts Used:** Abstract class + salary deduction logic.

```java
abstract class Employee
{
	protected int empId;
	protected double salary;
	protected int workingDays;
	void setEmp(int empId, double salary, int workingDays)
	{
		this.empId=empId;
		this.salary=salary;
		this.workingDays=workingDays;
	}
	
	abstract double calculateNetSalary();
}

class Developer extends Employee
{
	double calculateNetSalary()
	{
		int bonus = 5000;
		double finalSalary=0;
		if(workingDays >= 26)
			finalSalary = salary + bonus;
		else if(workingDays >=20 && workingDays<=25)
			finalSalary = salary - salary*0.1 + bonus;
		else if(workingDays < 20)
			finalSalary = salary - salary*0.2 + bonus;
	
		return finalSalary;
	}
}


class Tester extends Employee
{
	double calculateNetSalary()
	{
		int bonus = 3000;
		double finalSalary=0;
		if(workingDays >= 26)
			finalSalary = salary + bonus;
		else if(workingDays >=20 && workingDays<=25)
			finalSalary = salary - salary*0.1 + bonus;
		else if(workingDays < 20)
			finalSalary = salary - salary*0.2 + bonus;
	
		return finalSalary;
	}
}

public class SalaryDeductionSystem
{
	public static void main(String x[])
	{
		Employee e = null;
		e = new Developer();
		e.setEmp(12,1000,28);
		System.out.println("Developer Salary: "+e.calculateNetSalary());
		
		e = new Tester();
		e.setEmp(11,1000,20);
		System.out.println("Tester Salary: "+e.calculateNetSalary());
	}
}
```

## Q9. Shape Area and Perimeter Calculator (Rectangle vs Circle)

**Problem Statement:**  
Create an abstract class `Shape` with abstract methods `calculateArea()` and `calculatePerimeter()`.  
Subclasses `Rectangle` and `Circle` implement area and perimeter formulas and display results.

**Concepts Used:** Abstract class, method overriding.

```java
abstract class Shape
{
	protected int radius;
	protected float pi;
	protected int length;
	protected int width;
	
	
	abstract double calculateArea();
	
	abstract double calculatePerimeter();
	
}

class Rectangle extends Shape
{
	void setRectangle(int length, int width)
	{
		this.length=length;
		this.width=width;
	}
	
	double calculateArea()
	{
		return length*width;
	}
	
	double calculatePerimeter()
	{
		return 2*(length+width);
	}
}

class Circle extends Shape
{
	void setCircle(int radius, float pi)
	{
		this.radius=radius;
		this.pi=pi;
	}
	
	double calculateArea()
	{
		return pi*radius*radius;
	}
	
	double calculatePerimeter()
	{
		return 2*pi*radius;
	}
}

public class ShapeAreaPerimeter
{
	public static void main(String x[])
	{
		Shape s = null;
		s = new Rectangle();
		((Rectangle)s).setRectangle(12,4);
		System.out.println("Rectangle Area: "+s.calculateArea()+"\t"+"Rectangle Perimeter: "+s.calculatePerimeter());
		
		s = new Circle();
		((Circle)s).setCircle(4,3.14f);
		System.out.println("Circle Area: "+s.calculateArea()+"\t"+"Circle Perimeter: "+s.calculatePerimeter());

	}
}
```

## Q10. Vehicle Rental System (Car vs Bike)

**Problem Statement:**  
Create an abstract class `Vehicle` with abstract method `calculateRent(int days)`.  
Subclasses:  
- `Car`: ₹1000/day  
- `Bike`: ₹500/day  
Calculate total rent and display bill.

**Concepts Used:** Abstract class, logical calculations.

```java
abstract class Vehicle
{
	protected int days;

	abstract int calculateRent(int days);
	
}

class Car extends Vehicle
{
	int calculateRent(int days)
	{
		return days*1000;
	}
}

class Bike extends Vehicle
{
	int calculateRent(int days)
	{
		return days*500;
	}
}

public class VehicleRentalSystem
{
	public static void main(String x[])
	{
		Vehicle v = null;
		v = new Car();
		System.out.println("Total Rent (Car): "+v.calculateRent(12));
		
		v = new Bike();
		System.out.println("Total Rent (Bike): "+v.calculateRent(12));
	}
}
```
