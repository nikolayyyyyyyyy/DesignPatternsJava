package command_pattern.models;

import command_pattern.contracts.AirConditionReceiver;

public class AirCondition implements AirConditionReceiver {
    private int temp;

    @Override
    public void increaseTemperature() {
        this.temp++;
    }

    @Override
    public void decreaseTemperature() {
        if (this.temp == 0) {
            throw new IllegalArgumentException("Temp cannot be negative");
        }
        this.temp--;
    }

    @Override
    public String toString() {
        return String.format("The temp is : %d", this.temp);
    }
}
