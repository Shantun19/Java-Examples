class HelloWorld {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
        int[][] res = displayTranspose(matrix);
        for(int i=0; i<res.length; i++) {
            for(int j=0; j<res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] displayTranspose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];
        for(int i=0; i<res.length; i++) {
            for(int j=0; j<res[0].length; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        
        return res;
    }
}
