/* Q9. Write a Java program to count how many even numbers are present in an array.
Return the count. */


public class CountEvenRec_9 {
    static int countEven(int arr[], int index) {
        if (index == arr.length)
            return 0;
        int add = (arr[index] % 2 == 0) ? 1 : 0;
        return add + countEven(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 11, 14, 17};
        System.out.println("Even Count: " + countEven(arr, 0));
    }
}

