import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator{

    public static void main(String[] args) {
        //Instantation of Classes
        Scanner reader = new Scanner(System.in);
       

        final byte Months_In_Year = 12;
        final byte percent = 100;

        double principal;
 
        
         while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principal = reader.nextDouble();
            if (principal >= 1_000 && principal <= 1_000_000 )
                break;
        }

        float annualinterest;
        float monthlyInterest;

        while (true) {
        System.out.print("Annual Interest rate: ");
        annualinterest = reader.nextFloat();
        if (annualinterest > 0 && annualinterest <=30 )
            break;
        else 
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }
        monthlyInterest = annualinterest / percent / Months_In_Year;

        byte period;
        int numberOfPayments;

        while (true) {
        System.out.print("Period: ");
        period = reader.nextByte();
            if (period >= 1 && period <=30)
                break;
            else 
                System.out.println("Enter a value between 1 and 30. ");
        }
        numberOfPayments = period *Months_In_Year;
        
       

        double mortage = principal*(monthlyInterest*Math.pow(1+monthlyInterest, numberOfPayments) / (Math.pow(1+monthlyInterest, numberOfPayments) -1 ));

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.print(mortageFormatted);
        
        reader.close();
        


        
    }
}