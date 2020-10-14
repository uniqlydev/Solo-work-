import java.util.Scanner;

public class Coprime {
    private static boolean DivisibleCheck (int a,int b) {
        boolean Divisibility = false;
        if (b%a == 0) Divisibility = true;
        if (b%a != 0) Divisibility = false;
        return Divisibility;
    }

   public static void Coprime(int x, int y) {
       int xNum = 0;
       int yNum = 0;
       int factors  = 0;
       for (int i = 1;i<=x+y;i++) {
           if (DivisibleCheck(i, x)) xNum = i;;
           if (DivisibleCheck(i, y)) yNum = i;
           if (xNum == yNum) factors++;
           }
          String check = factors<=1 ? "It's a coprime" : "Not a coprime";
           System.out.println(check);
       }

    public static void ShowCoprime() {
        System.out.println("Input two numbers: "); 
        Scanner console = new Scanner(System.in);
        Coprime(console.nextInt(), console.nextInt());
    }

    public static void main (String [] args) {
        ShowCoprime();
    }
    
}
