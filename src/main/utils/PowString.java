package utils;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;;

public class PowString {
    public static double power(String x, String y){
        return pow(parseInt(x), parseInt(y));
    }
}
