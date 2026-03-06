import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    static boolean stackMethod(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray())
            stack.push(c);

        for (char c : text.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }

    static boolean dequeMethod(String text) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : text.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;

        return true;
    }

    static boolean twoPointerMethod(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "madam";

        long start1 = System.nanoTime();
        stackMethod(word);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        dequeMethod(word);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        twoPointerMethod(word);
        long end3 = System.nanoTime();

        System.out.println("Stack Method Time: " + (end1 - start1) + " ns");
        System.out.println("Deque Method Time: " + (end2 - start2) + " ns");
        System.out.println("Two Pointer Method Time: " + (end3 - start3) + " ns");
    }
}