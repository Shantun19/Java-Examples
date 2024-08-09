import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        String line = "This website is aw3som3.";
        int[] res = countVowelAndConsonant(line);
        System.out.println("The Number of vowel is => " + res[0]);
        System.out.println("The Number of Consonant is => " + res[1]);
        System.out.println("The Number of space is => " + res[3]);
        System.out.println("The Number of Digits is => " + res[2]);
    }
    
    public static int[] countVowelAndConsonant(String str) {
        int countVowel = 0;
        int countConsonant = 0;
        int countDigit = 0;
        int countSpace = 0;
       int[] res = new int[4];
       for(int i=0; i<str.length(); i++) {
           char ch = str.charAt(i);
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
               countVowel++;
           }
           else if(ch >= '0' && ch <= '9') countDigit++;
           else if (ch == ' ') countSpace++;
           else countConsonant++;
       }
       
       res[0] = countVowel;
       res[1] = countConsonant;
       res[2] = countDigit;
       res[3] = countSpace;
       
       return res;
    }
    
    
}
