import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // Write a Java program to convert a decimal number to an octal number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number !");
        int num = sc.nextInt();
        String ans = convert_decimal_to_octal(num);
        System.out.println("The octal number is " + ans);
    }

    public static String convert_decimal_to_octal(int num) {
        String ans = "";
        while(num != 0) {
            int rem = num % 8;
            ans = rem + ans;
            num/=8;
        }

        return ans;
    }
}
