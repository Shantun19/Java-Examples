import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class HelloWorld {
    public static void main(String[] args) {
        // Format y-M-d or yyyy-MM-d
        String string = "2017-07-25";
        // convert string data to date 
        LocalDate ld = LocalDate.parse(string , DateTimeFormatter.ISO_DATE);
        System.out.println(ld);
    }
}
