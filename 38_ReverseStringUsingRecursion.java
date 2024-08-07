class HelloWorld {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("The reverse String is " + revStr(str));
    } 
    
    public static String revStr(String str) {
        if(str.isEmpty()) return str;
        return revStr(str.substring(1)) + str.charAt(0);
    }
}
