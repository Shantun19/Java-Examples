import java.util.*;

public class Sample {
    public static void main(String[] args) {
//        48. Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
        printOdd(1);
    }

    public static void printOdd(int n) {
        if(n == 99) return;
        if(isOdd(n)) System.out.println(n);
        
        printOdd(n+1);
    }

    public static boolean isOdd(int n) {
        return (n % 2 != 0);
    }
}
