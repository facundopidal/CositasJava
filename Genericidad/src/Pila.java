import java.util.Stack;

public class Pila <T>{

    private Stack<T> pila = new Stack<>();

    public void apilar(T e){
        pila.add(e);
    }

    public boolean estaVacia(){
        return pila.empty();
    }
    
    public T desapilar(){
        if(!estaVacia())
            return pila.pop();
    return null;    
    }

    public T tope(){
        return pila.peek();
    }

    @Override
    public String toString() {
        return pila.toString();
    }

    


}
