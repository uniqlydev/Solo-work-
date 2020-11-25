public class SquareMatrices {

    public static boolean ZeroMatrixChecker(int [][] array) { //If all numbers inside the array are 0 
        
        int zero = 0;
        boolean isZero = false;
        for (int row = 0; row <= array.length-1;row++) {
            for (int column = 0;column <= array[row].length-1;column++) if (array[row][column] != 0 ) zero++;
        }
        if (zero > 0) {
            isZero = false;

        }else {
            isZero = true;
        }
        return isZero;

     
    }
    public static boolean IdentityMatrixChecker(int [][] array) { // if A == B 
        boolean isIdentity = false;
        boolean br = false;
        for (int a = 0 ;a<= array.length-1;a++) {
            for (int column = 0; column <= array[a].length-1;column++) {
                if (a==column && array[a][column] == 1) {
                    System.out.println(array[a][column]);
                }
                if (a == column && array[a][column] != 1) br = true;
            }
            if (br) {
                break;
            }else {
                System.out.println("It is an identity Matrix");
                isIdentity = true;
                break;
            }
        }
        return isIdentity;
    }

    public static boolean DiagonalMatrixChecker(int [][]array) { // All non-diagonal entries are 0 
        boolean isDiag = false;
        for (int row = 0; row <= array.length-1;row++) {
            for (int columnt = 0; columnt <= array[row].length-1;columnt++) {
              if (array[row][columnt] == 0) {
                  isDiag = true;
               if (row == columnt) columnt++;
               else if (columnt > row) break;
              }
              }
             }
             return isDiag;
            }
          
    
        
    public static boolean UpperTriangularMatrixChecker (int [][]array) {
        boolean isUpper = false;
        boolean breaker = false;
        for (int row = 0; row <= array.length-1;row++) {
            for (int columnt = 0; columnt <= array[row].length-1;columnt++) {
                if (row == columnt) {
                    if (array[row][columnt++] == 0){
                        breaker = true; 
                        break;
                    }
                }
            }
            if (breaker) {
                isUpper = false;
                break;
            }else isUpper = true;
        }
        return isUpper;
    } 

    public static boolean StrictlyUpperTriangularMatrixChecker(int [][] array) {
        boolean strictly = false;
        boolean breaker = false;
        if (UpperTriangularMatrixChecker(array)) {
        for (int row = 0; row <= array.length-1;row++) {
            for (int columnt = 0; columnt <= array[row].length-1;columnt++) {
                if (row == columnt) {
                   if (array[row][columnt] == 0) {
                       if (array[row][columnt+1] == 0) {
                           breaker = true;
                           break;
                       }
                   }
                }
            }
           if (breaker) {
                strictly = false;
               break;
           }else {
                strictly = true;
               break;
           }
        }
    }else strictly = false;
        return strictly;
    }

    public static void Checker(int [][] array) {
       if (!ZeroMatrixChecker(array) && !IdentityMatrixChecker(array) && !DiagonalMatrixChecker(array) && !UpperTriangularMatrixChecker(array) && !StrictlyUpperTriangularMatrixChecker(array)) System.out.println("It is a non-special square matrix");
       else {
           if (ZeroMatrixChecker(array)) System.out.println("It is a zero matrix");
           if (IdentityMatrixChecker(array)) System.out.println("It is an identity matrix");
           if (DiagonalMatrixChecker(array)) System.out.println("It is a diagonal matrix");
           if (UpperTriangularMatrixChecker(array)) System.out.println("It is an upper triangular matrix");
           if (StrictlyUpperTriangularMatrixChecker(array)) System.out.println("It is a strict triangular matrix");
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

       

        System.out.println("A");
        Checker(A);
        System.out.println("B");
        Checker(B);
        System.out.println("C");
        Checker(C);
        System.out.println("D");
        Checker(D);

    
       
  

        

    }
}