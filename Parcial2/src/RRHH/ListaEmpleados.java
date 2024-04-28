package RRHH;
import java.util.ArrayList;

public class ListaEmpleados {

    private static ArrayList<Empleado> lista = new ArrayList<>();

    public static boolean buscarPorLegajo(Empleado aBuscar){
        for(Empleado aux: lista){
            if(aux.getLegajo() == aBuscar.getLegajo()){
                return true;
            }
        }
        return false;
    }
    
    public static void agregarEmpleado(Empleado aux){
        if(!buscarPorLegajo(aux)){
            lista.add(aux);
            System.out.println("Se agrego el empleado correctamente");
        }
        else System.out.println("Ya se encontraba en la lista por eso no se agrego");
    }

    public static int contarEmpleado(){
        return lista.size();
    }

    public static void eliminarPorLegajo(Empleado aEliminar){
        if(buscarPorLegajo(aEliminar)){
            lista.remove(aEliminar);
            System.out.println("Se elimino correctamente el empleado");
        }
        else System.out.println("No se encontro en la lista");
    }

    public static ArrayList<Empleado> devolverListado(){
        return new ArrayList<>(lista);
    }

    public static void mostrar(){
        for(Empleado aux : lista){
            System.out.println(aux.toString());
        }
    }
}
