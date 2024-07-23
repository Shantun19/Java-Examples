import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=a+1; i<b; i++) {
            if(checkPrime(i)) System.out.println(i + " ");
        }
    }
    
    public static boolean checkPrime(int a) {
        for(int i=2; i<a; i++) {
            if(a%i == 0) return false;
        }
        return true;
    }
}
