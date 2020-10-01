import java.util.Scanner;

public class test {

   public static boolean isPrime(int n) { // To check if n is prime or not
        int divisors = 0;
        for(int x = 1; x<=n;x++) { // Loop to check if the divisor is 1 and itself only
            if (n%x == 0) // check to see if it has a remainder and to see if a number is divisible to n 
                divisors++;
        }
        boolean prime = divisors == 2 ? true:false; // A simplfied version of if-else
        return prime;  
    }

    static void goldbach(int n) { // Gives the pair of prime numbers equals to n
        if (isPrime(n)) System.out.println("Prime");
        else System.out.println("Even");
        System.out.println("GoldBach ");
        for(int x=2; x<n/2 +1; x++) { // anything less than 3 will be invalid
            if(isPrime(x) && isPrime(n-x)) // To filter Prime numbers.
                System.out.println( "Factors = "+ x +" + "+ (n-x)); //Put parenthesis to avoid error and to be prioritized by the program
        }
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        goldbach(in.nextInt());
    }
}
