/* Q12. WAP to create class name as Rev with two functions 
void setValue(int …x): this function can accept infinite values from calling 
void rev(): this function can reverse the array and display it */

class Rev
{
    private int[] arr;   // store values

    public void setValue(int... x)
    {
        arr = x;   // store varargs
    }

    public void rev()
    {
        System.out.println("Before Reverse:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Reverse logic (swap from both ends)
        int start = 0;
        int end = arr.length - 1;

        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("After Reverse:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Rev_12
{
    public static void main(String x[])
    {
        Rev r = new Rev();

        r.setValue(10, 20, 30, 40, 50, 60, 70);

        r.rev();
    }
	
}
/* 
start = 0
end   = 5
arr = [10, 20, 30, 40, 50, 60]
Iteration 1
powershell
कोड कॉपी करणे
start = 0, end = 5
swap arr[0] and arr[5]
After swap:

ini
कोड कॉपी करणे
arr = [60, 20, 30, 40, 50, 10]
start = 1, end = 4
Iteration 2
powershell
कोड कॉपी करणे
start = 1, end = 4
swap arr[1] and arr[4]
After swap:

ini
कोड कॉपी करणे
arr = [60, 50, 30, 40, 20, 10]
start = 2, end = 3
Iteration 3
powershell
कोड कॉपी करणे
start = 2, end = 3
swap arr[2] and arr[3]
After swap:

ini
कोड कॉपी करणे
arr = [60, 50, 40, 30, 20, 10]
start = 3, end = 2
Now:

powershell
कोड कॉपी करणे
start (3) > end (2)
Loop stops.

✅ Final Output After Reverse
Printing:

i	arr[i]
0	60
1	50
2	40
3	30
4	20
5	10

👉 Output:

mathematica
कोड कॉपी करणे
After Reverse:
60 50 40 30 20 10
🎉 Final Program Output
 */

/* java Rev_12.java
Before Reverse:
10 20 30 40 50 60
After Reverse:
60 50 40 30 20 10 */

