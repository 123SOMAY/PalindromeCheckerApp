import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String text) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : text.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "hello";

        if (isPalindrome(word1))
            System.out.println(word1 + " is  a Palindrome");
        else
            System.out.println(word1 + " is not a Palindrome");

        if (isPalindrome(word2))
            System.out.println(word2 + " is a Palindrome");
        else
            System.out.println(word2 + " is not a Palindrome");
    }
}