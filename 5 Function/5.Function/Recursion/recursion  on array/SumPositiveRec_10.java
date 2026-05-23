/* Q10. Write a Java function that returns the sum of all positive numbers present in an array. */

public class SumPositiveRec_10 
{
    static int sumPositive(int arr[], int index) {
        if (index == arr.length)
            return 0;
        int add = (arr[index] > 0) ? arr[index] : 0;
        return add + sumPositive(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = {-2, 5, -3, 7, 9, -1};
        System.out.println("Sum of Positive Numbers: " + sumPositive(arr, 0));
    }
}
