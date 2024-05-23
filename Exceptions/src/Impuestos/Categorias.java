package Impuestos;

public enum Categorias {
    PN(0.05),SN(0.15),NI(0.21);

    private double tasa;
    
    Categorias(double tasa){
    this.tasa = tasa;
    }
    
    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

   


}
