package TheThirteenth.big;

import java.math.BigDecimal;

public class BigDemo02 {
    public static void main(String[] args) {
        double num01 = 2.0;
        double num02 = 1.1;
        System.out.println(num01 - num02);

        BigDecimal big01 = new BigDecimal(2.0);
        BigDecimal big02 = new BigDecimal(1.1);
        BigDecimal result = big01.subtract(big02);
        System.out.println(result);


        BigDecimal bigDecimal = new BigDecimal("2.0");
        BigDecimal bigDecimal1 = new BigDecimal("1.1");
        BigDecimal subtract = bigDecimal.subtract(bigDecimal1);
        System.out.println(subtract);


    }
}
