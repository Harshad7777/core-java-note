/*
Q5. Write a java program to print all odd numbers between 1 to 100.
*/


import java.util.*;
public class alloddnumfrom1to100
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		int i=1;
		int n=100;
		
		while(i<=n)
		{
			System.out.println(i+" ");
			i+=2;
		}
	}
}
/* 

>javac alloddnumfrom1to100.java

>java alloddnumfrom1to100
1
3
5
7
9
11
13
15
17
19
21
23
25
27
29
31
33
35
37
39
41
43
45
47
49
51
53
55
57
59
61
63
65
67
69
71
73
75
77
79
81
83
85
87
89
91
93
95
97
99

> */