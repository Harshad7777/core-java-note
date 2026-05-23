/* Q5. Write a java program to print all odd numbers between 1 to 100.
 */
 
import java.util.*;
public class oddnumbers1to100_5
{
	static void printodd(int n)
	{
		if(n>100)
		return;
	
		if(n%2 != 0)
			
		System.out.println(n+" ");
		printodd(n+1);
	}
	
	public static void main(String x[])
	{
		int n = 1;
		printodd(n);
	}
	
	
}
/* 
java oddnumbers1to100_5.java
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
 */