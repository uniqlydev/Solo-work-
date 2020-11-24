public class SquareMatrices {

    public static boolean ZeroMatrixChecker(int [][] array) { //If all numbers inside the array are 0 
        int zero = 0;
        boolean diagonalArray = false;
        for (int row = 0; row <= array.length-1;row++) {
            for (int column = 0;column <= array[row].length-1;column++) if (array[row][column] != 0 ) zero++;
        }
        if (zero > 0) {

        }else diagonalArray = true;
        return diagonalArray;
     
    }
    public static boolean IdentityMatrixChecker(int [][] array) { // if A == B 
        boolean br = false;
        boolean diagonalArray2 = false;
        for (int a = 0 ;a<= array.length-1;a++) {
            for (int column = 0; column <= array[a].length-1;column++) {
                if (a==column && array[a][column] == 1) {
                    System.out.println(array[a][column]);
                }
                if (a == column && array[a][column] != 1) br = true;
            }
            if (br) {
                
                break;  
            }else diagonalArray2 = true;
        }
        return diagonalArray2;
    }

    public static boolean DiagonalMatrixChecker(int [][]array) { // All non-diagonal entries are 0 
    boolean breaker = false;
        for (int row = 0; row <= array.length-1;row++) {
            for (int columnt = 0; columnt <= array[row].length-1;columnt++) {
                if (array[row][columnt] != 0 ) {
                    if (row == columnt) {
                        columnt++;
                    }
                    breaker = true;
                }
             }
             if (breaker) breaker = true;

             
            }
           return breaker;
        }
        
    

    public static void UpperTriangularMatrixChecker (int [][]array) {
        int i, j; 
        for (i = 0; i < array.length-1; i++){ 
            for (j = 0; j < array[i].length-1; j++){ 
                if (i > j) { 
                    System.out.print("0" + " "); 
                } 
                else
                System.out.print(array[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 

    
   




    public static void main (String [] args){

        int [][] A = {
            {0,3,6,7},
            {0,0,5,-1},
            {3,8,0,9},
            {4,-2,0,0}
        };

        int [][] B = { 
            {0,6,6,-2},
            {0,0,7,9},
            {0,0,0,7},
            {0,0,0,0}
        };
        int [][] C = { 
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        int [][] D = {
            {0,0,0},
            {1,0,0},
            {0,-8,0}
        };

        int [][] x = {
            {2,6,7},
            {0,3,8},
            {0,0,4}
        };

    //    if (ZeroMatrixChecker(A)) {
    //        System.out.println("It is a zero matrix hence making it a diagonal matrix,");
    //    }else if (DiagonalMatrixChecker(A)) {
    //        System.out.println("It is diagonal matrix");
    //    }
    UpperTriangularMatrixChecker(A);
    }
}