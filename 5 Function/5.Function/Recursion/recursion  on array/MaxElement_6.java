Q6. Write a Java program to find and return the maximum element from an integer array.Use a function that returns the maximum value.


public class MaxElementRec_6 {
    static int findMax(int arr[], int index) {
        if (index == arr.length - 1)
            return arr[index];
        int maxRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxRest);
    }

    public static void main(String[] args) {
        int arr[] = {12, 45, 23, 51, 19, 8};
        System.out.println("Maximum: " + findMax(arr, 0));
    }
}

