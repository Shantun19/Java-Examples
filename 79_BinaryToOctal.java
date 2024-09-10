import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // Write a Java program to convert a binary number to an octal number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number !");
        long num = sc.nextLong();
        String ans = convert_binary_to_decimal(num);
        System.out.println("The decimal number is " + ans);
    }

    public static String convert_binary_to_decimal(long num) {
        long ans = 0;
        int count = 0;
        while(num != 0) {
            ans = ans + (long)((num % 10) * Math.pow(2 , count));
            count++;
            num/=10;
        }

        return convert_decimal_to_octal(ans);
    }

    public static String convert_decimal_to_octal(long num) {
        String ans = "";
        while(num != 0) {
            int rem = (int)(num % 8);
            ans = rem + ans;
            num/=8;
        }

        return ans;
    }
}
