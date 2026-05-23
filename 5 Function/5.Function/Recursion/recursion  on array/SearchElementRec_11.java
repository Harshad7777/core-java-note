/* Q11. Write a Java program to search for an element in an array and return its index position.
If the element is not found, return -1. */


public class SearchElementRec_11 
{
    static int search(int arr[], int index, int key) 
	{
        if (index == arr.length)
            return -1;
        if (arr[index] == key)
            return index;
        return search(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int result = search(arr, 0, key);
        System.out.println(result == -1 ? "Not found" : "Found at index: " + result);
    }
}

