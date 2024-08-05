import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       System.out.println("The GCD of" + a + " and " + b + " is " + gcd(a,b));
    }
    
    public static int gcd(int a , int b) {
        if(b != 0) return gcd(b , a%b);
        else return a;
    }
}
