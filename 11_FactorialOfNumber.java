import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number !!");
        int n = sc.nextInt();
        System.out.println("The factorial of Number is : " + fact(n));
    }
    
    public static int fact(int n) {
        if(n == 2) return n;
        return n * fact(n-1);
    }
}
