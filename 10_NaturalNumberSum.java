import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number !!");
        int n = sc.nextInt();
        int sum = (n * (n + 1))/2;
        System.out.println("the sum is " + sum);
    }
}