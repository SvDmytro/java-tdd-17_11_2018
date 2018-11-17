package fridge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class FridgeService {

    private final Set<ProductEntity> productEntities = new HashSet<>();


    Collection<ProductEntity> listItems() {
        return listItems(false);
    }


        Collection<ProductEntity> listItems(boolean includeExpired) {
        if (includeExpired)
            return new ArrayList<>(productEntities);

        return productEntities.stream()
                .filter(ProductEntity::isNotExpired)
                .collect(Collectors.toList());
    }

    void addProduct(final ProductEntity productEntity) {
        productEntities.add(productEntity);
    }

    Collection<Object> findByProduct(final Product product) {
        return productEntities.stream()
                .filter(productEntity -> productEntity.getProduct().equals(product))
                .collect(Collectors.toList());
    }

    void removeProduct(final ProductEntity ourApple) {
        productEntities.remove(ourApple);
    }
}
