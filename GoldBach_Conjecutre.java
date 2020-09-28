import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GoldBach_Conjecutre {

<<<<<<< HEAD
    
    public static void PrimeNumberList(int num) {   // Give prime numbers list to be used in Prime list
       int counter = 0;
       
       
    }

    public static void main (String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Input a number: ");
    int choice = console.nextInt();
    PrimeChecker(choice);
    PrimeNumberList(choice);
=======
    public static int[] GetTwoPrimes(int num) {
        int [] arrayPrime =
        for (int x = 1; x <= num; x++) {
            boolean isEven = false;
            for (int y = 2; y <= x/2; ++y) {
                if (x%y == 0) {
                    isEven = true;
                    break;
                }
                }
            if (isEven != true) {
                System.out.println(x);

            }
        }
    }
>>>>>>> 448353b235fbd900f7d8514173008033c41c3418

    public static void GetTwoPairs() {
        Random rand = new Random();

        int rand1 = rand.nextInt();

    }


    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        GetTwoPrimes(console.nextInt());
    }
}