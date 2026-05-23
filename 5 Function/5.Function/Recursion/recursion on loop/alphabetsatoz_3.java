/* Q3. Write a java program to print all alphabets from a to z. - using while loop */

import java.util.*;
public class alphabetsatoz_3
{
	
	static void printAlphabets(char ch)
	{
		if(ch>'z')
			return;
		
		System.out.println(ch+ " ");
		printAlphabets((char)(ch+1));
	}
	
	public static void main(String x[])
	{
		
		char ch = 'a';
		printAlphabets(ch);
	}
	
}
/* 
public class PrintAlphabets 
{
    static void printAlphabets(char ch) 
	{
        if (ch > 'z')
            return;
        System.out.print(ch + " ");
        printAlphabets((char)(ch + 1));
    }

    public static void main(String[] args) 
	{
        printAlphabets('a');
    }
} */

/* 
java alphabetsatoz_3.java
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