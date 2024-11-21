package Lab1.ex4.models;

import Lab1.ex4.enums.FishType;

public class EdibleFish extends Fish{
    private final double percentOfYield;

    public EdibleFish(FishType name,
                      double quantity,
                      double percentOfYield) {
        super(name, quantity);
        this.percentOfYield = percentOfYield;
    }

    public double getPercentOfYield() {
        return percentOfYield;
    }

}
