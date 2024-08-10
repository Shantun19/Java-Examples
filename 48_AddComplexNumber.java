class HelloWorld {
    float realNumber;
    float imaginaryNumber;
    
    public HelloWorld(float realNumber , float imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }
    
    
    public static void main(String[] args) {
        HelloWorld n1 = new HelloWorld(3.0f , 1.0f);
        HelloWorld n2 = new HelloWorld(2.0f , 3.0f);
        HelloWorld temp;
        
        temp = addComplex(n1 , n2);
        System.out.printf("Sum = %.1f + %.1fi", temp.realNumber, temp.imaginaryNumber);
    }
    
    public static HelloWorld addComplex(HelloWorld n1 , HelloWorld n2) {
        HelloWorld res = new HelloWorld(0.0f , 0.0f);
        res.realNumber = n1.realNumber + n2.realNumber;
        res.imaginaryNumber = n1.imaginaryNumber + n2.imaginaryNumber;
        
        return res;
    }
}
