package tests;

import models.Fraction;
import utils.Summator;
import java.math.BigInteger;

public class SummatorTest {
    public static void testSummator(){
        int a1 = 7;
        Fraction fraction1 = new Fraction(11, 3);
        double b1 = 3.21;
        BigInteger c1 = new BigInteger("12345678912345678912");


        System.out.println(Summator.sum(a1, fraction1, b1, c1));

    }
}
