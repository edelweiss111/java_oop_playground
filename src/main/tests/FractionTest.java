package tests;

import models.Fraction;

public class FractionTest {
    public static void testFraction(){
        Fraction fraction1 = new Fraction(1, -3);
        // Fraction fraction2 = new Fraction(2, 3);
        // Fraction fraction3 = new Fraction(4, 5);
        // Fraction fraction4 = new Fraction(4, 7);
        // Fraction fraction5 = new Fraction(6);

        // System.out.println(fraction1.sum(fraction5).toString());
        // System.out.println(fraction2.minus(fraction3).toString());
        // System.out.println(fraction1.multiply(fraction2).toString());
        // System.out.println(fraction4.divide(fraction3).toString());

        // System.out.println(fraction1.sum(fraction2).divide(fraction3).minus(5));

        System.out.println(fraction1);

    }

    public static void testFractionEquals(){
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(2, 3);
        Fraction fraction3 = new Fraction(1, 2);
        Fraction fraction4 = new Fraction(1, 2);

        System.out.println("1/3 и 2/3" + fraction1.equals(fraction2));
        System.out.println("1/3 и 1/2" + fraction1.equals(fraction3));
        System.out.println("1/2 и 1/2" + fraction3.equals(fraction4));
    }

    public static void testFractionClone(){
        Fraction fraction1 = new Fraction(1, 3);
        try{
            Fraction fraction2 = fraction1.clone();
            System.out.println("1 дробь - " + fraction1);
            System.out.println("2 дробь (её клон) - " + fraction2);

        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }   
}
