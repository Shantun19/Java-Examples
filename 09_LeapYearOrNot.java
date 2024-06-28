import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        
        String res = 
            (year % 4 == 0) ? 
            ((year % 100 == 0) ? 
            ((year % 400 == 0) ? "Is a Leap Year" : "Not a Leap Year") 
            : "Is a Leap Year") 
            : "Not a Leap Year";
        
        System.out.println(year + " " + res);
    }
}
