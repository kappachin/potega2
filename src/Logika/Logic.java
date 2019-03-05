package Logika;

import java.math.BigInteger;


public class Logic {
    public BigInteger potegaWarunkowe(long podstawa, int wykladnik) {
        BigInteger wynik;
        if (wykladnik == 0) {
            wynik = BigInteger.valueOf(1);
        } else {
            if ((wykladnik & 1) == 0) { //even
                int i = 1;
                wynik = BigInteger.valueOf(podstawa);
                while (i < (wykladnik/2)) {
                 wynik = wynik.multiply(BigInteger.valueOf(podstawa));
                 i++;
                } wynik = wynik.multiply(wynik);
            } else { //odd
                int i = 1;
                wynik = BigInteger.valueOf(podstawa);
                while(i<(wykladnik - 1)){
                    wynik = wynik.multiply(BigInteger.valueOf(podstawa));
                    i++;
                } wynik = wynik.multiply(BigInteger.valueOf(podstawa));

            }

        }
        return wynik;
    }

    public BigInteger Potega(long podstawa, int wykladnik) {
        BigInteger wynik;


        if (wykladnik == 0) {
            wynik = BigInteger.valueOf(1);
        } else {
            if ((wykladnik & 1) == 0) {
                //even
                BigInteger temp = Potega(podstawa, (wykladnik / 2));
                wynik = temp.multiply(temp);

            } else {
                //odd
                BigInteger temp2 = Potega(podstawa, (wykladnik - 1));
                wynik = temp2.multiply(BigInteger.valueOf(podstawa));
            }


        }

        // ( a * pow(a,n-1))
        return wynik;
    }


}
