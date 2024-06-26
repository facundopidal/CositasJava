import javax.print.DocFlavor.READER;

public class Rectangle {
    private static int width = 1;
    private static int height = 0;

    public static int getWidth() {
        return width;
    }
    public static void setWidth(int width) {
        Rectangle.width = width;
    }
    public static int getHeight() {
        return height;
    }
    public static void setHeight(int height) {
        Rectangle.height = height;
    }

    public static float calculateArea(){
       return width * height;
    }
    public static float calculatePerimeter(){
        return 2 * width + 2 * height;
    } 
    
    public Rectangle(){
        
    }
    public Rectangle(int width, int height){
        Rectangle.width = width;
        Rectangle.height = height;
    }
}
