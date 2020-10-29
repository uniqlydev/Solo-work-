public class arrays {


    public static int aba (int[] number){

        int sum = 0;

        for (int i = 0;i<=number.length-1;i++) sum+=number[i];


        return sum;
    }

    static void vararg (int [] number) {
        System.out.println("Number of args: " + number.length);
        System.out.println(aba(number));
    }

    public static void main (String [] args) {
        int [] numberarr = {1,2,3,4,5};
    
        vararg(numberarr);

    }
    
}
