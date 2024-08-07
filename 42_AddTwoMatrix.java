class HelloWorld {
    public static void main(String[] args) {
       int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
       int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };
       int res[][] = calculateMatrixSum(firstMatrix , secondMatrix);
       
       for(int i=0; i<firstMatrix.length; i++) {
           for(int j=0; j<firstMatrix[0].length; j++) {
               System.out.print(res[i][j] + " ");
           }
           System.out.println();
       }
    }
    
    public static int[][] calculateMatrixSum(int[][] m1 , int[][] m2) {
        int row = m1.length;
        int col = m1[0].length;
        
        int[][] res = new int[row][col];
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }
        
        return res;
    }
}
