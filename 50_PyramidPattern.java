class HelloWorld {
    public static void main(String[] args) {
        int col = 5;
        int row = 5;
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(j <= i) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
