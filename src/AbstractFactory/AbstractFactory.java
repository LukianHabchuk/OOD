package AbstractFactory;

import AbstractFactory.Adidas.AdidasProduct;
import AbstractFactory.Nike.NikeProduct;

public abstract class AbstractFactory {
    abstract AdidasProduct getAdidasProduct(String product);
    abstract NikeProduct getNikeProduct(String product);
}
