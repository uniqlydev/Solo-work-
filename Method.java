import java.util.Scanner;
public class Method {

    public static void goodboy(int x){
        System.out.println("Your number " + x + " is a good number");
    }
    public static void main (String [] args){
        Scanner console = new Scanner(System.in);
        for (int y = 0; y <3;y++){
            System.out.println("Enter an integer");
            goodboy(console.nextInt());
        }
        console.close();
    }
}