import java.util.Scanner;
public class Goldbach {

    static boolean PrimeChecker(int num) {
        for(int x=2; x<=num/2; x++) {
            if(num%x == 0) {
                return false;
            }
        }
        
        return true;
    }

    static void goldbach(int num) {
        if(num%2 != 0) { // Not expressible as  sum of two primes
            System.out.print(" is Not even!");
            return;
        }
        if(num < 2) {
            System.out.print(" is less than 2!");
            return;
        }
        
        System.out.println("\ncan be represented as");
        for(int x=2; x<num/2 +1; x++) {
            if(PrimeChecker(num) && PrimeChecker(num-x)) 
                System.out.println( "the sum of two primes = "+ x +" + "+ (num-x) );
        }
    }
    public static void main (String [] args) {
        Scanner console = new Scanner(System.in);
        goldbach(console.nextInt());
    }
}
