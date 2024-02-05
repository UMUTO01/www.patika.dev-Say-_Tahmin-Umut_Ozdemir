import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        RandomGame random = new RandomGame();


        System.out.println("You have 5 time to find the random number:");

        int n = 0;

        while (n<5){

            System.out.println("Number: ");

            int a = scan.nextInt();
            if(!random.TellNumberPlace(a)) n++;

            else{
                System.out.println("Correct guess");
                n = 6;
            }

        }
        System.out.println("The number was "+ random.getNumber());
    }
}