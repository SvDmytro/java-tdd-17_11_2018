package demo.tdd;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SmartFridge {

    private final Menu menu;
    private final List<Product> products;

    public SmartFridge(final Menu menu, final Collection<Product> products) {
        this.menu = menu;
        this.products = new ArrayList<>(products);
    }

    public Optional<Dish> produceDishSuggestionForExpiringProducts(final LocalDate currentDate) {
        final List<String> expiringIngredients = products.stream()
                .filter(product -> product.getExpirationDate().isBefore(currentDate))
                .map(Product::getTitle)
                .collect(Collectors.toList());

        return expiringIngredients.isEmpty() ? Optional.empty() : findDish(expiringIngredients);
    }

    private Optional<Dish> findDish(final List<String> expiringIngredients) {
        return menu.getDishes().stream()
                .filter(dish -> dish.getIngridients().stream().anyMatch(expiringIngredients::contains))
                .filter(dish -> dish.getIngridients().stream().allMatch(this::isIngredientInProducts))
                .findFirst();
    }

    private boolean isIngredientInProducts(final String ingredient) {
        return products.stream()
                .map(Product::getTitle)
                .anyMatch(ingredient::equals);
    }
}