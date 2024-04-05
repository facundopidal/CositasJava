public class CommissionedEmployee extends Employee {
    private static double initialSalary = 750;
    private int amountClients;
    private double clientValue;

    ///Constructor completo
    public CommissionedEmployee(int dni, String name, String lastName, int entryYear, int amountClients, double clientValue) {
        super(dni, name, lastName, entryYear);
        this.amountClients = amountClients;
        this.clientValue = clientValue;
    }
    // Constructor vacio
    public CommissionedEmployee(){
        super(0, null, null,0);
        amountClients = 0;
        clientValue = 0;
    }

    /// Sueldo minimo o comision, el mas alto
    @Override
    public double getSalary() {
        return Math.max(initialSalary, clientValue * amountClients);
    }
    public void print(){
        System.out.println(getDescription());
        System.out.println();
    }

    /// Descripcion del objeto
    public String getDescription() {
        return "CommissionedEmployee{" +
                "amountClients=" + amountClients +
                ", clientValue=" + clientValue +
                ", dni=" + dni +
                ", name='" + name +
                "', lastName='" + lastName +
                "', entryYear=" + entryYear +
                ", salary=" + getSalary() +
                '}';
    }

    ///Getters y Setters

    public static double getInitialSalary() {
        return initialSalary;
    }

    public int getAmountClients() {
        return amountClients;
    }

    public double getClientValue() {
        return clientValue;
    }

    public static void setInitialSalary(double initialSalary) {
        CommissionedEmployee.initialSalary = initialSalary;
    }

    public void setAmountClients(int amountClients) {
        this.amountClients = amountClients;
    }

    public void setClientValue(double clientValue) {
        this.clientValue = clientValue;
    }
}
