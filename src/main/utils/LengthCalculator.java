package utils;

import models.Lengthable;

public class LengthCalculator {
    public static double totalLength(Lengthable ... lines){
        double result = 0.0;
        
        for (Lengthable line : lines){
            if (line != null) result += line.getLength();
        }
        return result;
    }
}
