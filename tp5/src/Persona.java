import java.lang.Math;

public class Persona {
    private static final char SEXO_DEFECTO = 'h';
    private final int IMCBajo = -1;
    private final int IMCMedio = 0;
    private final int IMCAlto = 1;


    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;
    
    
    public int calcularIMC(){
           double imc = peso/Math.pow(altura, 2);
        if(imc<20)return IMCBajo;
        if(imc<=25)return IMCMedio;
        return IMCAlto;
    }
    
    public boolean esMayorDeEdad(){
        return (edad > 18)? true : false;
    }

    private void comprobarSexo(char sexo){
        if(sexo == 'm')
            this.sexo = sexo;
        else 
            this.sexo = SEXO_DEFECTO;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre
                + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + "]";
    }

    private void generaDNI(){
        dni = (int)Math.round(Math.random() * (100000000 - 1) + 1);
    }

    public Persona() {
        generaDNI();
        nombre = "";
        edad = -1;
        sexo = SEXO_DEFECTO;
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre,int dni, int edad, char sexo, double peso, double altura) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        peso = 0;
        altura = 0;
        comprobarSexo(sexo);
        generaDNI();
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

    public int getDni() {
        return dni;
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

    public static char getSexoDefecto() {
        return SEXO_DEFECTO;
    }

}
