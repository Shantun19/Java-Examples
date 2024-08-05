import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Operator [* , + , - , % , /]!");
        char operator = sc.next().charAt(0);
        
        System.out.println("Enter First Number !");
        Double number1 = sc.nextDouble();
        
        System.out.println("Enter Second Number !");
        Double number2 = sc.nextDouble();
        
        Double result = calculator(number1 , number2 , operator);
        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    }
    
    public static Double calculator(Double n1 , Double n2 , char operator)
    {
        switch(operator) {
            case '+' :
                return n1+n2;
            
            case '-' :
                return n1 - n2;
                
            case '*' :
                return n1*n2;
                
            case '%' :
                return n1%n2;
                
            case '/' : 
                return n1/n2;
                
            default : 
            System.out.println("Invalid Operator");
            break;
        }
        
        return -1.00;
    }
}
