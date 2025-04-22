package composit_flyweight.components;

import java.util.ArrayList;
import java.util.List;

public class RecipeComposite implements RecipeComponent {
    private final String name;
    private final List<RecipeComponent> components = new ArrayList<>();

    public RecipeComposite(String name) {
        this.name = name;
    }

    public void addComponent(RecipeComponent component) {
        components.add(component);
    }

    @Override
    public void print(int portions) {
        System.out.println("== " + name + " ==");
        for (RecipeComponent component : components) {
            component.print(portions);
        }
    }

    @Override
    public List<String> getIngredients(int portions) {
        List<String> result = new ArrayList<>();
        for (RecipeComponent component : components) {
            result.addAll(component.getIngredients(portions));
        }
        return result;
    }
}