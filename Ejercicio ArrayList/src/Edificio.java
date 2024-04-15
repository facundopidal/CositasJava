public abstract class Edificio {
    private double superficieEdificio;

    public abstract String toString();

    public Edificio(double superficieEdificio) {
        this.superficieEdificio = superficieEdificio;
    }

    public double getSuperficieEdificio(){
        return superficieEdificio;
    }
}
