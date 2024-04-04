public abstract class  Employee {
    protected int dni;
    protected String name;
    protected String lastName;
    protected int entryYear;

    public Employee(int dni, String name, String lastName, int entryYear) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.entryYear = entryYear;
    }

    ///Metodo dinamico
    public abstract double getSalary();
    ///Metodo dinamico
    public abstract void print();

    public void maxSalary(Employee[] employees){
        Employee aux = employees[0];
        for(Employee employee : employees ){
            if(employee.getSalary() > aux.getSalary())
                aux = employee;
        }
        aux.print();
    }

    public void showAll(Employee[] employees){
        for(Employee employee: employees){
            employee.print();
        }
    }
}
