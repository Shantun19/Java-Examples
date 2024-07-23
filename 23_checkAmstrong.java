import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 153 
        if(checkAmstrong(num)) System.out.println(num + " is a Amstrong Number");
        else System.out.println(num + " is not a Amstrong Number");
    }
    
    public static boolean checkAmstrong(int num) {
        int temp = num;
        int dig = countsDigits(num); // 3
        int sum = 0;
        while(temp != 0) {
            sum += calcPower(dig , temp%10);
            temp/=10;
        }
        if(num == sum) return true;
        return false;
        
    }
    
    public static int countsDigits(int num) {
        String str1 = Integer.toString(num);
        return str1.length();
    }
    
    public static int calcPower(int dig ,int num) {
        int prod = 1;
        for(int i=0; i<dig; i++) {
            prod *= num;
        }
        return prod;
    }
}
