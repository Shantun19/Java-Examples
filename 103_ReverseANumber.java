import java.util.*;

public class Sample {

    public static void main(String[] args) {
        // Basic Maths .
        // count the digit from the given integer.
        int n = 1234;
        int rev = reverseNumberusing_method1(n);

        // convert that integer to string.
        String str = String.valueOf(n);
        String rev1 = reverseNumberusing_method2(str);
        System.out.println("the reverse Number using method 1 is : " + rev);
        System.out.println("the reverse Number using method 2 is : " + rev1);
    }

    public static int reverseNumberusing_method1(int n) {
        int rev = 0;
        while(n != 0) {
            rev = (rev * 10) + (n%10);
            n/=10;
        }
        return rev;
    }

    public static String reverseNumberusing_method2(String num) {
        // base condition
        if(num.length() <= 1) return num; // return when our string contains only single character.
        // get the last character of the string + get the rest of the string except last character.
        return num.substring(num.length() - 1) + reverseNumberusing_method2(num.substring(0 , num.length() -1));

    }
}
