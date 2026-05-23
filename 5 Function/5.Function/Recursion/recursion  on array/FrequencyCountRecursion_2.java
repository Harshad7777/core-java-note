
/* Q2. Write a Java program to count the frequency of each element in an array using a function.
Example Input:
arr = {1, 2, 2, 3, 1, 4, 2}
Output:
1 → 2 times  
2 → 3 times  
3 → 1 time  
4 → 1 time
 */
import java.util.*;

public class FrequencyCountRecursion_2
{
    // Recursive function to count frequency
    static void countFrequency(int[] arr, boolean[] visited, int index)
    {
        // Base case
        if (index == arr.length)
            return;

        // If this element is not already counted
        if (!visited[index])
        {
            int count = 1;
            visited[index] = true;

            // Check for duplicates ahead
            for (int j = index + 1; j < arr.length; j++)
            {
                if (arr[index] == arr[j])
                {
                    visited[j] = true;
                    count++;
                }
            }

            // Print frequency of current element
            System.out.println(arr[index] + " → " + count + " time" + (count > 1 ? "s" : ""));
        }

        // Recursive call for next index
        countFrequency(arr, visited, index + 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        boolean[] visited = new boolean[n];

        System.out.println("\nFrequency of each element:");
        countFrequency(arr, visited, 0);
    }
}
/* 
Perfect 👍 Let’s do a step-by-step dry run of the recursion-based frequency counting program for this input:

arr = {1, 2, 2, 3, 1, 4, 2}

🧩 Initial Setup:
Variable	Value
arr	[1, 2, 2, 3, 1, 4, 2]
visited	[false, false, false, false, false, false, false]
index	0
🔁 Step-by-Step Dry Run
Step 1: index = 0

arr[0] = 1

visited[0] = false → So we count how many times 1 appears.

➡ Loop j = 1 to 6:

arr[1]=2 → not equal

arr[2]=2 → not equal

arr[3]=3 → not equal

arr[4]=1 ✅ match → count=2, mark visited[4]=true

arr[5]=4 → not equal

arr[6]=2 → not equal

✅ Print → 1 → 2 times
✅ Update → visited = [true, false, false, false, true, false, false]
🌀 Recurse → countFrequency(arr, visited, 1)

Step 2: index = 1

arr[1] = 2

visited[1] = false → count how many times 2 appears.

➡ Loop j = 2 to 6:

arr[2]=2 ✅ match → count=2, visited[2]=true

arr[3]=3 → not equal

arr[4]=1 → not equal

arr[5]=4 → not equal

arr[6]=2 ✅ match → count=3, visited[6]=true

✅ Print → 2 → 3 times
✅ Update → visited = [true, true, true, false, true, false, true]
🌀 Recurse → countFrequency(arr, visited, 2)

Step 3: index = 2

visited[2] = true → skip (already counted)
🌀 Recurse → countFrequency(arr, visited, 3)

Step 4: index = 3

arr[3] = 3

visited[3] = false → count 3

➡ Loop j = 4 to 6:
No more matches → count = 1

✅ Print → 3 → 1 time
✅ Update → visited = [true, true, true, true, true, false, true]
🌀 Recurse → countFrequency(arr, visited, 4)

Step 5: index = 4

visited[4] = true → skip
🌀 Recurse → countFrequency(arr, visited, 5)

Step 6: index = 5

arr[5] = 4

visited[5] = false → count 4

➡ Loop j = 6: no matches
✅ Print → 4 → 1 time
✅ Update → visited = [true, true, true, true, true, true, true]
🌀 Recurse → countFrequency(arr, visited, 6)

Step 7: index = 6

visited[6] = true → skip
🌀 Recurse → countFrequency(arr, visited, 7)

Step 8: index = 7 (Base Case)

index == arr.length → stop recursion ✅

✅ Final Output
1 → 2 times
2 → 3 times
3 → 1 time
4 → 1 time


 */
 
/*  java FrequencyCountRecursion_2.java
Enter size of array: 7
Enter 7 elements:
1 2 2 3 1 1 4 2

Frequency of each element:
1 ? 2 times
2 ? 3 times
3 ? 1 time
4 ? 1 time */