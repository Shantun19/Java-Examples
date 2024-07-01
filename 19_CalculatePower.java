import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("A to the power b is " + Math.pow(a,b));
        // or 
        int pow = 1;
        for(int i=0; i<b; i++) {
           pow *= a;
        }
        System.out.println(pow);
    }
}
