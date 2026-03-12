import java.util.*;
public class sorting
{
    public static void main(String x[])
    {
        Vector v = new Vector();
        v.add(10);
        v.add(5);
        v.add(20);          
        v.add(40);

        int size = v.size();
        System.out.println("vector sorting before"+v);
        for(int i=0; i<size; i++)
        {
            for(int j=i+1; j<size;j++)
            {
                Object pre= v.get(i);
                Object post = v.get(j);

                if((int)pre > (int)post)
                {
                    v.set(i, post);
                    v.set(j, pre);
                }
            }
        }
        System.out.println("vector sorting after"+v);
    }
}