import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int a = sc.nextInt();
        
        String result = (a % 2 == 0) ? a + " is even" : a + " is odd";
        System.out.println(result);
    }
}
