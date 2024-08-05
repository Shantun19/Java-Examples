import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt(); // 34
       for(int i=1; i<=num/2; i++) { // 17
            if(isPrime(i) && isPrime(num - i)) {
                System.out.println(i + " + " + (num-i)+ " = " + num);
            }
       }
    }
    
    public static boolean isPrime(int n) {
        if(n == 1) return true;
        for(int i=2; i<n; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    
}
