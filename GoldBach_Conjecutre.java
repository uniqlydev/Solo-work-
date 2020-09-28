import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class GoldBach_Conjecutre {

    public static int Random(int min) {
        Random rand = new Random();
        int firstNum = rand.nextInt(min);
        int secondNum = rand.nextInt(min);
        return firstNum;
    }

    public static int[] GetTwoPrimes(int num) {
        int primeCount = 0;
        int currNum;
        int [] numbers = new int[num];
        for (int x = 1; x <= num; x++) {
            boolean isEven = false;
            for (int y = 2; y <= x/2; ++y) {
                if (x%y == 0) {
                    isEven = true;
                    break;
                }
                }
            if (isEven != true) {
                currNum = x;
                numbers[primeCount] = currNum;
                primeCount++;
            }
        }
        return numbers;
    }

    public static void ShowPrime(int num) {
        int numbers [] = GetTwoPrimes(num);
        for (int i = 0; i<=num; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] == 0) {
                break;
            }
        }
    }
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int user_Choice = console.nextInt();
        int numbers [] = GetTwoPrimes(user_Choice);
        ShowPrime(user_Choice);
        console.close();
    }
}