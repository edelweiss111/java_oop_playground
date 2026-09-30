package utils;

import models.Meowable;

public class MeowUtils {
    public static void meow(Meowable ... meowables){
        for (Meowable meowable : meowables){
            if (meowable != null) meowable.meow();
        }
    }
}
