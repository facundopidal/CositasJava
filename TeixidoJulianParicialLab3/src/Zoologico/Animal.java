package Zoologico;

public abstract class Animal implements Valoraciones{

    protected String especie;
    protected String nombre;
    protected int edad;
    protected EstadosSalud estadoSalud;///Enumerador
    
    ///Constructor completo
    public Animal(String especie, String nombre, int edad, EstadosSalud estadoSalud) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
    }

    /// Constructor por defecto
    public Animal() {
        especie = "No especificada";
        nombre = "Sin nombre";
        edad = 0;
        estadoSalud = EstadosSalud.REGULAR;
    }

    /// Getters y Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public EstadosSalud getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(EstadosSalud estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    @Override
    public String toString() {
        return "Animal [especie=" + especie + ", nombre=" + nombre + ", edad=" + edad + ", estadoSalud=" + estadoSalud
                + "]";
    }

    ///Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (especie == null) {
            if (other.especie != null)
                return false;
        } else if (!especie.equals(other.especie))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edad != other.edad)
            return false;
        if (estadoSalud != other.estadoSalud)
            return false;
        return true;
    }

    /***  Pequeña explicacion 
    
    public abstract int valoracionPorEstadoSalud(); ///el modelado que plantee consiste en una variable entera
    /// estatica en cada tipo de animal y valoracionPorEstado de Salud agarra ese valor y lo retorna, lo pense
    ///asi porque los estados de salud son cambiantes entonces en cualquiero momento estos valores cambian,
    ///Por ejemplo en un main podemos -Consultar la valoracion X animal. y que en el momento se fije su estado
    ///y realice la funcion.

    */// Estas Lineas de codigo quedaron obsoletas cuando decidi implementar la Interfaz Valoraciones
    
}
