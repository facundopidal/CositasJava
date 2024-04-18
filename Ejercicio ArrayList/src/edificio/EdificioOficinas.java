package edificio;
public class EdificioOficinas extends Edificio {
    private int cantOficinas;

    @Override
    public String toString() {
        return "EdificioOficinas [cantOficinas=" + cantOficinas + ", getSuperficieEdificio()=" + getSuperficieEdificio()
                + "]";
    }

    public EdificioOficinas(double superficieEdificio, int cantOficinas) {
        super(superficieEdificio);
        this.cantOficinas = cantOficinas;
    }

    public int getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }
    
}
