import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Character");
        char ch = sc.next().charAt(0);
        
        String res = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? " is a vowel" : "is a consonant";
        
        System.out.println(ch + " " + res);
    }
}
