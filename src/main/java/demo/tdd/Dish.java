package demo.tdd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Dish {

    private final String title;
    private final List<String> ingredients;

    public Dish(final String title, final Collection<String> ingredients) {
        this.title = title;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getTitle() {
        return title;
    }

    public Collection<String> getIngridients() {
        return Collections.unmodifiableList(ingredients);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "title='" + title + '\'' +
                ", products=" + ingredients +
                '}';
    }
}