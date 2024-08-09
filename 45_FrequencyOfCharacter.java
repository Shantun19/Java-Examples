import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str = "What is My Name";
       System.out.println("Enter the character for frequency");
       char ch = sc.next().charAt(0);
       int fre = findFrequency(str , ch);
       System.out.println("The frequency of character " + ch + " is " + fre);
    }
    
    public static int findFrequency(String str , char ch) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            char x = str.charAt(i);
            if(x == ch) count++;
        }
        
        return count;
    }
}
