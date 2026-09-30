package tests;

import models.Fraction;
import utils.Summator;

public class SummatorTest {
    public static void testSummator(){
        int a1 = 2;
        Fraction fraction1 = new Fraction(3, 5);
        double b1 = 2.3;

        double b2 = 3.6;
        Fraction fraction2 = new Fraction(49, 12);
        int a2 = 3;
        Fraction fraction3 = new Fraction(3, 2);

        Fraction fraction4 = new Fraction(1, 3);
        int a3 = 1;


        System.out.println(Summator.sum(a1, fraction1, b1));
        System.out.println(Summator.sum(b2, fraction2, a2, fraction3));
        System.out.println(Summator.sum(fraction4, a3));
    }
}
