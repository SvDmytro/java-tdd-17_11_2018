package pl.stacjait.menu;

import org.springframework.stereotype.Service;

/**
 * Created by konto on 17/11/2018.
 */
@Service
public interface Frigerator {

    List<ProductProposition> getProducts();
}
