public class SquareMatrices {

    public static void ZeroMatrixChecker(int [][] array) {

        int zero = 0;
        for (int row = 0; row <= array.length-1;row++) {
            for (int column = 0;column <= array[row].length-1;column++) if (array[row][column] != 0 ) zero++;
        }
        if (zero > 0) System.out.println(array +" is not a Zero matrix");
    }

    public static void main (String [] args){

        int [][] A = {
            {0,3,6,7},
            {0,0,5,-1},
            {3,8,0,9},
            {4,-2,0,0}
        };

        int [][] B = { 
            { 0,6,6,-2},
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

        ZeroMatrixChecker(A);

    }
}