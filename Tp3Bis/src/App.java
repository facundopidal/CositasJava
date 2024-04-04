public class App {
    public static void main(String[] args) throws Exception {

        /*
        * 
        Rectangle.setHeight(10);
        Rectangle.setWidth(10);
        
        System.out.println("El area del rectangulo es: " + Rectangle.calculateArea());
        System.out.println("El perimetro del rectangulo es: " + Rectangle.calculatePerimeter());

        Rectangle.setHeight(20);
        Rectangle.setWidth(20);

        System.out.println("El area del rectangulo es: " + Rectangle.calculateArea());
        System.out.println("El perimetro del rectangulo es: " + Rectangle.calculatePerimeter());
        
        Rectangle rectangulote = new Rectangle();
        System.out.println("El area del rectangulo es: " + rectangulote.calculateArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulote.calculatePerimeter());
        * 
        */

        Employee empleado1 = new Employee(23456345, "Carlos", "Gutierrez", 25000);
        Employee empleado2 = new Employee(34234123, "Ana", "Sanchez", 27500);
        empleado1.getDescription();
        empleado2.getDescription();

        empleado1.increaseSalary(15);

        System.out.println("Salario aumentado de carlos es es de: " + empleado1.getSalary());

        System.out.println("Salario anual de " + empleado1.getName() + " es de: " + empleado1.annualSalary());


        
    }
}

