package Bridge.Shapes;

import Bridge.Colors.Palette;

public class Square extends Drawer {

    public Square(Palette palette) {
        super(palette);
    }

    @Override
    public void drawShape(String color) {
        switch (color){
            case ("#FF0000"): palette.setColor("RED"); break;
            case ("#00FF00"): palette.setColor("GREEN"); break;
            case ("#0000FF"): palette.setColor("BLUE"); break;
            default:
                System.out.println("Undefined color");
        }
    }
}
