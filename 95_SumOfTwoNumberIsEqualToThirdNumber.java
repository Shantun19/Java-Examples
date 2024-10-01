import java.util.*;

public class Sample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num1 = sc.nextByte();
        byte num2 = sc.nextByte();
        byte num3 = sc.nextByte();
        System.out.println("the sum is equal to third or not : " + sum(num1 , num2 , num3));
    }

    public static boolean sum(int num1 , int num2 , int num3) {
        return (num1 + num2) == num3;
    }
}
