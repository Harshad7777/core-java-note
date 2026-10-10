# HashMap and Collection Framework Programs in Java

## Code Links

1. [Q1. Remove Duplicate Elements from Array using HashSet](#q1-remove-duplicate-elements-from-array-using-hashset)
2. [Q2. Store Even Numbers in ArrayList](#q2-store-even-numbers-in-arraylist)
3. [Q3. Count Frequency of Each Element using HashMap](#q3-count-frequency-of-each-element-using-hashmap)
4. [Q4. Remove Element from Vector](#q4-remove-element-from-vector)
5. [Q5. Reverse ArrayList](#q5-reverse-arraylist)
6. [Q6. Check Element Exists in Set](#q6-check-element-exists-in-set)
7. [Q7. Find Maximum Value in ArrayList](#q7-find-maximum-value-in-arraylist)
8. [Q8. Merge Two ArrayLists](#q8-merge-two-arraylists)
9. [Q9. Find Key with Highest Value in HashMap](#q9-find-key-with-highest-value-in-hashmap)
10. [Q10. Remove Duplicates from ArrayList using Set](#q10-remove-duplicates-from-arraylist-using-set)
11. [Q11. Count Total Elements in Vector](#q11-count-total-elements-in-vector)
12. [Q12. Convert Set to Array](#q12-convert-set-to-array)
13. [Q13. Find Second Largest Element using ArrayList](#q13-find-second-largest-element-using-arraylist)
14. [Q14. Replace Value in HashMap](#q14-replace-value-in-hashmap)
15. [Q15. Remove All Elements from ArrayList](#q15-remove-all-elements-from-arraylist)
16. [Q16. Find Union of Two Sets](#q16-find-union-of-two-sets)
17. [Q17. Find Intersection of Two Sets](#q17-find-intersection-of-two-sets)
18. [Q18. Store Employee IDs in TreeSet](#q18-store-employee-ids-in-treeset)
19. [Q19. Count Words Frequency in String using HashMap](#q19-count-words-frequency-in-string-using-hashmap)
20. [Q20. Find Common Elements in 3 Arrays using Set](#q20-find-common-elements-in-3-arrays-using-set)
21. [Q21. Sort Map by Keys using TreeMap](#q21-sort-map-by-keys-using-treemap)
22. [Q22. Find Pair with Given Sum using HashSet](#q22-find-pair-with-given-sum-using-hashset)
23. [Q23. Remove Elements Greater than Average using ArrayList](#q23-remove-elements-greater-than-average-using-arraylist)
24. [Q24. Count Character Frequency using TreeMap](#q24-count-character-frequency-using-treemap)
25. [Q25. Rotate ArrayList by K Positions](#q25-rotate-arraylist-by-k-positions)
26. [Q26. Merge Two Maps with Summing Values](#q26-merge-two-maps-with-summing-values)
27. [Q27. Find All Anagrams using Map](#q27-find-all-anagrams-using-map)
28. [Q28. Find Majority Element (> n/2 times)](#q28-find-majority-element-n2-times)
29. [Q29. Group Even and Odd Numbers using Map](#q29-group-even-and-odd-numbers-using-map)
30. [Q30. Implement Word Dictionary using HashMap](#q30-implement-word-dictionary-using-hashmap)
31. [Q31. Find Kth Largest Element using TreeSet](#q31-find-kth-largest-element-using-treeset)
32. [Q32. Find Subarray with Maximum Sum using ArrayList](#q32-find-subarray-with-maximum-sum-using-arraylist)
33. [Q33. Find All Elements Appearing Exactly Twice](#q33-find-all-elements-appearing-exactly-twice)
34. [Q34. Flatten List of Lists](#q34-flatten-list-of-lists)
35. [Q35. Find Top 3 Maximum Numbers using TreeSet](#q35-find-top-3-maximum-numbers-using-treeset)
36. [Q36. Detect Duplicate Elements using Set](#q36-detect-duplicate-elements-using-set)
37. [Q37. Invert a Map (Value → List of Keys)](#q37-invert-a-map-value-list-of-keys)
38. [Q38. Find Longest Word using ArrayList](#q38-find-longest-word-using-arraylist)



## Q1. Remove Duplicate Elements from Array using HashSet

```java
import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[8];
		System.out.print("enter the elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		TreeSet set = new TreeSet();
		for(int i=0; i<arr.length; i++)
		{
			set.add(arr[i]);
		}
		System.out.print(set);
	}
}
```

## Q2. Store Even Numbers in ArrayList

```java
import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.print("enter the elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList al = new ArrayList();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
				al.add(arr[i]);
		}
		System.out.print(al);
	}
}
```

## Q3. Count Frequency of Each Element using HashMap

```java
import java.util.*;
public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[8];
		System.out.print("enter element: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<a.length; i++)
		{
			map.put(a[i], map.getOrDefault(a[i],0)+1);
		}
		for(Map.Entry<Integer, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey()+"="+m.getValue());
		}
	}
}
```

## Q4. Remove Element from Vector

```java
import java.util.*;
public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		System.out.print("enter element: ");
		for(int i=0; i<5; i++)
		{
			v.add(sc.nextInt());
		}
		System.out.print("enter element remove: ");
		int rem = sc.nextInt();
		Iterator i = v.iterator();
		while(i.hasNext())
		{
			if(i.next().equals(rem))
				i.remove();
		}
		System.out.print("After removing: "+v);
	}
}
```

## Q5. Reverse ArrayList

```java
import java.util.*;
public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter elements: ");
		for(int i=0; i<4; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Before Reverse: "+al);
		Collections.reverse(al);
		System.out.println("After Reverse: "+al);
	}
}
```

## Q6. Check Element Exists in Set

```java
import java.util.*;
public class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		HashSet set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		if(set.contains(20))
			System.out.println("Element Found");
		else
			System.out.println("Element Not Found");
	}
}
```

## Q7. Find Maximum Value in ArrayList

```java
import java.util.*;
public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.print("enter element: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Maximum Element: "+Collections.max(al));
	}
}
```

## Q8. Merge Two ArrayLists

```java
import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		System.out.print("enter element list1: ");
		for(int i=0; i<3; i++)
		{
			list1.add(sc.nextInt());
		}
		System.out.print("enter element list2: ");
		for(int i=0; i<3; i++)
		{
			list2.add(sc.nextInt());
		}
		list1.addAll(list2);
		System.out.print(list1);
	}
}
```

## Q9. Find Key with Highest Value in HashMap

```java
import java.util.*;
public class Q9
{
	public static void main(String x[])
	{
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 60);
		map.put("B", 90);
		map.put("C", 75);
		String topper = "";
		int max = Integer.MIN_VALUE;
		for(Map.Entry<String, Integer> m : map.entrySet())
		{
			if(m.getValue() > max)
			{
				max=m.getValue();	
				topper=m.getKey();
			}
		}
		System.out.println("Topper: "+topper);
	}
}
```

## Q10. Remove Duplicates from ArrayList using Set

```java
import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter elements: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0; i<al.size(); i++)
		{
			set.add(al.get(i));
		}
		System.out.print(set);
	}
}
```

## Q11. Count Total Elements in Vector

```java
import java.util.*;
public class Q11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		System.out.print("enter element: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		System.out.print("Size: "+v.size());
	}
}
```

## Q12. Convert Set to Array

```java
import java.util.*;
public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter element: ");
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0; i<4; i++)
		{
			set.add(sc.nextInt());
		}
		System.out.println("Set: "+set);
		Integer temp[] = set.toArray(new Integer[0]);
		int a[] = new int[temp.length];
		for(int i=0; i<temp.length; i++)
		{
			a[i]=temp[i];
		}
		System.out.print("Array: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
```

## Q13. Find Second Largest Element using ArrayList

```java
import java.util.*;
public class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter element: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		Collections.sort(al);
		System.out.print("Second Largest: "+al.get(al.size()-2));
	}
}
```

## Q14. Replace Value in HashMap

```java
import java.util.*;
public class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ravi", 60);
		System.out.println("Before Marks: "+map);
		map.replace("Ravi", 85);
		System.out.println("After Marks: "+map);
	}
}
```

## Q15. Remove All Elements from ArrayList

```java
import java.util.*;
public class Q15
{
	public static void main(String x[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("Before Remove: "+al);
		al.clear();
		System.out.println("Afrer Remove: "+al);
	}
}
```

## Q16. Find Union of Two Sets

```java
import java.util.*;
public class Q16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set1.addAll(set2);
		System.out.println("Union: "+set1);
	}
}
```

## Q17. Find Intersection of Two Sets

```java
import java.util.*;
public class Q17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set1.retainAll(set2);
		System.out.println("Intersection: "+set1);
	}
}
```

## Q18. Store Employee IDs in TreeSet

```java
import java.util.*;
public class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(105);
		set1.add(101);
		set1.add(110);
		set1.add(103);
		System.out.println("Sorted IDs = "+set1);
	}
}
```

## Q19. Count Words Frequency in String using HashMap

```java

```

## Q20. Find Common Elements in 3 Arrays using Set

**Problem Statement:**  
Find common elements in three arrays using HashSet.

*Example Input:* `A1 = 1 2 3 4 | A2 = 2 3 5 6 | A3 = 2 3 7 8`

*Example Output:* `Common = 2 3`

**Explanation:**  
Use intersection logic with sets.

```java
import java.util.*;
public class Q20
{
	public static void main(String x[])
	{
		int a[] = {1, 2, 3, 4};
		int b[] = {2, 3, 5, 6};
		int c[] = {2, 3, 7, 8};
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for(int i=0; i<b.length; i++)
			set1.add(b[i]);
		for(int i=0; i<c.length; i++)
			set2.add(c[i]);
		for(int i=0; i<a.length; i++)
		{
			if(set2.contains(a[i]))
				System.out.print(a[i]+" ");
		}
	}
}
```

## Q21. Sort Map by Keys using TreeMap

**Problem Statement:**  
Sort HashMap by keys using TreeMap.

*Example Input:* `3 -> C | 1 -> A | 2 -> B`

*Example Output:* `1 -> A | 2 -> B | 3 -> C`

**Explanation:**  
Pass HashMap into TreeMap.

```java
import java.util.*;
public class Q21
{
	public static void main(String x[])
	{
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "C");
		map.put(1, "A");
		map.put(2, "B");
		TreeMap<Integer, String> map2 = new TreeMap<>(map);
		for(Map.Entry<Integer, String> entry1 : map2.entrySet())
		{
			System.out.println(entry1.getKey()+" = "+entry1.getValue());
		}
	}
}
```

## Q22. Find Pair with Given Sum using HashSet

**Problem Statement:**  
Find all pairs whose sum equals target using HashSet.

*Example Input:* `Array = 1 4 5 6 3 2 | Target = 7`

*Example Output:* `Pairs = (1,6) (4,3) (5,2)`

**Explanation:**  
Use HashSet for checking complement.

```java
import java.util.*;
public class Q22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {1, 4, 5, 6, 3, 2};
		int target = 7;
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<a.length; i++)
		{
			int complement = target - a[i];
			if(set.contains(complement))
			{
				System.out.println(complement+","+a[i]);
			}
			set.add(a[i]);
		}
	}
}
```

## Q23. Remove Elements Greater than Average using ArrayList

**Problem Statement:**  
Remove all numbers greater than average from ArrayList.

*Example Input:* `[10,20,30,40,50]`

*Example Output:* `[10,20,30]`

**Explanation:**  
Find average and remove elements greater than average.

```java
import java.util.*;
public class Q23
{
	public static void main(String x[])
	{
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		int sum=0;
		for(int i=0; i<al.size(); i++)
			sum = sum + al.get(i);
		double average = (double)sum/al.size();
		Iterator<Integer> i = al.iterator();
		while(i.hasNext())
		{
			int value = i.next();
			if(value > average)
				i.remove();
		}
		System.out.print(al);
	}
}
```

## Q24. Count Character Frequency using TreeMap

**Problem Statement:**  
Count character frequency in string using TreeMap.

*Example Input:* `"banana"`

*Example Output:* `a = 3 | b = 1 | n = 2`

**Explanation:**  
TreeMap sorts keys automatically.

```java
import java.util.*;
public class Q24
{
	public static void main(String x[])
	{
		String s = "banana";
		TreeMap<Character, Integer> map = new TreeMap<>();
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+"=="+entry.getValue());
		}
	}
}
```

## Q25. Rotate ArrayList by K Positions

**Problem Statement:**  
Rotate elements of ArrayList by K positions.

*Example Input:* `[1,2,3,4,5] | K = 2`

*Example Output:* `[4,5,1,2,3]`

**Explanation:**  
Use Collections.rotate().

```java
import java.util.*;
public class Q25
{
	public static void main(String x[])
	{
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		int k=2;
		Collections.rotate(al, k);
		System.out.println(al);
	}
}
```

## Q26. Merge Two Maps with Summing Values

**Problem Statement:**  
Merge two maps. If key exists in both, sum values.

*Example Input:* `Map1: A=10, B=20 | Map2: A=5, C=15`

*Example Output:* `A=15, B=20, C=15`

**Explanation:**  
Use map.merge().

```java
import java.util.*;
public class Q26
{
	public static void main(String x[])
	{
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("A", 10);
		map1.put("B", 20);
		HashMap<String, Integer> map2 = new HashMap<>();
		map1.put("A", 5);
		map1.put("C", 15);
		for(Map.Entry<String, Integer> entry : map2.entrySet())
		{
            map1.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        System.out.println(map1);
	}
}
```

## Q27. Find All Anagrams using Map

**Problem Statement:**  
Group anagrams from list of words.

*Example Input:* `["bat","tab","cat","act"]`

*Example Output:* `[bat,tab] | [cat,act]`

**Explanation:**  
Use sorted string as key.

```java
import java.util.*;
public class Q27
{
	public static void main(String x[])
	{
		String words[] = {"bat","tab","cat","act"};
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		for (String word : words) 
		{
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (!map.containsKey(key)) 
			{
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
		}
		for (ArrayList<String> group : map.values()) 
		{
            System.out.println(group);
        }
	}
}
```

## Q28. Find Majority Element (> n/2 times)

**Problem Statement:**  
Find element appearing more than n/2 times.

*Example Input:* `2 2 1 2 3 2 2`

*Example Output:* `Majority = 2`

**Explanation:**  
Use HashMap for counting frequency.

```java
import java.util.*;
public class Q28
{
    public static void main(String x[])
    {
        int a[] = {2, 2, 1, 2, 3, 2, 2};
        int n = a.length;
        int majority = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++)
        {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            if(map.get(a[i]) > n/2)
            {
                majority = a[i];
                break;
            }
        }
        System.out.println("Majority: " + majority);
    }
}
```

## Q29. Group Even and Odd Numbers using Map

**Problem Statement:**  
Given an integer array, group even and odd numbers into a Map<String, List<Integer>>.

*Example Input:* `Array = 1 2 3 4 5 6`

*Example Output:* `Even = [2,4,6] | Odd = [1,3,5]`

**Explanation:**  
Create Map with keys "Even" and "Odd" and store numbers accordingly.

```java
import java.util.*;
public class Q29
{
	public static void main(String x[])
	{
		int a[] = {1, 2, 3, 4, 5, 6};
		HashMap<String, List<Integer>> map = new HashMap<>();
		map.put("Even", new ArrayList<>());
		map.put("Odd", new ArrayList<>());
		for(int num : a)
		{
			if(num%2==0)
			{
				map.get("Even").add(num);
			}	
			else
			{
				map.get("Odd").add(num);
			}	
		}
		for(Map.Entry<String, List<Integer>> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}
}
```

## Q30. Implement Word Dictionary using HashMap

**Problem Statement:**  
Store word and meaning in HashMap. Allow search functionality.

*Example Input:* `java -> programming language | Search: java`

*Example Output:* `Meaning = programming language`

**Explanation:**  
Use map.get().

```java
import java.util.*;
public class Q30 
{
    public static void main(String x[]) 
	{
        HashMap<String, String> map = new HashMap<>();
        map.put("", "programming language");
        String searchWord = "";
        String meaning = map.get(searchWord);
        if(meaning != null) 
		{
            System.out.println("Meaning = " + meaning);
        } 
		else 
		{
            System.out.println("Word not found");
        }
    }
}
```

## Q31. Find Kth Largest Element using TreeSet

**Problem Statement:**  
Find Kth largest element using TreeSet.

*Example Input:* `10 20 30 40 50 | K = 2`

*Example Output:* `2nd Largest = 40`

**Explanation:**  
Use descending iterator.

```java
import java.util.*;
public class Q31
{
	public static void main(String x[])
	{
		int a[] = {10, 20, 30, 40, 50};
		TreeSet<Integer> set = new TreeSet<>();
		int k=2;
		for(int num : a)
		{
			set.add(num);
		}
		Iterator<Integer> i = set.descendingIterator();
		int count=0;
		int result=-1;
		while(i.hasNext())
		{
			int value = i.next();
			count++;
			if(count == k)
			{
				result=value;
				break;
			}
		}
		if(result != -1)
			System.out.println("Kth Largest: "+result);
		else
			System.out.println("Element does not found");
	}
}
```

## Q32. Find Subarray with Maximum Sum using ArrayList

**Problem Statement:**  
Find maximum subarray sum and store subarray elements in ArrayList.

*Example Input:* `-2 1 -3 4 -1 2 1 -5 4`

*Example Output:* `Max Sum = 6 | Subarray = [4,-1,2,1]`

**Explanation:**  
Use Kadane's Algorithm.

```java
import java.util.*;
public class Q32
{
	public static void main(String x[])
	{
		int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int sum=a[0];
		int maxSum=a[0];
		ArrayList<Integer> al = new ArrayList<>();
		int start=0, end=0, tempStart=0;
		for(int i=1; i<a.length; i++)
		{
			if(sum + a[i] > a[i])
			{
				sum = sum + a[i];
			}
			else
			{
				sum = a[i];
				tempStart=i;
			}
			if(sum > maxSum)
			{
				maxSum=sum;
				start=tempStart;
				end=i;
			}
		}
		System.out.println("Max Sum: "+maxSum);
		for(int i=start; i<=end; i++)
			al.add(a[i]);
		System.out.println("Subarray: "+al);
	}
}
```

## Q33. Find All Elements Appearing Exactly Twice

**Problem Statement:**  
Find elements that appear exactly twice.

*Example Input:* `1 2 3 2 4 1 5 6`

*Example Output:* `1 2`

**Explanation:**  
Count frequency using map.

```java
import java.util.*;
public class Q33
{
	public static void main(String x[])
	{
		int a[] = {1, 2, 3, 2, 4, 1, 5, 6};
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int num : a)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() == 2)
			{
				System.out.print(entry.getKey()+" ");
			}
		}
	}
}
```

## Q34. Flatten List of Lists

**Problem Statement:**  
Given List<List<Integer>>, flatten into single list.

*Example Input:* `[[1,2],[3,4],[5]]`

*Example Output:* `[1,2,3,4,5]`

**Explanation:**  
Use nested loop or addAll().

```java
import java.util.*;
public class Q34
{
	public static void main(String x[])
	{
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(1, 2));
		list.add(Arrays.asList(3, 4));
		list.add(Arrays.asList(5));
		ArrayList<Integer> al = new ArrayList<>();
		for(List<Integer> innerList : list) 
		{
            al.addAll(innerList);
        }
		System.out.println(al);
	}
}
```

## Q35. Find Top 3 Maximum Numbers using TreeSet

**Problem Statement:**  
Given an array, find top 3 maximum numbers using TreeSet.

*Example Input:* `10 50 20 80 40 90 60`

*Example Output:* `Top 3 = 90 80 60`

**Explanation:**  
Use TreeSet to keep sorted order and fetch highest elements.

```java
import java.util.*;
public class Q35
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {10, 50, 20, 80, 40, 90, 60};
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		Iterator<Integer> i = set.descendingIterator();
        int count = 0;
        System.out.print("Top 3 = ");
        while (i.hasNext() && count < 3) 
		{
            System.out.print(i.next()+" ");
            count++;
        }
	}
}
```

## Q36. Detect Duplicate Elements using Set

**Problem Statement:**  
Print all duplicate elements from an array using Set.

*Example Input:* `1 2 3 2 4 5 1 6`

*Example Output:* `Duplicates = 1 2`

**Explanation:**  
Use one set for tracking, another for duplicates.

```java
import java.util.*;
public class Q36
{
	public static void main(String x[])
	{
		int a[] = {1, 2, 3, 2, 4, 5, 1, 6};
		HashSet<Integer> visit = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();
		for(int i : a)
		{
			if(!visit.add(i))
				duplicate.add(i);
		}
		for(int i : duplicate)
			System.out.print(i+" ");
	}
}
```

## Q37. Invert a Map (Value → List of Keys)

**Problem Statement:**  
Invert a Map<String, String> such that values become keys and group corresponding keys in list.

*Example Input:* `A -> X | B -> Y | C -> X`

*Example Output:* `X -> [A,C] | Y -> [B]`

**Explanation:**  
Use Map<String, List<String>>.

```java
import java.util.*;
public class Q37
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		map.put("A", "X");
		map.put("B", "Y");
		map.put("C", "X");
		Map<String, List<String>> map2 = new HashMap<>();
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			String key = entry.getKey();
            String value = entry.getValue();
            if(!map2.containsKey(value))
            {
                map2.put(value, new ArrayList<>());
            }
            map2.get(value).add(key);
		}
		for(Map.Entry<String, List<String>> entry : map2.entrySet())
		{
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}
}
```

## Q38. Find Longest Word using ArrayList

**Problem Statement:**  
Store words in ArrayList and find longest word.

*Example Input:* `["java", "collection", "map", "framework"]`

*Example Output:* `Longest Word = collection`

**Explanation:**  
Compare word lengths.

```java
import java.util.*;
public class Q38
{
	public static void main(String x[])
	{
		ArrayList<String> al = new ArrayList<>(Arrays.asList("", "collection", "map", "framework"));
		String longest = "";
		int len = 0;
		for(String a : al)
		{
			if(a.length() > len)
            {
                len = a.length();
                longest = a;
            }
		}
		System.out.println("Longest Word = "+longest);
	}
}
```
