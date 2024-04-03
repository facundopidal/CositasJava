public class App {
    public static void main(String[] args) {      
        Rectangle r = new Rectangle(1, 1);
        System.out.println("Rectangulo incializado en 1 - 1 ");
        System.out.println(r.getHeight());
        System.out.println(r.getWidth());
        
        System.out.println("Cambio de valores por defecto a 10 - 10");
        Rectangle.setHeight(10);
        Rectangle.setWidth(10);
        System.out.println("Area de un rectangulo default");
        System.out.println(Rectangle.calculateArea());
        System.out.println("Perimetro de un rectangulo default");
        System.out.println(Rectangle.calculatePerimeter());
        Rectangle a = new Rectangle();
        System.out.println(a.getHeight());
        System.out.println(a.getWidth());
    }
}
