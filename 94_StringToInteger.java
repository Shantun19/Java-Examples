import java.util.*;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number String !!");
        String str = sc.next();
        System.out.println("the integer value corresponding " + str + " is " +  Integer.parseInt(str));
    }
}
