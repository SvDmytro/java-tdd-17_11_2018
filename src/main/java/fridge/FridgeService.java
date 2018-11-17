package fridge;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class FridgeService {

    private final Set<ProductEntity> productEntities = new HashSet<>();

    Collection<ProductEntity> listItems() {
        return new HashSet<>(productEntities);
    }

    void addProduct(final ProductEntity productEntity) {
        productEntities.add(productEntity);
    }
}
