import java.util.Scanner;

public class MortgageCalculator{

    public static void main(String[] args) {
        //Instantation of Classes
        Scanner reader = new Scanner(System.in);
        Scanner reader1 = new Scanner(System.in);
        Scanner reader2 = new Scanner(System.in);


        System.out.print("Principal: ");
        double principal = reader.nextDouble(); 
        System.out.print("Monthly Interest rate: ");
        double interest = (reader1.nextDouble() / 100)/12; //Monthly interest rate
        System.out.print("Number of payments ");
        double numPayments = reader2.nextDouble() * 12;

        double monthPayment = principal*(interest*(Math.pow((1+interest),numPayments) / Math.pow((1+interest), numPayments) - 1));

        System.out.println(monthPayment);

        


        
    }
}