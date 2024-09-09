import java.util.*;

public class Sample {
    static int r = 5;
    static int c = 5;
    public static void main(String[] args) {
        printJ();
        printA();
        printV();
        printA();
    }

    public static void printJ() {
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(i == 0 || j == 2 || (i == 4 && j <= 1) || (i == 3 && j == 0)) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printA() {
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(i == 0 || j == 0 || j == 4 || i == 2) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printV() {
        for(int i=0; i<4; i++) {
            for(int j=0; j<7; j++) {
                if(i == j || i + j == 6) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
