package tests;

import utils.PowString;

public class PowStringTest {
    public static void testPowString(String[] args){
        if (args.length < 2) {
            System.out.println("Ошибка: передайте минимум два аргумента (X и Y)!");
            return;
        }

        double result = PowString.power(args[0], args[1]);
        System.out.println(result);
    }
}
