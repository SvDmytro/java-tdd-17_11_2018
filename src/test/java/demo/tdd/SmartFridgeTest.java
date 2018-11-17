package demo.tdd;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class SmartFridgeTest {

    private static final LocalDate FUTURE_DATE = LocalDate.of(2018, 11, 18);
    private static final LocalDate CURRENT_DATE = LocalDate.of(2018, 11, 17);
    private static final LocalDate PAST_DATE = LocalDate.of(2018, 11, 16);
    private static final Dish PANCAKES = new Dish("pancakes", Arrays.asList("milk", "wheat", "egg"));
    private static final Dish OMELETTE = new Dish("omelette", Arrays.asList("egg", "oil", "butter"));

    @Test
    public void smartFridgeShouldSuggestACorrectDishWhenDishIsAvailableAndProductExpires() {
        final Product milk = new Product("milk", PAST_DATE);
        final Product wheat = new Product("wheat", FUTURE_DATE);
        final Product egg = new Product("egg", FUTURE_DATE);
        final Menu menu = new Menu(Arrays.asList(PANCAKES, OMELETTE));
        final SmartFridge smartFridge = new SmartFridge(menu, Arrays.asList(milk, wheat, egg));

        final Optional<Dish> dish = smartFridge.produceDishSuggestionForExpiringProducts(CURRENT_DATE);

        Assert.assertThat(dish, notNullValue());
        Assert.assertThat(dish.isPresent(), is(true));
        Assert.assertThat(dish.get().getTitle(), is(PANCAKES.getTitle()));
        Assert.assertThat(dish.get().getIngridients(), is(PANCAKES.getIngridients()));
    }

    @Test
    public void smartFridgeShouldNotSuggestADishWhenNoProductsExpire() {
        final Product milk = new Product("milk", FUTURE_DATE);
        final Product wheat = new Product("wheat", FUTURE_DATE);
        final Product egg = new Product("egg", FUTURE_DATE);
        final Menu menu = new Menu(Arrays.asList(PANCAKES, OMELETTE));
        final SmartFridge smartFridge = new SmartFridge(menu, Arrays.asList(milk, wheat, egg));

        final Optional<Dish> dish = smartFridge.produceDishSuggestionForExpiringProducts(CURRENT_DATE);

        Assert.assertThat(dish, notNullValue());
        Assert.assertThat(dish.isPresent(), is(false));
    }

    @Test
    public void smartFridgeShouldNotSuggestADishWhenNoDishWithExpiringProductAvailable() {
        final Product milk = new Product("milk", PAST_DATE);
        final Menu menu = new Menu(Arrays.asList(OMELETTE));
        final SmartFridge smartFridge = new SmartFridge(menu, Arrays.asList(milk));

        final Optional<Dish> dish = smartFridge.produceDishSuggestionForExpiringProducts(CURRENT_DATE);

        Assert.assertThat(dish, notNullValue());
        Assert.assertThat(dish.isPresent(), is(false));
    }

    @Test
    public void smartFridgeShouldNotSuggestADishWhenProductExpiresButNoOtherProductsAvailable() {
        final Product milk = new Product("egg", PAST_DATE);
        final Menu menu = new Menu(Arrays.asList(PANCAKES, OMELETTE));
        final SmartFridge smartFridge = new SmartFridge(menu, Arrays.asList(milk));

        final Optional<Dish> dish = smartFridge.produceDishSuggestionForExpiringProducts(CURRENT_DATE);

        Assert.assertThat(dish, notNullValue());
        Assert.assertThat(dish.isPresent(), is(false));
    }

    @Test
    public void smartFridgeShouldNotSuggestADishWhenNoProductsAvailable() {
        final Menu menu = new Menu(Arrays.asList(PANCAKES, OMELETTE));
        final SmartFridge smartFridge = new SmartFridge(menu, Collections.emptyList());

        final Optional<Dish> dish = smartFridge.produceDishSuggestionForExpiringProducts(CURRENT_DATE);

        Assert.assertThat(dish, notNullValue());
        Assert.assertThat(dish.isPresent(), is(false));
    }

    @Test
    public void smartFridgeShouldNotSuggestADishWhenNoDishesAvailable() {
        final Product milk = new Product("milk", FUTURE_DATE);
        final Product wheat = new Product("wheat", FUTURE_DATE);
        final Product egg = new Product("egg", FUTURE_DATE);
        final Menu menu = new Menu(Collections.emptyList());
        final SmartFridge smartFridge = new SmartFridge(menu, Arrays.asList(milk, wheat, egg));

        final Optional<Dish> dish = smartFridge.produceDishSuggestionForExpiringProducts(CURRENT_DATE);

        Assert.assertThat(dish, notNullValue());
        Assert.assertThat(dish.isPresent(), is(false));
    }
}