import java.util.Scanner;

public class array {
    
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        double [] temperature = new double[3];

        for(int x = 0;x<=temperature.length-1;x++) {
            System.out.println("Enter " + x + " temperature: ");
            temperature[x] = scanner.nextDouble();
        }

        for (int x = 0;x<=temperature.length-1;x++) System.out.println(temperature[x]);

        System.out.println();
    }
}
