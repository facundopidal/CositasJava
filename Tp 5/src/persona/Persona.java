package persona;

public class Persona {
    private static final char sexoPorDefecto = 'h';
    private final int imcBajo = -1;
    private final int imcMedio = 0;
    private final int imcAlto = 1;

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private int dni;

    public int calcularIMC(){
        double imc = peso/(altura*altura);
        if(imc < 20) return imcBajo;
        if(imc <= 25) return imcMedio;
        return imcAlto;
    }

    public boolean esMayorDeEdad(){
        return edad >= 18 ? true : false;
    }

    private void comprobarSexo(char sexo){
        if(sexo == 'm') 
            this.sexo = sexo;
        else 
            this.sexo = sexoPorDefecto;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso
                + ", altura=" + altura + ", dni=" + dni + "]";
    }

    private void generarDNI(){
        dni = (int) Math.round(Math.random() * 99999999 + 1);
    }

    public Persona(){
        this.nombre = "";
        this.edad = -1;
        this.sexo = sexoPorDefecto;
        this.peso = 0;
        this.altura = 0;
        generarDNI();
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = 0;
        this.altura = 0;
        generarDNI();
        comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura, int dni){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.dni = dni;
        comprobarSexo(sexo);
    }

    public char getSexoPorDefecto() {
        return sexoPorDefecto;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDni() {
        return dni;
    }
}
