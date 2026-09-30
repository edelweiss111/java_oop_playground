package utils;

public class Summator {
    public static double sum(Number ... numbers){
        double result = 0.0;
        for (Number num : numbers){
            if (num != null){
                result += num.doubleValue();
            }
        }
        return result;
    }
}
