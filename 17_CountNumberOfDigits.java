import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The Number of digit in " + n + " is " + calc(n));
    }
    
    public static int calc(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n/=10;
        }
        
        return count;
    }
}
