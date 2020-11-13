
public class array {

    public static int CountNumGreaterThan50 (int [] array) {
        int numGreaterThan50 = 0;

        for (double T : array)   if (T>50) numGreaterThan50++;
 
        return numGreaterThan50;
    }

    public static int CountNumLessThan50 (int [] array) {
        int numGreaterThan50 = CountNumGreaterThan50(array);
        int numLessThanOrEqualTo50 = array.length-numGreaterThan50;

        return numLessThanOrEqualTo50;   
    }

    public static boolean isOdd(int x) {
        boolean isDivisible = x%2!=0 ? true:false;
        
        return isDivisible;
    }

    public static boolean isPrime (int x ) {
        int factors = 0;
        for (int i = 1; i<=x;i++) {
            if (i%x==0) factors++;
            
        }
        boolean hasOnly2Factors = factors>2 ? true:false;

        return hasOnly2Factors;
    }
    public static int PrimeCount (int [] x) {
        int primeCount = 0;
        for (int prime:x) if (isPrime(prime)) primeCount++;
        return primeCount;
    }

    public static boolean isDivisibleByFive (int x) {
        boolean isDivisble = x%5==0 || x%10==0 ? true:false;

        return isDivisble;
    }

    public static void main (String [] args) {
        int[] x = {23,56,67,89,44,11,29,78,34,90,45,88};
        int oddCount = 0;
        int evenCount=0;
        int primeCount = PrimeCount(x);
        
        System.out.println("Number of x Greater than 50: " + CountNumGreaterThan50(x));
        System.out.println("Number of x less than or equal to 50: " + CountNumLessThan50(x));
        for(int temp : x) {
            if (isOdd(temp)) oddCount++;
            if (!isOdd(temp)) evenCount++;
        }
        System.out.println("Odd numbers: " + oddCount+"\nEven numbers: " + evenCount);

        System.out.println("Prime count: " + primeCount);

        System.out.println("Prime numbers: ");
        for(int prime : x) if (isPrime(prime)) System.out.print(prime+",");

        System.out.println("Numbers divisble by 5: ");
        for (int i : x) if(isDivisibleByFive(i)) System.out.print(i+",");

            



        
        
    }
}
