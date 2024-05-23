import java.util.ArrayList;
import java.util.Iterator;

public class Almacenamiento<T> {
    private ArrayList<T> lista = new ArrayList<>();

    public Almacenamiento() {
    }

    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }
    
    public ArrayList<T> eliminar(T e){
        ArrayList<T> eliminados = new ArrayList<>();
        Iterator<T> i = lista.iterator();
        while(i.hasNext()){
            if(i.next().equals(e)){
                eliminados.add(e);
                i.remove();
            }
        }
        return eliminados;
    }

    public boolean agregar(T e){
        return lista.add(e);
    }

    public ArrayList<T> buscar(T e){
        ArrayList<T> encontrados = new ArrayList<>();
        for (T t : lista) {
            if(t.equals(e))
                encontrados.add(e);
        }
        return encontrados;
    }

    


}
