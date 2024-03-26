public class Cliente {
    private String nombre;
    private int id;
    private char genero;
    
    public Cliente(String nombre, int id, char genero) {
        this.nombre = nombre;
        this.id = id;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public char getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void mostrar(){
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println((genero=='m')?"Genero: Masculino":"Genero Femenino");
    }
    
}

