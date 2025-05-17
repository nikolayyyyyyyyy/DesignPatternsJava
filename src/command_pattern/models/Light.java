package command_pattern.models;

import command_pattern.contracts.LightReceiver;

public class Light implements LightReceiver {
    private boolean isLightOn;

    @Override
    public void turnOn() {
        this.isLightOn = true;
    }

    @Override
    public void turnOff() {
        this.isLightOn = false;
    }

    public String getLightState() {
        return String.format("The light is: %s", this.isLightOn ? "On" : "Off");
    }
}
