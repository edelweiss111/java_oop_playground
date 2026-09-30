package utils;

import models.GradeRule;

public class EvenGradeRule implements GradeRule{
    @Override 
    public boolean isValid(int grade) {
        return grade % 2 == 0;
    }
}
