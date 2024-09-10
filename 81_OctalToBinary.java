import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // 26. Write a Java program to convert a octal number to a binary number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Octal Number !");
        long num = sc.nextLong();
        long ans = convert_octal_to_decimal(num);
        // now convert this decimal to binary.
        String str = "";
        while(ans != 0) {
            str = (int)(ans % 2) + str;
            ans/=2;
        }
        System.out.println("The binary number is " + str);
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
}
