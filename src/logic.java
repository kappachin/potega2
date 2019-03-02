import java.math.BigInteger;
import java.util.Scanner;

public class logic {
    public BigInteger potega(int podstawa, int wykladnik) {
        BigInteger wynik;
        if (wykladnik == 0) {
            podstawa = 1;
        } else {
            if ((wykladnik & 1) == 0) {
                wynik = BigInteger.valueOf((podstawa^(wykladnik/2))^2);
            } else {

            }

        }
        return wynik;
    }


}
