package tests;

import utils.StringsUtil;

public interface StringsUtilTest {
    public static void testStringsUtil(){
        // Тест 1: Обычный случай (100 / 2 / 5 = 10)
        System.out.println(StringsUtil.extractAndDivide("100", "2", "5")); // 10

        // Тест 2: Игнорирование букв и пропускание 0 в середине (100 / 0 / 2 = 50)
        System.out.println(StringsUtil.extractAndDivide("100", "орро", "0", "abc", "2")); // 50

        // Тест 3: Первый ноль (0 / 5 = 0)
        System.out.println(StringsUtil.extractAndDivide("0", "5", "2")); // 0

        // Тест 4: Только буквы
        System.out.println(StringsUtil.extractAndDivide("hello", "world")); // 0
    }
}
