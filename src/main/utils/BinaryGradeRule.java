package utils;

import models.GradeRule;

public class BinaryGradeRule implements GradeRule{
    @Override
    public boolean isValid(int grade){
        return grade == 0 || grade == 1;
    }    
}
