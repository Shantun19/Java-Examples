import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // 22. Write a Java program to convert a binary number to a decimal number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number !");
        long num = sc.nextLong();
        long ans = convert_binary_to_decimal(num);
        System.out.println("The decimal number is " + ans);
    }

    public static long convert_binary_to_decimal(long num) {
        long ans = 0;
        int count = 0;
        while(num != 0) {
            ans = ans + (long)((num % 10) * Math.pow(2 , count));
            count++;
            num/=10;
        }

        return ans;
    }
}
