/* 2. Question:
 Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes. */
/* 
class BankAccount
{
	double balance;
	
	
	
}

public class BankApplication_2
{
	public static void main(String x[])
	{
		SaveingsAccount s = new SaveingsAccount(10000);
		CurrentAccount c = new CurrentAccount(10000);
		
		System.out.println("Saving Interest	:"+s.calculateInterest());
		System.out.println("Current Interest :"+c.calculateInterest());

	}
} */

import java.util.*;

class BankAccount
{
	double bal;
	
	BankAccount(double bal)
	{
		this.bal = bal;
	}
	
	//method overloading
	double calculateInterest()
	{
		return 0;
	}
}	

class SavingsAccount extends BankAccount
	{
		SavingsAccount(double bal)
		{
			super(bal); //constructor chaining
		}
		
		double calculateInterest()
		{
			return bal * 0.05;
		}
	}


class CurrentAccount extends BankAccount
{
	CurrentAccount(double bal)
	{
		super(bal); //constructor chaining		
	}
	double calculateInterest()
	{
		return bal*0.03;
	}
}

public class BankApplication_2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//upcasting
		BankAccount b = null; //polymorfic referance	
		
		System.out.println("enter the amount of SavingsAccount: ");
		double bal = sc.nextDouble();
		
		b = new SavingsAccount(bal);
		double Int = b.calculateInterest();
		System.out.println("interts for SavingsAccount is "+ Int);
		
		
		System.out.println("enter the amount of CurrentAccount: ");
		bal = sc.nextDouble();
		
		b = new CurrentAccount(bal);
	    Int = b.calculateInterest();
		System.out.println("interts for CurrentAccount is "+ Int);
	}
}


/* >java BankApplication_2.java
enter the amount of SavingsAccount:
100000
interts for SavingsAccount is 5000.0
enter the amount of CurrentAccount:
100000
interts for CurrentAccount is 3000.0 */