package app;
//import persona.*;
//import password.*;
//import java.util.Scanner;

import electrodomestico.*;
//import producto.*;

public class App {
    public static void main(String[] args) {

        // Persona

        // Persona p1 = new Persona("juan", 18, 'h');
        // p1.setAltura(1.77);
        // p1.setPeso(81);
        // System.out.println(p1.calcularIMC());
        // System.out.println(p1.toString());
        // System.out.println(p1.esMayorDeEdad());

        // Password

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Ingrese la cantidad de contraseñas: ");
        // int dim = sc.nextInt();
        // Password[] passwords = new Password[dim];
        // Boolean[] sonFuertes = new Boolean[dim];
        // System.out.print("Ingrese la longitud de las contraseñas: ");
        // int length = sc.nextInt();
        // sc.close();
        // for(int i = 0; i < passwords.length; i++){
        // passwords[i] = new Password(length);
        // sonFuertes[i] = passwords[i].isStrong();
        // System.out.println("La contraseña " + (i + 1) + " es " +
        // passwords[i].getPassword() + " y " + (sonFuertes[i] ? "es fuerte" : "no es
        // fuerte"));
        // }

        // Electrodomestico

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

        double precioL = 0, precioT = 0;
        Lavadora l;
        Television t;
        for(Electrodomestico electrodomestico: electrodomesticos){

            if(electrodomestico instanceof Lavadora) {
                l = (Lavadora) electrodomestico;
                precioL += l.calcularPrecioFinal();
            }

            if(electrodomestico instanceof Television){
                t = (Television) electrodomestico;
                precioT += t.calcularPrecioFinal();
            }
        }
        System.out.println("Precio total de Electrodomesticos: " + (precioL + precioT));
        System.out.println("Precio total de Lavadoras: " + precioL);
        System.out.println("Precio total de Televisiones: " + precioT);

        // Productos

        // Crear los arrays
        // Serie[] series = new Serie[5];
        // Videojuego[] videojuegos = new Videojuego[5];

        // // Llenar los arrays con objetos
        // for (int i = 0; i < 5; i++) {
        //     series[i] = new Serie("Serie " + (i+1), "Genero " + (i+1), i+1, "Creador " + (i+1));
        //     videojuegos[i] = new Videojuego("Videojuego " + (i + 1), i * 10);
        // }

        // // Entregar algunos videojuegos y series
        // series[0].entregar();
        // videojuegos[0].entregar();
        // series[2].entregar();
        // videojuegos[2].entregar();

        // // Contar cuántos están entregados
        // int seriesEntregadas = 0;
        // int videojuegosEntregados = 0;

        // for (Serie serie : series) {
        //     if (serie.isEntregado()) {
        //         seriesEntregadas++;
        //         serie.devolver();
        //     }
        // }

        // for (Videojuego videojuego : videojuegos) {
        //     if (videojuego.isEntregado()) {
        //         videojuegosEntregados++;
        //         videojuego.devolver();
        //     }
        // }

        // System.out.println("Series entregadas: " + seriesEntregadas);
        // System.out.println("Videojuegos entregados: " + videojuegosEntregados);

        // Serie serieMaxTemporadas = series[0];
        // Videojuego videojuegoMaxHoras = videojuegos[0];

        // for (Serie serie : series) {
        //     if (serie.getTemporadas() > serieMaxTemporadas.getTemporadas()) {
        //         serieMaxTemporadas = serie;
        //     }
        // }

        // for (Videojuego videojuego : videojuegos) {
        //     if (videojuego.getHorasEstimadas() > videojuegoMaxHoras.getHorasEstimadas()) {
        //         videojuegoMaxHoras = videojuego;
        //     }
        // }

        // System.out.println("La serie con más temporadas es: " + serieMaxTemporadas.toString());
        // System.out.println("El videojuego con más horas estimadas es: " + videojuegoMaxHoras.toString());
        // System.out.println("CompareTo: " + series[1].compareTo(series[2]) + "   ||    " + videojuegos[1].compareTo(videojuegos[0]));
    }
}
