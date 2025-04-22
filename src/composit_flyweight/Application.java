package composit_flyweight;

import composit_flyweight.components.Ingredient;
import composit_flyweight.components.RecipeComposite;
import composit_flyweight.flyweight.RecipeFactory;
import composit_flyweight.order.Dish;
import composit_flyweight.order.Order;

public class Application {
    public static void main(String[] args) {
        RecipeComposite salad = new RecipeComposite("Salad");
        salad.addComponent(new Ingredient("Tomato", 100));
        salad.addComponent(new Ingredient("Cucumber", 100));
        salad.addComponent(new Ingredient("Salt", 5));

        RecipeComposite soup = new RecipeComposite("Soup");
        soup.addComponent(new Ingredient("Water", 300));
        soup.addComponent(new Ingredient("Potato", 150));
        soup.addComponent(new Ingredient("Carrot", 50));

        RecipeFactory.registerRecipe("Salad", salad);
        RecipeFactory.registerRecipe("Soup", soup);

        Order order = new Order();
        order.addDish(new Dish("Salad", 2));
        order.addDish(new Dish("Soup", 1));

        order.processOrder();
        System.out.println("All ingredients needed:");
        order.getAllIngredients().forEach(System.out::println);
    }
}