package AbstractFactory;

import AbstractFactory.Adidas.AdidasProduct;
import AbstractFactory.Nike.NikeProduct;

public class Main {
    public static void main(String[] args) {
        AbstractFactory adidasFactory = FactoryGenerator.getFactory("ADIDAS");
        AdidasProduct adidasProduct = adidasFactory.getAdidasProduct("Adidas shoes");
        adidasProduct.makeAdidasProduct();

        AbstractFactory nikeFactory = FactoryGenerator.getFactory("NIKE");
        NikeProduct nikeProduct = nikeFactory.getNikeProduct("Nike outerwear");
        nikeProduct.makeNikeProduct();
    }
}
