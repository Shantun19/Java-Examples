import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // 38. Write a Java program to count letters, spaces, numbers and other characters in an input string.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String !");
        String str = sc.next();
        countCharacter(str);
    }

    public static void countCharacter(String str) {
        int countLetter = 0;
        int countSpace = 0;
        int countNumber = 0;
        int countSpecialCharcter = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)) countLetter++;
            else if(Character.isSpaceChar(ch)) countSpace++;
            else if(Character.isDigit(ch)) countNumber++;
            else countSpecialCharcter++;
        }

        System.out.println("The Number of letters is : " + countLetter);
        System.out.println("The Number of Spaces is : " + countSpace);
        System.out.println("The Number of Number is : " + countNumber);
        System.out.println("The Number of Special Charcter is : " + countSpecialCharcter);
    }
}
