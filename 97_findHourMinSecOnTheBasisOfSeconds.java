import java.util.*;

public class Sample {

    public static void main(String[] args) {
        // question 54.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Seconds !!");
        int seconds = sc.nextInt();
        displayHourMinSec(seconds);
    }

    public static void displayHourMinSec(int seconds) {
        int S = seconds % 60; // to calculate the seconds.
        int H = seconds / 60; // convert total seconds to minutes.
        int M = H % 60; // calculate the remaining seconds.
        H = H / 60;

        System.out.println("the times is => " + H + ":" + M + ":" + S);


    }
}
