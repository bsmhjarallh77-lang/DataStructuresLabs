package assignment2;
import java.util.Stack;
public class SortStackUsingStack {

    // Question 2: Sort Stack using another Stack

    public static Stack<Integer> sort(Stack<Integer> stack) {
            Stack<Integer> tempStack = new Stack<>();

            while (!stack.isEmpty()) {
                int temp = stack.pop();

                while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                    stack.push(tempStack.pop());
                }
                tempStack.push(temp);
            }
            return tempStack;
        }

        public static void main(String[] args) {
            Stack<Integer> s = new Stack<>();
            s.push(3);
            s.push(1);
            s.push(4);
            s.push(2);

            Stack<Integer> sorted = sort(s);
            System.out.println(sorted);
        }


    }


