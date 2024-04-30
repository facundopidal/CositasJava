import java.util.ArrayList;

public class ListaVehiculo {
    private static ArrayList<Vehiculo> lista = new ArrayList<>();

    public static void agregar(Vehiculo v) {
        lista.add(v);
    }

    public static Vehiculo buscarPorPatente(String patente) {
        for (Vehiculo v : lista) {
            if (v.getPatente().equals(patente)) 
                return v;
        }
        return null;
    }

    public static int contar(){
        return lista.size();
    }

    public static ArrayList<Vehiculo> devolverListado() {
        return new ArrayList<>(lista);
    }

    public static Vehiculo eliminarPorPatente(String patente) {

        for (Vehiculo v : lista) {
            if (v.getPatente().equals(patente)){
                lista.remove(v);
                return v;
            }            
        }
        return null;
    }
}
