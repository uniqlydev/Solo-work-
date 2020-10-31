public class arrays {


    static void CountLength(int [] number) {
        System.out.println("Number of args: " + number.length);
        String check = number.length > 50 ? "Array X is greater than 50": "Array X is less than 50";
        System.out.println(check);
    }

    public static boolean isODD (int num) {
        int factors = 0;
        for (int x = 1; x<=num; x++) {
            if (num % x == 0) factors++; 
            
        }
        boolean check = factors > 2 ? true:false;

        return check; 
    }

    public static int OddCounter(int [] number) {
        int oddcount = 0;
     for (int i = 0; i <= number.length-1;i++) {
         isODD(number[i]);
         if (isODD(number[i])) oddcount++;
     }
     System.out.println("ODD: " + oddcount);
        return oddcount; 
    }

    public static int PrimeCounter(int [] number) {
        int primecount = 0; 
        for (int i = 0 ; i<= number.length-1;i++) {
            isODD(number[i]); 
            if (!isODD(number[i])) primecount++; 
        }
        System.out.println("Prime: " + primecount);
        return primecount;
    }
  
    public static void Display(int [] num) {
        for (int x = 0; x<=num.length-1;x++)  if (!isODD(num[x])) System.out.print("+num[x]);
        for (int y = 0; y<=num.length-1;y++) if (isODD(num[y])) System.out.print();
           
        
    }

       
    

    public static void main (String [] args) {
        int[] x = {23,56,67,89,44,11,29,78,34,90,45,88};
        CountLength(x);
        PrimeCounter(x);
        OddCounter(x);
    
        

       

    }
    
}
