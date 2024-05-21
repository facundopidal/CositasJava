import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Edad {
    private static LocalDate fechaNac;
    private static LocalDate fechaActual = LocalDate.now();
    private static final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");// Pasamos del formato por defecto a este

    public static void calcular(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu fecha de nacimiento (dd/MM/yyyy): ");
        String fechaNacimientoStr = sc.nextLine();
        try{
            fechaNac = LocalDate.parse(fechaNacimientoStr, formato);
            if(!fechaNacimientoStr.equals(fechaNac.format(formato))) throw new IllegalArgumentException(); //Compara que la fecha introducida sea igual a la parsed
            Period periodo = Period.between(fechaNac, fechaActual);
            if(periodo.getDays() < 0 || periodo.getMonths() < 0 || periodo.getYears() < 0) throw new IllegalArgumentException(); //No permite introducir fechas posterioress a hoy
            System.out.println("Tu edad es: " + periodo.getYears() + " años " + periodo.getMonths() + " meses " + periodo.getDays() + " días");
        } catch(DateTimeParseException e){
            System.out.println("La fecha introducida no es valida");
        } catch(IllegalArgumentException e){
            System.out.println("Introduzca una fecha anterior a hoy");
        } finally{
            sc.close();
        }
    }

}
