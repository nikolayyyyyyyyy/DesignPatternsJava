package composit_flyweight.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void processOrder() {
        for (Dish dish : dishes) {
            dish.prepare();
        }
    }

    public List<String> getAllIngredients() {
        List<String> all = new ArrayList<>();
        for (Dish dish : dishes) {
            all.addAll(dish.getRequiredIngredients());
        }
        return all;
    }
}