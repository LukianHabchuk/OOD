package AbstractFactory;

import AbstractFactory.Adidas.AdidasOuterwear;
import AbstractFactory.Adidas.AdidasProduct;
import AbstractFactory.Adidas.AdidasShoes;
import AbstractFactory.Nike.NikeProduct;

public class AdidasFactory extends AbstractFactory {
    @Override
    AdidasProduct getAdidasProduct(String product) {
        if(product == null) return null;
        if(product.equalsIgnoreCase("ADIDAS OUTOWEAR")) return new AdidasOuterwear();
        if(product.equalsIgnoreCase("ADIDAS SHOES")) return new AdidasShoes();
        return null;
    }

    @Override
    NikeProduct getNikeProduct(String product) {
        return null;
    }
}
