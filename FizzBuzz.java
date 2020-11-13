import java.util.Scanner;

public class FizzBuzz {
    public static void main (String[] args) {
    // If the number is divisible by 5, the result is fizz 
    // If the number is divisible by 3, the result is buzz
    // If the number is divisible by both 5 and 3, the result is fizzbuzz
    // if the number is not divisible by 5 or 3, the number will print instead. 
        Scanner number = new Scanner(System.in);
        System.out.print("Number: ");
        int num = number.nextInt();
    
        String fizz = num%5==0 ? "FIZZ" : Integer.toString(num) ; 
        String buzz = num%3==0 ? "BUZZ" : Integer.toString(num);
        boolean fizzBuzz = num%3==0 && num%5==0;

        if (fizz != "FIZZ")
            System.out.print(num);
        else if (buzz != "BUZZ")
            System.out.print(num);
        else if (fizzBuzz)
            System.out.print("FIZZBUZZ"); 
    }
}