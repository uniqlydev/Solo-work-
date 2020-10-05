import java.util.Scanner;

public class euclidean {

    private static int GetMultiple(int a, int b) { // Check the highest multiple without overlapping the biggernumber 
       int q;
        while(true) {
            q = 1;
            b = b*q;
            if (b >= a) break;
            System.out.println(q);
            q++; 
        }
        q--;
        System.out.println(q);
        return q;
    }


    public static void GetGCD(int a,int b) {
        int biggerNum = a;
        int smallerNum = b;
        int q = 0;
        // int r = GetMultiple(biggerNum, smallerNum,q);
        
        if (a>b) {
            biggerNum = a;
            smallerNum = b;
        }
        else {
            biggerNum = b;
            smallerNum = a;
        }
        // GetMultiple(biggerNum, smallerNum, q); 
       
        
        // r = biggerNum - smallerNum*q;


        //Euclidean Alghorithim -> BiggerNum = SmallerNum * q + r; Where q is the number of multiplication that can be done without overlapping the BiggerNum and r is the remainder. 
        //The process is simple, we need to move the smaller number to the right and r to the right until r is equal to 0 

       while (true) {
           biggerNum = smallerNum; 
       }

        
    }

   

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in); 
        int q = 0;
        GetMultiple(50, 3);
        
    }
    
}
