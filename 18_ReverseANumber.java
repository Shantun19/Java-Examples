import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Before Reversing : " + n);
         System.out.println("After Reversing : " + rev(n));
        
    }
    
    public static int rev(int n) {
        int rev = 0;
        while(n != 0) {
            rev = (rev * 10) + (n%10);
            n/=10;
        }
        
        return rev;
    }
}
