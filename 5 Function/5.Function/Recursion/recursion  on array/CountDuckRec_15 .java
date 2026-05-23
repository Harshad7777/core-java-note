/* 
Q15. Write a Java program to return the count of duck elements present in an integer array.
 */
 
public class CountDuckRec_15 
{
    static boolean isDuck(int n) 
	{
        if (n == 0)
            return false;
        if (n % 10 == 0)
            return true;
        if (n / 10 == 0)
            return false;
        return isDuck(n / 10);
    }

    static int countDuck(int arr[], int index) {
        if (index == arr.length)
            return 0;
        int add = isDuck(arr[index]) ? 1 : 0;
        return add + countDuck(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 305, 42, 5, 100};
        System.out.println("Duck Count: " + countDuck(arr, 0));
    }
}
