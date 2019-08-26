package AbstractFactory;

import AbstractFactory.Adidas.AdidasProduct;
import AbstractFactory.Nike.NikeOuterwear;
import AbstractFactory.Nike.NikeProduct;
import AbstractFactory.Nike.NikeShoes;

public class NikeFactory extends AbstractFactory {
    @Override
    AdidasProduct getAdidasProduct(String product) {
        return null;
    }

    @Override
    NikeProduct getNikeProduct(String product) {
        if(product == null) return null;
        if(product.equalsIgnoreCase("NIKE OUTERWEAR")) return new NikeOuterwear();
        if(product.equalsIgnoreCase("NIKE SHOES")) return new NikeShoes();
        return null;
    }
}
