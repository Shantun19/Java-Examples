class HelloWorld {
    public static void main(String[] args) {
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);
        
        // using replaceAll()method 
        sentence = sentence.replaceAll("\\s" , "");
        System.out.println("After Removing white space : " + sentence);
        
    }
}
