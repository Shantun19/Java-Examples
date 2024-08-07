class HelloWorld {
    public static void main(String[] args) {
        int decimal = 78;
        String octal = "";
        while(decimal != 0) {
            int rem = decimal % 8;
            octal = rem + octal;
            decimal/=8;
        }
        System.out.println("octal " + octal);    
    } 
}
