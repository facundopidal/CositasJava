package Password;

public class InvalidPasswordException  extends Exception{

    public InvalidPasswordException(String s){
        super(s);
    }

    public InvalidPasswordException(){
        super("Invalid Password");
    }
}
