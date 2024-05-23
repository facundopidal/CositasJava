import java.util.Collections;
import java.util.LinkedList;

public class ListaOrdenada<T extends Comparable<T>> {
    private LinkedList<T> lista = new LinkedList<>();
    private boolean ascendente = true;
    public boolean contiene(T e){
        return lista.contains(e);
    }

    public boolean agregar(T e){
        boolean agregado = lista.add(e);
        Collections.sort(lista);

        if(!isAscendente())
            Collections.reverse(lista);

        return agregado;
    }

    public boolean eliminar(T e){
        return lista.remove(e);
    }

    public T obtener(int posicion){
        return lista.get(posicion);
    }

    public ListaOrdenada(boolean isAscendente) {
        this.ascendente = isAscendente;
    }

    public boolean isAscendente() {
        return ascendente;
    }
    
}
