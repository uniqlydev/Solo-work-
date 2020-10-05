import java.util.Scanner;

public class euclidean {

    private static void GetMultiple(int a, int b) { // Check the highest multiple without overlapping the biggernumber 
       int q = 1;
        while(a>b) {
            b *=q;
            q++;
            System.out.println(q);
        }
        q--;
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
        GetMultiple(50, 3);
        
    }
    
}
