/* Q3. Write a java program to print all alphabets from a to z. - using while loop
 */

import java.util.*;
public class printalphabetatoz_3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("all alphabates are:");
		
		alphabetatoz();
		
	}
	
	public static void alphabetatoz()
	{
		char ch = 'a';
		while(ch<='z')
		{
			System.out.println(ch+" ");
			ch++;
		}
	}
}
/* 
java printalphabetatoz_3.java
all alphabates are:
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
z */