public class Cuenta {
    private double saldo;

    public Cuenta(double saldo){
        this.saldo = saldo;
    }

    public void ingresar(double ingreso){
        saldo += ingreso;
    }

    public void retirar(double retiro) throws SaldoInsuficienteException, IllegalArgumentException{
        try{
            if(retiro <= 0) throw new IllegalArgumentException("El valor debe superar 0");
            if(retiro > saldo) throw new SaldoInsuficienteException("El saldo es insuficiente");
            saldo -= retiro;
        } catch(SaldoInsuficienteException | IllegalArgumentException e){
            System.out.println(e.getMessage());
            //throw e;
        }

    }
}
