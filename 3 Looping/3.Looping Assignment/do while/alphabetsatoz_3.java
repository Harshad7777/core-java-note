/*
Q3. Write a java program to print all alphabets from a to z. - using while loop
*/

import java.util.*;
public class alphabetsatoz_3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter any one alphabets if you start from them");
		
		/* char ch = sc.next().charAt(0); */
		char ch ='a';
		
		do
		{
			System.out.println(ch+" ");
			ch++;
		}
		while(ch<='z');
	}
}

/* 
>javac alphabetsatoz3.java

>java alphabetsatoz3
enter any one alphabets if you start from them
a
a
b
c
d
e
f
g
h
i
j
k
l
m
n
o
p
q
r
s
t
u
v
w
x
y
z

> */