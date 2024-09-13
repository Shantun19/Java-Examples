import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // 37. Write a Java program to reverse a string.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String !");
        String str = sc.next();
        String rev = revString(str , str.length());
        System.out.println("The reverse string is : " + rev);
    }

    public static String revString(String str , int len) { // ab ,  len = 2
        if(len < 1) return ""; // empty string
        if(len == 1) return String.valueOf(str.charAt(0)); // contains only one element.
        else return str.charAt(len - 1) + revString(str , len - 1);
    }
}
