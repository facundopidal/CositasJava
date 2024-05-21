package impuestos;
public enum Categoria {
    PN(0.05), SN(0.15), NI(0.21);

    private double tasa; // Podria ser final y no tener set
    Categoria(double tasa){
        this.tasa = tasa;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }
}
