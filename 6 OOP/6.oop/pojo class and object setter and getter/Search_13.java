/* Q13. WAP to create class name as Search with two functions 
 boolean isPresent(int  key,int …value): this function can search the key present in an
array or not if present returns true otherwise return false.
 */
 
class Search
{
    public boolean isPresent(int key, int... value)
    {
        Normal for loop
        for (int i = 0; i < value.length; i++)
        {
            if (value[i] == key)
            {
                return true;   // key found
            }
        }
        return false;   // key not found
    }
}

public class Search_13
{
    public static void main(String x[])
    {
        Search s = new Search();

        int key = 20;

        boolean result = s.isPresent(key, 5, 10, 15, 20, 25, 30);

        if (result)
            System.out.println(key + " is present in array");
        else
            System.out.println(key + " is NOT present in array");
    }
}


/* java Search_13.java
20 is present in array
 */
 