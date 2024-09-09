import java.util.*;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Binary Number !");
        long binary1 = sc.nextLong();
        long dec1 = convertBinaryToDecimal(binary1);
        System.out.println("Enter Second Binary Number !");
        long binary2 = sc.nextLong();
        long dec2 = convertBinaryToDecimal(binary2);
        System.out.println("The sum is => " + decimalToBinary(dec1+dec2));

    }

    public static long convertBinaryToDecimal(long num) {
        int count = 0;
        long decimal = 0;
        while(num != 0) {
            decimal = decimal + (int) ((num % 10) * Math.pow(2, count));
            count++;
            num /= 10;
        }

        return decimal;
    }

    public static String decimalToBinary(long num) {
        String ans = "";
        while(num != 0) {
            long rem = num % 2;
            ans = rem + ans;
            num/=2;
        }

        return ans;
    }
}
