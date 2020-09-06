import java.util.Scanner;

public class ProceduralDecomposition {

    public static void message(String name) {
        System.out.println("Welcome to the game, " + name);
       
    }
    public static void message(int x) {
        System.out.println("you are " + x);
       
    }
    public static int ageCalcu(int first_Num,int second_Num){
        return first_Num+second_Num;
    }

    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
       
        // int age = 23;
        // int hisAge = 18;
        // System.out.println("WHat is your name? ");
        // String name = console.next();
        // message(name);
        // message(age);


        // System.out.println();
        // System.out.println("WHat is his name? ");
        // name = console.next();
        // message(name);
        // message(age);

        System.out.println();
        System.out.print("Input age: ");
        int firstNum = console.nextInt();
        System.out.print("Input his age: ");
        int secondNum = console.nextInt();
        System.out.print("Age gap: " + ageCalcu(firstNum,secondNum)+ "\n");
    


    }
    
}
