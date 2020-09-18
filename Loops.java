import java.util.Scanner;

public class Loops {
    
    public static void main (final String[] args) {
        final Scanner keyboard = new Scanner(System.in);
    int k = 0;
    System.out.print("Enter a number: ");
    int a = keyboard.nextInt();
    
    for(int x = 0;x<=a;x++){
        k+=x;
        System.out.println(k);
    }

    }
}
