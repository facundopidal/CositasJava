public class Cuenta {

    private String nombreYApellido;

    private float saldo;

    //Constructors
    
    public Cuenta(String nombreYApellido, float saldo) {
        this.nombreYApellido = nombreYApellido;
        this.saldo = saldo;
    }
    
    public Cuenta(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
        this.saldo = 0;
    }

    //Getters y setters

    public float getSaldo() {
        return saldo;
    }

    public String getNombreYApellido(){
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido){
        this.nombreYApellido = nombreYApellido;
    }

    // Methods

    public void ingresar(float c){
        if(c < 0){
            System.out.println("La cantidad a ingresar no puede ser negativa");
            return;
        } 
        saldo += c;
        System.out.println("Se ingresaron $" + c + " correctamente");
    }

    
    public void extraer(float c){
        if(c > saldo){
            System.out.println("No dispone de ese saldo");
            return;
        }
        if(c < 0){
            System.out.println("La cantidad a extraer no puede ser negativa");
            return;
        } 
        saldo -= c;
        System.out.println("Se extrajeron $" + c + " correctamente");
    }


}