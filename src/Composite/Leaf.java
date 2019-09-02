package Composite;

public class Leaf implements Component {
    @Override
    public void show() {
        System.out.println("Show leaf");
    }
}
