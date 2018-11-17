import fridge.Product;
import org.junit.Assert;
import org.junit.Test;

public class IngredientTest {

    @Test
    public void ingredientShouldBeCreated() {
        Product milk = new Product("Milk 1L");

        Ingredient ingredient = new Ingredient(milk, UnitEnum.ml, 1000);
    }

    @Test
    public void ingredientShouldReturnQuantity() {
        Product milk = new Product("Milk 1L");
        Assert.assertEquals(10, new Ingredient(milk, UnitEnum.pc, 10).getQuantity());

    }
}
