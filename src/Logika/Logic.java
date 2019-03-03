package Logika;

import java.math.BigInteger;


public class Logic {
    public BigInteger potega(int podstawa, int wykladnik) {
        BigInteger wynik;
        if (wykladnik == 0) {
            wynik = BigInteger.valueOf(1);
        } else {
            if ((wykladnik & 1) == 0) {
                wynik = BigInteger.valueOf(0);
            } else {
                wynik = BigInteger.valueOf(0);
            }

        }
        return wynik;
    }


}
