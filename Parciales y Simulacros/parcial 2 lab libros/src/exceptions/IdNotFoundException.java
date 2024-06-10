package src.exceptions;

public class IdNotFoundException extends Exception{
    public IdNotFoundException(String s){
        super(s);
    }
    
    public IdNotFoundException(){
        super("Error: ID no encontrado");
    }
}
