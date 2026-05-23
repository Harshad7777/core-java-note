/* 16. Generate Multiplication Table
Create a class MultiplicationTable with a method printTable to print the table of a given number.
Explanation: Explains nested loops and formatted printing. */


class MultiplicationTable
{
    public void printTable(int n) 
	{
        for (int i = 1; i <= 10; i++) 
		{
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

public class MultiplicationTable_16
{
	public static void main(String[] args) 
	
	{
        MultiplicationTable obj = new MultiplicationTable();
		
        obj.printTable(5);
    }
}
    


/* java MultiplicationTable_16.java
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50 */