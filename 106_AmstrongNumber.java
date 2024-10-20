import java.util.*;

public class Sample {

    public static void main(String[] args) {
        // Amstrong Number ;
        int n = 153;
        if(checkAmstrong(n)) System.out.println(n + " is a Amstrong Number");
        else System.out.println(n + " is not a Amstrong Number");
    }

    public static boolean checkAmstrong(int n) {
        int dig = countDigits(n);
        int sum = 0;
        while(n != 0) {
            sum += (int)Math.pow((n%10) , dig);
            n/=10;
        }
        return sum == n;
    }

    public static int countDigits(int n) {
        String str = String.valueOf(n);
        return str.length();
    }
}
