public class App {
    public static void main(String[] args) {
        Auto a1 = new Auto("A1", "Renault", 4, "Super consumidor", 13, "", ModoCambios.AUTOMATICO);
        Auto a2 = new Auto("A2", "Renault", 6, "Super consumidor", 14, "", ModoCambios.MANUAL);
        Moto m1 = new Moto("M1", "Zanella", 2, "Consume nafta de moto", 2, 110, true);
        Moto m2 = new Moto("M2", "Zanella", 2, "Consume nafta premium", 3, 150, true);
        ListaVehiculo.agregar(a1);
        ListaVehiculo.agregar(a2);
        ListaVehiculo.agregar(m1);
        ListaVehiculo.agregar(m2);
        System.out.println(ListaVehiculo.buscarPorPatente("A1")); 
        System.out.println(ListaVehiculo.contar());
        System.out.println(ListaVehiculo.eliminarPorPatente("A2")); 
        System.out.println(ListaVehiculo.contar());
        
    }

}
