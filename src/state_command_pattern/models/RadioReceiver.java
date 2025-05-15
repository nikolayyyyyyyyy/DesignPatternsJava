package state_command_pattern.models;

import state_command_pattern.contracts.MultimediaReceiver;
import state_command_pattern.contracts.State;

public class RadioReceiver implements MultimediaReceiver, State {
    private int channel;
    private int volume;
    private State state;

    public RadioReceiver() {
        this.channel = 0;
        this.volume = 0;
    }

    @Override
    public String increaseChannel() {
        this.channel++;
        return "Increasing channel";
    }

    @Override
    public String decreaseChannel() {
        if (this.channel == 0) {
            throw new IllegalArgumentException("Channel cannot be negative value");
        }
        this.channel--;
        return "Decreasing channel";
    }

    @Override
    public String increaseVolume() {
        this.volume++;
        return "Increasing volume";
    }

    @Override
    public String decreaseVolume() {
        if (this.volume == 0) {
            throw new IllegalArgumentException("Volume cannot be negative value");
        }
        this.volume--;
        return "Decreasing volume";
    }

    public int getChannel() {
        return this.channel;
    }

    public int getVolume() {
        return this.volume;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String doAction() {
        return state.doAction();
    }
}
