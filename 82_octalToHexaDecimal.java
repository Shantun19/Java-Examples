import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // 27. Write a Java program to convert a octal number to a hexadecimal number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Octal Number !");
        long num = sc.nextLong();
        long ans = convert_octal_to_decimal(num);
        // convert this decimal to hexadecimal.
        String res = convert_decimal_to_hexadecimal(ans);
        System.out.println("The hexadecimal no. is => " + " " + res);
    }

    public static long convert_octal_to_decimal(long num) {
        long decimal = 0;
        int count = 0;
        while(num != 0) {
            decimal += ((num % 10)*Math.pow(8 , count));
            count++;
            num/=10;
        }

        return decimal;
    }

    public static String convert_decimal_to_hexadecimal(long num) {
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String ans = "";
        while(num != 0) {
            int rem = (int)(num % 16);
            ans = hex[rem] + ans;
            num/=16;
        }

        return ans;
    }
}
