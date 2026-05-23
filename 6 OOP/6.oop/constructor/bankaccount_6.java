/* Q6. Create a BankAccount class with:
      accountNumber, name, balance
      Initialize these using a parameterized constructor.

      Create a method withdraw(int amount) that checks:
      ✔ Amount must be greater than 0
      ✔ Amount must be <= balance
      ✔ After withdrawal, update balance
      ✔ If invalid → print message accordingly

      Explanation:
      Multiple logical checks are applied together.
*/

import java.util.*;

class BankAccount
{
    private int accountNumber;
    private String name;
    private double balance;

    // Parameterized constructor
    public BankAccount(int accountNumber, String name, double balance)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Method to withdraw money
    public void withdraw(int amount)
    {
        if(amount <= 0)
        {
            System.out.println("Invalid amount. Withdrawal must be greater than 0.");
        }
        else if(amount > balance)
        {
            System.out.println("Insufficient balance. Cannot withdraw " + amount);
        }
        else
        {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);
        }
    }
}

public class bankaccount_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter account holder name: ");
        String name = sc.next();

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        BankAccount acc = new BankAccount(accNo, name, bal);

        System.out.print("Enter amount to withdraw: ");
        int amt = sc.nextInt();

        acc.withdraw(amt);
    }
}


/* >java bankaccount_6.java
Enter account number: 12345
Enter account holder name: harshad
Enter initial balance: 1000000
Enter amount to withdraw: 50000
Withdrawal successful! */