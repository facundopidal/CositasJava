import java.util.Stack;

public class Pila<T> {
    private Stack<T> pila = new Stack<>();
    
    public boolean agregar(T e){
        return pila.add(e);
    }

    public boolean estaVacia(){
        return pila.empty();
    }

    public T extraer(){
        if(!estaVacia())
            return pila.pop();
        
        return null;
    }

    public int cantidad(){
        return pila.size();
    }

    public T tope(){
        return pila.peek();
    }

    @Override
    public String toString() {
        String pilaStr = "[";
        for(int i = 0 ; i < pila.size(); i++){
            if(i != pila.size() - 1) pilaStr += pila.get(i) + ", "; //Si no es el ultimo elemento
            else pilaStr += pila.get(i);
        }
        pilaStr += "]";
        return pilaStr;
    }

}
