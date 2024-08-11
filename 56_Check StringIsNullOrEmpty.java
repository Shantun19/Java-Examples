import java.util.*;
import java.util.stream.IntStream;

class HelloWorld {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "";
        String s3 = "  ";
        
        System.out.println("S1 String is => " + checkString(s1));
        System.out.println("S2 String is => " + checkString(s2));
        System.out.println("S3 String is => " + checkString(s3));
        
    }
    
    public static String checkString(String str) {
        if(str == null) return "Null";
        else if(str.isEmpty()) return "Empty";
        else return "Neither Null nor Empty";
    }
}
