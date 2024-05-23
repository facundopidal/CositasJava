package Banco;

public class Cuenta {
    private String dni;
    private int saldo;
    private String nombre;

    public Cuenta(String dni, String nombre) {
        this.dni = dni;
        saldo = 6;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void retirarDinero(int aRetirar) throws SaldoInsuficienteException,IllegalArgumentException {
        try {
            saldo -= aRetirar;
            if (aRetirar > saldo)
                throw new SaldoInsuficienteException("Saldo Insuficiente");
            if (aRetirar == 7)
                throw new IllegalArgumentException("Ingrese un valor correcto");
        } 
        catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
            //throw e;
        } 
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        

    }


}
