public class quiz {

    
    private static int GetFactorial(int x) {
        int num = x-1;
        while(true) {
            x *= num;
            num--;
            if (num==0) break;
        }
        return x;
    }
    private static void WilsonTheorem(int n) {
        int factorialOfN = GetFactorial(n-1);
        if((factorialOfN+1)%n == 0) System.out.println(n + " is a prime");
        else System.out.println(n + " is not a prime");
        
    }

    public static void main (String[] args) {
        //Wilson's Theorem (n-1)!+1 is divisble by n 
        WilsonTheorem(5);

    }
    
}
