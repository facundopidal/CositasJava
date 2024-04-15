public class App {
    public static void main(String[] args) {      
        Rectangle r = new Rectangle(1, 1);
        System.out.println(r.getHeight());
        System.out.println(r.getWidth());
        
        Rectangle.setHeight(10);
        Rectangle.setWidth(10);
        System.out.println(Rectangle.calculateArea());
        System.out.println(Rectangle.calculatePerimeter());
        Rectangle a = new Rectangle();
        System.out.println(a.getHeight());
        System.out.println(a.getWidth());
    }
}
