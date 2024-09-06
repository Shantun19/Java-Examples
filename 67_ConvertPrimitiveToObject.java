// Java Program to convert primitive types to objects and vice versa
class HelloWorld {
    public static void main(String[] args) {
        int a = 45;
        double d = 45.5;
        boolean b = false;
        
        // convert this primitive data type to wrapper object.
        Integer i = Integer.valueOf(a);
        Double d1 = Double.valueOf(d);
        Boolean b1 = Boolean.valueOf(b);
        
        // check 
        if(i instanceof Integer) System.out.println(i + " wrapper object");
        if(d1 instanceof Double) System.out.println(d + " wrapper object");
        if(b1 instanceof Boolean) System.out.println(b + " wrapper object");
    }
}
