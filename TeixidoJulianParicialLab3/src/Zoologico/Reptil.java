package Zoologico;

public class Reptil extends Animal{

    private String tipoDeEscama;
    private boolean venenoso;
    private static int valoracionBase = 25;
    
    ///Constructor completo
    public Reptil(String especie, String nombre, int edad, EstadosSalud estadoSalud, String tipoDeEscama,
            boolean venenoso) {
        super(especie, nombre, edad, estadoSalud);
        this.tipoDeEscama = tipoDeEscama;
        this.venenoso = venenoso;
    }

    public Reptil() {
        tipoDeEscama = "Tipo de escama no especificado";
        venenoso = true;/// Si todavia no se sabe si es venenoso un reptil es mejor partir
                        /// de la base de que si lo es por seguridad :)
    }

    ///Getters y setters
    public String getTipoDeEscama() {
        return tipoDeEscama;
    }

    public void setTipoDeEscama(String tipoDeEscama) {
        this.tipoDeEscama = tipoDeEscama;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public static int getValoracionBase() {
        return valoracionBase;
    }

    public static void setValoracionBase(int valoracionBase) {
        Reptil.valoracionBase = valoracionBase;
    }
    
    @Override
    public String toString() {
        return "Reptil [tipoDeEscama=" + tipoDeEscama + ", venenoso=" + venenoso + ", toString()=" + super.toString()
        + "]";
    }
    
    ///Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Reptil other = (Reptil) obj;
        if (tipoDeEscama == null) {
            if (other.tipoDeEscama != null)
                return false;
        } else if (!tipoDeEscama.equals(other.tipoDeEscama))
            return false;
        if (venenoso != other.venenoso)
            return false;
        return true;
    }

    ///Metodo Interfaz
    @Override
    public int calcularValoracion() {
        int valoracionActual = getValoracionBase();
        if(getEstadoSalud() == EstadosSalud.ESTUPENDO)/// Caso estupendo TRIPLICA
            return valoracionActual * 3;
        return valoracionActual;/// Regular y malo quedan igual
    }



    

}
