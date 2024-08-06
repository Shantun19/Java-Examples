class HelloWorld {
    public static void main(String[] args) {
        long num = 11001;
        int decimal = 0;
        int count = 0;
        
        while(num != 0) {
            decimal = decimal + (int)((num%10)*Math.pow(2 , count));
            count++;
            num/=10;
        }
        
        System.out.println("The decimal value is " + " " + decimal);
    }
}
