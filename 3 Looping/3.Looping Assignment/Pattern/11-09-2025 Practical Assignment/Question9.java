/*Q9. Write a java program to print this pattern.
	1
	2	*	2
	3	*	3	*	3
	4	*	4	*	4	*	4
	3	*	3	*	3
	2	*	2
	1
*/
public class Question9
{
    public static void main(String[] args)
    {
        int n = 4;

        // Upper half
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
                if (j < i)
                    System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
                if (j < i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
