/* Q10. WAP to create class name as FindMax with two functions 
void setValue(int …x): this function accept infinite parameter from calling
int  getMax(): this function can find the value from the function and return it.
 */
 
class FindMax
 {
	 private int[] arr;
	 private int max;
	 
	 public void setValue(int...x)//...variable argument	
	 {
		arr = x;
	 }
	 
	 public int getMax()
	 {
		 if(arr.length == 0)
		 {
			 System.out.println("no value provided!");
			 return -1;
		 }
		 
		 max = arr[0];
		 
		 for(int i = 1; i<arr.length; i++ )
		 {
			 if(arr[i]>max)
			 {
				 max = arr[i];
			 }
		 }
		 return max;
	 }
	
 }

public class FindMax_10
{
	public static void main(String x[])
	{
		FindMax f = new FindMax();
		
		f.setValue(10,50,20,5,99,3);
		
		System.out.println("max val is : "+f.getMax());
	}
}