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
            int x = 1;
            boolean divisibility = DivisibleChecker(x, num);
            boolean divisibility2 =  DivisibleChecker(i, num2);
            if (divisibility) System.out.println("First num " + i);
            if (divisibility2) System.out.println("Second num" + x);
            x++;
        }
        
    } 

  

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in); 
       GetGCD(console.nextInt(),console.nextInt());
        
    }
    
}
