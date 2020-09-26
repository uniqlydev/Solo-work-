import java.util.Arrays;

/* Given two integer arrays A and B of size N.
There are N gas stations along a circular route, where the amount of gas at station i is A[i].

You have a car with an unlimited gas tank and it costs B[i] of gas to travel from station i
to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the minimum starting gas station’s index if you can travel around the circuit once, otherwise return -1.

You can only travel in one direction. i to i+1, i+2, … n-1, 0, 1, 2.. Completing the circuit means starting at i and
ending up at i again.*/


public class GasStation {

    public static void main (String [] args){
        final 

        int [] [] arrays = new int [2] [2];
        arrays[0][0] = 1;
        arrays[0][1] = 2;
        arrays[1][0] = 2;
        arrays[1][1] = 1;

        System.out.print(Arrays.deepToString(arrays));



    }
    
    
}
