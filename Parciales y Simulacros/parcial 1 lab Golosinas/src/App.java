import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(1, "Juan", "Perez", "Calle 123", "01/01/1990", 1000);
        Administrador admin1 = new Administrador(2, "Maria", "Gonzalez", "Avenida XYZ", "15/05/1985", "Recursos Humanos");
        
        // Agregar empleados a la lista
        ListaEmpleados.agregar(vendedor1);
        ListaEmpleados.agregar(admin1);
        
        // Mostrar la cantidad de empleados
        System.out.println("Cantidad de empleados: " + ListaEmpleados.contarEmpleados());
        
        // Buscar un empleado por legajo
        Empleado empleadoBuscado = ListaEmpleados.buscarPorLegajo(1);
        if (empleadoBuscado != null) {
            System.out.println("Empleado encontrado: " + empleadoBuscado);
        } else {
            System.out.println("Empleado no encontrado.");
        }
        
        // Eliminar un empleado por legajo
        Empleado empleadoEliminado = ListaEmpleados.eliminarPorLegajo(2);
        if (empleadoEliminado != null) {
            System.out.println("Empleado eliminado: " + empleadoEliminado);
        } else {
            System.out.println("Empleado no encontrado para eliminar.");
        }
        
        // Mostrar la cantidad de empleados después de eliminar
        System.out.println("Cantidad de empleados después de eliminar: " + ListaEmpleados.contarEmpleados());
        ListaEmpleados.agregar(empleadoEliminado);
        ArrayList<Repartidor> listaR = new ArrayList<>();
        ArrayList<Empleado> listaE = ListaEmpleados.devolverListado();

        listaR.add(new Repartidor("juan", "Repartidor", 4));
        listaR.add(new Repartidor("Pidi", "Repartidor", 6));
        listaR.add(new Repartidor("Huevo", "Repartidor", 7));
        
        System.out.println("Pago total: " + calcularPagos(listaE, listaR));

    }
    public static double calcularPagos(ArrayList<Empleado> listaE, ArrayList<Repartidor> listaR) {
        double total = 0;
        Vendedor vendedor;
        Administrador administrador;
        for(int i = 0; i < listaE.size(); i++) {
            if(listaE.get(i) instanceof Vendedor){
                vendedor = (Vendedor) listaE.get(i);
                total += vendedor.calcularSalario();
            }
            if(listaE.get(i) instanceof Administrador){
                administrador = (Administrador) listaE.get(i);
                total += administrador.calcularSalario();
            }
        }
        for(int i = 0; i < listaR.size(); i++) {
            total += listaR.get(i).calcularSalario();
        }

        return total;
    }
}
