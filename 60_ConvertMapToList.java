import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // Java Program to Convert Map (HashMap) to List
        Map<Integer , String> map = new HashMap<Integer , String>();
        map.put(1 , "A");
        map.put(2 , "B");
        map.put(3 , "C");
        map.put(4 , "D");
        
        List<Integer> l1 = new ArrayList(map.keySet());
        List<String> l2 = new ArrayList(map.values());
        
        System.out.println("list l1 => " + l1);
        System.out.println("list l2 => " + l2);

    }
}
