import java.util.*;

public class Sample {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        int count = 0;
        for(int i=1; i<=digits.length; i++) {
            for(int j=1; j<=digits.length; j++) {
                if(checkForNotEqual(i , j)) {
                    for(int k=1; k<=digits.length; k++) {
                        if(checkForNotEqual(i , k) && checkForNotEqual(j , k)) {
                            count++;
                            System.out.println(i+""+j+""+k);
                        }
                    }
                }
                else continue;
            }
        }
        System.out.println("The Total Number is : " + count);
    }

    public static boolean checkForNotEqual(int a , int b) {
        return a != b;
    }
}
