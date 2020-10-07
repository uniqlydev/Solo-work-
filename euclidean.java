import java.util.Scanner;

public class euclidean {

    private static void GetMultiple(int a, int b) { // Check the highest multiple without overlapping the biggernumber 
       int q = 1;
        while(true) {
            b*=q;
            if (b<a) q++;
            if (b==a) {
                System.out.println(q);
                break;
            }
            b = 0;
        }
    }

    public static void GetGCD(int num, int num2) {
        for (int i = 1; i<=num;i++) {
            boolean divisibility = DivisibleChecker(x, num);
            if (divisibility) System.out.println("First num " + i);
        }
        
    } 

  

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in); 
        GetMultiple(20, 3);
        
    }
    
}
