class HelloWorld {
    public static void main(String[] args) {
        int decimal = 25;
        String ans = "";
        
        while(decimal != 0) {
            int remainder = decimal % 2;
            ans = remainder + ans;
            decimal /= 2;
        }
        
        System.out.println("ans => " +  ans);
    }
}
