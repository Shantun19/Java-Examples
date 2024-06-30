// fibonacci series : 0 1 1 2 3 5 8 13 
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n); // 6 -> 5 
    }
    
    public static void fib(int n) {
        int first = 0;
        int second = 1;
        for(int i=0; i<n; i++) {
            System.out.print(first + " ");
            int nterm = first + second;
            first = second;
            second = nterm;
        }
    }
}
