package Logika;

import java.math.BigInteger;


public class Logic {
    public BigInteger potegaWarunkowe(long podstawa, int wykladnik) {
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

    public BigInteger Potega(long podstawa, int wykladnik){
        BigInteger wynik;
        if(wykladnik == 0){
            wynik = BigInteger.valueOf(1);
        }

       // ( a * pow(a,n-1))
    return wynik;
    }


}
