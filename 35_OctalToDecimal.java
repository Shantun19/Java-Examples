class HelloWorld {
    public static void main(String[] args) {
        // octal to decimal 
        int octal = 116;
        int decimal = 0;
        int count = 0;
        
        while(octal != 0) {
            decimal += ((octal%10) * Math.pow(8 , count));
            octal/=10;
            count++;
        }
        
        System.out.println("decimal value => " + decimal);
    } 
}
