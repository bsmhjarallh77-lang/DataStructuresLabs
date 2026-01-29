package assignment2;
import java.util.Stack;
public class Reverse_a_string_using_Stack {

    // Question 1: Reverse String using Stack

    public static String reverse(String str) {
            Stack<Character> stack = new Stack<>();

            for (char c : str.toCharArray()) {
                stack.push(c);
            }

            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }

            return reversed.toString();
        }

        public static void main(String[] args) {
            System.out.println(reverse("DataStructure"));
        }


    }



