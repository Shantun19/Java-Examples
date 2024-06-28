import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Character !");
        char ch = sc.next().charAt(0);
        System.out.println("The ASCHII value of " + ch + " is " + (int)ch);
    }
}
