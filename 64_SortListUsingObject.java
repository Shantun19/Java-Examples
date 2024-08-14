import java.util.*;

class HelloWorld {
    String customProperty;
    
    public HelloWorld(String customProperty) {
        this.customProperty = customProperty;
    }
    
    public String getCustomProperty() {
        return this.customProperty;
    }
    
    public static void main(String[] args) {
        ArrayList<HelloWorld> list = new ArrayList<>();
        list.add(new HelloWorld("Z"));
        list.add(new HelloWorld("A"));
        list.add(new HelloWorld("B"));
        list.add(new HelloWorld("X"));
        list.add(new HelloWorld("Aa"));
        
        list.sort((o1 , o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty()));
        
        for(HelloWorld str : list) {
            System.out.print(str.getCustomProperty());
        }
    }
}
