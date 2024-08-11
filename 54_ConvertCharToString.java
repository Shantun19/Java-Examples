import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // Java Program to Convert Character to String and Vice-Versa
        char ch = 'A';
        String str = Character.toString(ch);
        System.out.println("Convert char to string => " + str);
        
        // convert string array to char 
        String st = "This is great";
        char[] chr = st.toCharArray();
        System.out.print("after convert array => " + Arrays.toString(chr));
    }
}
