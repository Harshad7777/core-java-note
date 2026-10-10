# Constructor Programs in Java

## Code Links

1. [Q1. Student Class with Parameterized Constructor](#q1-student-class-with-parameterized-constructor)
2. [Q3. Check Even or Odd using Constructor](#q3-check-even-or-odd-using-constructor)
3. [Q4. Salary Validation in Employee Class](#q4-salary-validation-in-employee-class)
4. [Q5. Box Volume Validation](#q5-box-volume-validation)
5. [Q6. Bank Account Withdrawal System](#q6-bank-account-withdrawal-system)
6. [Q7. Car Mileage Rating System](#q7-car-mileage-rating-system)
7. [Q8. Student Grade and Result Calculation](#q8-student-grade-and-result-calculation)
8. [Q9. Filter High Salary Employees from Array](#q9-filter-high-salary-employees-from-array)
9. [Q10. Count Low Stock Products](#q10-count-low-stock-products)
10. [Q11. Product Price Calculation with Constructors](#q11-product-price-calculation-with-constructors)
11. [Q12. Employee Net Salary and Salary Comparison](#q12-employee-net-salary-and-salary-comparison)
12. [Q13. Bank Account Fraud Detection System](#q13-bank-account-fraud-detection-system)
13. [Q14. Loan Applicant Eligibility System](#q14-loan-applicant-eligibility-system)
14. [Q15. Vehicle Emission Test Check](#q15-vehicle-emission-test-check)
15. [Q16. Employee Management System with Menu](#q16-employee-management-system-with-menu)
16. [Q17. Product Stock & Billing System with Menu](#q17-product-stock--billing-system-with-menu)
17. [Q18. Student Attendance & Grading System with Menu](#q18-student-attendance--grading-system-with-menu)
18. [Q19. Delivery Order Management System with Menu](#q19-delivery-order-management-system-with-menu)
19. [Q20. Franchise Performance and Incentive System with Menu](#q20-franchise-performance-and-incentive-system-with-menu)


## Q1. Student Class with Parameterized Constructor

**Problem Statement:**  
Create a `Student` class with fields: `name`, `marks`. Use a parameterized constructor to initialize both fields. Write a method `checkResult()` that prints `"Pass"` if `marks ≥ 35`, otherwise `"Fail"`. Create 3 student objects and print their results.

**Concepts Used:**  
- ✔ Parameterized constructor  
- ✔ If–else logic  

**Explanation:**  
The constructor sets the student’s name and marks. Then apply a simple logical condition (`≥ 35`).

```java
class Student 
{
	private String name;
	private int marks;
	
	//Parameterized constructor
	Student(String name, int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	//If–else logic
	void checkResult()
	{
		if(marks >= 35)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}

public class Q1
{
	public static void main(String x[])
	{
		Student s1 = new Student("Dhruv",25);
		Student s2 = new Student("Shri", 94);
		Student s3 = new Student("Mayur", 69);
		s1.checkResult();
		s2.checkResult();
		s3.checkResult();
	}
}
```

## Q3. Check Even or Odd using Constructor

**Problem Statement:**  
Make a `NumberCheck` class with one field `num`, initialized by a constructor. Write a method `checkEvenOdd()` that prints whether the number is `Even` or `Odd`.

**Concepts Used:**  
- ✔ Constructor  
- ✔ Logical `%` (modulus) operator  

**Explanation:**  
Use `num % 2 == 0` to check even; else odd.

```java
class NumberCheck
{
	private int num;
	NumberCheck(int num)
	{
		this.num=num;
	}
	
	String checkEvenOdd()
	{
		if(num % 2 == 0)
			return "Even";
		else
			return "Odd";
	}
}

public class Q3
{
	public static void main(String x[])
	{
		NumberCheck nc1 = new NumberCheck(12);
		NumberCheck nc2 = new NumberCheck(31);
		
		System.out.println(nc1.checkEvenOdd());
		System.out.println(nc2.checkEvenOdd());
	}
}
```

## Q4. Salary Validation in Employee Class

**Problem Statement:**  
Create an `Employee` class with fields `name` and `salary`, initialized with a constructor. Write a method `validateSalary()` that checks: Salary must be between 10,000 and 1,00,000 (inclusive).  
If valid → Print `"Valid salary"`  
Else → Print `"Invalid salary"`

**Concepts Used:**  
- ✔ Constructor  
- ✔ Logical AND operator (`&&`)

```java
class Employee
{
	private String name;
	private int salary;
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	String validateSalary()
	{
		if(salary >=10000 && salary <=100000)
			return name +": Valid salary";
		else
			return name +": Invalid salary";
	}
}

public class Q4
{
	public static void main(String x[])
	{
		Employee e1 = new Employee("Virat",9000);
		Employee e2 = new Employee("Dhoni",49999);
		
		System.out.println(e1.validateSalary());
		System.out.println(e2.validateSalary());
	}
}
```

## Q5. Box Volume Validation

**Problem Statement:**  
Create a `Box` class with fields `length`, `width`, `height`. Initialize them with a constructor. Write a method `isValidVolume()` that checks volume:  
If `volume > 0` → Print `"Valid box"`  
Else → Print `"Invalid dimensions"`

**Concepts Used:**  
- ✔ Constructor  
- ✔ Logical condition (`volume > 0`)  
- ✔ Multiplication operation  

**Explanation:**  
A box is valid only if all dimensions are positive, so the volume remains `> 0`.

```java
class Box
{
	private int length;
	private int width;
	private int height;
	Box(int length,int width,int height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
	
	String isValidVolume()
	{
		double volume = length*width*height;
		
		if(volume > 0)
			return "Valid box";
		else 
			return "Invalid dimensions";
	}
}

public class Q5
{
	public static void main(String x[])
	{
		Box b1 = new Box(12,5,4);
		Box b2 = new Box(5,-5,7);
		
		System.out.println(b1.isValidVolume());
		System.out.println(b2.isValidVolume());
	}
}
```

## Q6. Bank Account Withdrawal System

**Problem Statement:**  
Create a `BankAccount` class with: `accountNumber`, `name`, `balance`. Initialize these using a parameterized constructor. Create a method `withdraw(int amount)` that checks:  
- `amount` must be greater than 0  
- `amount` must be `<= balance`  
- After withdrawal, update balance  
- If invalid → print message accordingly

**Explanation:**  
You must apply multiple logical checks together.

```java
class BankAccount
{
	private int accountNumber;
	private String name;
	private int balance;
	BankAccount(int accountNumber,String name,int balance)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
	}
	
	void withdraw(int amount)
	{
		if(amount > 0 && amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Balance: "+balance);
		}
		else 
		{
			System.out.println("Invalid amount");
		}
	}
}

public class Q6
{
	public static void main(String x[])
	{
		BankAccount b1 = new BankAccount(1,"Dhurv",500);
		BankAccount b2 = new BankAccount(2,"Gj",400);
		b1.withdraw(45);
		b2.withdraw(-0);
	}
}
```

## Q7. Car Mileage Rating System

**Problem Statement:**  
Create a `Car` class with `brand` and `mileage`. Use a constructor to set values. Write a method `getMileageRating()`:  
- `mileage < 10` → `"Poor"`  
- `10` to `15` → `"Average"`  
- `15` to `20` → `"Good"`  
- `> 20` → `"Excellent"`

**Explanation:**  
Use nested `if-else` or `else-if` ladder inside a class method.

```java
class Car
{
	private String brand;
	private int mileage;
	Car(String brand,int mileage)
	{
		this.brand=brand;
		this.mileage=mileage;
	}
	
	void getMileageRating()
	{
		if(mileage < 10)
			System.out.println(brand+": Poor");
		else if(mileage >= 10 && mileage <=15)
			System.out.println(brand+": Average");
		else if(mileage >= 15 && mileage <=20)
			System.out.println(brand+": Good");
		else
			System.out.println(brand+": Excellent");
		
	}
}

public class Q7
{
	public static void main(String x[])
	{
		Car c1 = new Car("BMW",15);
		Car c2 = new Car("TATA",40);
		Car c3 = new Car("BUGAATI",9);
		
		c1.getMileageRating();
		c2.getMileageRating();
		c3.getMileageRating();
	}
}
```

## Q8. Student Grade and Result Calculation

**Problem Statement:**  
Create a `Student` class with 3 subject marks: `m1`, `m2`, `m3` (initialize via constructor).  
Write a method `calculateResult()`:  
- `Total = m1 + m2 + m3`  
- `Percentage = total / 3`  
- If any subject `< 35` → print `"Fail"`  
- Else print Percentage and Grade:  
  - `≥ 75` → Distinction  
  - `≥ 60` → First Class  
  - `≥ 50` → Second Class  
  - Else → Pass

**Explanation:**  
This requires combined logic: OR logic for fail, else-if ladder for grading, and arithmetic + constructor initialization.

```java
class Student
{
	private int m1, m2, m3;
	Student(int m1, int m2, int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	void calculateResult()
	{
		int total = m1+m2+m3;
		float p = (float)total / 3;
		
		System.out.printf("Percentage: %.2f\t", p);
		
		if(m1 < 35 || m2 < 35 || m3 < 35)
			System.out.print("Fail");
		else if(p >= 75)
			System.out.println("Grade: Distinction");
		else if(p >= 60)
			System.out.println("Grade: First Class");
		else if(p >= 50)
			System.out.println("Grade: Second Class");
		else 
			System.out.println("Grade: Pass");
	}
}

public class Q8
{
	public static void main(String x[])
	{
		Student s1 = new Student(60,48,88);
		Student s2 = new Student(30,58,44);
		
		s1.calculateResult();
		s2.calculateResult();
	}
}
```

## Q9. Filter High Salary Employees from Array

**Problem Statement:**  
Create an `Employee` class with: `empId`, `name`, `salary`. Use constructor to initialize values. Create an array of 10 employees. Write a method `filterHighSalary()` that prints only those employees whose `salary > 30000`.

**Concepts Used:**  
- ✔ Array of objects  
- ✔ Constructor for object initialization  
- ✔ Logical operator (`salary > 30000`)

**Explanation:**  
Constructor loads employee data. Using loops and logical conditions, filter and display selected employees.

```java
import java.util.*;
class Employee
{
	private int empId;
	private String name;
	private int salary;
	
	Employee(int empId,String name,int salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	int getId()
	{
		return empId;
	}
	String getName()
	{
		return name;
	}
	int getSalary()
	{
		return salary;
	}
	
}

class Display
{
	Employee e[];
	void filterHighSalary(Employee e[])
	{
		System.out.println();
		for(int i=0; i<e.length; i++)
		{
			if(e[i].getSalary() > 30000)
				System.out.println(e[i].getId()+"\t"+e[i].getName());
		}
			
	}
}


public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Display d = new Display();
		Employee e[] = new Employee[3];
		for(int i=0; i<e.length; i++)
		{
			System.out.print("enter the employee id: ");
			int empId =  sc.nextInt();
			System.out.print("enter the employee name: ");
			String name = sc.next();
			System.out.print("enter the employee salary: ");
			int salary = sc.nextInt();
			System.out.print("\n");
				
			e[i]=new Employee(empId,name,salary);
		}
		
		d.filterHighSalary(e);
	}
}
```

## Q10. Count Low Stock Products

**Problem Statement:**  
Create a `Product` class with: `productName`, `stock`. Use a constructor to set values. Create an array of 15 products. Write a method to count how many products have `stock < 10`.

**Concepts Used:**  
- ✔ Constructor  
- ✔ Array of objects  
- ✔ Logical condition (`stock < 10`)  
- ✔ Counter variable  

**Explanation:**  
Loop through array, apply condition, increment count.

```java
import java.util.*;
class Product
{
	private String productName;
	private int stock;
	int count = 0;
	 
	Product(String productName,int stock)
	{
		this.productName=productName;
		this.stock=stock;	 
	}
	
	String getProductName()
	{
		return productName;
	}
	int getStock()
	{
		return stock;
	}
	
}

class ProductDisplay
{
	void display(Product p[])
	{
		int count = 0;
		for(int i=0; i<p.length; i++)
		{
			if(p[i].getStock() < 10)
				count++;
		}
	
		System.out.print("Count many products have stock < 10: "+count);
	}
}

public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[5];
		ProductDisplay pd = new ProductDisplay();
		for(int i=0; i<p.length; i++)
		{
			System.out.print("enter the product name: ");
			String pn = sc.next();
			System.out.print("enter the product stock: ");
			int stock = sc.nextInt();
			System.out.print("\n");
			
			p[i] = new Product(pn,stock);
		}
		
		pd.display(p);
	}
}
```

## Q11. Product Price Calculation with Constructors

**Problem Statement:**  
Create a class `Product` with:  
- **Fields:** `productId`, `name`, `price`, `category`  
- **Constructors:**  
  - Default constructor (assign temporary values)  
  - Parameterized constructor (assign all fields)  
- **Task Logic:** Write a method `getFinalPrice()` that applies:  
  - If `category` = `"Electronics"` → 18% GST + 10% discount  
  - If `category` = `"Clothing"` → 5% GST + 20% discount  
  - Otherwise → only 5% GST  
Create 3 objects using all three constructors and find the final price for each.

**Expected Learning:**  
Constructor chaining + conditional logic.

```java
import java.util.*;
class Product
{
	private int productId;
	private String name;
	private int price;
	private String category;
	Product()
	{
		productId=12;
		name="dh";
		price=45;
		category="Clothing";
	}
	
	Product(int productId,String name,int price,String category)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.category=category;
	}
	
	void getFinalPrice()
	{
		if(category.equals("Electronics"))
		{
			double gst = price*18/100;
			double dis = price*10/100; 
			double finalprice = price + gst - dis;
			System.out.println("Final Price: "+finalprice);
		}
		else if(category.equals("Clothing"))
		{
			double gst = price*5/100;
			double dis = price*20/100; 
			double finalprice = price + gst - dis;
			System.out.println("Final Price: "+finalprice);
		}
		else
		{
			double gst = price*5/100;
			double finalprice = price + gst;
			System.out.println("Final Price: "+finalprice);
		}
		
	}
}

public class Q11
{
	public static void main(String x[])
	{
		Product p1 = new Product();
		Product p2 = new Product(1,"Dhruv",400,"Electronics");
		Product p3 = new Product(2,"Shri",100,"Clothing");
		
		p1.getFinalPrice();
		p2.getFinalPrice();
		p3.getFinalPrice();
	}
}
```

## Q12. Employee Net Salary and Salary Comparison

**Problem Statement:**  
Create a class `Employee` with:  
- **Fields:** `id`, `name`, `basicSalary`, `isPermanent`  
- Parameterized constructor to initialize fields.  
- **Write methods:**  
  - `calculateNetSalary()`:  
    - If permanent → HRA = 20%, DA = 10%, PF = 12%  
    - If temporary → HRA = 10%, DA = 5%, PF = 0  
  - `compareSalary(Employee e)` → return higher salary employee name.  
**Task Logic:** Create 3 `Employee` objects. Compare each pair using logic (nested comparison).

**Expected Learning:**  
Complex if-else + constructor initialization + inter-object comparison.

```java
class Employee
{
	private int id;
	private String name;
	private int basicSalary;
	private String isPermanent;
	
	Employee(int id,String name,int basicSalary,String isPermanent)
	{
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
		this.isPermanent=isPermanent;
	}
	
	String getName()
	{
		return name;
	}
	
	
	double calculateNetSalary()
	{
		double hra, da, pf;

		if(isPermanent.equals("permanent"))
		{
			hra = 0.20 * basicSalary;
            da  = 0.10 * basicSalary;
            pf  = 0.12 * basicSalary;
		}
		else
		{
			hra = 0.10 * basicSalary;
            da  = 0.05 * basicSalary;
            pf  = 0.0;
		}
		
	return basicSalary + hra + da - pf;
		
	}
	
	String compareSalary(Employee e)
	{
		if(this.calculateNetSalary() > e.calculateNetSalary())
			return this.name;
		else
			return e.name;
	}
}

public class Q12
{
	public static void main(String x[])
	{
		
		Employee e1 = new Employee(1,"dhruv",1000,"permanent");
		Employee e2 = new Employee(2,"shri",100,"temporary");
		Employee e3 = new Employee(3,"Ganesh",400,"permanent");
		
		
		double res1 = e1.calculateNetSalary();
		System.out.println("Employee 1: "+res1);
		double res2 = e2.calculateNetSalary();
		System.out.println("Employee 2: "+res2);
		double res3 = e3.calculateNetSalary();
		System.out.println("Employee 3: "+res3);
		
		System.out.print("\n");
		
		System.out.println("Between e1 & e2: " + e1.compareSalary(e2) + " has higher salary");
        System.out.println("Between e2 & e3: " + e2.compareSalary(e3) + " has higher salary");
        System.out.println("Between e1 & e3: " + e1.compareSalary(e3) + " has higher salary");
		
		//String msg = (e1.compareSalary(e2))? "EMP1":
	}
}
```

## Q13. Bank Account Fraud Detection System

**Problem Statement:**  
Create a `BankAccount` class with: `accountNumber`, `holderName`, `balance`, `lastTransactionAmount`. Parameterized constructor.  
**Logic Method `isFraudAlert()`:** Return `true` when ANY condition matches:  
- `lastTransactionAmount` > 50% of balance  
- `lastTransactionAmount` > 50,000  
- More than 3 transactions above ₹10,000 in a row (use an `int` counter passed to constructor)  
- Balance suddenly dropped by more than 40% (use `previousBalance` passed to constructor)  
**Task:** Create objects with different values. Check fraud alert result.

**Expected Learning:**  
Complex logical combinations (`&&`, `||`), constructor usage, real-world reasoning.

```java
class BankAccount
{
    private int accountNumber;
    private String holderName;
    private double balance;
    private double lastTransactionAmount;
    private int highValueTxnCount;      // > 10000 counter
    private double previousBalance;

    BankAccount(int accountNumber, String holderName, double balance,double lastTransactionAmount, 
					 int highValueTxnCount, double previousBalance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.lastTransactionAmount = lastTransactionAmount;
        this.highValueTxnCount = highValueTxnCount;
        this.previousBalance = previousBalance;
    }

    boolean isFraudAlert()
    {
        if (lastTransactionAmount > balance * 0.5)
            return true;

        if (lastTransactionAmount > 50000)
            return true;

        if (highValueTxnCount > 3)
            return true;

        if ((previousBalance - balance) > previousBalance * 0.4)
            return true;

        return false;
    }
}

public class Q13
{
    public static void main(String[] args)
    {
        BankAccount ba1 = new BankAccount(12, "Dhruv", 60000, 35000, 2, 100000);

        BankAccount ba2 = new BankAccount(74, "Shri", 20000, 12000, 4, 35000);

        BankAccount ba3 = new BankAccount(69, "Ganesh", 30000, 8000, 1, 60000);

        System.out.println("BA1 Fraud Alert: " + ba1.isFraudAlert());
        System.out.println("BA2 Fraud Alert: " + ba2.isFraudAlert());
        System.out.println("BA3 Fraud Alert: " + ba3.isFraudAlert());
    }
}
```

## Q14. Loan Applicant Eligibility System

**Problem Statement:**  
Create a class `LoanApplicant` with:  
- **Fields:** `name`, `age`, `annualIncome`, `creditScore`, `existingLoans`  
- **Constructor:** Initialize all fields.  
- **Logic Method `isEligible()`:** Return `true` only if all the following conditions match:  
  - `age` between 21 and 55  
  - `annualIncome` ≥ 3,50,000  
  - `creditScore` ≥ 700  
  - `existingLoans` < 3  
  - Special rules:  
    - If `creditScore` is between 650–699 → income must be ≥ 5,00,000  
    - If `existingLoans` = 2 → creditScore must be ≥ 750  
**Task:** Create 3 applicants and check eligibility for each.

**Focus:**  
Compound conditions + nested logic + constructor handling.

```java
class LoanApplicant
{
	private String name;
	private int age;
	private int annualIncome;
	private int creditScore;
	private int existingLoans;
	
	LoanApplicant(String name,int age,int annualIncome,int creditScore,int existingLoans)
	{
		this.name=name;
		this.age=age;
		this.annualIncome=annualIncome;
		this.creditScore=creditScore;
		this.existingLoans=existingLoans;
	}
	
	boolean isEligible()
	{
		 // Basic conditions
        if(age < 21 || age > 55)
            return false;

        if(existingLoans >= 3)
            return false;
		
		// Special case loan rule
        if(existingLoans == 2 && creditScore < 750)
            return false;
		
		 // Credit score ruless
        if(creditScore >= 700)
        {
            if(annualIncome >= 350000)
                return true;
            else
                return false;
        }
        else if(creditScore >= 650 && creditScore <= 699)
        {
            if(annualIncome >= 500000)
                return true;
            else
                return false;
        }
        else
        {
            return false;
        }
    
	}
}

public class Q14
{
	public static void main(String x[])
	{
		LoanApplicant l1 = new LoanApplicant("Dhruv",22,450000,799,2);
		LoanApplicant l2 = new LoanApplicant("Shri",32,600000,749,3);
		LoanApplicant l3 = new LoanApplicant("Ganesh",20,450000,700,5);
		
		System.out.println("Applicant 1: "+l1.isEligible());
		System.out.println("Applicant 2: "+l2.isEligible());
		System.out.println("Applicant 3: "+l3.isEligible());
	}
}
```

## Q15. Vehicle Emission Test Check

**Problem Statement:**  
Create a class `Vehicle` with:  
- **Fields:** `regNo`, `vehicleType`, `emissionLevel`, `fuelType`, `lastServiceKm`  
- **Constructor:** Assign all fields.  
- **Logic Method `needsEmissionTest()`:** Return `true` when ANY condition is true:  
  - `emissionLevel > 75`  
  - `vehicleType` = `"Diesel"` AND `emissionLevel > 60`  
  - `fuelType` = `"Petrol"` AND `lastServiceKm > 5000`  
  - `vehicleType` = `"Electric"` → ALWAYS return `false` (exclusion rule)  
  - If `emissionLevel` between 55–75 AND `service > 8000` → return `true`  
**Task:** Create multiple `Vehicle` objects and test emission status.

**Focus:**  
Logical combinations (`&&`, `||`) + constructor initialization + exclusion case.

```java
class Vehicle
{
	private int regNo;
	private String vehicleType;
	private int emissionLevel;
	private String fuelType;
	private int lastServiceKm;
	
	Vehicle(int regNo,String vehicleType,int emissionLevel,String fuelType,int lastServiceKm)
	{
		this.regNo=regNo;
		this.vehicleType=vehicleType;
		this.emissionLevel=emissionLevel;
		this.fuelType=fuelType;
		this.lastServiceKm=lastServiceKm;
	}
	
	boolean needsEmissionTest()
	{
		if(vehicleType.equals("Electric"))
			return false;
		
		if(emissionLevel > 75)
			return true;
		
		if(vehicleType.equals("Diesel") && emissionLevel > 60)
			return true;
		
		if(fuelType.equals("Petrol") && lastServiceKm > 5000)
			return true;
		
		if((emissionLevel>=55 && emissionLevel<=75) && lastServiceKm > 8000)
			return true;
	
		return false;
	}
}

public class Q15
{
	public static void main(String x[])
	{
		Vehicle v1 = new Vehicle(1, "Diesel", 78, "Petrol", 6000);
		Vehicle v2 = new Vehicle(2, "Electric", 48, "Petrol", 4000);
		Vehicle v3 = new Vehicle(3, "Diesel", 98, "Petrol", 7000);
		
		System.out.println("Vehicle 1: "+v1.needsEmissionTest());
		System.out.println("Vehicle 2: "+v2.needsEmissionTest());
		System.out.println("Vehicle 3: "+v3.needsEmissionTest());
	}
}
```

## Q16. Employee Management System with Menu

**Problem Statement:**  
Create an `Employee` class with a constructor to initialize: `empId`, `empName`, `basicSalary`, `department`.

**Menu Options:**  
1. Add employee  
2. Calculate Net Salary using formula:  
   - HRA = 20%, DA = 15%, PF = 12% deduction  
   - Bonus (apply logic): IT dept → 10%, HR dept → 7%, Others → 5%  
3. Display employees  
4. Display highest net salary employee  
5. Exit

```java
import java.util.*;

class Employee
{
    private int empId;
    private String empName;
    private double basicSalary;
    private String department;
    private double netSalary;

    Employee(int empId, String empName, double basicSalary, String department)
    {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.department = department;
    }

    void calculateSalary()
    {
        double hra = basicSalary * 0.20;
        double da  = basicSalary * 0.15;
        double pf  = basicSalary * 0.12;

        double salary = basicSalary + hra + da - pf;
        double bonus;

        if(department.equalsIgnoreCase("IT"))
            bonus = salary * 0.10;
        else if(department.equalsIgnoreCase("HR"))
            bonus = salary * 0.07;
        else
            bonus = salary * 0.05;

        netSalary = salary + bonus;
    }

    double getNetSalary()
    {
        return netSalary;
    }

    void display()
    {
        System.out.println(empId + "\t" + empName + "\t" + netSalary + "\t" + department);
    }
}

public class Q16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Employee emp[] = new Employee[5];
        int count = 0;
        char ch;

        do
        {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Calculate Net Salary");
            System.out.println("3. Display Employees");
            System.out.println("4. Display Highest Net Salary Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Basic Salary: ");
                    double sal = sc.nextDouble();
                    System.out.print("Enter Department: ");
                    String dept = sc.next();

                    emp[count++] = new Employee(id, name, sal, dept);
                    break;

                case 2:
                    for(int i=0; i<count; i++)
                        emp[i].calculateSalary();
                    System.out.println("Salary calculated for all employees");
                    break;

                case 3:
                    System.out.println("ID\tName\tNetSalary\tDept");
                    for(int i=0; i<count; i++)
                        emp[i].display();
                    break;

                case 4:
                    int maxIndex = 0;
                    for(int i=1; i<count; i++)
                    {
                        if(emp[i].getNetSalary() > emp[maxIndex].getNetSalary())
                            maxIndex = i;
                    }
                    System.out.println("Highest Salary Employee:");
                    emp[maxIndex].display();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }

            System.out.print("Do you want to continue (y/n): ");
            ch = sc.next().charAt(0);

        } while(ch=='y' || ch=='Y');
    }
}
```

## Q17. Product Stock & Billing System with Menu

**Problem Statement:**  
Create a `Product` class with constructor arguments: `productId`, `name`, `price`, `quantity`.

**Menu Options:**  
1. Add product  
2. Update stock quantity  
3. Sort products according to price (high → low)  
4. Show “Low Stock Products” (quantity < 5)  
5. Generate bill when a customer buys items  
6. Exit  

**Notes:**  
Sorting must be done manually using loops (Bubble/Selection sort). Billing must reduce quantity and calculate total amount. Use logical operators to check: `if (quantity > 0 && buyQty <= quantity)` to prevent negative stock.

```java
import java.util.*;
class Product
{
	Scanner sc = new Scanner(System.in);
	private int productId;
	private String name;
	private int price;
	private int quantity;
	Product(int productId,String name,int price,int quantity)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	int getPId()
	{
		return productId;
	}
	
	int getPrice()
	{
		return price;
	}
	
	int getQuantity()
	{
		return quantity;
	}
	
	void AddQuantity(int qty)
	{
		quantity += qty;
	}
	
	boolean SellQuantity(int BuyQty)
	{
		if(quantity > 0 && BuyQty <= quantity)
		{
			 quantity -= BuyQty;
			return true;
		}
		return false;
	}
	
	
	void display()
	{
		System.out.println(productId+"\t"+name+"\t"+price+"\t"+quantity);
	}
	
}

public class Q17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[5];
		int count=0;
		char ch;
		
		do
		{
			System.out.println("1. Add product");
			System.out.println("2. Update stock quantity");
			System.out.println("3. Sort products according to price (high → low)");
			System.out.println("4. Show “Low Stock Products” (quantity < 5)");
			System.out.println("5. Generate bill when a customer buys items");
			System.out.println("6. Exit");
			
			System.out.print("enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("enter productId: ");
					int productId = sc.nextInt();
					System.out.print("enter name: ");
					String name = sc.next();
					System.out.print("enter price: ");
					int price = sc.nextInt();
					System.out.print("enter quantity: ");
					int quantity = sc.nextInt();
				
					p[count++] = new Product(productId,name,price,quantity);
					break;
				
				case 2:
					System.out.print("enter product id: ");
					int id = sc.nextInt();
					System.out.print("enter quantity to add: ");
					int qty = sc.nextInt();
					boolean found = false;
					for(int i=0; i<count; i++)
					{
						if(p[i].getPId() == id)
						{
							p[i].AddQuantity(qty);
							found=true;
							System.out.print("Quatity Updated...");
							break;
						}
					}
					if(!found)
						System.out.println("Id Not Found");
						
					break;
						
				case 3:
					for(int i=0; i<count; i++)
					{
						for(int j=i+1; j<count; j++)
						{
							if(p[i].getPrice() < p[j].getPrice())
							{
								Product temp = p[i];
								p[i] = p[j];
								p[j] = temp;
							}
						}
					}
					System.out.println("After Sort");
					for(int i=0; i<count; i++)
					p[i].display();
					break;
					
				case 4:
					System.out.println("Low Stock Products:");
					for(int i=0; i<count; i++)
					{
						if(p[i].getQuantity() < 5)
						{
							p[i].display();
						}
					}
					break;
					
				case 5:
						System.out.print("enter the Product id: ");
						id = sc.nextInt();
						System.out.print("enter the buy Quantity: ");
						int BuyQty = sc.nextInt();
						
						found=false;
						for(int i=0; i<count; i++)
						{
							if(p[i].getPId() == id)
							{
								found=true;
								if(p[i].SellQuantity(BuyQty))
								{
									int bill = BuyQty * p[i].getPrice();
									System.out.println("Total Bill: "+bill);
									break;
								}
								else
								{
									System.out.println("Insufficient Quantity...");
								}
								break;
							}
						}
						
						if(!found)
							System.out.println("Product id does not found");
						break;
				
				case 6:
					System.exit(0);
					
				default:
					System.out.println("Invalid Choice!");
			}
			
			System.out.print("Do you want to continue (y/n): ");
			ch = sc.next().charAt(0);
		
		}while(ch=='Y' || ch=='y');
	}
}
```

## Q18. Student Attendance & Grading System with Menu

**Problem Statement:**  
Create a `Student` class with constructor: `roll`, `name`, `attendance` (out of 100), `marks` of 5 subjects.

**Menu Options:**  
1. Add student  
2. Calculate final result: `Avg ≥ 60` AND `attendance ≥ 75` → Pass, Else → Fail  
3. Display students with “Short Attendance” (`attendance < 60`)  
4. Highest and lowest scoring student  
5. Show student rank list (sort by average)  
6. Exit

```java
import java.util.*;
class Student
{
	private int rno;
	private String name;
	private int attendance;
	private int[] marks;
	Student(int rno, String name, int attendance, int[] marks)
	{
		this.rno=rno;
		this.name=name;
		this.attendance=attendance;
		this.marks=marks;
	}
	
	int getRNO()
	{
		return rno;
	}
	int getAttendance()
	{
		return attendance;
	}
	
	int getTotalMarks()
    {
        int total = 0;
        for(int i=0; i<marks.length; i++)
            total += marks[i];
        return total;
    }

	int getAverage()
    {
        return getTotalMarks() / marks.length;
    }
	
	void display()
	{
		System.out.println("Roll No: "+rno+"\t"+"  Name: "+name+"\t"+"  Attendance: "+attendance+"\t"+"  Average: "+getAverage());
	}
}

public class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[2];
		int count=0;
		char ch;
		
		do
		{
			System.out.println("1. Add student");
			System.out.println("2. Calculate final result");
			System.out.println("3. Display students with Short Attendance (attendance < 60)");
			System.out.println("4. Highest and lowest scoring student");
			System.out.println("5. Show student rank list (sort by average)");
			System.out.println("6. Exit");
			
			System.out.println("enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					if(count == s.length)
					{
						System.out.println("Student list is full!");
						break;
					}
					System.out.print("enter roll no: ");
					int rno = sc.nextInt();
					System.out.print("enter name: ");
					String name = sc.next();
					System.out.print("enter attendance (out of 100): ");
					int attendance = sc.nextInt();
					System.out.print("enter the marks of 5 subjects: ");
					int marks[] = new int[5];
					for(int j=0; j<marks.length; j++)
					{
						marks[j]=sc.nextInt();
					}
				s[count++] = new Student(rno,name,attendance,marks);
				break;
				
				case 2:
					System.out.println("Final Result:");
                    for(int i=0; i<count; i++)
                    {
                        int avg = s[i].getAverage();

                        if(avg >= 60 && s[i].getAttendance() >= 75)
                            System.out.println("Roll No: "+s[i].getRNO()+"  Average: "+avg+"  Result: Pass");

                        else
                            System.out.println("Roll No: "+s[i].getRNO()+"  Average: "+avg+"  Result: Fail");                   
                    }
                    break;
					
				case 3:
					System.out.println("Display Student with Short Attendance:");
					for(int i=0; i<count; i++)
					{
						if(s[i].getAttendance() < 60)
							s[i].display();
					}
					break;
					
				case 4:
					if(count == 0)
                    {
                        System.out.println("No students available.");
                        break;
                    }

                    Student high = s[0];
                    Student low  = s[0];

                    for(int i=1; i<count; i++)
                    {
                        if(s[i].getAverage() > high.getAverage())
                            high = s[i];
                        if(s[i].getAverage() < low.getAverage())
                            low = s[i];
                    }

                    System.out.println("Highest Scoring Student:");
                    high.display();

                    System.out.println("Lowest Scoring Student:");
                    low.display();
                    break;
					
				case 5:
					System.out.println("Display Student Rank List (sort by average):");
					
					for(int i=0; i<count; i++)
                    {
                        for(int j=i+1; j<count; j++)
                        {
                            if(s[i].getAverage() < s[j].getAverage())
                            {
                                Student temp = s[i];
                                s[i] = s[j];
                                s[j] = temp;
                            }
                        }
                    }
					
					System.out.println("Rank List:");
                    for(int i=0; i<count; i++)
                        s[i].display();
                    break;
				
				case 6:
					System.exit(0);
					
				default:
					System.out.println("Invalid choice!!!");	
			}
				
			System.out.print("Do you want to continue(y/n): ");
			ch = sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
	}
}
```

## Q19. Delivery Order Management System with Menu

**Problem Statement:**  
Create a `DeliveryOrder` class with constructor: `orderId`, `customerName`, `distanceInKm`, `timeSlot` (Morning, Afternoon, Night).

**Menu Options:**  
1. Add delivery order  
2. Calculate delivery charges:  
   - Base charge = ₹50  
   - Distance charge = ₹10 per km  
   - Time slot charges: Night → additional ₹40, Morning / Afternoon → ₹0  
3. Show “Priority Orders” (`distance > 15 km` OR `timeSlot = Night`)  
4. Display order with highest delivery charge  
5. Sort orders by distance (high → low)  
6. Exit

```java
import java.util.*;
class DeliveryOrder
{
	private int orderId;
	private String customerName;
	private int distanceInKm;
	private String timeSlot;
	DeliveryOrder(int orderId,String customerName,int distanceInKm,String timeSlot)
	{
		this.orderId=orderId;
		this.customerName=customerName;
		this.distanceInKm=distanceInKm;
		this.timeSlot=timeSlot;
	}
	int getOrderId()
	{
		return orderId;
	}
	String getTimeSlot()
	{
		return timeSlot;
	}
	int getDistance()
	{
		return distanceInKm;
	}
	
	void display()
	{
		System.out.println("OrderId: "+orderId+"\t"+"CustomerName: "+customerName+"\t"+"DistanceInKm: "+distanceInKm+"\t"+"TimeSlot: "+timeSlot+"\t"+"Charge: "+calulateCharge());
	}
	
	int calulateCharge()
	{
		int total=0;
		if(getTimeSlot().equalsIgnoreCase("night"))
		return total = 50 + getDistance()*10+40;
		else
		return total = 50 + getDistance()*10;	
	}
	
}
public class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		DeliveryOrder d[] = new DeliveryOrder[5];
		char ch;
		int count=0;
		
		do
		{
			System.out.println("1. Add delivery order");
			System.out.println("2. Calculate delivery charges");
			System.out.println("3. Show Priority Orders (distance > 15 km OR timeSlot = Night)");
			System.out.println("4. Display order with highest delivery charge");
			System.out.println("5. Sort orders by distance (high → low)");
			System.out.println("6. Exit");
			
			System.out.print("enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("enter the orderId: ");
					int orderId = sc.nextInt();
					System.out.print("enter the customerName: ");
					String customerName = sc.next();
					System.out.print("enter distanceInKm: ");
					int distanceInKm = sc.nextInt();
					System.out.print("enter the timeSlot: ");
					String timeSlot = sc.next();
					d[count++] = new DeliveryOrder(orderId,customerName,distanceInKm,timeSlot);
					break;
				
				case 2:
					for(int i=0; i<count; i++)
					{
						d[i].calulateCharge();
						d[i].display();
					}
					break;
				
				case 3:
					for(int i=0; i<count; i++)
					{
						if(d[i].getDistance() > 15 || d[i].getTimeSlot().equalsIgnoreCase("night"))
						d[i].display();
					}
					break;
					
				case 4:
					int index = 0;

					for(int i=1; i<count; i++)
					{
						if(d[i].calulateCharge() > d[index].calulateCharge())
						{
							index = i;
						}
					}

					d[index].display();
					break;
					
				case 5:
					for(int i=0; i<count; i++)
					{
						for(int j=i+1; j<count; j++)
						{
							if(d[i].getDistance() < d[j].getDistance())
							{
								DeliveryOrder temp = d[i];
								d[i] = d[j];
								d[j] = temp;
							}
						}
					}
					for(int i=0; i<count; i++)
						d[i].display();
					break;
					
				case 6:
					System.exit(0);
					
				default:
					System.out.print("Invalid Choice!");
			}
			
			System.out.print("Do you want to continue(y/n): ");
			ch = sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		
	}
}
```

## Q20. Franchise Performance and Incentive System with Menu

**Problem Statement:**  
Create a `Franchise` class with constructor: `franchiseId`, `ownerName`, `monthlySales`, `city`, `targetSales`.

**Menu Options:**  
1. Register franchise  
2. Calculate monthly incentive:  
   - If `sales ≥ target` → 10% incentive  
   - If `sales ≥ 2 × target` → 25% incentive  
   - If `sales < target` → NO incentive  
3. Display underperforming franchises (`sales < 0.7 × target`)  
4. Find franchise with highest incentive  
5. Display franchises city-wise (filter by a given city)  
6. Exit

```java
import java.util.*;
class Franchise
{
	private int franchiseId;
	private String ownerName;
	private int monthlySales;
	private String city;
	private int targetSales;
	Franchise(int franchiseId,String ownerName,int monthlySales,String city,int targetSales)
	{
		this.franchiseId=franchiseId;
		this.ownerName=ownerName;
		this.monthlySales=monthlySales;
		this.city=city;
		this.targetSales=targetSales;
	}
	
	int getMS()
	{
		return monthlySales;
	}
	
	String getCity()
	{
		return city;
	}
	int getTS()
	{
		return targetSales;
	}
	
	double calculateIncentives()
	{
		double incentive = 0;
		if(getMS() >= getTS())
			return getMS()*0.10;
		else if(getMS() >= 2*getTS())
			return getMS()*0.25;
		else
			return incentive;
	}
	
	void display()
	{
		System.out.println("FranchiseID: "+franchiseId+"\t"+"Owner: "+ownerName+"\t"+"MonthlySales: "+monthlySales+"\t"+"City: "+city+"\t"+"TargetSales: "+targetSales+"\t"+"Incentive: "+calculateIncentives());
	}
	
}
public class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Franchise f[] = new Franchise[5];
		int count=0;
		char ch;
		
		do
		{
			System.out.println("1. Register franchise");
			System.out.println("2. Calculate monthly incentive");
			System.out.println("3. Display underperforming franchises (sales < 0.7 × target)");
			System.out.println("4. Find franchise with highest incentive");
			System.out.println("5. Display franchises city-wise (filter by a given city)");
			System.out.println("6. Exit");
			
			System.out.print("enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("enter franchiseId: ");
					int franchiseId = sc.nextInt();
					System.out.print("enter ownerName: ");
					String ownerName = sc.next();
					System.out.print("enter monthlySales: ");
					int monthlySales = sc.nextInt();
					System.out.print("enter city: ");
					String city = sc.next();
					System.out.print("enter targetSales: ");
					int targetSales = sc.nextInt();
					
				f[count++] = new Franchise(franchiseId,ownerName,monthlySales,city,targetSales);
				break;
				
				case 2:
					for(int i=0; i<count; i++)
					{
						f[i].calculateIncentives();
						f[i].display();
					}
				break;
				
				case 3:
					for(int i=0; i<count; i++)
					{
						if(f[i].getMS() < 0.7 * f[i].getTS())
						{
							f[i].display();
						}
					}
				break;
				
				case 4:
					int index=0;
					for(int i=0; i<count; i++)
					{
						if(f[i].calculateIncentives() > f[index].calculateIncentives())
						{
							index=i;
						}
					}
					
					f[index].display();
				break;
				
				case 5:
					System.out.print("enter the city: ");
					city = sc.next();
					for(int i=0; i<count; i++)
					{
						if(f[i].getCity().equalsIgnoreCase(city))
						f[i].display();
					}
				break;
				
				case 6:
					System.exit(0);
					
				default:
					System.out.println("Invalid Choice!");
			}
			
			System.out.print("Do you want to continue(y/n): ");
			ch = sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
	}
}
```
