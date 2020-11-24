public class SquareMatrices {

    public static boolean ZeroMatrixChecker(int [][] array) { //If all numbers inside the array are 0 
        int zero = 0;
        boolean isZero = false;
        for (int row = 0; row <= array.length-1;row++) {
            for (int column = 0;column <= array[row].length-1;column++) if (array[row][column] != 0 ) zero++;
        }
        if (zero > 0) {
            System.out.println("It is not a zero matrix");

        }else {
            System.out.println("It is a Zero matrix");
            isZero = true;
        }
        return isZero;

     
    }
    public static void IdentityMatrixChecker(int [][] array) { // if A == B 
        boolean br = false;
        for (int a = 0 ;a<= array.length-1;a++) {
            for (int column = 0; column <= array[a].length-1;column++) {
                if (a==column && array[a][column] == 1) {
                    System.out.println(array[a][column]);
                }
                if (a == column && array[a][column] != 1) br = true;
            }
            if (br) {
                System.out.println("It is not an identity matrix");
                break;
            }else {
                System.out.println("It is an identity Matrix");
                break;
            }
        }
    }

    public static void DiagonalMatrixChecker(int [][]array) { // All non-diagonal entries are 0 
    
        int zerocounter = 0; 
        for (int row = 0; row <= array.length-1;row++) {
            for (int columnt = 0; columnt <= array[row].length-1;columnt++) {
                if (array[row][columnt] != 0 ) {
                    zerocounter++;
                }
             }
           
            if (zerocounter > 1) {
                System.out.println("It is not a diagonal matrix");
                break;
            }else {
                System.out.println("It is a diagonal matrix");
                break;
            }
            }
           
        }
        
    

    public static void UpperTriangularMatrixChecker (int [][]array) {
       
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
            {0,0,0},
            {0,0,8},
            {0,0,4}
        };

        ZeroMatrixChecker(C);
        IdentityMatrixChecker(A);
        DiagonalMatrixChecker(C);

    }
}