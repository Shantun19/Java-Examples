import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class HelloWorld {
    public static void main(String[] args) {
        // Java Program to Get Current Date/Time.
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("The Current Date and Time is => " + ldt);
        
        // Get Current date and time with pattern.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted = ldt.format(formatter);

        System.out.println("Current Date and Time is: " + formatted);
        
    }
}
