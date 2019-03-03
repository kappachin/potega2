package App;
import Logika.Logic;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) {
        Logic logic = new Logic();
        System.out.println(logic.potegaWarunkowe(2,1));
        long start = System.nanoTime();
        System.out.println(logic.Potega(2,31));
        long stop = System.nanoTime();
        System.out.println((stop - start));
    }
}
