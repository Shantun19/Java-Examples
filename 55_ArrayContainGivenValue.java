import java.util.*;
import java.util.stream.IntStream;

class HelloWorld {
    public static void main(String[] args) {
        // Check if an array contains the given value using Stream.
        int[] num = {1, 2, 3, 4, 5};
        int toFind = 3;
        
        boolean found = IntStream.of(num).anyMatch(n -> n == toFind);
        
        if(found) System.out.println(toFind + " is found");
        else System.out.println(toFind + " is not found");
        
    }
}            
