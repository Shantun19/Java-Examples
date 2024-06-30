import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print("The LCM of " + a + " and " + b + " is :" + calcLCM(a , b));
        
    }
    
    public static int calcLCM(int a , int b) {
        int gcd = calcGCD(a , b);
        return (a * b)/gcd;
    }
    
    public static int calcGCD(int a , int b) {
        int gcd = 0;
        for(int i=2; i<Math.min(a , b); i++) {
            if(a%i == 0 && b%i == 0) {
                gcd = Math.max(gcd , i);
            }
        }
        
        return gcd;
    }
}
