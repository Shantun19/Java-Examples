// Java Program to Check if a String is Numeric
class HelloWorld {
    public static void main(String[] args) {
        String string = "12345.15";
        boolean isNumeric = true;
        
        // Parsing string to a double
        try {
            Double d = Double.parseDouble(string);
        }
        catch(NumberFormatException e) {
            isNumeric = false;
        }
        
        // Correcting the ternary operator syntax
        String ans = isNumeric ? " is a Number" : " is Not a Number";
        System.out.println(string + ans);
    }
}
