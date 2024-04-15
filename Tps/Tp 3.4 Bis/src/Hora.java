import java.lang.Math;
public class Hora{
    private int hora;
    private int minuto;
    private int segundo;
    
    
    public Hora() {
        this.hora = (int) Math.round(Math.random() * 23); 
        this.minuto = (int) Math.round(Math.random() * 59);
        this.segundo = (int) Math.round(Math.random() * 59);
    }

    public void mostrarHora(){
        System.out.print(hora < 10 ? "0" + hora + ":" : hora + ":");
        System.out.print(minuto < 10 ? "0" + minuto + ":" : minuto + ":");
        System.out.print(segundo < 10 ? "0" + segundo : segundo);
        System.out.println();
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public Hora avanzarSegundo(){
        segundo++;
        if(segundo >= 60){
            segundo = 0;
            minuto++;
            if (minuto >= 60) {
                minuto = 0;
                hora = (hora + 1) % 24;
            }
        }
        return this;
    }
    
    public Hora retrocederSegundo(){
        segundo--;
        if(segundo < 0){ 
            segundo = 59;
            minuto--;
            if (minuto < 0) {
                minuto = 59;
                hora = (hora - 1) % 24;
            }
        }
        return this;
    }

    
}