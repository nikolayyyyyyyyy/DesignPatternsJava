package composit_flyweight.components;

import java.util.List;

public interface RecipeComponent {
    void print(int portions);
    List<String> getIngredients(int portions);
}