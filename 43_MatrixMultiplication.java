class HelloWorld {
    public static void main(String[] args) {
       int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
       int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
       int res[][] = multiplyMatrix(firstMatrix, secondMatrix);
       
       for(int i = 0; i < res.length; i++) {
           for(int j = 0; j < res[0].length; j++) {
               System.out.print(res[i][j] + " ");
           }
           System.out.println();
       }
    }
    
    public static int[][] multiplyMatrix(int[][] m1, int[][] m2) {
        int r1 = m1.length;
        int c1 = m1[0].length;
        int r2 = m2.length;
        int c2 = m2[0].length;
        
        if (c1 != r2) {
            throw new IllegalArgumentException("Matrix multiplication is not possible");
        }
        
        int[][] res = new int[r1][c2];
        
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        
        return res;
    }
}
