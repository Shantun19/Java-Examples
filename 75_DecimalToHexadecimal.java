import java.util.*;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number !");
        int num = sc.nextInt();
        String ans = convert_decimal_to_hexadecimal(num);
        System.out.println("The hexa decimal number is " + ans);
    }

    public static String convert_decimal_to_hexadecimal(int num) {
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String ans = "";
        while(num != 0) {
            int rem = num % 16;
            ans = hex[rem] + ans;
            num/=16;
        }
        return ans;
    }
}
