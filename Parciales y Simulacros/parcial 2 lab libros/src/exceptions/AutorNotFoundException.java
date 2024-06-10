package src.exceptions;

public class AutorNotFoundException extends Exception{
    public AutorNotFoundException(String s){
        super(s);
    }
    
    public AutorNotFoundException(){
        super("Error: No autor");
    }
}
