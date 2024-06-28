import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
         System.out.println("Enter Number 2");
        int b = sc.nextInt();
         System.out.println("Enter Number 3");
        int c = sc.nextInt();
        
        String res = (a > b && a > c) ? a + " is the largest" : ((b > a && b > c) ? b + "is the largest" : c + " is the largest");
        
        System.out.println(res);
        
    }
}
