package utils;

public class StringsUtil {
    public static int extractAndDivide(String ... strings){
        Integer count = null;
        for (String string : strings){
            try {
                //пробуем перевести в int
                int intString = Integer.parseInt(string);
                //если счетчик пустой, сохраняем в него число
                if (count == null) count = intString;
                //иначе делим счетчик на число и сохраняем в него же
                else count /= intString;
            }catch (NumberFormatException e){}//ошибка перевода из строки в int
            catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль!");
            }
        }
        if (count != null) return count;
        return 0;
    }
}
