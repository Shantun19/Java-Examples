import java.util.*;

public class Sample {
    static int r = 5;
    static int c = 5;
    public static void main(String[] args) {
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        // Print the top section pattern 4 times
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        // Print the bottom section pattern once
        System.out.println("* * * * * * ==================================");
        // Print the middle section pattern 6 times
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}