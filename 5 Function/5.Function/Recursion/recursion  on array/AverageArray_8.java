/* Q8. Write a Java function that returns the average value of all elements in an array.
 */

public class AverageRec_8 {
    static int sum(int arr[], int index) {
        if (index == arr.length)
            return 0;
        return arr[index] + sum(arr, index + 1);
    }

    static double average(int arr[]) {
        return (double) sum(arr, 0) / arr.length;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println("Average: " + average(arr));
    }
}
