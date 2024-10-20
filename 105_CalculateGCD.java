import java.util.*;

public class Sample {

    public static void main(String[] args) {
        int a = 4;
        int b = 8;

        // calculate gcd without euclidean algo.
        int gcd = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);

        // calculate gcd using euclid algo.
        int res = calcGcd(a , b);
        System.out.println("The GCD of using euclid" + a + " and " + b + " is " + res);
    }

    public static int calcGcd(int a , int b) {
        if(b == 0) return a;
        return calcGcd(b , a%b);
    }
}
