package Bridge;

import Bridge.Colors.Color;
import Bridge.Shapes.Drawer;
import Bridge.Shapes.Square;

public class Main {
    public static void main(String[] args) {
        Drawer drawer = new Square(new Color());

        drawer.drawShape("#FF0000");
        drawer.drawShape("#00FF00");
        drawer.drawShape("#0000FF");
        drawer.drawShape("#000000");
    }
}
