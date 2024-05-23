import java.util.HashSet;

public class Conjunto<T> {
    private HashSet<T> set = new HashSet<>();

    public boolean contiene(T e){
        return set.contains(e);
    }

    public boolean agregar(T e){
        return set.add(e);
    }

    public boolean eliminar(T e){
        return set.remove(e);
    }

}
