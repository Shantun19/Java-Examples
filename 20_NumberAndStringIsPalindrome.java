import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = sc.next();
        checkNumber(a);
        checkString(str);
    }
    
    public static void checkNumber(int a) {
        int temp = a;
        int rev = 0;
        while(temp != 0) {
            rev = (rev*10) + (temp%10);
            temp/=10;
        }
        if(rev == a) System.out.println("Number is Palindrome");
        else System.out.println("Number is not Palindrome");
    }
    
    public static void checkString(String str) {
        String rev = "";
        for(int i=str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            rev+=ch;
        }
        if(str.equals(rev)) System.out.println("String is Palindrome");
        else System.out.println("String is not Palindrome");
    }
}
