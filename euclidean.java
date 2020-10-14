import java.util.Scanner;

public class euclidean {
    

    private static boolean DivisibleCheck (int a,int b) {
        boolean Divisibility = false;
        if (b%a == 0) Divisibility = true;
        if (b%a != 0) Divisibility = false;
        return Divisibility;
    }

    public static void Print(int x,int y) {
        System.out.println("Factors of " + x);
        for (int i = 1; i<=x;i++) {
        boolean check = DivisibleCheck(i, x);
        if (check) System.out.println(i);
        }
        System.out.println("--------------------------------------------");
        System.out.println("Factors of " + y);
        for (int o = 1;o<=y;o++) {
            boolean check2 = DivisibleCheck(o, y);
         if (check2) System.out.println(o);
        }
    }

    public static int EuclideanFormula (int a, int b) { // Check for remainder where b = remainder
        while (b!=0) {
            int recentNumb = b;
            b = a%b; // If zerom 
            a = recentNumb;
        }
        return a;
    }
    public static void main (String [] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter 2 digits: ");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        Print(num1,num2);
        System.out.println("-------------------------------------");
        System.out.println("GCD: "+EuclideanFormula(num1, num2));
    }
}
