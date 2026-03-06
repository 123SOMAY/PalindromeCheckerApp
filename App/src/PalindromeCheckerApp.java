public class PalindromeCheckerApp {

    static boolean checkPalindrome(String text) {
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

        if (checkPalindrome(word))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is not a Palindrome");
    }
}