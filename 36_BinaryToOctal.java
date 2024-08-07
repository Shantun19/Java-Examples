class HelloWorld {
    public static void main(String[] args) {
        // Program to Convert Binary to Octal
        long binary = 101001;
        int octal = convertBinaryToOctal(binary);
        System.out.println("The octal number is => " + octal);
    } 
    
    public static int convertBinaryToOctal(long binary) {
        // first convert to decimal 
        long temp = binary;
        int decimal = 0;
        int count = 0;
        while(temp != 0) {
            decimal += ((temp%10) * Math.pow(2 , count));
            count++;
            temp/=10;
        }
        // now convert decimal to octal 
        String ans = "";
        while(decimal != 0) {
            int rem = decimal%8;
            ans = rem + ans;
            decimal/=8;
        }
        return Integer.parseInt(ans);
    }
}
