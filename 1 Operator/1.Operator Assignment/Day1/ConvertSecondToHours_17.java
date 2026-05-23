/*
Q17. Write a Java program to convert seconds to hours, minutes and seconds. 
*/

import java.util.*;

public class ConvertSecondToHours_17 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total seconds:");
        int totalSeconds = sc.nextInt();  // Better to use int, as seconds are whole numbers

        int hours = totalSeconds / 3600;              // calculate hours
        int minutes = (totalSeconds % 3600) / 60;     // calculate remaining minutes
        int seconds = totalSeconds % 60;              // calculate remaining seconds

        System.out.println("Hours    : " + hours);
        System.out.println("Minutes  : " + minutes);
        System.out.println("Seconds  : " + seconds);
    }
}

/* 
>javac convertSecondToHours17.java
>java convertSecondToHours
enter seconds
3600
seconds to hours1.0
seconds to minutes0.0
seconds to seconds0.0
 */
