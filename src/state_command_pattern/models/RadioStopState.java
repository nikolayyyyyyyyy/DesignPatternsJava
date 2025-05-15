package state_command_pattern.models;

import state_command_pattern.contracts.State;

public class RadioStopState implements State {
    @Override
    public String doAction() {
        return "Radio is stopped and is quiet.";
    }
}
