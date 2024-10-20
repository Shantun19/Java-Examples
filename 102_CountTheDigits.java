import java.util.*;

public class Sample {

    public static void main(String[] args) {
        // Basic Maths .
        // count the digit from the given integer.
        int n = 19876543;
        int digits = count_the_digits_method1(n);
        int digits1 = count_the_digits_method2(n);
        System.out.println("The Number of Digits in " + n + " with method 1 is " + digits);
        System.out.println("The Number of Digits in " + n + " with method 2 is " + digits);
    }

    public static int count_the_digits_method1(int n) {
        return String.valueOf(n).length();
    }

    public static int count_the_digits_method2(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n/=10;
        }
        return count;
    }
}
