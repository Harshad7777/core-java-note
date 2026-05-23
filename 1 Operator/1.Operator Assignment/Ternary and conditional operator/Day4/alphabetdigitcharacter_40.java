/*
Q40. Write a java program to input any character and check whether it is alphabet, digit or special character.
*/
import java.util.*;
public class alphabetdigitcharacter_40
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter character");
			char ch = sc.next().charAt(0);

				if(ch >= 'a' && ch <= 'z' || ch >= 'A' &&  ch <='Z' )
				{
					System.out.println(ch +" is a character");
				}
				else if (ch >='0' )					
				{
					System.out.println(ch +" is a digit");
				}
				else 
				{
					System.out.println(ch +" is a special character");
				}
		}
			
	}
	
	
// >javac alphabetdigitcharacter.java
// >java alphabetdigitcharacter
// enter character
// A
// A is a character

// >java alphabetdigitcharacter
// enter character
// 1
// 1 is a digit

// >java alphabetdigitcharacter
// enter character
// @
// @ is a digit

// >java alphabetdigitcharacter
// enter character
// #
// # is a special character

// >
	