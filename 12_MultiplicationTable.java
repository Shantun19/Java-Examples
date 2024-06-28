import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number !!");
        int n = sc.nextInt();
        multiplicationTable(n);
    }
    
    public static void multiplicationTable(int n) {
        for(int i=1; i<=10; i++) {
            System.out.println(n + " X "+ i + " = " + (n*i));
        }
    }
}
