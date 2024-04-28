import java.util.ArrayList;

public class ListaEmpleados {
    private static ArrayList<Empleado> lista = new ArrayList<>();

    public static void agregar(Empleado empleado) {
        lista.add(empleado);
    }

    public static Empleado buscarPorLegajo(int legajo) {
        int i;
        boolean flag = false;

        for(i = 0; i < lista.size(); i++) {
            if(lista.get(i).getLegajo() == legajo) {
                flag = true;
                break;
            }
        }

        if (flag) return lista.get(i);       
 
        return null; // Por si no lo encuentra 
    }

    public static int contarEmpleados() {
        return lista.size();
    }

    public static ArrayList<Empleado> devolverListado() {
        return lista;
    }

    public static Empleado eliminarPorLegajo(int legajo) {
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getLegajo() == legajo) 
                return lista.remove(i);
        }
        return null; // Por si no lo encuentra 
    }
}
