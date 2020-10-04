import java.util.Scanner;

public class euclidean {



    


    public static int GetGCD(int a,int b) {
        Scanner console = new Scanner(System.in);
        int biggerNum;
        int smallerNum;
        int q;
        int r; 
        
        if (a>b) {
            biggerNum = a;
            smallerNum = b;
        }
        else {
            biggerNum = b;
            smallerNum = a;
        }

        while (true) {
            q = 1;
            if (smallerNum*q > biggerNum) break;
            q++;
        }
        q--;
        r = biggerNum - smallerNum*q;


        

        int num_Of_Multiplicaions = q;
         //Euclidean formula 
            while (true) {
                biggerNum = smallerNum; 
                smallerNum = r; 
                r = 0;
                    while (true) {
                        
                        
                    }
            }

        
    }

   

    public static void main (String[] args) {
        
    }
    
}
