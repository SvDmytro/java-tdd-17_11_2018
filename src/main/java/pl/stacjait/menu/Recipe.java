package pl.stacjait.menu;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import java.util.Set;

/**
 * Created by konto on 17/11/2018.
 */
@Data
public class Recipe {

    private Set<ProductProposition> ingridients;


//    public Recipe(Set<ProductProposition> ingridients) {
//        this.ingridients = ingridients;
//    }

//    public Set<ProductProposition> getIngridients() {
//        return ingridients;
//    }
}
