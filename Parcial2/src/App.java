import java.time.LocalDate;
import java.util.Scanner;

import RRHH.*;
import Interfaces.*;

public class App {
    public static void main(String[] args) throws Exception {

        Administradores a1 = new Administradores(1, "Giuseppe", "Gonzales", "Nicaragua 16", LocalDate.of(2003, 12, 12),
                AreasDeTrabajo.FINANZAS);
        Administradores a2 = new Administradores(2, "tiki", "con un par", "DeLobas 21", LocalDate.of(1955, 7, 16),
                AreasDeTrabajo.MARKETING);
        Administradores a3 = new Administradores(6, "Nicolas", "Gonzales", "Nicaragua 4500", LocalDate.of(2009, 12, 12),
                AreasDeTrabajo.VENTAS);
        /// admins 45
        Vendedores v1 = new Vendedores(7, "tuki", "Gonzales", "Nicaragua 4500", LocalDate.of(2009, 12, 10));
        v1.setMontoMensual(20);/// 6
        Vendedores v2 = new Vendedores(8, "toko", "Gonzales", "Nicaragua 4500", LocalDate.of(2009, 12, 10));
        v2.setMontoMensual(20);/// 6

        Repartidores r1 = new Repartidores("Gonza", "Penoffffi");
        r1.setKmRecorridos(10);/// 30

        Scanner scanner = new Scanner(System.in);
        boolean cont = true;

        do {
            
            System.out.println("1. Agregar Empleado (agrega 3 admins, 2 vendedores)");
            System.out.println("2. BuscarPorLegajo retorna true o false");
            System.out.println("3. Contar Empleados");
            System.out.println("4. Eliminar Empleado");
            System.out.println("5. Ver lista");
            System.out.println("6. Ver Sueldos a Pagar");
            System.out.println("7. Salir");
            int op;
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    ListaEmpleados.agregarEmpleado(a1);
                    ListaEmpleados.agregarEmpleado(a1);/// mandamos uno repetido para verificar que no lo agrega
                    ListaEmpleados.agregarEmpleado(a2);
                    ListaEmpleados.agregarEmpleado(a3);
                    ListaEmpleados.agregarEmpleado(v1);
                    ListaEmpleados.agregarEmpleado(v2);
                    break;
                case 2:
                    System.out.println("El administrador nombre y apellido " + a1.getNombre() + " " + a1.getApellido());
                    if (ListaEmpleados.buscarPorLegajo(a1))
                        System.out.println("Se encuentra en el sistema");
                    else
                        System.out.println(" NO se encuentra en el sistema");
                    break;
                case 3:
                    System.out.println("Cantidad de empleados" + ListaEmpleados.contarEmpleado());
                    break;
                case 4:
                    ListaEmpleados.eliminarPorLegajo(v2);/// Eliminamos empleado v2
                    break;
                case 5:
                    ListaEmpleados.mostrar();
                    break;
                case 6:
                    //Sueldos[] pagoDeSueldos = { /* como paso la lista aca */r1 };
                     Sueldos[] pagoDeSueldos ={a1,a2,a3,v1,v2,r1};
                    System.out.println("El pago total de sueldos es de :" + pagoTotalDeSueldos(pagoDeSueldos));
                    break;
                case 7:
                    cont = false;
                    break;
                default:
                    System.out.println("Ingrese un caracter valido");
                    break;
            }

        } while (cont);
        scanner.close();
    }

    public static double pagoTotalDeSueldos(Sueldos[] a) {
        double total = 0;
        for (Sueldos aux : a) {
            total += aux.calcularSueldo();
        }
        return total;
    }

}
