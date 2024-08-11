import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // Java Program to Join Two Lists
        List<String> l1 = new ArrayList<String>();
        l1.add("Apple");
        l1.add("Banana");
        l1.add("Kiwi");
        
        List<String> l2 = new ArrayList<String>();
        l2.add("Lady finger");
        l2.add("capsicum");
        l2.add("spinach");
        
        List<String> result = new ArrayList<String>();
        result.addAll(l1);
        result.addAll(l2);
        
        System.out.println("the final list is => " + result);
        
    }
}
