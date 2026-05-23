
// Q9. Write a java program swap two number using third variable.

import java.util.Scanner;

public class Day2 
{
	public static void main(String x[]) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("first variable");
		int fv = sc.nextInt();

		System.out.println("second variable");
		int sv = sc.nextInt();

		System.out.println("variable before Swapping");
		System.out.println("a="+ fv + ",b="+sv);
 
		int temp = fv;
		fv = sv;
		sv= temp;

		System.out.println("after Swapping variable");
		System.out.println("a="+fv+ ",b="+sv);

	}
}

// PS C:\Users\harsh\Downloads\java course notes\java\Operator Assignment> javac Day2PSPPPPPS C:\Users\harsh\Downloads\java course notes\java\Operator Assignment> java Day2       
// first variable
// 10
// second variable
// 20
// variable before Swapping
// a=10,b=20
// after Swapping variable
// a=20,b=10
