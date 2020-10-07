import java.util.Scanner;

public class euclidean {

    public static boolean DivisibleChecker(int a, int b) {
        boolean divisbleCheck = false;
        if (b%a==0) divisbleCheck = true;
        if (b%a!=0) divisbleCheck = false;
        return divisbleCheck; 
    }

    public static void GetGCD(int num, int num2) {
        for (int i = 1; i<=num;i++) {
            boolean divisibility = DivisibleChecker(x, num);
            if (divisibility) System.out.println("First num " + i);
        }
        
    } 

  

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in); 
       GetGCD(console.nextInt(),console.nextInt());
        
    }
    
}
