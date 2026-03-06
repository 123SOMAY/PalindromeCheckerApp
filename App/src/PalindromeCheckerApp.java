import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    static boolean stackStrategy(String text) {
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray())
            stack.push(c);

        for (char c : text.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }

    static boolean dequeStrategy(String text) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : text.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;

        return true;
    }

    public static void main(String[] args) {
        String word = "madam";
        String strategy = "stack";

        boolean result;

        if (strategy.equals("stack"))
            result = stackStrategy(word);
        else
            result = dequeStrategy(word);

        if (result)
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is not a Palindrome");
    }
}