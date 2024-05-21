package impuestos;
public class InvalidCategoryException extends Exception {
    
    public InvalidCategoryException(String s){
        super(s);
    }

    public InvalidCategoryException(){
        super("Categoria invalida");
    }
}
