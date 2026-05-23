/* Q11. WAP to create class name as Sort with two functions 
void setValue(int …x): this function can accept infinite value 
void sort(): this function can perform sorting on variable argument array
void display(): this function can display the data of array before sorting and after
sorting 
 */
 
class Sort
{
    private int[] arr;   // to store the values

    public void setValue(int... x)
    {
        arr = x;   //store varargs values
    }

    public void sort()
    {
        // Simple Bubble Sort using normal for loops
		//(Bubble Sort)
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;   // 
                }
            }
        }
    }

    public void display()
    {
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Sort_11
{
    public static void main(String x[])
    {
        Sort s = new Sort();

        // Passing infinite values
        s.setValue(50, 10, 5, 90, 20, 1);

        System.out.println("Before Sorting:");
        s.display();

        s.sort();

        System.out.println("After Sorting:");
        s.display();
    }
}
/* 

🔄 Pass-by-pass Dry Run
PASS 1 (i = 0)
Compare arr[0] = 50 and arr[1] = 10

50 > 10 → swap
→ 10 50 5 90 20 1

Compare 50 and 5

50 > 5 → swap
→ 10 5 50 90 20 1

Compare 50 and 90

50 < 90 → no swap
→ 10 5 50 90 20 1

Compare 90 and 20

90 > 20 → swap
→ 10 5 50 20 90 1

Compare 90 and 1

90 > 1 → swap
→ 10 5 50 20 1 90

Array after Pass 1:

10 5 50 20 1 90

PASS 2 (i = 1)
Compare 10 and 5

10 > 5 → swap
→ 5 10 50 20 1 90

Compare 10 and 50

10 < 50 → no swap
→ 5 10 50 20 1 90

Compare 50 and 20

50 > 20 → swap
→ 5 10 20 50 1 90

Compare 50 and 1

50 > 1 → swap
→ 5 10 20 1 50 90

Array after Pass 2:

5 10 20 1 50 90

PASS 3 (i = 2)
Compare 5 and 10

No swap

Compare 10 and 20

No swap

Compare 20 and 1

20 > 1 → swap
→ 5 10 1 20 50 90

Array after Pass 3:

5 10 1 20 50 90

PASS 4 (i = 3)
Compare 5 and 10

No swap

Compare 10 and 1

10 > 1 → swap
→ 5 1 10 20 50 90

Array after Pass 4:

5 1 10 20 50 90

PASS 5 (i = 4)
Compare 5 and 1

5 > 1 → swap
→ 1 5 10 20 50 90

Array after Pass 5:

1 5 10 20 50 90

🎉 Final Sorted Array
1 5 10 20 50 90 */

/* 
java Sort_11.java
Before Sorting:
Array elements:
50 10 5 90 20 1
After Sorting:
Array elements:
1 5 10 20 50 90 */