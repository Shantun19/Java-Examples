class HelloWorld {
    public static void main(String[] args) {
       int base = 2;
       int power = 4;
       
       System.out.println("The power is => " + powerRaised(base , power));
    }
    
    public static int powerRaised(int base , int power) {
        if(power == 1) return base;
        return base * powerRaised(base , power-1);
    }
}
