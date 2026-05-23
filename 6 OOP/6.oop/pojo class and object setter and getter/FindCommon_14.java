/* Q14. Given two arrays, our task is to find their common elements. 
 Input:  Array1 = [“a”, “b”, “c”, “d”, “e”, “f”],
            Array2 = [“b”, “d”, “e”, “h”, “g”, “c”]
Output: [b, c, d, e]
Your Task 

You have to create class names s FindCommonElements with following methods 
void setArray(int a[],int b[]); this function can accept two array as parameter 
Int [] getCommonElements(): you have to create a new third array and find the common element and
return it. */ 



import java.util.*;

class FindCommonElements
{
    private String[] a;
    private String[] b;
    private String[] c;

    public void setArray(String[] a, String[] b, String[] c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getCommonElements()
    {
        int k = 0;

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                if (a[i].equals(b[j]))
                {
                    c[k++] = a[i];
                }
            }
        }

        for (int i = 0; i < k; i++)
        {
            System.out.print(c[i] + " ");
        }
    }
}




public class FindCommon_14
{
    public static void main(String[] x)
    {
        Scanner sc = new Scanner(System.in);

        String[] a = new String[6];
        String[] b = new String[6];
        String[] c = new String[a.length];

        System.out.print("Enter the elements in array1: ");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.next();
        }

        System.out.print("Enter the elements in array2: ");
        for (int i = 0; i < b.length; i++)
        {
            b[i] = sc.next();
        }

        FindCommonElements co = new FindCommonElements();
		
        co.setArray(a, b, c);

        System.out.println("Common elements:");
        co.getCommonElements();
    }
}


/* 
java FindCommon_14.java
Enter elements of Array 1:
a b c d e f
Enter elements of Array 2:
b d e h g c
Common Elements:
b c d e */