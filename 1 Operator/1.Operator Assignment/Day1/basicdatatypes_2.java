/*Q2. Write a java program to input all basic data types and print its output.
	
	Example :-
	
	Input :-        int a=2 ;              
					char ch='A' ;
					float f=3.14f;
					double d=2.34647;
					long b=1234545;
	
	Output:-	        a=2 ;              
					    ch='A' ;
					    f=3.14f;
					    d=2.34647;
					    b=1234545;
*/

public class basicdatatypes_2
	{
		public static void main(String x[])
		{		
			// System.out.print("Enter a byte value: ");
			// byte b = sc.nextByte();

			// System.out.print("Enter a short value: ");
			// short s = sc.nextShort();

			// System.out.print("Enter an int value: ");
			// int i = sc.nextInt();

			// System.out.print("Enter a long value: ");
			// long l = sc.nextLong();

			// System.out.print("Enter a float value: ");
			// float f = sc.nextFloat();

			// System.out.print("Enter a double value: ");
			// double d = sc.nextDouble();

			// System.out.print("Enter a char value: ");
			// char c = sc.next().charAt(0);

			// System.out.print("Enter a boolean value (true/false): ");
			// boolean bool = sc.nextBoolean();	

					byte b = 1;
					short s = 3;
				    int a=2 ;   
					long l=1234545;
					float f=3.14f;
					double d=2.34647;   
					char ch='A';
					boolean bool = true;
				
					
			System.out.println("byte= "+b);
			System.out.println("short= "+s);		
			System.out.println("int "+a);
			System.out.println("long= "+l);
			System.out.println("float= "+f);
			System.out.println("double= "+d);
			System.out.println("char= "+ch);
			System.out.println("boolean= "+bool);

		}
	}

	
/*	
C:\Program Files\Java\jdk-24\bin>javac Day1.java
C:\Program Files\Java\jdk-24\bin>java Day1
a= 2
ch= A
f= 3.14
d= 2.34647
b= 1234545
*/
