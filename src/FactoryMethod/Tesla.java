package FactoryMethod;

public class Tesla extends ElonMusk {
    @Override
    public Product manage() {
        return new TeslaRoadster();
    }
}
