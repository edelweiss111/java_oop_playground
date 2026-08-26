package tests;

import models.Fraction;

public class FractionTest {
    public static void testFraction(){
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(2, 3);
        Fraction fraction3 = new Fraction(4, 5);
        Fraction fraction4 = new Fraction(4, 7);
        Fraction fraction5 = new Fraction(6);

        System.out.println(fraction1.sum(fraction5).toString());
        System.out.println(fraction2.minus(fraction3).toString());
        System.out.println(fraction1.multiply(fraction2).toString());
        System.out.println(fraction4.divide(fraction3).toString());

        System.out.println(fraction1.sum(fraction2).divide(fraction3).minus(5));

    }
    
}
