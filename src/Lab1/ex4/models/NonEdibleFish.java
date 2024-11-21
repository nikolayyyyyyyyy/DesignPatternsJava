package Lab1.ex4.models;

import Lab1.ex4.enums.FishType;

public class NonEdibleFish extends Fish{
    private final String threat;

    public NonEdibleFish(FishType name,
                         double quantity,
                         String threat) {
        super(name, quantity);
        this.threat = threat;
    }

    public String getThreat() {
        return threat;
    }
}
