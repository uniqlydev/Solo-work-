public class PerformanceTask2Array {

    public static void SquareMatrixChecker(int [][] matrix) {
        // A square matrix is a matrix that has the same number of columns and rows. 

        int requireCount = matrix[0].length -1; 
        int columnCount = 0;
        int rowCount = 0;
        String isMatrix = columnCount != requireCount || rowCount!=requireCount ? "It is a square matrix.":"It is not a square matrix.";

        for (int r  = 0; r <= matrix.length-1;r++) { //Access the row 

                for (int col = 0; col<=matrix[r].length-1;col++) {
                    columnCount = col;
                }
            rowCount = r;
        }
        
        System.out.println("Required count: " +requireCount);
        System.out.println("Row count: " + rowCount);
        System.out.println("Column Count: " + columnCount);


        System.out.println(isMatrix);

      

    }

    public static void main (String[] args) {
    //Matrix

    int [][] a = {
        {7,2,1},
        {0,4,2},
        {5,7,11}
    };

    int [][] b = {
        {1,4},
        {2,8},
        {1,6}
    };
    
    int [][] c = {
        {1},
        {2,3,4},
        {5,6}
    };
    
    SquareMatrixChecker(c);
    //  System.out.println("Matrix A: " +SquareMatrixChecker(a));
    //  System.out.println("Matrix B: " +SquareMatrixChecker(b));
    //  System.out.println("Matrix C: " +SquareMatrixChecker(b));
    



    }
    
}
