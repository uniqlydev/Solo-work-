import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator{

    public static void main(String[] args) {
        //Instantation of Classes
        Scanner reader = new Scanner(System.in);
       

        final byte Months_In_Year = 12;
        final byte percent = 100;


        System.out.print("Principal: ");
        double principal = reader.nextDouble(); 

        System.out.print("Annual Interest rate: ");
        float annualinterest = reader.nextFloat();
        float monthlyInterest = annualinterest / percent / Months_In_Year; 

        System.out.print("Period: ");
        byte period = reader.nextByte();
        int numberOfPayments = period *Months_In_Year;

        double mortage = principal*(monthlyInterest*Math.pow(1+monthlyInterest, numberOfPayments) / (Math.pow(1+monthlyInterest, numberOfPayments) -1 ));

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.print(mortageFormatted);
        
        


        
    }
}