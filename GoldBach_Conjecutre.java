import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GoldBach_Conjecutre {

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