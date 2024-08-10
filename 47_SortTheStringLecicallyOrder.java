class HelloWorld {
    public static void main(String[] args) {
        String[] words = { "B", "C", "P", "A" , "D" };
        String[] res = sortInLexicalOrder(words);
        for(String str : res) {
            System.out.print(str + " , ");
        }
    }
    
    public static String[] sortInLexicalOrder(String[] words) {
        for(int i=0; i<words.length-1; i++) {
            for(int j=i+1; j<words.length; j++) {
                if(words[i].compareTo(words[j]) > 0) 
                {
                    // swap the strings \
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        
        return words;
    }
}
