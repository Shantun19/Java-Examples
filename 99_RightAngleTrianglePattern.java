import java.util.*;

public class Sample {

    public static void main(String[] args) {
        // pattern printing.
        int r = 10;
        int c = 10;

        // right angle triangle pattern
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}
