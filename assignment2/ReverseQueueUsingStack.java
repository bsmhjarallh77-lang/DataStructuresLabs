package assignment2;
import java.util.*;
public class ReverseQueueUsingStack {

    // Question 3: Reverse Queue

        public static Queue<Integer> reverse(Queue<Integer> queue) {
            Stack<Integer> stack = new Stack<>();

            while (!queue.isEmpty()) {
                stack.push(queue.remove());
            }

            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }
            return queue;
        }

        public static void main(String[] args) {
            Queue<Integer> q = new LinkedList<>();
            q.add(1);
            q.add(2);
            q.add(3);

            System.out.println(reverse(q));
        }


    }



