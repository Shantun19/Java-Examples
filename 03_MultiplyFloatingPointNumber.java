import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        float a = sc.nextFloat();
        System.out.println("Enter Number 2");
        float b = sc.nextFloat();
        
        float product = (float)a*b;
        System.out.printf("The product is : %.2f", product);
    }
}
