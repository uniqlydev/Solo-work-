import java.util.Scanner;

public class PROBLEMSET1 {
    

    public static boolean isPrime(int n) { // To check if n is prime or not
        int divisors = 0;
        for(int x = 1; x<=n;x++) { // Loop to check if the divisor is 1 and itself only
            if (n%x == 0) // check to see if it has a remainder and to see if a number is divisible to n 
                divisors++;
        }
        boolean prime = divisors == 2 ? true:false; // A simplfied version of if-else
        return prime;  
    }
    public static void Show(int k) {
        for(int x = 1; x<=k;x++) {
            if (isPrime(x)) 
                System.out.println(x);
        }
    }
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        Show(console.nextInt());
      
    }
}
