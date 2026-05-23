/*
Q18. Write a Java program to convert days to years, month and week.
*/

import java.util.*;

public class DayToYearMonthWeek_18
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println("Years : " + years);
        System.out.println("Months: " + months);
        System.out.println("Weeks : " + weeks);
        System.out.println("Days  : " + days);
    }
}

/* 
>java dayToyearMonthWeek
enter days
365
days to years1.0
remaining12.166666666666666
remaining52.142857142857146 */