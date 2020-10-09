public class PT2 {

    private static boolean DivisibilityCheck (int num1, int num2) { 
        boolean divisible = false; 
        if (num2%num1 == 0) divisible = true; 
        if (num2%num1 != 0) divisible = false; 
        boolean x = num2%num1 == 0 ? true:false;
        return divisible;
    }

    private static void ShowFactors(int num1, int num2) {
        System.out.println("Factors of " + num1);
        for(int x = 1;x<=num1;x++) {
            boolean checker = DivisibilityCheck(x, num1);
            if (checker) System.out.println(x);
        }
        System.out.println("Factors of " + num2);
        for (int y = 1;y<=num2;y++) {
            boolean checker2 = DivisibilityCheck(y, num2);
            if (checker2) System.out.println(y);
        }
    }

    private static int EuclideanFormula(int num1,int num2) {
        while (num2 != 0) {
            int recentNum = num2;
            num2 = num1%num2;
            num1 = recentNum;
        }
        return num1;
    }




    public static void main (String[] args) {
        ShowFactors(20, 80);
        System.out.println("---------------------------");
        System.out.println(EuclideanFormula(36, 27));
    }
    
    
}
