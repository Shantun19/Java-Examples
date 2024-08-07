class HelloWorld {
    public static void main(String[] args) {
        // octal to binary 
        int octal = 67;
        long binary = convertOctalToBinary(octal);
        System.out.println("the binary number is => " + binary);
    } 
    
    public static long convertOctalToBinary(int octal) {
        // first convert into decimal.
        int decimal = 0;
        int count = 0;
        while(octal != 0) {
            decimal += ((octal%10) * Math.pow(8 , count));
            count++;
            octal/=10;
        }
        // convert decimal to binary 
        String ans = "";
        while(decimal != 0) {
            int rem = decimal%2;
            ans = rem + ans;
            decimal/=2;
        }
        
        return Long.parseLong(ans);
    }
}
