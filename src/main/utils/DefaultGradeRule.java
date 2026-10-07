package utils;

import models.GradeRule;

public class DefaultGradeRule implements GradeRule{
    @Override 
    public boolean isValid(int grade){
        return grade <= 5 && grade >= 2;
    }
}
