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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    
}
