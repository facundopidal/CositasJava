import java.util.ArrayList;
import java.util.Iterator;

public class Almacenamiento<T> {
    private ArrayList<T> lista = new ArrayList<>();

    public boolean agregar(T e){
        return lista.add(e);
    }

    public ArrayList<T> eliminar(T e){
        ArrayList<T> eliminados = new ArrayList<>();
        Iterator<T> iterator = lista.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(e)){
                eliminados.add(e);
                iterator.remove();
            }
        }
        return eliminados;
    }

    public ArrayList<T> buscar(T e){
        ArrayList<T> buscados = new ArrayList<>();

        for(T t: lista){
            if(t.equals(e))
                buscados.add(t);
        }
        return buscados;
    }

    @Override
    public String toString() {
        String listaString = "[";
        for(int i = 0 ; i < lista.size(); i++){
            if(i != lista.size() - 1) listaString += lista.get(i) + ", "; //Si no es el ultimo elemento
            else listaString += lista.get(i);
        }
        listaString += "]";
        return listaString;
    }

    public Almacenamiento() {
    }
}
