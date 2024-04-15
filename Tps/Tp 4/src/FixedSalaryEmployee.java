public class FixedSalaryEmployee extends Employee{
    private int serviceYears;
    private double initialSalary;

    ///Constructor completo
    public FixedSalaryEmployee(int dni, String name, String lastName, int entryYear, int serviceYears, double initialSalary) {
        super(dni, name, lastName, entryYear);
        this.serviceYears = serviceYears;
        this.initialSalary = initialSalary;
    }
    // Constructor vacio
    public FixedSalaryEmployee(){
        super(0, null, null, 0);
        initialSalary = 0;
        serviceYears = 0;
    }

    ///Salario segun antiguedad
    @Override
    public double getSalary() {
        if(serviceYears > 1 && serviceYears < 4)return initialSalary * 1.05;
        if(serviceYears >3 && serviceYears < 8)return initialSalary * 1.10;
        if(serviceYears >7 && serviceYears < 16)return initialSalary * 1.15;
        if(serviceYears > 15)return initialSalary * 1.20;
        return initialSalary;
    }

    ///Descripcion del objeto
    @Override
    public void print(){
        System.out.println(getDescription());
        System.out.println();
    }

    public String getDescription() {
        return "FixedSalaryEmployee{" +

                "dni=" + dni +
                ", name='" + name + '\'' +
                ", lastName='" + lastName +
                ", entryYear=" + entryYear +
                "serviceYears=" + serviceYears +
                ", salary=" + getSalary() +
                '}';
    }

    // Geters and Setters
    public int getServiceYears() {
        return serviceYears;
    }

    public double getInitialSalary() {
        return initialSalary;
    }

    public void setServiceYears(int serviceYears) {
        this.serviceYears = serviceYears;
    }

    public void setInitialSalary(double initialSalary) {
        this.initialSalary = initialSalary;
    }
}
