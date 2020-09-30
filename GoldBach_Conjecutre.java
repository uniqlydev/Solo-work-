import java.util.Scanner;
import java.util.Random;

public class GoldBach_Conjecutre {


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
            if (!isEven) {
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
    public static void GetTwoPairs(int num) {
        int [] randomArray = GetTwoPrimes(num);
        Random rand = new Random();
        int firstDigit = randomArray[rand.nextInt(num)];
        int secondDigit = randomArray[rand.nextInt(num)];
        while (true) { // WIll randomize numbers in order to get a combination within the numbers array
            if (firstDigit != 0 && secondDigit != 0 && firstDigit != secondDigit && firstDigit + secondDigit != num)
                System.out.println("Pairs: " + firstDigit +"," + secondDigit); 
            if (firstDigit != 0 && secondDigit != 0 && firstDigit != secondDigit && firstDigit + secondDigit == num) { // To avoid 0s and having the same digit. 
                System.out.println("Goldbach: " + firstDigit + "+" + secondDigit);
                break;
            }
            firstDigit = randomArray[rand.nextInt(num)];// if condition not yet true, randomize again. 
            secondDigit = randomArray[rand.nextInt(num)];
        }
           
    }
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int user_Choice = console.nextInt();
        ShowPrime(user_Choice);
        GetTwoPairs(user_Choice);
        console.close();
    }
}