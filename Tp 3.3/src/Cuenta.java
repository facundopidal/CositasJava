public class Cuenta {
    private int id;
    private float balance;
    private Cliente cliente;
    
    public Cuenta(int id, float balance, Cliente cliente) {
        this.id = id;
        this.balance = balance;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(float aDepositar){
            balance += aDepositar;
            System.out.println("El cliente " + cliente.getNombre() + " deposito " + aDepositar);
    }

    public void extraer(float aExtraer){
            if((balance - aExtraer) > -2000){
                balance -= aExtraer;
                System.out.println("El cliente " + cliente.getNombre() + " retiro " + aExtraer);
            }
            else{
                System.out.println("Error, no hay fondos suficientes");
            }
    }

}
