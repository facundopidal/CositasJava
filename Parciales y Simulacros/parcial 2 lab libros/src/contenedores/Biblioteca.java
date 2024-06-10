package src.contenedores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import src.exceptions.AutorNotFoundException;
import src.exceptions.DuplicatedIdException;
import src.exceptions.IdNotFoundException;
import src.interfaces.*;

public class Biblioteca<T extends Identificable> {
    HashMap<Integer, T> coleccion = new HashMap<>();

    public Biblioteca(){
        coleccion = new HashMap<>();
    }

    public void agregar(T e) throws DuplicatedIdException{
        if(coleccion.containsKey(e.getId()))
            throw new DuplicatedIdException();

       coleccion.put(e.getId(), e);
    }

    public T eliminar(T e) throws IdNotFoundException{
        if(!coleccion.containsKey(e.getId())) 
            throw new IdNotFoundException();
        return coleccion.remove(e.getId());
    }

    @Override
    public String toString(){
        String cont = "";

        if(coleccion.isEmpty())
            System.out.println("Coleccion vacia");

        for (Map.Entry<Integer, T> entry : coleccion.entrySet()) {
            cont += '|' + "Clave: " + entry.getKey() + '|' + "Valor: " + entry.getValue() + '|' + '\n';
        }
        return cont;
    }



    public T buscar(int id) throws IdNotFoundException{
        if(!coleccion.containsKey(id)) 
            throw new IdNotFoundException();

        return coleccion.get(id);
    }


    public ArrayList<T> filtrarPorAutor(String autor) throws AutorNotFoundException{
        ArrayList<T> filtrado = new ArrayList<>();

        for(T e: coleccion.values()){
            if(e.getAutor().equalsIgnoreCase(autor))
                filtrado.add(e);
        }

        if(filtrado.isEmpty()) 
            throw new AutorNotFoundException();

        return filtrado;
    }

    public String filtrarPorAutorString(String autor) throws AutorNotFoundException{
        String cont = "";
        for (Map.Entry<Integer, T> entry : coleccion.entrySet()) {
            if(entry.getValue().getAutor().equalsIgnoreCase(autor))
                cont += '|' + "Clave: " + entry.getKey() + '|' + "Valor: " + entry.getValue() + '|' + '\n';
        }

        if(cont.isEmpty()) 
            throw new AutorNotFoundException();

        return cont;
    }

    public HashMap<Integer, T> devolverMap(){
        return coleccion;
    }


}
