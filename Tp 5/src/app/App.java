package app;
//import persona.*;
//import password.*;
//import java.util.Scanner;

import electrodomestico.Electrodomestico;
import electrodomestico.Lavadora;
import electrodomestico.Television;

public class App {
    public static void main(String[] args) {

                                            //Persona
        // Persona p1 = new Persona("juan", 18, 'h');
        // p1.setAltura(1.77);
        // p1.setPeso(81);
        // System.out.println(p1.calcularIMC());
        // System.out.println(p1.toString());
        // System.out.println(p1.esMayorDeEdad());



                                            //Password
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Ingrese la cantidad de contraseñas: ");
        // int dim = sc.nextInt();
        // Password[] passwords = new Password[dim];
        // Boolean[] sonFuertes = new Boolean[dim];
        // System.out.print("Ingrese la longitud de las contraseñas: ");
        // int length = sc.nextInt();
        // sc.close();
        // for(int i = 0; i < passwords.length; i++){
        //     passwords[i] = new Password(length);
        //     sonFuertes[i] = passwords[i].isStrong();
        //     System.out.println("La contraseña " + (i + 1) + " es " + passwords[i].getPassword() + " y " + (sonFuertes[i] ? "es fuerte" : "no es fuerte"));
        // }


                                            //Electrodomestico
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Television();
        electrodomesticos[2] = new Electrodomestico();
        electrodomesticos[3] = new Lavadora(23,10);
        electrodomesticos[4] = new Television("blanco", 'A', 23, 5, 45, true);
        electrodomesticos[5] = new Electrodomestico("azul", 'B', 10, 50);
        electrodomesticos[6] = new Lavadora("verde", 'B', 10, 50, 6);
        electrodomesticos[7] = new Television(10, 5);
        electrodomesticos[8] = new Electrodomestico(15,2);
        electrodomesticos[9] = new Electrodomestico("negro", 'F', 10, 20);

        double precioE = 0, precioL = 0, precioT = 0;        
        for(Electrodomestico electrodomestico: electrodomesticos){
            precioE += electrodomestico.calcularPrecioFinal();

            if(electrodomestico instanceof Lavadora) precioL += electrodomestico.calcularPrecioFinal();
            if(electrodomestico instanceof Television) precioT += electrodomestico.calcularPrecioFinal();
        }
        System.out.println("Precio total de Electrodomesticos: " + precioE);
        System.out.println("Precio total de Lavadoras: " + precioL);
        System.out.println("Precio total de Televisiones: " + precioT);
        
        
    }
}
