package composit_flyweight.components;

import java.util.List;

public class Ingredient implements RecipeComponent {
    private final String name;
    private final int quantityPerPortion;

    public Ingredient(String name, int quantityPerPortion) {
        this.name = name;
        this.quantityPerPortion = quantityPerPortion;
    }

    @Override
    public void print(int portions) {
        System.out.println(name + ": " + (quantityPerPortion * portions));
    }

    @Override
    public List<String> getIngredients(int portions) {
        return List.of(name + " - " + (quantityPerPortion * portions));
    }
}