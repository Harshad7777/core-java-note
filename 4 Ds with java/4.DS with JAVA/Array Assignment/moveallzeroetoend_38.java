/* Q3. Write a program in java to move all zeroes to the end of a given array.
		Expected Output :
		The given array is : 2 5 7 0 4 0 7 -5 8 0
		The new array is:
		2 5 7 8 4 -5 7 0 0 0
 */
 
public class moveallzeroetoend38
{
	public static void main (String x[])
	{
		int a[] = new int[] {2, 5, 7, 0, 4, 0, 7, -5, 8, 0};
		
		int index = 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				a[index++] = a[i];
			}
		}
		while(index<a.length)
		{
			a[index++] = 0;
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}




/* 
public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 0, 4, 0, 7, -5, 8, 0};

        System.out.print("The given array is : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Move zeroes
        int index = 0; // position for next non-zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill remaining with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println("The new array is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
 */