package assignment2;
import java.util.*;
public class MergeSortedQueues {

    // Question 5: Merge two Sorted Queues

        public static Queue<Integer> merge(Queue<Integer> q1, Queue<Integer> q2) {
            Queue<Integer> result = new LinkedList<>();

            while (!q1.isEmpty() && !q2.isEmpty()) {
                if (q1.peek() <= q2.peek()) {
                    result.add(q1.remove());
                } else {
                    result.add(q2.remove());
                }
            }

            while (!q1.isEmpty()) result.add(q1.remove());
            while (!q2.isEmpty()) result.add(q2.remove());

            return result;
        }

        public static void main(String[] args) {
            Queue<Integer> q1 = new LinkedList<>(List.of(1, 3, 5));
            Queue<Integer> q2 = new LinkedList<>(List.of(2, 4, 6));

            System.out.println(merge(q1, q2));
        }


    }


