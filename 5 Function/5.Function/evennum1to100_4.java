/* Q4. Write a java program to print all even numbers between 1 to 100.- using while loop
 */
import java.util.*;
public class evennum1to100_4
{
	public static void main(String x[])
	{
		System.out.println("all even numbers are:");

		evennum1to100();
	}
	
	public static void evennum1to100()
	{
		int i=1;
		while( i<=100)	
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
			i++;
		}	
	}
}
/* 
java evennum1to100_4.java
all even numbers are:
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
82
84
86
88
90
92
94
96
98
100 */