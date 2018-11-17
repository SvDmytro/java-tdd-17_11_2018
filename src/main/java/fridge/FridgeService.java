package fridge;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class FridgeService {

    private final Set<ProductEntity> productEntities = new HashSet();


    Collection<ProductEntity> listNonexpiredItems() {
        return productEntities.stream()
                .filter(ProductEntity::isNotExpired)
                .collect(Collectors.toList());
    }

    Collection<ProductEntity> listItems() {
        return new HashSet(productEntities);
    }


    void addProduct(final ProductEntity productEntity) {
        productEntities.add(productEntity);
    }
}
