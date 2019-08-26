package Bridge.Shapes;

import Bridge.Colors.Palette;

public abstract class Drawer {
    protected Palette palette;

    protected Drawer(Palette palette) {
        this.palette = palette;
    }

    public abstract void drawShape(String color);
}
