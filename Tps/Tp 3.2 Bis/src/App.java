public class App {
    public static void main(String[] args) {
    // a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 
    // 25000. 
    // b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 
    // 27500. 
    // c. Imprima ambos objetos por pantalla.
    // d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el 
    // salario anual del mismo. 

        Employee e1 = new Employee(23456345, "Carlos", "Gutierrez", 25000);
        Employee e2 = new Employee(34234123, "Ana", "Sánchez", 27500);

        System.out.println(e1.getDescription());
        System.out.println(e2.getDescription());

        e1.increaseSalary(0.15);
        System.out.println(e1.annualSalary());
    }
}
