/* Q14. Write a Java program to find and return the sum of all elements placed at even index positions (0, 2, 4, …) in an array.
 */
public class SumEvenIndexRec_14 {
    static int sumEvenIndex(int arr[], int index) {
        if (index >= arr.length)
            return 0;
        return arr[index] + sumEvenIndex(arr, index + 2);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        System.out.println("Sum at Even Index: " + sumEvenIndex(arr, 0));
    }
}
