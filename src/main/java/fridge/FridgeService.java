package fridge;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class FridgeService {

    private final Set<Product> products = new HashSet<>();

    Collection<Product> listItems() {
        return new HashSet<>(products);
    }

    void addProduct(final Product product) {
        products.add(product);
    }
}
