//Punto 1
// la salida por pantalla es metodo de la clase B, metodo de la clase A
//metodo de la clase C, metodo de la clase A

public class Main {
    public static void main(String[] args) {
        FixedSalaryEmployee e1 = new FixedSalaryEmployee(569587, "Javier", "Gomez", 2008, 26, 1225);
        
        CommissionedEmployee e2 = new CommissionedEmployee(695235, "Eva", "Nieto", 2010, 179, 8.1);
        
        CommissionedEmployee e3 = new CommissionedEmployee();
        e3.setAmountClients(81);
        e3.setClientValue(7.9);
        e3.setDni(741258);
        e3.setEntryYear(2012);
        e3.setName("Jose");
        e3.setLastName("Ruiz");

        FixedSalaryEmployee e4 = new FixedSalaryEmployee();
        e4.setInitialSalary(1155); 
        e4.setEntryYear(2013);
        e4.setDni(896325);
        e4.setName("Maria");
        e4.setLastName("Nuñez");
        e4.setServiceYears(2024-2013);

        Employee[] employees =  {e1,e2,e3,e4};
        maxSalary(employees);

        showAll(employees);

        int x = e1.dni;
        System.out.println(x);

    }
    public static void maxSalary(Employee[] employees){
        Employee aux = employees[0];
        for(Employee employee : employees ){
            if(employee.getSalary() > aux.getSalary())
                aux = employee;
        }
        System.out.println("El empleado con mayor salario es:");
        aux.print();
    }

    public static void showAll(Employee[] employees){
        for(Employee employee: employees){
            employee.print();
        }
    }
}
//Punto 3
//