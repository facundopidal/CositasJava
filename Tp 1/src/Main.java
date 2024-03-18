import java.util.Scanner;
public class Main {
    public static void main(String[] args){
      /*
      int[]numeros = new int[5];
      numeros[0] = 1;
      numeros[1] = 2;
      cargarArreglo(numeros);
      mostrarArreglo(numeros);
      float prom = promediarArreglo(numeros);
      System.out.println("\n" + prom);
      */
      //System.out.println(sumarNaturales(6));
      // System.out.println("Ingresaste " + contarPosiivos() + " positivos");
      // encontrarAscii();

      int[] a = {1,2,6};
      int[] b = {1,2,7};
        System.out.println(contarRepetidos(a,b));
        saludar();
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
}