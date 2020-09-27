import java.util.Scanner;



public class GoldBach_Conjecutre {
    
    public static void PrimeChecker(int num) {
        int divisiblecount = 0;
       for(int x = 1; x<=num; x++) {
       if (num%x == 0)
            divisiblecount +=1;
       }
       if (divisiblecount == 2)
       System.out.println("Prime");
       else if (divisiblecount!=2)
       System.out.println("Not a prime");
    }

    
    public static void PrimePairsFinder(int num) {
         for (int x = 1; x<=num;x++) {
            for (int y = 2; y<=x; y++) {
                if (x%y == 0)
                    System.out.println(y);
            }
            
        }
    }
    public static void main (String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Input a number: ");
    int choice = console.nextInt();
    PrimeChecker(choice);
    PrimePairsFinder(choice);

    
    
    

    }
}