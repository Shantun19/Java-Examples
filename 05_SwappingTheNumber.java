import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        
        System.out.println("Before Swapping a = "+ a);
        System.out.println("Before Swapping b = "+ b);
        
        // swapping the logic 
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After Swapping a = "+ a);
        System.out.println("After Swapping b = "+ b);
    }
} 
