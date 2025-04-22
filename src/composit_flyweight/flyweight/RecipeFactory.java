package composit_flyweight.flyweight;

import composit_flyweight.components.RecipeComposite;

import java.util.HashMap;
import java.util.Map;

public class RecipeFactory {
    private static final Map<String, RecipeComposite> recipes = new HashMap<>();

    public static RecipeComposite getRecipe(String name) {
        return recipes.get(name);
    }

    public static void registerRecipe(String name, RecipeComposite recipe) {
        recipes.putIfAbsent(name, recipe);
    }

    public static void printAllRecipes() {
        recipes.forEach((name, recipe) -> recipe.print(1));
    }
}