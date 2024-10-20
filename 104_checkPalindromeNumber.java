import java.util.*;

public class Sample {

    public static void main(String[] args) {
        // check palindrome.
        int n = 123;
        if(checkPalindrome(n)) System.out.println("The Given NUmber " + n + " is Palindrome");
        else System.out.println("The Given NUmber " + n + " is not Palindrome");
    }

    public static boolean checkPalindrome(int n) {
        return Integer.parseInt(reverseString(String.valueOf(n))) == n;
    }

    public static String reverseString(String str) {
        if(str.length() <= 1) return str;
        return str.substring(str.length() - 1) + reverseString(str.substring(0 , str.length() - 1));
    }
}
