import java.util.HashSet;

public class Conjunto <T> {
    private HashSet<T> conjunto = new HashSet<>();

    public boolean buscar(T aBuscar){
        return conjunto.contains(aBuscar);
    }

    public boolean agregar(T aAgregar){
        return conjunto.add(aAgregar);
    }

    public boolean eliminar(T aEliminar){
        return conjunto.remove(aEliminar);
    }

}
