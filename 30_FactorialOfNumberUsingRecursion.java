import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       System.out.println("The Factorial ofb" + num + " is " + fact(num));
    }
    
    public static int fact(int num) {
        if(num == 1) return num;
        return fact(num - 1) * num;
    }
    
}
