# String Programs in Java

## Code Links

1. [Q1. Count Vowels, Consonants, Digits, and Special Characters in String](#q1-count-vowels-consonants-digits-and-special-characters-in-string)
2. [Q2. Reverse Each Word Individually in Sentence](#q2-reverse-each-word-individually-in-sentence)
3. [Q3. Find Most Frequently Occurring Character in String](#q3-find-most-frequently-occurring-character-in-string)
4. [Q4. Check Whether Two Strings are Anagrams](#q4-check-whether-two-strings-are-anagrams)
5. [Q5. Remove Duplicate Characters from String](#q5-remove-duplicate-characters-from-string)
6. [Q6. Find First Non-Repeating Character in String](#q6-find-first-non-repeating-character-in-string)
7. [Q7. Check Whether String is Palindrome (Ignoring Spaces and Case)](#q7-check-whether-string-is-palindrome-ignoring-spaces-and-case)
8. [Q8. Find Longest Word in Given Sentence](#q8-find-longest-word-in-given-sentence)
9. [Q9. Replace Each Character with Next Character in ASCII Sequence](#q9-replace-each-character-with-next-character-in-ascii-sequence)
10. [Q10. Count Words Ending with Vowel](#q10-count-words-ending-with-vowel)
11. [Q11. Print All Permutations of String](#q11-print-all-permutations-of-string)
12. [Q12. Compress String using Consecutive Character Frequencies](#q12-compress-string-using-consecutive-character-frequencies)
13. [Q13. Check Whether Two Strings are Isomorphic](#q13-check-whether-two-strings-are-isomorphic)
14. [Q14. Find Lexicographically Smallest and Largest Substring of Length K](#q14-find-lexicographically-smallest-and-largest-substring-of-length-k)
15. [Q15. Reverse Only Alphabets in String (Keeping Special Characters Intact)](#q15-reverse-only-alphabets-in-string-keeping-special-characters-intact)


## Q1. Count Vowels, Consonants, Digits, and Special Characters in String

**Problem Statement:**  
Write a Java program to count the number of vowels, consonants, digits, and special characters present in a given string.

*Example Input:* `"Hello World! 123"`
*Example Output:* `Vowels: 3  Consonant: 7  Digits: 3  Special Character: 3`

```java
import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the String: ");
		String s1 = sc.nextLine();
		
		int v=0;
		int c=0;
		int d=0;
		int s=0;
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
			ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') 
				v++;
				
			else if((ch >=65 && ch <= 90) || (ch >= 97 && ch <= 122))
				c++;
			
			else if(ch >= 48 && ch <= 57)
				d++;
			
			else
				s++;
		}
		
		System.out.print("Vowels: "+v+"\t"+"Consonant: "+c+"\t"+"Digits: "+d+"\t"+"Special Character: "+s);
		
	}
}
```

## Q2. Reverse Each Word Individually in Sentence

**Problem Statement:**  
Given a sentence, reverse each word individually without changing the word order.

*Example Input:* `"Java is fun"`
*Example Output:* `"avaJ si nuf"`

```java
import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the String: ");
		String s = sc.nextLine();
		String result = "";
		String words[] = s.split(" ");
		for(int i=0; i<words.length; i++)
		{
			String word = words[i];
            String rev = "";

            for (int j=word.length()-1; j>=0; j--) 
			{
                rev = rev + word.charAt(j);
            }
			
            result = result + rev + " ";
		}
		
		System.out.print("New String: "+result);
	}
}
```

## Q3. Find Most Frequently Occurring Character in String

**Problem Statement:**  
Write a Java program to find the most frequently occurring character in a given string.

*Example Input:* `"success"`
*Example Output:* `Most Frequent Character: s`

```java
import java.util.*;
public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine();
		
		char ch[] = s.toCharArray();
		
		char c = ch[0];
		int maxCount=0;
		boolean visited[] = new boolean[ch.length];
		
		for(int i=0; i<ch.length; i++)
		{
			if(visited[i])
				continue;
			
			int count=0;
			for(int j=0; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					visited[j] = true;
					count++;
				}	
			}
			
			if(count>maxCount)
			{
				maxCount=count;
				c=ch[i];
			}
		}
		
		System.out.print("Max: "+c);
		
	}
}
```

## Q4. Check Whether Two Strings are Anagrams

**Problem Statement:**  
Check whether two given strings are anagrams of each other.

*Example Input:* `String 1: "listen" | String 2: "silent"`
*Example Output:* `Anagrams`

```java
import java.util.*;
public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		
		
		
	}
}
```

## Q5. Remove Duplicate Characters from String

**Problem Statement:**  
Write a Java program to remove duplicate characters from a string and print the unique string.

*Example Input:* `"programming"`
*Example Output:* `"progami"`

```java
import java.util.*;
public class Q5
 {
    public static void main(String[] args) 
	{
		String s1 = "programming";
		  
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		   
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		   
		String s2 = "";
		for(char c : set)
		{
			s2 = s2 + c;
		}
		
       System.out.print(s2);
    }
}
```

## Q6. Find First Non-Repeating Character in String

**Problem Statement:**  
Find the first character in a string that does not repeat.

*Example Input:* `"aabbcde"`
*Example Output:* `First non-repeating character: c`

```java
import java.util.*;
public class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine();
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
			char c = s.charAt(i);
			for(int j=0; j<s.length(); j++)
			{
				char ch = s.charAt(j);
				if(c==ch)
					count++;
			}
			
			if(count==1)
			{
				System.out.print(c);
				break;
			}
		}
	}
}
```

## Q7. Check Whether String is Palindrome (Ignoring Spaces and Case)

**Problem Statement:**  
Check whether a given string is a palindrome, ignoring spaces and case sensitivity.

*Example Input:* `"A man a plan a canal Panama"`
*Example Output:* `Palindrome`

```java
import java.util.*;
public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine().toLowerCase();
		
		int left=0, right=s.length()-1;
		boolean flag=true;
		while(left < right)
		{
			if (s.charAt(left) == ' ') 
			{
                left++;
                continue;
            }

            if (s.charAt(right) == ' ') 
			{
                right--;
                continue;
            }
			
			if(s.charAt(left) != s.charAt(right))
			{
				flag=false;
				break;
			}
			left++;
			right--;
		}
		
		if(flag)
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
	}
}
```

## Q8. Find Longest Word in Given Sentence

**Problem Statement:**  
Write a Java program to find the longest word in a given sentence.

*Example Input:* `"Java Collection Framework is powerful"`
*Example Output:* `Longest Word: Framework`

```java
import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine();
		String ch[] = s.split(" ");
		String longest = "";
		int max=0;
		for(int i=0; i<ch.length; i++)
		{
		
			int len = ch[i].length();
			if(len > max)
			{
				max = len;
				longest = ch[i];
			}		
		}
		
		System.out.print("Longest Word: "+longest);
	}
}
```

## Q9. Replace Each Character with Next Character in ASCII Sequence

**Problem Statement:**  
Replace each character in the string with the next character in the ASCII sequence.

*Example Input:* `"abcd"`
*Example Output:* `"bcde"`

```java
import java.util.*;
public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine();
		String s1 = "";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			ch = (char)(ch+1);
			s1 +=ch;
		}
		
		System.out.print("New String: "+s1);
	}
}
```

## Q10. Count Words Ending with Vowel

**Problem Statement:**  
Count how many words in a string end with a vowel.

*Example Input:* `"Java is easy to learn"`
*Example Output:* `Count: 3`

```java
import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine();
		String words[] = s.split(" ");
		int count=0;
		for(int i=0; i<words.length; i++)
		{
			String w = words[i];
			char last = w.charAt(w.length()-1);
			if(last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u')
				count++;
		}
		
		System.out.print("Count: "+count);
	}
}
```

## Q11. Print All Permutations of String

**Problem Statement:**  
Write a Java program to print all permutations of a given string.

*Example Input:* `"abc"`
*Example Output:* `abc acb bac bca cab cba`

**Explanation:**  
Fix one character at a time and rearrange remaining characters to generate all n! arrangements.

```java
import java.util.*;
public class Q11 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
        String s = sc.nextLine();
		
        char ch[] = s.toCharArray();
        List<String> list = new ArrayList<>();
    
        for(int i=0; i<ch.length; i++)
        {
            for(int j=0; j<ch.length; j++)
            {
               for(int k=0; k<ch.length; k++)
                {
                   if (i != j && j != k && i != k) 
                   {
                        String res = "" + ch[i] + ch[j] + ch[k];
						System.out.print(res+" ");
                        list.add(res);
                   }
                }
             }
        }
        
       // System.out.print(list);
    }
}
```

## Q12. Compress String using Consecutive Character Frequencies

**Problem Statement:**  
Compress a string such that consecutive repeated characters are replaced by the character followed by its count.

*Example Input:* `"aabcccccaaa"`
*Example Output:* `"a2b1c5a3"`

```java
import java.util.*;
public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.nextLine();
			
		String result = "";
		int i = 0;
		while(i < s.length())
		{
			char c = s.charAt(i);
			int count = 1;
			while(i + 1 < s.length() && s.charAt(i + 1) == c)
			{
				count++;
				i++;
			}
			
			result = result + c + count;
			i++;
		}
		
		System.out.print("New String: "+result);
	}
}
```

## Q13. Check Whether Two Strings are Isomorphic

**Problem Statement:**  
Check whether two strings are isomorphic (characters in the first string can be mapped uniquely to characters in the second string).

*Example Input:* `String 1: "egg" | String 2: "add"`
*Example Output:* `Isomorphic`

```java
import java.util.*;
public class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string 1: ");
		String s1 = sc.nextLine();
		System.out.print("enter string 2: ");
		String s2 = sc.nextLine();
		
		HashSet<Character> set1 = new HashSet<>();
		HashSet<Character> set2 = new HashSet<>();
		
		for(int i=0; i<s1.length(); i++)
			set1.add(s1.charAt(i));
		
		for(int i=0; i<s2.length(); i++)
			set2.add(s2.charAt(i));
		
		if(set1.size() == set2.size())
			System.out.print("Isomorphic");
		else
			System.out.print("Not Isomorphic");
	}
}
```

## Q14. Find Lexicographically Smallest and Largest Substring of Length K

**Problem Statement:**  
Given a string and an integer K, find the lexicographically smallest and largest substring of length K.

*Example Input:* `String: "welcometojava" | K = 3`
*Example Output:* `Smallest: ava | Largest: wel`

```java
import java.util.*;
public class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.next(); 
		int k = 3;
		String currentString = s.substring(0,k);
		String max = currentString;
		String min = currentString;
		
		for(int i=0; i<s.length(); i++)
		{
			currentString = currentString.substring(1,k)+s.charAt(i);
		
			if(max.compareTo(currentString) < 0)
				max = currentString;

			if(min.compareTo(currentString) > 0)
				min = currentString;
		}
		
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
}
```

## Q15. Reverse Only Alphabets in String (Keeping Special Characters Intact)

**Problem Statement:**  
Reverse only alphabets in a string while keeping special characters in their original positions.

*Example Input:* `"a-bC-dQq!"`
*Example Output:* `"q-Qd-Cba!"`

```java
import java.util.*;
public class Q15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string: ");
		String s = sc.next().toLowerCase();
		
		char ch[] = s.toCharArray();
		int start = 0, end = ch.length-1;
		while(start < end)
		{
		
			if(!(ch[start] >= 'a' && ch[start] <= 'z'))
			{
				start++;
			}
			else if(!(ch[end] >= 'a' && ch[end] <= 'z'))
			{
				end--;
			}
			else
			{
				char c = ch[start];
				ch[start]=ch[end];
				ch[end] = c;
				start++;
				end--;
			}
		}
		
		String s1 = new String(ch);
		System.out.print("New String: "+s1);
		
	}
}
```
