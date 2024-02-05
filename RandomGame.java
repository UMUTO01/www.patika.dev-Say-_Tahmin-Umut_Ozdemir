import java.util.Random;

public class RandomGame {

    public static int Number = (int) (Math.random()*100);

    public static int getNumber() {
        return Number;
    }

    public boolean TellNumberPlace(int a){

        boolean truth;

        if(a != Number){
            System.out.println("Wrong choice");
            truth = false;
        }
        else truth = true;

        return truth;
    }
}
