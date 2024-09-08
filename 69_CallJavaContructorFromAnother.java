// Java Program to Call One Constructor from another
class HelloWorld {
    int sum = 0;
    
    public HelloWorld() {
        this(10 , 10); // it will search for the cnstructor that accepts two integer arguments.
    }
    
    public HelloWorld(int num1 , int num2) {
        sum = num1 + num2;
    }
    
    void display() {
        System.out.println("The sum is => " + " " + sum);
    }
    
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld(); // this will call the constructor with 0 arguments.
        hw.display();
        
        HelloWorld hw = new HelloWorld(5 , 5); // this will call the constructor that accepts two integer arguments.
        hw.display();
    }
}
