import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       System.out.println("The Sum of Natural No. upto " + num + " is " + calcSum(num));
    }
    
    public static int calcSum(int num) {
        if(num == 1) return num;
        return calcSum(num-1) + num;
    }
    
}
