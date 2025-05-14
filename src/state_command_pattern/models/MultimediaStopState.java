package state_command_pattern.models;

import state_command_pattern.contracts.State;

public class MultimediaStopState implements State {
    @Override
    public String doAction() {
        return "Media is stopped";
    }
}
