import java.util.Scanner;

public class GoldBach_Conjecutre {
    
    public static void PrimeChecker(int num) {
        int divisiblecount = 0;
        boolean isPrime = true;
       for(int x = 1; x<=num; x++) {
       if (x%num == 0)
            divisiblecount +=1;
       }
       if (divisiblecount == 2)
       System.out.println("prime");
       else if (divisiblecount>2)
       System.out.println("Not a prime");
    }


    
    public static void main (String[] args) {
    Scanner console = new Scanner(System.in);
    PrimeChecker(console.nextInt());
    System.out.println("Hello");
    

    }
}