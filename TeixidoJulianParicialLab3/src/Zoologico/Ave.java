package Zoologico;

public class Ave extends Animal{

    private String tipoDePlumaje;
    private boolean migratoria;
    private static int valoracionBase = 10;
    
    
    ///Constructor completo
    public Ave(String especie, String nombre, int edad, EstadosSalud estadoSalud, String tipoDePlumaje,
            boolean migratoria) {
        super(especie, nombre, edad, estadoSalud);
        this.tipoDePlumaje = tipoDePlumaje;
        this.migratoria = migratoria;
    }

    ///Por defecto
    public Ave() {
        tipoDePlumaje = "Plumaje sin especificar";
        migratoria = false;
    }

    public String getTipoDePlumaje() {
        return tipoDePlumaje;
    }

    public void setTipoDePlumaje(String tipoDePlumaje) {
        this.tipoDePlumaje = tipoDePlumaje;
    }

    public boolean isMigratoria() {
        return migratoria;
    }

    public void setMigratoria(boolean migratoria) {
        this.migratoria = migratoria;
    }

    public static int getValoracionBase() {
        return valoracionBase;
    }

    public static void setValoracionBase(int valoracionBase) {
        Ave.valoracionBase = valoracionBase;
    }

    @Override
    public String toString() {
        return "Ave [tipoDePlumaje=" + tipoDePlumaje + ", migratoria=" + migratoria + ", toString()=" + super.toString()
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
        Ave other = (Ave) obj;
        if (tipoDePlumaje == null) {
            if (other.tipoDePlumaje != null)
                return false;
        } else if (!tipoDePlumaje.equals(other.tipoDePlumaje))
            return false;
        if (migratoria != other.migratoria)
            return false;
        return true;
    }

    ///Metodo Interfaz
    @Override
    public int calcularValoracion() {
        int valoracionActual = getValoracionBase();
        if (getEstadoSalud() == EstadosSalud.MALO)/// Caso Malo reduce a la mitad
            return valoracionActual / 2;
        if (getEstadoSalud() == EstadosSalud.ESTUPENDO)/// Caso Estupendo duplica
            return valoracionActual * 2;
        return valoracionActual; ///Caso regular permacene valorBase
    }

    

    

    

}
