import java.util.*;

public class SApplication
{
    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);
        int a[] = new int[5];
        int top = -1;
        int choice;

        do
        {
            System.out.println("1 : PUSH");
            System.out.println("2 : POP");
            System.out.println("3 : DISPLAY");
            System.out.println("4 : PEEK");
            System.out.println("5 : SEARCH");
            System.out.println("6 : EXIT");
            System.out.print("Enter your choice : ");

            choice = xyz.nextInt();

            switch(choice)
            {
                // PUSH
                case 1:
                    if(top == a.length - 1)
                    {
                        System.out.println("Stack Overflow");
                    }
                    else
                    {
                        System.out.print("Enter value : ");
                        int value = xyz.nextInt();
                        top++;
                        a[top] = value;
                        System.out.println("Element pushed");
                    }
                    break;

                // POP
                case 2:
                    if(top == -1)
                    {
                        System.out.println("Stack Underflow");
                    }
                    else
                    {
                        System.out.println("Popped value : " + a[top]);
                        top--;
                    }
                    break;

                // DISPLAY
                case 3:
                    if(top == -1)
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        System.out.println("Stack elements:");
                        for(int i = top; i >= 0; i--)
                        {
                            System.out.println(a[i]);
                        }
                    }
                    break;

                // PEEK
                case 4:
                    if(top == -1)
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        System.out.println("Top element : " + a[top]);
                    }
                    break;

                // SEARCH
                case 5:
                    if(top == -1)
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        System.out.print("Enter value to search : ");
                        int key = xyz.nextInt();
                        int index = -1;

                        for(int i = 0; i <= top; i++)
                        {
                            if(a[i] == key)
                            {
                                index = i;
                                break;
                            }
                        }

                        if(index != -1)
                        {
                            System.out.println("Element found at position from top : " + (top - index));
                        }
                        else
                        {
                            System.out.println("Element not found");
                        }
                    }
                    break;

                // EXIT
                case 6:
                    System.out.println("Program terminated");
                    xyz.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
        while(true);
    }
}