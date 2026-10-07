package exceptions;

public class InvalidGradeException extends RuntimeException{

    public InvalidGradeException(String message){
        super(message);
    }

    public InvalidGradeException(){
        super("");
    }
}
