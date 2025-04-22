package composit_flyweight.order;

import composit_flyweight.components.RecipeComposite;
import composit_flyweight.flyweight.RecipeFactory;

import java.util.List;

public class Dish {
    private final String name;
    private final int portions;

    public Dish(String name, int portions) {
        this.name = name;
        this.portions = portions;
    }

    public void prepare() {
        RecipeComposite recipe = RecipeFactory.getRecipe(name);
        if (recipe != null) {
            System.out.println("Preparing " + name + " for " + portions + " portions:");
            recipe.print(portions);
        } else {
            System.out.println("No recipe for " + name);
        }
    }

    public List<String> getRequiredIngredients() {
        RecipeComposite recipe = RecipeFactory.getRecipe(name);
        return recipe != null ? recipe.getIngredients(portions) : List.of();
    }
}