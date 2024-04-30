package Zoologico;

public class Excursion implements Valoraciones{
    
    private String nombre;
    private String descripcion; /// animales que pueden durante la excursion ?¿
    private static int valoracionBase = 50;
    private static boolean finDeSemana = true;/// valor que iria cambiando todo el tiempo durante el uso del sistema
    /// estatica porque afecta a todas las excursiones
    
    public Excursion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    public Excursion() {
        nombre = "Nombre no especificado";
        descripcion = "Descripcion incompleta";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static int getValoracionBase() {
        return valoracionBase;
    }

    public static void setValoracionBase(int valoracionBase) {
        Excursion.valoracionBase = valoracionBase;
    }

    public static boolean isFinDeSemana() {
        return finDeSemana;
    }

    public static void setFinDeSemana(boolean finDeSemana) {
        Excursion.finDeSemana = finDeSemana;
    }

    @Override
    public String toString() {
        return "Excursion [nombre=" + nombre + ", descripcion=" + descripcion + "]";
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Excursion other = (Excursion) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        return true;
    }

    @Override
    public int calcularValoracion() {
        if(isFinDeSemana()) 
            return getValoracionBase()* 2;
        return getValoracionBase();
    }

    

    
}
