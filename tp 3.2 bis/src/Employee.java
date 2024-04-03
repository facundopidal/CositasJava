public class Employee {
    private int dni; 
     private String name;
     private String surname;
     private double salary;

    public double annualSalary(){
        return salary * 12;
    }
    public void increaseSalary(double percentage){
        salary *= (1 + percentage);
    }
    public String getDescription(){
        return "DNI: " + dni + "\nNombre: " + name + "\nApellido: "+ surname + "\nSalario: " + salary;
    }
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
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(int dni, String name, String surname, double salary) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

}