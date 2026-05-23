/* Q8.Problem:
 Given a stack of integers, sort it in ascending order using only one extra stack.
Example:
 Input Stack:  3  5  1  4 
 Output Stack:  1  3  4  5
Logic Explanation:
Use a temporary stack.
Pop each element from the original stack.
While the temp stack’s top is greater, move elements back to the original.
Push the element in correct order to temp.
Result will be a sorted stack.

 */
import java.util.*;

public class SortStack_8 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter stack elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        Stack<Integer> sortedStack = sortStack(stack);

        System.out.println("Sorted Stack (ascending order):");
        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop() + " ");
        }
    }

    static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            // Move elements from tempStack back to stack if they are greater
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            // Place temp in correct order in tempStack
            tempStack.push(temp);
        }

        return tempStack;
    }
}
