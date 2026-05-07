
// 1. Find Maximum Element using ArrayList 
// Problem: Store integers in an ArrayList and find the maximum element. 
// Requirement: Do not use array. 
// Example: 
// Input: [3, 7, 2, 9, 5] 
// Output: 9



// import java.util.*;
// public class MaxElementInArrayList
// {
//     public static void main(String x[])
//     {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(3);
//         list.add(7);
//         list.add(2);
//         list.add(9);
//         list.add(5);

//         int max = Integer.MIN_VALUE; // Initialize max to the smallest integer value

//         for (Integer num : list) 
//             {
//                 if (num > max) 
//                 {
//                     max = num; // Update max if the current number is greater
//                 }
//            }

//         System.out.println("Maximum element in the ArrayList: " + max);
//     }
// }



// 2. Reverse Elements in ArrayList 
// Problem: Reverse the elements stored in an ArrayList. 
// Example: 
// Input: [1, 2, 3, 4] 
// Output: [4, 3, 2, 1] 


import java.util.*;

public class ReverseArrayList
{
    public static void main(String x[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Collections.reverse(list); // Reverse the elements in the ArrayList

        System.out.println("Reversed ArrayList: " + list);
    }
}


// 3. Sum of Elements in ArrayList 
// Problem: Calculate the sum of all elements in an ArrayList. 
// Example: 
// Input: [1, 2, 3, 4] 
// Output: 10

import java.util.*;
public class SumOfArrayList          
{
    public static void main(String x[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);     
        list.add(3);
        list.add(4);

        int sum = 0; // Initialize sum to 0
        for (Integer num : list) 
        {
            sum += num; // Add each number to the sum
        }
        System.out.println("Sum of elements in the ArrayList: " + sum);
    }
}


Got it — this is your **machine test paper**, so I’ll give you **clean, exam-ready Java programs** with:
✔ user input
✔ proper indentation
✔ comments (important for marks)

---

# ✅ Q1. Highest Frequency Element using HashMap

```java
import java.util.*;

public class Q1_HighestFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Taking array input
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // HashMap to store frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Counting frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int element = 0;

        // Finding highest frequency element
        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                element = key;
            }
        }

        // Output
        System.out.println("Element with highest frequency: " + element);
        System.out.println("Frequency: " + maxFreq);
    }
}
```

---

# ✅ Q2. Next Greater Element (Using ArrayList only)

```java
import java.util.*;

public class Q2_NextGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Finding next greater element
        for (int i = 0; i < list.size(); i++) {
            int next = -1;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) > list.get(i)) {
                    next = list.get(j);
                    break;
                }
            }

            System.out.println(list.get(i) + " -> " + next);
        }
    }
}
```

---

# ✅ Q3. Reverse Each Word in Sentence

```java
import java.util.*;

public class Q3_ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        // Store words in ArrayList
        ArrayList<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));

        // Reverse each word
        for (String word : words) {
            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }

            System.out.print(rev + " ");
        }
    }
}
```

---

# ✅ Q4. Word Frequency using HashMap

```java
import java.util.*;

public class Q4_WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        // HashMap for frequency
        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Display result
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
```

---

# ✅ Q5. Sort Strings by Length

```java
import java.util.*;

public class Q5_SortByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter words: ");
        String input = sc.nextLine();

        ArrayList<String> list = new ArrayList<>(Arrays.asList(input.split(" ")));

        // Sort based on length
        Collections.sort(list, (a, b) -> a.length() - b.length());

        // Output
        System.out.println("Sorted words:");
        for (String word : list) {
            System.out.println(word);
        }
    }
}
```

---

# 🎯 Exam Tips (Important)

* Write **comments → you get extra marks**
* Maintain **proper indentation**
* Use **Scanner input (mandatory)**
* Even if logic slightly different → marks still given

---

If you want, I can:
✔ Combine all into **menu-driven program (full project)**
✔ Or give **handwritten-style notes for writing in exam**




