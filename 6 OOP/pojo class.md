# POJO Class and Object Assignment

## Code Links

1. [Q1. Library Management System with Menu](#q1-library-management-system-with-menu)
2. [Q2. Employee Management System with Menu](#q2-employee-management-system-with-menu)
3. [Q3. Student Performance Analysis](#q3-student-performance-analysis)
4. [Q4. Employee Salary Calculations](#q4-employee-salary-calculations)
5. [Q5. Car Mileage Analysis](#q5-car-mileage-analysis)
6. [Q6. Player Batting Average Analysis](#q6-player-batting-average-analysis)
7. [Q7. Food Billing System with Menu](#q7-food-billing-system-with-menu)
8. [Q8. Multiplication Table Class](#q8-multiplication-table-class)
9. [Q9. Find Maximum using Varargs](#q9-find-maximum-using-varargs)
10. [Q10. Array Sorting using Varargs](#q10-array-sorting-using-varargs)
11. [Q11. Reverse Array using Varargs](#q11-reverse-array-using-varargs)
12. [Q12. Element Search in Array](#q12-element-search-in-array)
13. [Q13. Find Common Elements in Two Arrays](#q13-find-common-elements-in-two-arrays)
14. [Q14. Intersection of Two Arrays](#q14-intersection-of-two-arrays)
15. [Q15. Binary Search in Sorted Array](#q15-binary-search-in-sorted-array)
16. [Q16. Search Pair with Target Sum](#q16-search-pair-with-target-sum)
17. [Q17. Median of Two Sorted Arrays](#q17-median-of-two-sorted-arrays)
18. [Q18. Calculate Power of a Number](#q18-calculate-power-of-a-number)
19. [Q19. Merge Two Sorted Arrays](#q19-merge-two-sorted-arrays)
20. [Q20. Book and Library POJO Class](#q20-book-and-library-pojo-class)
21. [Q21. Vehicle and ShowRoom POJO Class](#q21-vehicle-and-showroom-pojo-class)
22. [Q22. Student and Department POJO Class](#q22-student-and-department-pojo-class)
23. [Q23. Player and Team POJO Class](#q23-player-and-team-pojo-class)
24. [Q24. Product, Customer, and Shop Billing System](#q24-product-customer-and-shop-billing-system)
25. [Q25. Product Search by ID in Array](#q25-product-search-by-id-in-array)
26. [Q26. Sort Books by Price Descending](#q26-sort-books-by-price-descending)
27. [Q27. Find Player with Second Highest Runs](#q27-find-player-with-second-highest-runs)
28. [Q28. Reverse a Number Class](#q28-reverse-a-number-class)
29. [Q29. Perfect Number Check Class](#q29-perfect-number-check-class)
30. [Q30. Armstrong Number Check Class](#q30-armstrong-number-check-class)
31. [Q31. Prime Number Check Class](#q31-prime-number-check-class)
32. [Q32. Duck Number Check Class](#q32-duck-number-check-class)
33. [Q33. Fibonacci Series Class](#q33-fibonacci-series-class)


## Q1. Library Management System with Menu

**Problem Statement:**  
Create a class called `Library` to hold accession number, title of the book, author name, and price of the book. Write a menu-driven program in Java that implements library management with the following options:
1. Add Book Details
2. Display All Book Details
3. Display List of all books of a given author
4. Display title of a specified book
5. Display total count of books in the library
6. Display books in ascending order of accession number
7. Update book details by title of book
8. Delete book details by price
9. Display price range between 100 to 500
10. Exit System

```java
import java.util.*;
class Library
{
	private int accNo;
	private String title;
	private String author;
	private int price;

	public void setAccNo(int accNo)
	{
		this.accNo=accNo;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	
	int getAccNum()
	{
		return accNo;
	}
	String getTitle()
	{
		return title;
	}
	String getAuthor()
	{
		return author;
	}
	int getPrice()
	{
		return price;
	}
}

class DisplayLibrary
{
	Scanner sc = new Scanner(System.in);
	private Library l[];
	public void menu(Library l[])
	{
		this.l=l;
	}
	
	void bookDetail(Library l[])
	{
		
		for(int i=0; i<l.length; i++)
		{
			l[i] = new Library();
			System.out.print("enter the accession number: ");
			int accNo = sc.nextInt();
			System.out.print("enter the title of book: ");
			String title = sc.next();
			System.out.print("enter the author name: ");
			String author = sc.next();
			System.out.print("enter the price: ");
			int price = sc.nextInt();
			System.out.print("\n");
			
			l[i].setAccNo(accNo);
			l[i].setTitle(title);
			l[i].setAuthor(author);
			l[i].setPrice(price);
		}
	}
	
	void disBookDetail(Library l[])
	{
		System.out.println("AccNumber--Title--Author--Price");
		for(int i=0; i<l.length; i++)
		{
			System.out.println(l[i].getAccNum()+"\t"+l[i].getTitle()+"\t"+l[i].getAuthor()+"\t"+l[i].getPrice());
		}
	}
	
	void disBookByAuthor(Library l[])
	{
		System.out.print("enter the author name: ");
		String author = sc.next();
		
		System.out.println("AccNumber--Title--Author--Price");
		for(int i=0; i<l.length; i++)
		{
			if(author.equals(l[i].getAuthor()))
			{
				System.out.println(l[i].getAccNum()+"\t"+l[i].getTitle()+"\t"+l[i].getAuthor()+"\t"+l[i].getPrice());
			}
		}
	}
	
	void disTitleByBook(Library l[])
	{
		System.out.print("enter the book name: ");
		String title = sc.next();
		
		System.out.println("AccNumber--Title--Author--Price");
		for(int i=0; i<l.length; i++)
		{
			if(title.equals(l[i].getTitle()))
			{
				System.out.println(l[i].getAccNum()+"\t"+l[i].getTitle()+"\t"+l[i].getAuthor()+"\t"+l[i].getPrice());
			}
		}
	}
	
	void disCountBook(Library l[])
	{
		System.out.println("Count of Book: "+l.length);
	}
	
	void disBookByAsc(Library l[])
	{
		System.out.println("AccNumber--Title--Author--Price");
		for(int i=0; i<l.length; i++)
		{
			for(int j=i+1; j<l.length; j++)
			{
				if(l[i].getAccNum() > l[j].getAccNum())
				{
					Library temp = l[i];
					l[i] = l[j];
					l[j] = temp;
				}
			}
			
		}
		
		for(int i=0; i<l.length; i++)
		{
			System.out.println(l[i].getAccNum()+"\t"+l[i].getTitle()+"\t"+l[i].getAuthor()+"\t"+l[i].getPrice());
		}
	}
	
	void updateBookByTitle(Library l[])
	{
		System.out.print("enter the book title: ");
		String title = sc.next();
		
		for(int i=0; i<l.length; i++)
		{
			if(title.equals(l[i].getTitle()))
			{
				System.out.println("Edit book details");

				System.out.print("enter the accession number: ");
				int acc = sc.nextInt();

				System.out.print("enter the title: ");
				String t = sc.next();

				System.out.print("enter the author name: ");
				String a = sc.next();

				System.out.print("enter the price: ");
				int p = sc.nextInt();

				l[i].setAccNo(acc);
				l[i].setTitle(t);
				l[i].setAuthor(a);
				l[i].setPrice(p);
				break;
			}
		}
	}
	
	void deleteBookByPrice(Library l[])
	{
		
	}
	
	void disBookByPrice(Library l[])
	{
		System.out.println("book details price range between 100 to 500.");
		
		for(int i=0; i<l.length; i++)
		{
			if((l[i].getPrice() >= 100) && (l[i].getPrice() <= 500))
			{
				System.out.println(l[i].getAccNum()+"\t"+l[i].getTitle()+"\t"+l[i].getAuthor()+"\t"+l[i].getPrice());
			}
		}
	}
	
}

public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		DisplayLibrary dl = new DisplayLibrary();
		Library l[] = new Library[4];
		
		int choice;
		char ch;
		
		do 
		{
			System.out.println("\n===== MENU =====");
            System.out.println("1. Add Book Details.");
            System.out.println("2. Display All Book Details.");
            System.out.println("3. Display List of all book of given author.");
			System.out.println("4. Display list the title of specified book.");
            System.out.println("5. Display list count of the book in the library.");
            System.out.println("6. Display list the books in the ascending order of accession number.");
            System.out.println("7. Update book details by title of book.");
            System.out.println("8. Delete book details by price.");
            System.out.println("9. Display the price range between 100 to 500.");
			System.out.println("10. Exit The Code.");


            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					dl.bookDetail(l);
					break;
					
				case 2:
					dl.disBookDetail(l);
					break;
				
				case 3:
					dl.disBookByAuthor(l);
					break;
					
				case 4:
					dl.disTitleByBook(l);
					break;
				
				case 5:
					dl.disCountBook(l);
					break;
					
				case 6:
					dl.disBookByAsc(l);
					break;
					
				case 7:
					dl.updateBookByTitle(l);
					break;
				
				case 8:
					dl.deleteBookByPrice(l);
					break;
					
				case 9:
					dl.disBookByPrice(l);
					break;
					
				case 10:
					System.out.print("Exiting System...");
					System.exit(0);
					
				default:
					System.out.print("Invalid Option !");
					
			}
			
				System.out.print("\nDo you want to continue? (y/n): ");
				ch = sc.next().charAt(0);
				
		}while(ch == 'y' || ch == 'Y');
	}
}
```

## Q2. Employee Management System with Menu

**Problem Statement:**  
Create a class named `Employee` to hold `empid`, `empname`, `empemail`, `empcontact`, and `empsalary`. Write a menu-driven program with options:
1. Add Employee Details
2. Display All Employee Details
3. Search Employee By ID
4. Update Employee Details By Name
5. Delete Employee Details By Email
6. Display count of employees in company
7. Display employees in ascending order of salary
8. Display employee details with highest salary
9. Display employee details in salary range 10,000 to 60,000
10. Exit System

```java
import java.util.*;
class Employee
{
	private int empid;
	private String empname;
	private String empemail;
	private String empcontact;
	private int empsalry;
	
	public void setEmpId(int empid)
	{
		this.empid=empid;
	}
	public void setEmpName(String empname)
	{
		this.empname=empname;
	}
	public void setEmpEmail(String empemail)
	{
		this.empemail=empemail;
	}
	public void setEmpContact(String empcontact)
	{
		this.empcontact=empcontact;
	}
	public void setEmpSalary(int empsalry)
	{
		this.empsalry=empsalry;
	}
	
	int getId()
	{
		return empid;
	}
	String getName()
	{
		return empname;
	}
	String getEmail()
	{
		return empemail;
	}
	String getContact()
	{
		return empcontact;
	}
	int getSalary()
	{
		return empsalry;
	}
}


class DisplayEmployee
{
	private Employee e[];
	public void setEmp(Employee e[])
	{
		this.e=e;
	}
	
	
	//1. Add Employee Details.
	Scanner sc = new Scanner(System.in);
	void addEmpDetail(Employee e[])
	{
		for(int i=0; i<e.length; i++)
		{
			e[i] = new Employee();
			System.out.print("enter the employee id: ");
			int empid = sc.nextInt();
			System.out.print("enter the employee name: ");
			String empname = sc.next();
			System.out.print("enter the employee email: ");
			String empemail = sc.next();
			System.out.print("enter the employee contact: ");
			String empcontact = sc.next();
			System.out.print("enter the employee salary: ");
			int empsalry = sc.nextInt();
			System.out.print("\n");
			
			e[i].setEmpId(empid);
			e[i].setEmpName(empname);
			e[i].setEmpEmail(empemail);
			e[i].setEmpContact(empcontact);
			e[i].setEmpSalary(empsalry);
		}
	}
	
	
	//2. Display All Employee Details.
	void disEmpDetail(Employee e[])
	{
		for(int i=0; i<e.length; i++)
		{
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getEmail()+"\t"+e[i].getContact()+"\t"+e[i].getSalary());
		}
	}
	
	
	//3. Search Employee By Id then employee is found or not.
	void searchEmpById(Employee e[])
	{
		System.out.print("enter the employee id: ");
		int id = sc.nextInt();
		boolean found = false;
		int index=0;
		for(int i=0; i<e.length; i++)
		{
			if(id==e[i].getId())
			{
				found=true;
				index=i;
				break;
			}
			else
			{
				found=false;
			}
		}

			if(found)
				System.out.println(e[index].getId()+"\t"+e[index].getName()+"\t"+e[index].getEmail()+"\t"+e[index].getContact()+"\t"+e[index].getSalary());
			else
				System.out.println("Not Found");
	}
	
	
	//4. Update Employee Details By Name.
	void updateEmpByName(Employee e[])
	{
		System.out.print("enter the employee name to update: ");
		String name = sc.next();
		
		for(int i=0; i<e.length; i++)
		{
			if(name.equals(e[i].getName()))
			{
				System.out.print("enter the id: ");
				int id = sc.nextInt();
				System.out.print("enter the name: ");
				name = sc.next();
				System.out.print("enter the email: ");
				String email = sc.next();
				System.out.print("enter the contact: ");
				String contact = sc.next();
				System.out.print("enter the salary: ");
				int salary = sc.nextInt();
				
				e[i].setEmpId(id);
				e[i].setEmpName(name);
				e[i].setEmpEmail(email);
				e[i].setEmpContact(contact);
				e[i].setEmpSalary(salary);
			}
		}
	}
	
	//5. Delete Employee Details By Email.
	
	
	//6. Display list count of the Employee in Company.
	void countEmp(Employee e[])
	{
		int count=e.length;
		System.out.println("Count: "+count);
	}
	
	
	//7. Display list the employee in the ascending order of employee salary.
	void disEmpAscBySalary(Employee e[])
	{
		for(int i=0; i<e.length; i++)
		{
			for(int j=i+1; j<e.length; j++)
			{
				if(e[i].getSalary() > e[j].getSalary())
				{
					Employee temp = e[i];
					e[i] = e[j];
					e[j] = temp;
				}
			}
		}
	
		for(int i=0; i<e.length; i++)
		{
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getEmail()+"\t"+e[i].getContact()+"\t"+e[i].getSalary());			
		}
	}
	
	
	//8. Display the employee details in highest salary.
	void disEmpHighBySalary(Employee e[])
	{
		int max=0;
		int index=0;
		for(int i=0; i<e.length; i++)
		{
			if(e[i].getSalary() > max)
			{
				max = e[i].getSalary();
				index=i;
			}
		}
		
		System.out.println(e[index].getId()+"\t"+e[index].getName()+"\t"+e[index].getEmail()+"\t"+e[index].getContact()+"\t"+e[index].getSalary());			
	}
	
	//9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.
	void disEmpMinMaxSalary(Employee e[])
	{
		for(int i=0; i<e.length; i++)
		{
			if((e[i].getSalary() >= 10000) && (e[i].getSalary() <= 60000))
			{
				System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getEmail()+"\t"+e[i].getContact()+"\t"+e[i].getSalary());		
			}
		}
	}
	
	//exit
}

public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Employee e[] = new Employee[3];
		DisplayEmployee de = new DisplayEmployee();
		int choice;
		char ch;
		
		do
		{
			System.out.println("1. Add Employee Details.");
			System.out.println("2. Display All Employee Details.");
			System.out.println("3. Search Employee By Id then employee is found or not.");
			System.out.println("4. Update Employee Details By Name.");
			System.out.println("5. Delete Employee Details By Email.");
			System.out.println("6. Display list count of the Employee in Company.");
			System.out.println("7. Display list the employee in the ascending order of employee salary.");
			System.out.println("8. Display the employee details in highest salary.");
			System.out.println("9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.");
			System.out.println("10. Exit.");
			
			System.out.print("enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					de.addEmpDetail(e);
					break;
					
				case 2:
					de.disEmpDetail(e);
					break;
				
				case 3:
					de.searchEmpById(e);
					break;
				
				case 4:
					de.updateEmpByName(e);
					break;
					
				case 6:
					de.countEmp(e);
					break;
				
				case 7:
					de.disEmpAscBySalary(e);
					break;
				
				case 8:
					de.disEmpHighBySalary(e);
					break;
				
				case 9:
					de.disEmpMinMaxSalary(e);
					break;
				
				case 10:
					System.out.print("Exiting System...");
					System.exit(0);
					
				default:
					System.out.println("Invalid Choice !");
			}
		
				System.out.print("Do you want to continue(y/n): ");
				ch = sc.next().charAt(0);
		
		}while(ch=='y' || ch=='Y');		
	}
}
```

## Q3. Student Performance Analysis

**Problem Statement:**  
Create a POJO class `Student` with fields: `rollNo`, `name`, `marks[]` (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
- Calculate total marks for each student.
- Find the student with the highest average marks.
- Display list of students who failed in any subject (`marks < 35`).

**Explanation:**  
Tests array of objects, iteration inside objects, object encapsulation (POJO), and multiple computations.

```java
import java.util.*;
class Student
{
	private int rn;
	private String name;
	private int[] marks;
	
	public void setArr(int rn, String name, int marks[])
	{
		this.rn=rn;
		this.name=name;
		this.marks=marks;
	}
	
	int getRn()
	{
		return rn;
	}
	String getName()
	{
		return name;
	}
	int[] getMarks()
	{
		return marks;
	}
	
}
class DisplayStudent
{	
	Student s[];
	public void totalMarks(Student s[])
	{
		this.s=s;
	}
	
	void show()
	{	
		//1st operations
		System.out.println("RollNo--Name--TotalMarks");
		for(int i=0; i<s.length; i++)
		{
			int[] marks = s[i].getMarks();
			int total=0;
			for(int j=0; j<marks.length; j++)
			{
				total=total+marks[j];
			}
			System.out.println(s[i].getRn()+"\t"+s[i].getName()+"\t"+total);
		}
		
		
		//2nd operations
		System.out.println("Highest Average of marks: ");
		double max=-1;
		int index=0;
		for(int i=0; i<s.length; i++)
		{
			int[] marks = s[i].getMarks();
			int total=0;
			for(int j=0; j<marks.length; j++)
			{
				total=total+marks[j];
			}
			double avg = total/(double)marks.length;
			if(avg>max)
			{
				max=avg;
				index=i;
			}
		}
		
		System.out.println("RollNo--Name--Average");
		System.out.println(s[index].getRn()+"\t"+s[index].getName()+"\t"+max);
		
		
		//3rd operations
		System.out.println("Display the list of students who have failed in any subject:");
		System.out.println("RollNo--Name");
		for(int i=0; i<s.length; i++)
		{
			int[] marks = s[i].getMarks();
			for(int j=0; j<marks.length; j++)
			{
				if((marks[j]) < 35)
				{
					System.out.println(s[i].getRn()+"\t"+s[i].getName());
					break;
				}
			}
			
		}
	}
}

public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		DisplayStudent d = new DisplayStudent();
		Student s[] = new Student[5];
		for(int i=0; i<s.length; i++)
		{
			s[i] = new Student();
			System.out.print("enter the rollNo: ");
			int rn = sc.nextInt();
			System.out.print("enter the name: ");
			String name = sc.next();
			int marks[] = new int[3];
			System.out.print("enter the marks of 3 subject:");
			for(int j=0; j<marks.length; j++)
			{
				marks[j]=sc.nextInt();
			}
			
			s[i].setArr(rn,name,marks);
		}
		
		d.totalMarks(s);
		d.show();
		
	}
}
```

## Q4. Employee Salary Calculations

**Problem Statement:**  
Create a POJO class `Employee` with fields: `empId`, `name`, `basicSalary`, `hra`, and `da`. Store details of 5 employees using an array of objects. Perform the following operations:
- Calculate gross salary for each employee (`gross = basic + hra + da`).
- Find and display employee with maximum salary.
- Print details of employees whose salary is greater than the average salary of all employees.

**Explanation:**  
Covers aggregation, comparison, and filtering along with numerical calculations for max and average values.

```java
import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int bs;
	private int hra;
	private int da;
	public void StoreData(int id,String name,int bs,int hra,int da)
	{
		this.id=id;
		this.name=name;
		this.bs=bs;
		this.hra=hra;
		this.da=da;
	}
	
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	int getBs()
	{
		return bs;
	}
	int getHra()
	{
		return hra;
	}
	int getDa()
	{
		return da;
	}
}


class DisplayEmpData
{
	private Employee e[];
	
	public void setEmp(Employee e[])
	{
		this.e=e;
	}
	
	void show()
	{
		//1st operations
		int egs[] = new int[e.length];
		System.out.println("-----------------------------------");
		System.out.println("Gross salary for each employee");
		System.out.println("-----------------------------------");
		System.out.println("EmpID--EmpName--GrossSalary");
		for(int i=0; i<e.length; i++)
		{
			int gs = e[i].getBs() + e[i].getHra() + e[i].getDa();
			egs[i]=gs;
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+gs);
			gs = 0;
		}
		
		
		//2nd operations
		System.out.println("-----------------------------------");
		System.out.println("Employee with the maximum salary");
		System.out.println("-----------------------------------");
		int maxSalary=0, index=0;
		System.out.println("EmpID--EmpName--MaxSalary");
		for(int i=0; i<e.length; i++)
		{
			if(egs[i] > maxSalary)
			{
				maxSalary=egs[i];
				index=i;
			}
		}
		System.out.println(e[index].getId()+"\t"+e[index].getName()+"\t"+maxSalary);
		
		
		//3rd operations
		System.out.println("-------------------------------------------------------");
		System.out.println("Employees salary is greater than average salary of all");
		System.out.println("-------------------------------------------------------");
		System.out.println("EmpID--EmpName--MaxAvgSalary");
		int total=0;
		for(int i=0; i<e.length; i++)
		{
			total+=egs[i];
		}
		index=0;
		double avg = total / (double)e.length;
		double max = Double.MIN_VALUE;
		for(int i=0; i<e.length; i++)
		{
			if(egs[i] > avg)
			{
				System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+egs[i]);
			}
		}
		
	} 
}

public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		DisplayEmpData ded = new DisplayEmpData();
		Employee e[] = new Employee[5];
		for(int i=0; i<e.length; i++)
		{
			e[i] = new Employee();
			System.out.print("enter the id: ");
			int id = sc.nextInt();
			System.out.print("enter the name: ");
			String name = sc.next();
			System.out.print("enter the basic salary: ");
			int bs = sc.nextInt();
			System.out.print("enter the hra: ");
			int hra = sc.nextInt();
			System.out.print("enter the da: ");
			int da = sc.nextInt();
			System.out.print("\n");
			
			e[i].StoreData(id,name,bs,hra,da);
		}
		
		ded.setEmp(e);
		ded.show();
	}
}
```

## Q5. Car Mileage Analysis

**Problem Statement:**  
Create a POJO class `Car` with fields: `carId`, `model`, `fuelConsumed`, and `distanceTravelled`. Store details of 5 cars using an array of objects. Perform the following operations:
- Calculate mileage of each car (`mileage = distanceTravelled / fuelConsumed`).
- Find car with best mileage.
- Display cars whose mileage is above average mileage of all cars.

```java
import java.util.*;
class Car
{
	private int id;
	private String model;
	private int fc;
	private int dt;
	
	public void StoreCar(int id,String model,int fc,int dt)
	{
		this.id=id;
		this.model=model;
		this.fc=fc;
		this.dt=dt;
	}
	
	int getId()
	{
		return id;
	}
	String getModel()
	{
		return model;
	}
	int getFc()
	{
		return fc;
	}
	int getDt()
	{
		return dt;
	}
}

class DisplayCar
{
	private Car c[];
	public void setCar(Car c[])
	{
		this.c=c;
	}
	
	void show()
	{
		//operations 1
		float cm[] = new float[c.length];
		System.out.println("-------------------------------");
		System.out.println("display the mileage of each car");
		System.out.println("-------------------------------");
		System.out.println("CarID---CarModel---Mileage");
		for(int i=0; i<c.length; i++)
		{
			float mileage = (float)c[i].getDt() / c[i].getFc();
			cm[i] = mileage; 
			System.out.println(c[i].getId()+"\t"+c[i].getModel()+"\t"+mileage);
			mileage = 0;
		}
		
		
		//operations 2
		System.out.println("----------------------------------");
		System.out.println("show the car with the best mileage");
		System.out.println("----------------------------------");
		System.out.println("CarID---CarModel---BestMileage");
		float max = cm[0];
		int index=0;
		for(int i=0; i<cm.length; i++)
		{
			if(cm[i] > max)
			{
				max = cm[i];
				index=i;
			}
		}
		System.out.println(c[index].getId()+"\t"+c[index].getModel()+"\t"+max);
		
		
		//operations 3
		System.out.println("-----------------------------------------------------------");
		System.out.println("cars whose mileage is above the average mileage of all cars");
		System.out.println("------------------------------------------------------------");
		System.out.println("CarID---CarModel---AvgMileage");
		float totalAvg=0;
		for(int i=0; i<cm.length; i++)
		{
			totalAvg+=cm[i];
		}
		
		float avg = totalAvg/cm.length;
		for(int i=0; i<cm.length; i++)
		{
			if(cm[i] > avg)
			{
				System.out.println(c[i].getId()+"\t"+c[i].getModel()+"\t"+cm[i]);
			}
		}
	}
	
}

public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		DisplayCar d = new DisplayCar();
		Car c[] = new Car[5];
		for(int i=0; i<c.length; i++)
		{
			c[i] = new Car();
			System.out.print("enter the car id: ");
			int id = sc.nextInt();
			System.out.print("enter the car model: ");
			String model = sc.next();
			System.out.print("enter the car fuel consumed: ");
			int fc = sc.nextInt();
			System.out.print("enter the car distance travelled: ");
			int dt = sc.nextInt();
			System.out.print("\n");
			c[i].StoreCar(id,model,fc,dt);
		}
		
		d.setCar(c);
		d.show();
	}
}
```

## Q6. Player Batting Average Analysis

**Problem Statement:**  
Create a POJO class `Player` with fields: `playerId`, `name`, `runs`, and `matches`. Store details of 5 players using an array of objects. Perform the following operations:
- Calculate average runs per match for each player.
- Find and display player with highest batting average.
- Print details of players whose batting average is above team average.

```java
import java.util.*;
class Player
{
	private int id;
	private String name;
	private int runs;
	private int match;
	public void StorePlayer(int id,String name,int runs,int match)
	{
		this.id=id;
		this.name=name;
		this.runs=runs;
		this.match=match;
	}
	
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	int getRuns()
	{
		return runs;
	}
	int getMatch()
	{
		return match;
	}
}

class DisplayPlayer
{
	private Player p[];
	public void setPlayer(Player p[])
	{
		this.p=p;
	}
	
	void show()
	{
		//operations 1
		System.out.println("--------------------------------------");
		System.out.println("average runs per match for each player");
		System.out.println("--------------------------------------");
		System.out.println("ID----Name----Average");
		float avg = 0;
		float ap[] = new float[p.length];
		for(int i=0; i<p.length; i++)
		{
			avg = p[i].getRuns() / p[i].getMatch();
			ap[i]=avg;
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+avg);
		}
		
		
		//operations 2
		System.out.println("---------------------------------------------------");
		System.out.println("display the player with the highest batting average");
		System.out.println("---------------------------------------------------");
		System.out.println("ID----Name----MaxAverage");
		float max = ap[0];
		int index=0;
		for(int i=0; i<p.length; i++)
		{
			if(ap[i] > max)
			{
				max=ap[i];
				index=i;
			}
		}
		System.out.println(p[index].getId()+"\t"+p[index].getName()+"\t"+max);
		
		
		//operations 3
		System.out.println("-------------------------------------------------------");
		System.out.println("players whose batting average is above the team average");
		System.out.println("-------------------------------------------------------");
		System.out.println("ID----Name----Average");
		int totalAvg=0;
		for(int i=0; i<ap.length; i++)
		{
			totalAvg+=ap[i];
		}
		avg = totalAvg / ap.length;
		for(int i=0; i<p.length; i++)
		{
			if(ap[i] > avg)
			{
				System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+ap[i]);
			}
		}
	}
}

public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		DisplayPlayer dp = new DisplayPlayer();
		Player p[] = new Player[5];
		for(int i=0; i<p.length; i++)
		{
			p[i] = new Player();
			System.out.print("enter the player id: ");
			int id = sc.nextInt();
			System.out.print("enter the name of player: ");
			String name = sc.next();
			System.out.print("enter the runs: ");
			int runs = sc.nextInt();
			System.out.print("enter the no of matches: ");
			int match = sc.nextInt();
			
			p[i].StorePlayer(id,name,runs,match);
		}
		
		dp.setPlayer(p);
		dp.show();
	}
}
```

## Q7. Food Billing System with Menu

**Problem Statement:**  
Create a class `Food` with data members `fid`, `fname`, `fprice`, `fcategory` using `do-while` loop and `switch-case`. Create an array of objects of size 5, store food details, and perform:
1. Add All Food Details
2. Display All Food Details
3. Display Bill Details:
   - Bill Without GST
   - Bill With 18% GST

```java
import java.util.*;
class Food
{
	private int id;
	private String name;
	private int price;
	private String category;
	
	public void StoreDetail(int id,String name,int price,String category)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.category=category;
	}
	
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	int getPrice()
	{
		return price;
	}
	String getCategory()
	{
		return category;
	}
}


class DisplayFood
{
	void displayAll(Food f[])
	{
		System.out.println("\n----- ALL FOOD DETAILS -----");
		System.out.println("ID__NAME__PRICE__CATEGORY");
		for(int i=0; i<f.length; i++)
		{
			System.out.println(f[i].getId()+"\t"+f[i].getName()+"\t"+f[i].getPrice()+"\t"+f[i].getCategory());
		}
	}
	
	void billWithoutGST(Food f[])
	{
		int total=0;
		for(int i=0; i<f.length; i++)
		{
			total+=f[i].getPrice();
		}
		System.out.println("Bill Without GST: "+total);
	}
	
	void billWithGST(Food f[])
	{
		int total=0;
		for(int i=0; i<f.length; i++)
		{
			total+=f[i].getPrice();
		}
		
		double gst = total * 0.18;
        double finalBill = total + gst;

        System.out.println("\nTotal Amount: " + total);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final Bill: " + finalBill);
	}
}

public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Food f[] = new Food[5];
		DisplayFood df = new DisplayFood();
		
		int choice;
		char ch;
		
		do
        {
            System.out.println("\n===== MENU =====");
            System.out.println("1 : Add All Food Details");
            System.out.println("2 : Display All Food Details");
            System.out.println("3 : Display Bill Details");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				for(int i=0; i<f.length; i++)
				{
					f[i] = new Food();
					System.out.print("enter the food id: ");
					int id = sc.nextInt();
					System.out.print("enter the food name: ");
					String name = sc.next();
					System.out.print("enter the food price: ");
					int price = sc.nextInt();
					System.out.print("enter the food category: ");
					String category = sc.next();
					System.out.print("\n");
					f[i].StoreDetail(id,name,price,category);
				}
				break;
				
				case 2:
                    df.displayAll(f);
                    break;
				
				case 3: 
					System.out.println("\n1 : Bill Without GST");
                    System.out.println("2 : Bill With 18% GST");
                    System.out.print("Enter choice: ");
                    int b = sc.nextInt();
					
					if(b==1)
						df.billWithoutGST(f);
					else if(b==2)
						df.billWithGST(f);
					else
						System.out.println("Invalid option!");
					
					break;
					
				default:
					System.out.println("Invalid Choice!");
		
			}
				System.out.print("\nDo you want to continue? (y/n): ");
				ch = sc.next().charAt(0);
				
		}while(ch == 'y' || ch == 'Y');
	}
}
```

## Q8. Multiplication Table Class

**Problem Statement:**  
Create a class `Table` with functions:
- `void setValue(int n)`: Accepts number as input parameter.
- `void showTable()`: Displays multiplication table of the number.

```java
import java.util.*;
class Table
{
	private int n;
	public void setValue(int n)
	{
		this.n=n;
	}
	
	public void showTable()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+"x"+i+"="+(n*i));
		}
	}
}

public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		Table t = new Table();
		t.setValue(n);
		t.showTable();
	}
}
```

## Q9. Find Maximum using Varargs

**Problem Statement:**  
Create a class `FindMax` with functions:
- `void setValue(int... x)`: Accepts varargs parameter.
- `int getMax()`: Finds and returns maximum value from array.

```java
import java.util.*;
class FindMax
{
	private int []a;
	public void setValue(int ...x)
	{
		this.a=x;
	}
	
	public int getMax()
	{
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}

public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size: ");
		int n = sc.nextInt();
		int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
		
		FindMax fm = new FindMax();
		fm.setValue(a);
		int res = fm.getMax();
		System.out.print("Maximum Element: "+res);
	}
}
```

## Q10. Array Sorting using Varargs

**Problem Statement:**  
Create a class `Sort` with functions:
- `void setValue(int... x)`: Accepts varargs parameter.
- `void sort()`: Sorts variable argument array.
- `void display()`: Displays array data before and after sorting.

```java
import java.util.*;
class Sort
{
	private int []a;
	public void setValue(int ...x)
	{
		this.a=x;
	}
	
	public void sort()
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public void display()
	{
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

public class Q11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("enter the elements in array: ");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
		
		Sort s = new Sort();
		s.setValue(a);
		
		
		System.out.print("Display Before: ");
		s.display();
		
		System.out.print("\n");
		s.sort();
		
		System.out.print("Display After: ");
		s.display();
		
	}
}
```

## Q11. Reverse Array using Varargs

**Problem Statement:**  
Create a class `Rev` with functions:
- `void setValue(int... x)`: Accepts varargs parameter.
- `void rev()`: Reverses the array and displays it.

```java
import java.util.*;
class Rev
{
	private int []a;
	public void setValue(int ...x)
	{
		this.a=x;
	}
	
	public void rev()
	{
		int start=0, end=a.length-1;
		for(int i=0; i<a.length/2; i++)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
		System.out.print("After Reverse:");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("enter the elements in array: ");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
		
		Rev r = new Rev();
		r.setValue(a);
		r.rev();
		
	}
}
```

## Q12. Element Search in Array

**Problem Statement:**  
Create a class `Search` with function:
- `boolean isPresent(int key)`: Searches if key is present in array; returns `true` if found, else `false`.

```java
import java.util.*;
class Search
{
	private int []a;
	public void setValue(int ...x)
	{
		this.a=x;
	}
	
	public boolean isPresent(int skey)
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==skey)
			{
				return true;
			}	
		}
		return false;
	}
}

public class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the elements: ");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("enter the element to search: ");
		int skey = sc.nextInt();
		
		Search s = new Search();
		s.setValue(a);
		boolean res = s.isPresent(skey);
		
		if(res)
			System.out.print("Present");
		else
			System.out.print("Not Present");
	}
}
```

## Q13. Find Common Elements in Two Arrays

**Problem Statement:**  
Given two arrays, find their common elements. Create a class `FindCommonElements` with methods:
- `void setArray(String a[], String b[])`: Accepts two arrays as parameters.
- `String[] getCommonElements()`: Returns a new array containing common elements.

```java
import java.util.*;
class FindCommonElements
{
	private String []a;
	private String []b;
	public void setArray(String a[],String b[])
	{
		this.a=a;
		this.b=b;
	}
	
	public String[] getCommonElements()
	{
		String temp[] = new String[a.length]; 
		int k=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i].equals(b[j]))
				{
					temp[k++]=a[i];
				}
			}
		
		}
		
		 String res[] = new String[k];
		
		for(int i=0; i<k; i++)
		{
			res[i]=temp[i];
		}
		
		return res;
	}
}

public class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		String a[] = new String[6];
		String b[] = new String[6];
		String c[] = new String[a.length];
		System.out.print("enter the elements in array1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.next();
		}
		System.out.print("enter the elements in array2: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.next();
		}
		
		FindCommonElements co = new FindCommonElements();
		co.setArray(a,b);
		 String res [] = co.getCommonElements();
		
		for(int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
	}
}
```

## Q14. Intersection of Two Arrays

**Problem Statement:**  
Given two arrays `a[]` and `b[]`, find the intersection of the two arrays without duplicate elements. Create a class `Intersection` with methods:
- `void setArray(int a[], int b[])`: Accepts two arrays as parameters.
- `int[] getIntersection()`: Finds and returns intersection array.

```java
import java.util.*;
class Intersection
{
	private int []a;
	private int []b;
	public void setArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	
	public int[] getIntersection()
	{ 
    boolean visit[] = new boolean[a.length];
    int temp[] = new int[a.length];
    int k = 0;

    for (int i = 0; i < a.length; i++)
    {
        if (visit[i])
            continue;

        for (int m = i; m < a.length; m++)
        {
            if (a[i] == a[m])
            {
                visit[m]=true;
            }
        }

        for (int j = 0; j < b.length; j++)
        {
            if (a[i] == b[j])
            {
                temp[k++] = a[i];
                break;
            }
        }
    }

    int res[] = new int[k];
    for (int i = 0; i < k; i++)
        res[i] = temp[i];

    return res;
	}
}


public class Q15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[4];
		System.out.print("enter the elements in array 1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the elements in array 1: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		Intersection it = new Intersection();
		it.setArray(a,b);
		
		int res[] = it.getIntersection();

        for(int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
	}
}
```

## Q15. Binary Search in Sorted Array

**Problem Statement:**  
Create a class `BinarySearch` with methods:
- `void setArray(int a[])`: Accepts sorted array as parameter.
- `int getIndex(int key)`: Searches for key using binary search and returns index, or `-1` if not found.

```java
import java.util.*;
class BinarySearch
{
	private int []a;
	public void setArray(int a[])
	{
		this.a=a;
	}
	
	public int getIndex(int key)
	{	
		int left=0, right=a.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(a[mid]==key)
			{
				return mid;
			}
			else if(a[mid]<key)
			{
				left = mid+1;
			}
			else
			{
				right = mid-1;
			}
		}
		
		return -1;
	}
}

public class Q16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the element in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the element for search: ");
		int key = sc.nextInt();
		
		BinarySearch bs = new BinarySearch();
		bs.setArray(a);
		
		int res = bs.getIndex(key);
		
		if(res!=-1)
		System.out.print("Element: "+res);
		else
		System.out.print("Element Not Found");
	}
}
```

## Q16. Search Pair with Target Sum

**Problem Statement:**  
Given an array `arr[]` of `n` integers and a `target` value, find whether there is a pair of elements whose sum equals `target` (2Sum problem). Create a class `ArraySum` with methods to accept array & target and check condition.

```java
import java.util.*;
class ArraySum
{
	private int []a;
	private int target;
	public void setArray(int a[], int target)
	{
		this.a=a;
		this.target=target;
	}
	
	public boolean getSum()
	{
		
		for(int i=0; i<a.length; i++)
		{
			int sum=0;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]==target)
				{
					return true;
				}
			}
		}
		return false;
	}
}

public class Q17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the elements in arr: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the target for sum: ");
		int target = sc.nextInt();
		
		ArraySum as = new ArraySum();
		as.setArray(a,target);
		boolean res = as.getSum();
		if(res)
			System.out.print("true");
		else
			System.out.print("false");
		
	}
}
```

## Q17. Median of Two Sorted Arrays

**Problem Statement:**  
Given two sorted arrays `a[]` and `b[]`, find median of merged sorted arrays. Create a class `Median` with methods:
- `void setArray(int a[], int b[])`: Accepts two arrays as parameters.
- `float getMedian()`: Returns median value.

```java
import java.util.*;
class Median
{
	private int []a;
	private int []b;
	public void setArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	
	public float getMedian()
	{
		int c[] = new int[a.length+b.length];
		int k=0;
		for(int i=0; i<a.length; i++)
			c[k++]=a[i];
		
		for(int i=0; i<b.length; i++)
			c[k++]=b[i];
			
		for(int i=0; i<c.length; i++)
		{
			for(int j=i+1; j<c.length; j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		int n = c.length;

		//odd length
        if(n%2!=0)
            return c[n/2];
        
		//even length
        return (c[n/2] + c[n/2 - 1]) / 2.0f;
	}
}

public class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[0];
		int b[] = new int[4];
		System.out.print("enter the elements in array 1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("enter the elements in array 2: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		Median m = new Median();
		m.setArray(a,b);
		float res = m.getMedian();
		System.out.print("Median: "+res);
	}
}
```

## Q18. Calculate Power of a Number

**Problem Statement:**  
Create a class `Power` with methods:
- `void setNum(int base, int index)`: Accepts base and index values.
- `int showPower()`: Calculates and returns power value.

```java
import java.util.*;
class Power
{
	private int base;
	private int index;
	public void setNum(int base, int index)
	{
		this.base=base;
		this.index=index;
	}
	
	public int showPower()
	{
		int p=1;
		for(int i=1; i<=index; i++)
		{
			p=p*base;
		}
		return p;
	}
}

public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the base: ");
		int base = sc.nextInt();
		System.out.print("enter the index: ");
		int index = sc.nextInt();
		
		Power p = new Power();
		p.setNum(base,index);
		int res = p.showPower();
		System.out.print("Power: "+res);
	}
}
```

## Q19. Merge Two Sorted Arrays

**Problem Statement:**  
Given two sorted arrays, merge them in a sorted manner. Create a class `MergeSort` with methods:
- `void setArray(int a[], int b[])`: Accepts two sorted arrays as parameters.
- `int[] getMergedArray()`: Returns merged sorted array.

```java
import java.util.*;
class MergeSort
{
	private int []a;
	private int []b;
	public void setArray(int a[], int b[])
	{
		this.a=a;
		this.b=b;
	}
	
	public int[] getMergedArray()
	{
		int c[] = new int[a.length+b.length];
		int k=0;
		for(int i=0; i<a.length; i++)
			c[k++]=a[i];
		
		for(int i=0; i<b.length; i++)
			c[k++]=b[i];
			
		//sort logics
		for(int i=0; i<c.length; i++)
		{
			for(int j=i+1; j<c.length; j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		return c;
		
	}
}

public class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[4];
		System.out.print("enter the elements in array 1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the elements in array 2: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		MergeSort ms = new MergeSort();
		ms.setArray(a,b);
		int res [] = ms.getMergedArray();
		
		System.out.print("Merge Array: ");
		for(int i=0; i<res.length; i++)
			System.out.print(res[i]+" ");
	}
}
```

## Q20. Book and Library POJO Class

**Problem Statement:**  
Create POJO class `Book` with fields `id`, `name`, and `price`. Create class `Library` with methods:
- `void setBook(Book book)`
- `void showBook()`

```java
import java.util.*;
class Book
{
	private int id;
	private String name;
	private int price;
	
	public void setBook(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public int getId() 
	{
        return id;
    }

    public String getName() 
	{
        return name;
    }

    public int getPrice()
	{
        return price;
    }
}

class Library
{
	private Book book;

    public void setBook(Book book)
    {
        this.book = book;
    }
	
	public void showBook()
    {
        System.out.println("ID\tName\tPrice");
        System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getPrice());
    }

}

public class Q21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the id: ");
		int id = sc.nextInt();
		System.out.print("enter the name: ");
		String name = sc.next();
		System.out.print("enter the price: ");
		int price = sc.nextInt();
		
		Book b = new Book();
		b.setBook(id, name, price);
		
		Library lib = new Library();
        lib.setBook(b);
        lib.showBook();
	}
}
```

## Q21. Vehicle and ShowRoom POJO Class

**Problem Statement:**  
Create POJO class `Vehicle` with fields `id`, `name`, and `price`. Create class `ShowRoom` with methods:
- `void setVehicle(Vehicle vehicle)`
- `void showVehicle()`

```java
import java.util.*;
class Vehicle
{
	private int id;
	private String name;
	private int price;
	
	public void setVehicle(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public int getId() 
	{
        return id;
    }

    public String getName() 
	{
        return name;
    }

    public int getPrice()
	{
        return price;
    } 
}

class ShowRoom
{
	private Vehicle vehicle;
	
	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle=vehicle;
	}
	
	public void showVehicle()
	{
		System.out.println("ID\tName\tPrice");
        System.out.println(vehicle.getId() + "\t" + vehicle.getName() + "\t" + vehicle.getPrice());
	}
}

public class Q22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the id: ");
		int id = sc.nextInt();
		System.out.print("enter the name: ");
		String name = sc.next();
		System.out.print("enter the price: ");
		int price = sc.nextInt();
		
		Vehicle v = new Vehicle();
		v.setVehicle(id,name,price);
		
		ShowRoom sh = new ShowRoom();
		sh.setVehicle(v);
		sh.showVehicle();
		
	}
}
```

## Q22. Student and Department POJO Class

**Problem Statement:**  
Create POJO class `Student` with fields `name`, `id`, and `percentage`. Create class `Dept` with methods:
- `void setStudent(Student student)`
- `void showStudent()`

```java
import java.util.*;
class Student
{
	private String name;
	private int id;
	private int percentage;
	
	public void setStudent(String name,int id,int percentage)
	{
		this.name=name;
		this.id=id;
		this.percentage=percentage;
	}	
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getPercentage()
	{
		return percentage;
	}
}

class Dept
{
	private Student student;
	public void setStudent(Student student)
	{
		this.student=student;
	}
	
	public void showStudent()
	{
		System.out.println("Name\tID\tPercentage");
		System.out.println(student.getName()+ "\t" + student.getId()  + "\t" + student.getPercentage()+"%");
	}
}

public class Q23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the name: ");
		String name = sc.next();
		System.out.print("enter the id: ");
		int id = sc.nextInt();
		System.out.print("enter the percentage: ");
		int percentage = sc.nextInt();
		
		Student s = new Student();
		s.setStudent(name,id,percentage);
		
		Dept d = new Dept();
		d.setStudent(s);
		d.showStudent();
	}
}
```

## Q23. Player and Team POJO Class

**Problem Statement:**  
Create POJO class `Player` with fields `id`, `name`, and `run`. Create class `Team` with methods:
- `void setPlayer(Player player)`
- `void showPlayer()`

```java
import java.util.*;
class Player
{
	private int id;
	private String name;
	private int run;
	public void setPlayer(int id,String name,int run)
	{
		this.id=id;
		this.name=name;
		this.run=run;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRun()
	{
		return run;
	}
}

class Team
{
	private Player player;
	public void setPlayer(Player player)
	{
		this.player=player;
	}
	
	public void showPlayer()
	{
		System.out.println("ID\tName\tRun");
		System.out.println(player.getId()+"\t"+player.getName()+"\t"+player.getRun());
	}
}

public class Q24
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the id: ");
		int id = sc.nextInt();
		System.out.print("enter the name: ");
		String name = sc.next();
		System.out.print("enter the runs: ");
		int run = sc.nextInt();
		
		Player p = new Player();
		p.setPlayer(id,name,run);
		
		Team t = new Team();
		t.setPlayer(p);
		t.showPlayer();
	}
}
```

## Q24. Product, Customer, and Shop Billing System

**Problem Statement:**  
Consider a billing application with:
1. `Product` (POJO): `id`, `name`, `price`
2. `Customer` (POJO): `id`, `name`, `address`, `email`, `contact`
3. `Shop`:
   - `void storeProducts(Customer c, Product... p)`
   - `void calBill()`: Calculates bill with items list and grand total.

```java
class Product
{
    private int id;
    private String name;
    private int price;


    Product(int id, String name, int price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int getId()
	{ 
		return id; 
	}
    String getName() 
	{
		return name; 
	}
    int getPrice()
	{
		return price; 
	}
}


class Customer
{
    private int id;
    private String name;
    private String address;
    private String email;
    private String contact;

    Customer(int id, String name, String address, String email, String contact)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.contact = contact;
    }

    int getId()
	{
		return id; 
	}
    String getName() 
	{
		return name; 
	}
    String getAddress() 
	{
		return address; 
	}
    String getEmail() 
	{ 
		return email; 
	}
    String getContact()
	{ 
		return contact; 
	}
}


class Shop
{
    private Customer customer;
    private Product[] products;

    void storeProducts(Customer c, Product ...p)
    {
        this.customer = c;
        this.products = p;
    }

    void calBill()
    {
        double total = 0;

        System.out.println("------- CUSTOMER BILL -------");
        System.out.println("Customer ID   : " + customer.getId());
        System.out.println("Customer Name : " + customer.getName());
        System.out.println("Email         : " + customer.getEmail());
        System.out.println("Contact       : " + customer.getContact());
        System.out.println("--------------------------------");
        System.out.println("Items Purchased:");
        System.out.println("--------------------------------");

        for (int i = 0; i < products.length; i++)
        {
            Product p = products[i];
            System.out.println(p.getId() + "  " + p.getName() + "  Rs." + p.getPrice());
            total += p.getPrice();
        }

        System.out.println("--------------------------------");
        System.out.println("Grand Total : Rs." + total);
        System.out.println("--------------------------------");
    }
}

public class Q25
{
    public static void main(String x[])
    {
        Customer c = new Customer(101, "Dhruv", "Pune", "dhruv5@.com", "8010865586");

        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1000);

        Shop shop = new Shop();
        shop.storeProducts(c, p1, p2, p3);
        shop.calBill();
    }
}
```

## Q25. Product Search by ID in Array

**Problem Statement:**  
Create POJO class `Product` with fields `id`, `name`, and `price`. Create 5 product objects using an array of objects. Input ID from keyboard and search if product is present in array of objects.

```java
import java.util.*;
class Product
{
	private int id;
	private String name;
	private int price;
	
	public void setProduct(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getPrice()
	{
		return price;
	}
}


public class Q28
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[5];
			
			p[0] = new Product();
			p[0].setProduct(1,"A1",1000);
			
			p[1] = new Product();
			p[1].setProduct(2,"A2",2000);
			
			p[2] = new Product();
			p[2].setProduct(3,"A3",3000);
			
			p[3] = new Product();
			p[3].setProduct(4,"A4",4000);
			
			p[4] = new Product();
			p[4].setProduct(5,"A5",5000);
		
		
		System.out.println("ID \t Product Name \t Product Price: ");
		for(int i=0; i<p.length; i++)
		{
			System.out.println(p[i].getId()+"\t \t"+p[i].getName()+"\t \t"+p[i].getPrice());
		}
		
		System.out.print("enter the product using id: ");
		int sk = sc.nextInt();
		boolean found=false;
		int index=-1;
		for(int i=0; i<p.length; i++)
		{
			if(sk==p[i].getId())
			{
				found=true;
				index=i;
				break;
			}
		}
		
		if(found)
			System.out.print(p[index].getId()+"\t \t"+p[index].getName()+"\t \t"+p[index].getPrice());
		else
			System.out.print("Does not found");

		
	}
}
```

## Q26. Sort Books by Price Descending

**Problem Statement:**  
Create POJO class `Book` with fields `id`, `name`, `author`, and `price`. Arrange all books in descending order by price using array of objects.

```java
class Book
{
	private int id;
	private String name;
	private String author;
	private int price;
	
	public void setBook(int id,String name,String author,int price)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.price=price;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getAuthor()
	{
		return author;
	}
	public int getPrice()
	{
		return price;
	}
}

public class Q29
{
	public static void main(String x[])
	{
		Book b[] = new Book[4];
		
		b[0] = new Book();
		b[0].setBook(1,"Destiny","Mayur",399);
		
		b[1] = new Book();
		b[1].setBook(2,"Bgmi","Shriram",99);
		
		b[2] = new Book();
		b[2].setBook(3,"Rich","Harshad",199);
		
		b[3] = new Book();
		b[3].setBook(4,"XXIII","Dhruv",299);
		
		for(int i=0; i<b.length; i++)
		{
			for(int j=i+1; j<b.length; j++)
			{
				if(b[i].getPrice() < b[j].getPrice())
				{
					Book temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		
		System.out.println("all books in descending order by using price");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i].getId()+"\t"+b[i].getName()+"\t"+b[i].getAuthor()+"\t"+b[i].getPrice());
		}
	}
}
```

## Q27. Find Player with Second Highest Runs

**Problem Statement:**  
Create POJO class `Player` with fields `id`, `name`, and `run`. Find player details whose runs scored is second highest.

```java
class Player
{
	private int id;
	private String name;
	private int run;
	
	public void setPlayer(int id,String name,int run)
	{
		this.id=id;
		this.name=name;
		this.run=run;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getRun()
	{
		return run;
	}
}

public class Q30
{
	public static void main(String x[])
	{
		Player p[] = new Player[4];
		
		p[0] = new Player();
		p[0].setPlayer(1,"Dhruv",40);
		
		p[1] = new Player();
		p[1].setPlayer(2,"Harshad",60);
		
		p[2] = new Player();
		p[2].setPlayer(3,"Mayur",30);
		
		p[3] = new Player();
		p[3].setPlayer(4,"Shriram",55);
		
		
		int fmax = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		
		for(int i=0; i<p.length; i++)
		{
			int runs = p[i].getRun();
			if(runs > fmax)
			{
				smax=fmax;
				fmax=runs;
			}
			else
			{
				if(runs!=fmax && runs > smax)
				{
					smax=runs;
				}
			}
		}
		
		for(int i=0; i<p.length; i++)
        {
            if(p[i].getRun() == smax)
            {
                System.out.println("Second Highest:");
                System.out.println(p[i].getId() + "\t" + p[i].getName() + "\t \t" + p[i].getRun());
                break;
            }
        }
		
	}
}
```

## Q28. Reverse a Number Class

**Problem Statement:**  
Create a class `Rev` with methods:
- `void setValue(int n)`: Accepts number.
- `int showRev()`: Reverses the number and returns it.

```java
import java.util.*;
class Rev
{
	private int n;
	public void setValue(int n)
	{
		this.n=n;
	}
	
	public int showRev()
	{
		int reverse=0;
		while(n!=0)
		{
			int rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		return reverse;
	}
}

public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the name: ");
		int n = sc.nextInt();
		
		Rev r = new Rev();
		r.setValue(n);
		int res = r.showRev();
		System.out.print("Reverse Number: "+res);
	}
}
```

## Q29. Perfect Number Check Class

**Problem Statement:**  
Create a class `Perfect` with methods:
- `void setNum(int n)`: Accepts number as parameter.
- `int findPerfect()`: Checks whether the number is a Perfect number.

```java
import java.util.*;
class Perfect
{
	private int n;
	public void setNum(int n)
	{
		this.n=n;
	}
	
	public int findPerfect()
	{
		int sum=0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			sum+=i;
		}
		return sum;
	}
}

public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		Perfect p = new Perfect();
		p.setNum(n);
		int res = p.findPerfect();
		
		if(res==n)
			System.out.print("Perfect Number");
		else
			System.out.print("Not Perfect Number");
	}
}
```

## Q30. Armstrong Number Check Class

**Problem Statement:**  
Create a class `Armstrong` with methods:
- `void setNum(int n)`: Accepts number as parameter.
- `int checkArm()`: Checks whether the number is an Armstrong number.

```java
import java.util.*;
class Armstrong
{
	private int n;
	public void setNum(int n)
	{
		this.n=n;
	}
	
	public int checkArm()
	{
		int temp=n;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			int p=1;
			for(int i=1; i<=count; i++)
			{
				p=p*rem;
			}
			sum+=p;
			n=n/10;
		}
		return sum;
	}
}

public class Q6
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		Armstrong ar = new Armstrong();
		ar.setNum(n);
		int res = ar.checkArm();
		
		if(res==n)
			System.out.print("Armstrong Number");
		else
			System.out.print("Not Armstrong Number");
	}
}
```

## Q31. Prime Number Check Class

**Problem Statement:**  
Create a class `Prime` with methods:
- `void setValue(int n)`: Accepts number as parameter.
- `int checkPrime()`: Checks whether the number is a Prime number.

```java
import java.util.*;
class Prime
{
	private int n;
	public void setValue(int n)
	{
		this.n=n;
	}
	
	public int checkPrime()
	{
		int count=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
				count++;
		}
		return count;
	}
	
}

public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		Prime p = new Prime();
		p.setValue(n);
		int res = p.checkPrime();
		
		if(res==2)
			System.out.print("Prime Number");
		else
			System.out.print("Not Prime Number");
	}
}
```

## Q32. Duck Number Check Class

**Problem Statement:**  
Create a class `Duck` with methods:
- `void setValue(int n)`: Accepts number as parameter.
- `void checkDuck()`: Checks whether the number is a Duck number.

```java
import java.util.*;
class Duck
{
	private int n;
	public void setValue(int n)
	{
		this.n=n;
	}
	
	public void checkDuck()
	{
		boolean flag=false;
		while(n!=0)
		{
			int rem = n%10;
			
			if(rem==0)
				flag=true;
				
			n=n/10;
		}
		
		if(flag)
			System.out.print("Duck Number");
		else
			System.out.print("Not Duck Number");
	}
}

public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		Duck d = new Duck();
		d.setValue(n);
		d.checkDuck();
		
	}
}
```

## Q33. Fibonacci Series Class

**Problem Statement:**  
Create a class `Fibo` with methods:
- `void setLimit(int limit)`: Sets limit for Fibonacci series.
- `void checkFibo()`: Prints Fibonacci series up to specified limit.

```java
import java.util.*;
class Fibo
{
	private int limit;
	public void setLimit(int limit)
	{
		this.limit=limit;
	}
	public void checkFibo()
	{
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		for(int i=1; i<=limit-2; i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}

public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the limit: ");
		int limit = sc.nextInt();
		
		Fibo f = new Fibo();
		f.setLimit(limit);
		f.checkFibo();
		
	}
}
```
