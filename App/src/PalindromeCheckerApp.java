public class PalindromeCheckerApp {

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String text = "madam";

        if (isPalindrome(text, 0, text.length() - 1))
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is not a Palindrome");
    }
}