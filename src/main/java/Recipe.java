import fridge.Product;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private String name;
    private int rating;
    private MealTypeEnum type;
    List<Ingredient> ingredients = new ArrayList();

    public Recipe(String name, int rating, MealTypeEnum type, List<Ingredient> ingredients) {
        this.name = name;
        this.rating = rating;
        this.type = type;
        this.ingredients = ingredients;
    }

    public Recipe() {

    }

    public Boolean hasIngredient(Product product) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getProduct().equals(product)) return true;
        }
        return false;

    }

    public String getName() {

        return this.name;
    }
}


