import fridge.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IngredientTest {

    List<Recipe> mockRecipeList= new ArrayList<Recipe>();

    private Recipe recipeFactory(List<Ingredient> ingredients) {
        return new Recipe(UUID.randomUUID().toString(), 1, MealTypeEnum.Breakfast, ingredients);
    }

    private void fillRecipeList() {
       mockRecipeList.clear();
       Ingredient milk = new Ingredient(new Product("Milk"), UnitEnum.pc, 1);
       Ingredient egg = new Ingredient(new Product("Egg"), UnitEnum.pc, 2);
        List<Ingredient> list_1 = new ArrayList<Ingredient>();
        List<Ingredient> list_2 = new ArrayList<Ingredient>();

        list_1.add(milk);
        list_2.add(milk);
        list_2.add(egg);



        mockRecipeList.add(recipeFactory(list_1));
        mockRecipeList.add(recipeFactory(list_2));
    }

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

    @Test
    public void recipeByIngredientsShouldBeFound() {
        fillRecipeList();
        Product milk = new Product("Milk");
        Product egg = new Product("Egg");
        Product somethingElse = new Product("Something Else");

        // test for milk
        for(Recipe r: mockRecipeList) {
            if (r.hasIngredient(milk)) {
                System.out.println(r.getName());
            }
        }

        // test for egg
        for(Recipe r: mockRecipeList) {
            if (r.hasIngredient(egg)) {
                System.out.println(r.getName());
            }
        }

         // test for egg
        for(Recipe r: mockRecipeList) {
            if (r.hasIngredient(somethingElse)) {
                System.out.println(r.getName());
            }
        }


        Assert.assertTrue(mockRecipeList.get(0).hasIngredient(milk));
        Assert.assertFalse(mockRecipeList.get(0).hasIngredient(somethingElse));

//        for(Recipe r: mockRecipeList) {
//            Assert.assertTrue(r.hasIngredient(milk));
//        }

//        for(Recipe r: mockRecipeList) {
//            Assert.assertTrue(r.hasIngredient(egg));
//        }

//        for(Recipe r: mockRecipeList) {
//            Assert.assertFalse(r.hasIngredient(somethingElse));
//        }





    }
}
