package demo.tdd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Menu {

    private final List<Dish> dishes;

    public Menu(final Collection<Dish> dishes) {
        this.dishes = new ArrayList<>(dishes);
    }

    public Collection<Dish> getDishes() {
        return dishes;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "dishes=" + dishes +
                '}';
    }
}