import java.util.Scanner;

public class ProceduralDecomposition {


    public static double getCircumference(double radius){
        Scanner console = new Scanner(System.in);
        double Pi = Math.PI;
        double circumference = 2*Pi*radius;
        return circumference;
    }

    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Input Radius:");
        System.out.print(getCircumference(console.nextDouble()));
        
        
    }
    
}
