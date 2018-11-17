package pl.stacjait.menu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import sun.jvm.hotspot.utilities.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

/**
 * Created by konto on 17/11/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class MenuTest {

    @Autowired
    private Menu menu;

    @Mock
    private Frigerator frigerator;

    @Mock
    private RecipeService recipeService;

    @Test
    public void shouldReturnBreakfastRecipe(){

        //given zawrotsc lodowki

        List<ProductProposition> productPropositionList = new ArrayList();
                when(frigerator.getProducts())
                .thenReturn(productPropositionList);

        //and
        List<Recipe> recipeList = new ArrayList();
        when(recipeService.getRecipes(1))
                .thenReturn(recipeList);



        //expect
        //Recipe scrambledEggsRecipe = ;
        Assert.that(scrambledEggsRecipe,menu.createBreakfast(recipeList, productPropositionList));
    }


}
