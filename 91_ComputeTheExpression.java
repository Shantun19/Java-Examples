import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 5 => 5 + 55 + 555  => 6n
        System.out.println("the computation is => " + (6 * num));
    }
}
