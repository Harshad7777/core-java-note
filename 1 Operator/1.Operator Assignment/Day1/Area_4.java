/*
Q 4. Write a java program to enter length and breadth of a rectangle and find its area.
	
		area = length * breadth;
*/

public class Area_4
{
    public static void main (String x[])
    {
    	int length = Integer.parseInt(x[0]);
        int breadth = Integer.parseInt(x[1]);
        
        int area = length * breadth;
        
        System.out.println("Area of rectangle: " + area);
    }
}

/*
C:\Program Files\Java\jdk-24\bin>javac Day1.java
C:\Program Files\Java\jdk-24\bin>java Day1 10 10
Area of trangle:100
*/
