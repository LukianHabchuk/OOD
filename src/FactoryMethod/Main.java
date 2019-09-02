package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        ElonMusk director = new SpaceX();
        director.manage().make();

        director = new Tesla();
        director.manage().make();
    }
}
