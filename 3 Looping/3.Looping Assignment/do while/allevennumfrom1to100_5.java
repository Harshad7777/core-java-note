/*
Q4. Write a java program to print all even numbers between 1 to 100.- using while loop
*/


import java.util.*;
public class allevennumfrom1to100
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		int i=2;
		int n=100;
		
		while(i<=n)
		{
			System.out.println(i+" ");
			i+=2;
		}
	}
}

/* 
>javac allevennumfrom1to100.java

>java allevennumfrom1to100
2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82402
84
86
88
90
92
94
96
98
100

> */