import java.util.*;

public class Sample {

    public static void main(String[] args) {
        // pattern printing.
        int r = 9;
        int c = 9;
        int k = 0;

        for (int i = 0; i < r; i++) {
            if (i <= 4) {
                k++;
            } else {
                k--;
            }

            for (int j = 0; j < c; j++) {
                if (j >= 5 - k && j <= 3 + k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
