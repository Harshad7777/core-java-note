
/*
Q30. Write a Java program to check whether a number is a multiple of both 3 and 5 using logical AND (&&) operator.
Input: 15
Output: Multiple of both 3 and 5
*/
import java.util.*;
public class numbermultipleof3and5_30	
	{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextInt();

       String msg =(num % 3 == 0 && num % 5 == 0)?"Multiple of both 3 and 5":"Not a multiple of both 3 and 5"; 
           
		System.out.println("num"+msg);   
    }
}

/* >javac numbermultipleof3and5.java
>java numbermultipleof3and5
Enter a number: 15
numMultiple of both 3 and 5 */