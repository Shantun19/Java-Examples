import java.util.*;

public class Sample {

    public static void main(String[] args) {
        // question 54.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(checkRightMostDigit(num1 , num2 , num3));

    }

    public static boolean checkRightMostDigit(int num1 , int num2 , int num3) {
        int rmdOfNum1 = num1 % 10;
        int rmdOfNum2 = num2 % 10;
        int rmdOfNum3 = num3 % 10;

        return rmdOfNum1 == rmdOfNum2 || rmdOfNum2 == rmdOfNum3 || rmdOfNum1 == rmdOfNum3;

    }
}
