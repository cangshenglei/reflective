package TheThirteenth.big;

import java.math.BigInteger;

public class BigDemo01 {
    public static void main(String[] args) {
        int num01 = 1234567890;
        long num02 = 1234567890123456789L;

        BigInteger bigInteger = new BigInteger("12345678901234567890");
        BigInteger bigInteger1 = new BigInteger("1");
        BigInteger add = bigInteger.add(bigInteger1);

        System.out.println(add);


    }
}
