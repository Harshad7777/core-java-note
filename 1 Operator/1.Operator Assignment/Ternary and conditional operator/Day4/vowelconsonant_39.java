/*
Q39. Write a java program to input any alphabet and check whether it is vowel or consonant.
*/

import java.util.*;
public class vowelconsonant_39
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter alphabet");
			char ch = sc.next().charAt(0);
			
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <='Z')
				{
					if(ch == 'a' || ch=='i'|| ch=='o'|| ch =='u' || ch == 'A' || ch=='I' || ch=='O' || ch=='U' )
					{
						System.out.println(ch +" is a vowel");
					}
					else
					{
						System.out.println(ch +" is a consonant");
					}
				}
			else
			{
				System.out.println("invalid input! please enter an alphabet");
			}
		}
	}
	
	
// >javac vowelconsonant.java
// >java vowelconsonant
// enter alphabet
// a
// a is a vowel

// >java vowelconsonant
// enter alphabet
// ^A
// invalid input! please enter an alphabet

// >java vowelconsonant
// enter alphabet
// 1
// invalid input! please enter an alphabet

// >