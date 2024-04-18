package edificio;
public class Polideportivo extends Edificio implements Instalacion {
    private String nombre;

    @Override
    public String toString() {
        return "Polideportivo " + nombre + ":, getTipoDeInstalacion()=" + getTipoDeInstalacion()
                + ", getSuperficieEdificio()=" + getSuperficieEdificio();
    }

    @Override
    public int getTipoDeInstalacion() {
        //No se que retornar
        if(this.getClass() == this.getClass()) return 0;
        else return -1;
    }
    
    public Polideportivo(double superficieEdificio, String nombre) {
        super(superficieEdificio);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}
