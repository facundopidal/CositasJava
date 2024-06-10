package src.exceptions;

public class DuplicatedIdException extends Exception{
    public DuplicatedIdException(String s){
        super(s);
    }

    public DuplicatedIdException(){
        super("Error: ID duplicado");
    }
}
