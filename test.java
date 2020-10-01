import java.util.Scanner;

public class test {
   public static boolean isPrime(int n) {
        int divisors = 0;
        for(int x = 1; x<=n;x++) {
            if (n%x == 0)
                divisors++;
        }
        boolean prime = divisors == 2 ? true:false;

        return prime;  
    }

    static void goldbach(int n) {
        if(!isPrime(n)) System.out.println("Not a prime :>");
        System.out.println("Digits: ");
        for(int x=2; x<n/2 +1; x++) {
            if(isPrime(x) && isPrime(n-x)) {
                System.out.println( "Factors = "+x +" + "+ (n-x) );
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        goldbach(in.nextInt());
    }
}
