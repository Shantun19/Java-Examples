import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // 33. Write a Java program and compute the sum of an integer's digits.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number !");
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0) {
            sum += (num % 10);
            num/=10;
        }
        System.out.println("The Sum is " + sum);
    }
}
