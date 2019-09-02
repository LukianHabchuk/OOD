package FactoryMethod;

public class TeslaRoadster extends Product {
    @Override
    public void make() {
        System.out.println("Make tesla product");
    }
}
