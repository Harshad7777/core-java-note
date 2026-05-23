/* Q13. Write a Java program to calculate the difference between the largest and smallest numbers in an array.
Return that difference. */


public class DiffRec_13 {
    static int findMax(int arr[], int index) {
        if (index == arr.length - 1) return arr[index];
        return Math.max(arr[index], findMax(arr, index + 1));
    }

    static int findMin(int arr[], int index) {
        if (index == arr.length - 1) return arr[index];
        return Math.min(arr[index], findMin(arr, index + 1));
    }

    public static void main(String[] args) {
        int arr[] = {5, 10, 25, 2, 8};
        int diff = findMax(arr, 0) - findMin(arr, 0);
        System.out.println("Difference: " + diff);
    }
}

