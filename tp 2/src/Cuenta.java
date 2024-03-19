public class Cuenta {
    private String nombre;
    private float saldo;
    
    ///Constructors
    public Cuenta(String nombre, float saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public Cuenta(String nombre) {
        this.nombre = nombre;
        this.saldo = 0;
    }

    ///Getters
    public String getNombre() {
        return nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    ///Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void ingresar(float c){
        if(c < 0){
            System.out.println("La cantidad ingresada no es valida");
            return; 
        }
        saldo += c;
    }
    
    public void extraer(float c){
        if(c > saldo){
            System.out.println("No dispone de ese saldo");
            return;
        }
        if(c < 0){
            System.out.println("La cantidad ingresada no es valida");
            return; 
        }
        saldo -= c;
    }
}
