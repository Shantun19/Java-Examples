import java.util.*;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number !");
        int num = sc.nextInt();
        // convert decimal to binary
        String ans = "";
        while (num != 0)
        {
            int rem = num % 2;
            ans = rem + ans;
            num/=2;

        }

        System.out.println("The binary number is " + ans);
    }
}
