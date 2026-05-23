/* 18. Check Leap Year
Create a class LeapYearChecker with a method isLeapYear to check if a year is a leap year.
Explanation: Implements logical conditions for leap year calculation. */

class LeapYearChecker 
{

    public boolean isLeapYear(int year) 
	{
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
            return true;
			
		}
        return false;
    }
}
public class LeapYearChecker_18 
{
	public static void main(String x[]) 
	{
        LeapYearChecker obj = new LeapYearChecker();
		
        System.out.println("Leap year? " + obj.isLeapYear(2024));
    }
}
/* 
java LeapYearChecker_18.java
Leap year? true */
    

