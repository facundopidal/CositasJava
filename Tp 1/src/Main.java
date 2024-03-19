import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args){

        // int[] numeros = new int[5];
        // numeros[0] = 1;
        // numeros[1] = 2;
        // cargarArreglo(numeros);
        // mostrarArreglo(numeros);
        // float prom = promediarArreglo(numeros);
        // System.out.println("\n" + prom);
        

        // System.out.println(sumarNaturales(6));
        // System.out.println("Ingresaste " + contarPosiivos() + " positivos");
        // encontrarAscii();

        // int[] a = {1,2,6};
        // int[] b = {1,2,7};
        // System.out.println(contarRepetidos(a,b));
        // saludar();

        // calcularAreaYPerimetro();

        //calcularHipotenusa();

        // leerTemperaturas();

        //CalculadoraPolacaInversaApp();

        // calcularSalario();

        saludoPersonalizado();
    }
    // Punto 1
    public static float promediarArreglo(int[] numeros){
        float suma = 0;
        for (int numero : numeros) suma += numero;
        return suma/numeros.length;
    }


    public static void cargarArreglo(int[]arregloX){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese 5 enteros");
        for(int i=0; i < arregloX.length;i++) {
            arregloX[i]=sc.nextInt();
        }
        sc.close();
    }

    public static void mostrarArreglo(int[] arregloX){
        for(int i=0; i < arregloX.length;i++) {
            System.out.print(arregloX[i] +"|");
        }
    }
    // Punto 2
    public static void leerPar(int num){
        System.out.println(num %2 == 0 ? "es muy par" : "es muy no par");
    }

    // Punto 3
    public static int sumarNaturales(int n){
        int suma = 0;
        if (n < 1){
            System.out.println("El numero no es natural");
            return 0;
        }
        for (int i=0; i<=n; i++) suma += i;
        return suma;
    }
    // Punto 4
    public static int contarPosiivos(){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Ingrese un entero");
        while (sc.nextInt() > 0) {
            System.out.println("Ingrese otro entero");
            i++;
        }
        sc.close();
        return i;
    }
    // Punto 5
    public static void encontrarAscii(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un caracter: ");
        char caracter = sc.next().charAt(0);
        System.out.println("El ascii es " + (int)caracter);
        sc.close();
    }
    // Punto 6
    public static int contarRepetidos(int[] a, int[] b){
        if(a.length != b.length) return -1;
        int cont = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b.length; j++){
                if(a[i] == b[j]) cont++;
            }
        }
        return cont;
    }
    //Punto 8  
    public static void saludar(){  
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        System.out.println("Buen dia " + sc.next());
        sc.close();
    }
    //Punto 9
    public static void calcularAreaYPerimetro(){
        Scanner sc = new Scanner(System.in);
        int radio = sc.nextInt();
        System.out.println("El area es " + (Math.PI * Math.pow(radio, 2)) + "\nEl perímetro es " + (2 * Math.PI * radio));
        sc.close();
    }
    //Punto 10
    public static void calcularHipotenusa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer cateto: ");
        int catetoA = sc.nextInt();
        System.out.print("Ingrese el segundo cateto: ");
        int catetoB = sc.nextInt();
        double suma = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
        double hip = Math.sqrt(suma);
        System.out.println("La hipotenusa es " + hip);
        sc.close();
    }
    //Punto 11 
    public static void generarTemperaturas(double[] temps){
        for(int i = 0; i < temps.length; i++){
            temps[i] = Math.random() * 45 - 10;
        }
    }

    public static double calcularMin(double[] temps) {
        double min = temps[0];
        for(int i = 1; i < temps.length; i++){
            if(temps[i] < min)
                min = temps[i];
        }
        return min;
    }
    
    public static double calcularMax(double[] temps) {
        double max = temps[0];
        for(int i = 1; i < temps.length; i++){
            if(temps[i] > max)
                max = temps[i];
        }
        return max;
    }

    public static double calcularPromedio(double[] temps){
        double suma = 0;
        for(double temp: temps) suma += temp; // Acumula el arreglo
        return suma/temps.length;
    }

    public static void leerTemperaturas(){
        double[] temps = new double[30];
        generarTemperaturas(temps);

        double min = calcularMin(temps);
        System.out.println("El minimo es " + String.format("%.2f", min));

        double max = calcularMax(temps);
        System.out.println("El maximo es " + String.format("%.2f", max));

        double prom = calcularPromedio(temps);
        System.out.println("El promedio es " + String.format("%.2f", prom));

    }

    //Punto 12
    public static void CalculadoraPolacaInversaApp(){
        Scanner sc = new Scanner(System.in);
        String opt;
        int a, b;
        do {
            System.out.print("Ingrese un entero: ");
            a = sc.nextInt();
            System.out.print("Ingrese un entero: ");
            b = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese + para suma, - para resta, / para division, * para multiplicacion, ^ para potencia, % para modulo y x para salir: ");
            opt = sc.nextLine();

            switch (opt) {
                case "+":
                    System.out.println("El resultado es " + (a + b));
                    break;
                case "-":
                    System.out.println("El resultado es " + (a - b));
                    break;
                case "*":
                    System.out.println("El resultado es " + (a * b));
                    break;
                case "/":
                    System.out.println("El resultado es " + String.format("%.2f", (double)((double) a / (double) b)));
                    break;
                case "^":
                    System.out.println("El resultado es " + Math.pow(a, b));
                    break;
                 case "%":
                    System.out.println("El resultado es " + (a % b));
                    break;
                case "x": 
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese un caracter valido");
                    break;
            }
        } while (!opt.equals("x"));
        sc.close();
    }

    //Punto 13

    public static void calcularSalario(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        sc.nextLine(); //Limpia el buffer luego de escanear un int

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su salario: ");
        int salario = sc.nextInt();
        sc.close();

        if(edad > 60) System.out.println(nombre + ", su salario es de " + (salario*1.15));
        else if(edad > 50) System.out.println(nombre + ", su salario es de " + (salario*1.1));
        else if(edad > 19) System.out.println(nombre + ", su salario es de " + (salario*1.05));
        else if(edad < 16) System.out.println(nombre + ", usted no tiene edad para trabajar");
        else System.out.println(nombre + ", su salario es de " + salario);      
    }

    //Punto 14

    public static void saludoPersonalizado(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        sc.close();
        System.out.println("Adivinando...");

        //Para hacer sleep
        // try{
        //     Thread.sleep(5000);
        // } catch (Exception e){
        //     System.out.println(e);
        // }

        System.out.println("Luego de pensarlo, detecto que su nombre es " + nombre + ", y su edad es " + edad);
    }
}