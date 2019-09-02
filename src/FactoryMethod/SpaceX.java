package FactoryMethod;

public class SpaceX extends ElonMusk {
    @Override
    public Product manage() {
        return new Falcon9();
    }
}
