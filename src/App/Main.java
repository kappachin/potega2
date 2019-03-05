package App;
import Logika.Logic;

public class Main {

    public static void main(String[] args) {
        Logic logic = new Logic();
        System.out.println(logic.potegaWarunkowe(2,35));
        long start = System.nanoTime();
        System.out.println(logic.Potega(2,35));
        long stop = System.nanoTime();
        System.out.println("czas(w nanokesundach):" + (stop - start));
    }
}
