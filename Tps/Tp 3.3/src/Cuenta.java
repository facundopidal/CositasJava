public class Cuenta {
    private int id;
    private float balance;
    private Cliente cliente;
    private String[] registros;
    private int indexRegistros;
    
    public Cuenta(int id, float balance, Cliente cliente) {
        this.id = id;
        this.balance = balance;
        this.cliente = cliente;
        this.registros = new String[10];
        this.indexRegistros = 0;
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

    private void desplazarRegistros(){
        for (int i = 0; i < 9; i++) {
            registros[i] = registros[i + 1];
        }
    }

    public void depositar(float aDepositar){

        if(indexRegistros < 10){
            balance += aDepositar;
            registros[indexRegistros++] = "Depósito: El cliente " + cliente.getNombre() + " deposito " + aDepositar;
            System.out.println(registros[indexRegistros - 1]);
        } else {
            desplazarRegistros();
            registros[9] = "Depósito: El cliente " + cliente.getNombre() + " deposito " + aDepositar;
            System.out.println(registros[9]);
        }

    }

    public void extraer(float aExtraer){
        if(indexRegistros < 10){
            if((balance - aExtraer) > -2000){
                balance -= aExtraer;
                registros[indexRegistros++] = "Extracción: El cliente " + cliente.getNombre() + " retiró " + aExtraer;
                System.out.println(registros[indexRegistros - 1]);
            }
            else{
                System.out.println("Error, no hay fondos suficientes");
            }
        }else {
            desplazarRegistros();
            registros[9] = "Extracción: El cliente " + cliente.getNombre() + " retiró " + aExtraer;
            System.out.println(registros[9]);
        }
    }

    public void mostrarRegistros(){
        System.out.println("Registros:");
        for (int i = 0; i < indexRegistros; i++) {
            System.out.println(registros[i]);
        }
    }

}
