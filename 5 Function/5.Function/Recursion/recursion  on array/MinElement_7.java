/* Q7. Write a Java program to return the smallest number from an array using a function. */

public class MinElementRec_7 {
    static int findMin(int arr[], int index) {
        if (index == arr.length - 1)
            return arr[index];
        int minRest = findMin(arr, index + 1);
        return Math.min(arr[index], minRest);
    }

    public static void main(String[] args) {
        int arr[] = {12, 45, 23, 51, 19, 8};
        System.out.println("Minimum: " + findMin(arr, 0));
    }
}

