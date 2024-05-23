import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaOrdenada <T extends Comparable<T>> {
    private List<T> lista = new LinkedList<>();
    private boolean ascendente = true;
    
    public ListaOrdenada(boolean ascendente) {
        this.ascendente = ascendente;
    }

    public ListaOrdenada() {
    }

    public boolean contiene (T e){
        return lista.contains(e);
    }
    public boolean isAscendente() {
        return ascendente;
    }

    public boolean agregar(T e){
        if(contiene(e))return false;
        lista.add(e);
        Collections.sort(lista);
    
        if(!isAscendente()){
            Collections.reverse(lista);
        }
        return true;
    }

    public boolean eliminar(T e){
        return lista.remove(e);
    }

    public T obtener(int pos){
        return lista.get(pos);
    }

    

}
