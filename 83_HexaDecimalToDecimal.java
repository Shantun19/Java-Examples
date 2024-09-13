import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // 28. Write a Java program to convert a hexadecimal value into a decimal number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexaDecimal Number !");
        String num = sc.next();
        int ans = convert_hexadecimal_to_decimal(num);
        System.out.println("The decimal number is " + ans);
    }

    public static int convert_hexadecimal_to_decimal(String num) { // 2A5
        num = num.toUpperCase();
        int ans = 0;
        int count = 0;
        for(int i=num.length()-1; i>=0; i--) {
            char ch = num.charAt(i); // 5
            int getIndex = return_index(ch); // 5
            ans = ans + (int)(getIndex * (Math.pow(16 , count)));
            count++;
        }
        return ans;
    }

    public static int return_index(char ch) {
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        for(int i=0; i<hex.length; i++) {
            if(hex[i] == ch) return i;
        }
        return -1;
    }
}
