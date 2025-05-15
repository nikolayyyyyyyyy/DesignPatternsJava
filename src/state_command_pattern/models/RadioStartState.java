package state_command_pattern.models;

import state_command_pattern.contracts.State;

public class RadioStartState implements State {
    @Override
    public String doAction() {
        return "Radio is on and it making noises.";
    }
}
