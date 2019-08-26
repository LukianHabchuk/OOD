package Bridge.Colors;

public class Color implements Palette {
    @Override
    public void setColor(String color) {
        System.out.println("Shape color: "+color);
    }
}
