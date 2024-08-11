import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // Java Program to Convert a List to Array and Vice Versa
        List<String> l1 = new ArrayList<String>();
        l1.add("1");
        l1.add("2");
        l1.add("3");
        
        String[] arr = new String[l1.size()];
        l1.toArray(arr);
        
        for(String ele : arr) {
            System.out.print(ele + " ");
        }
        
        // convert array to list 
        String[] lang = {"Java" , "Python" , "c#" , "Ruby"};
        List<String> ls = new ArrayList<>(Arrays.asList(lang));
        System.out.println("convert array to list => " + ls);
    }
}
