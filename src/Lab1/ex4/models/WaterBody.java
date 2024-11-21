package Lab1.ex4.models;

import Lab1.ex4.exceptions.WaterBodyException;
import Lab1.ex4.interfaces.Usage;

import java.util.Arrays;

public abstract class WaterBody implements Usage {
    private final String name;
    private double depth;
    private final Fish[] fish;

    public WaterBody(String name, double depth, Fish[] fish) throws WaterBodyException {
        this.name = name;
        setDepth(depth);
        this.fish = fish;
    }

    public String getName() {
        return name;
    }

    public Fish[] getFish() {
        return fish;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        if(depth < 0){
            throw new WaterBodyException("Дълбочината не може да бъде отрицателна величина!");
        }
        this.depth = depth;
    }

    @Override
    public boolean isProductabe() {
        return Arrays.stream(this.fish)
                .anyMatch(a->a.getClass().getSimpleName().equals("EdibleFish") && a.getQuantity() > 10);
    }

    public abstract boolean isFloaty();

    public double calculateProduction(){
        return Arrays.stream(this.fish)
                .filter(a->a.getQuantity() > 10)
                .mapToDouble(Fish::getQuantity)
                .sum();
    }
}
