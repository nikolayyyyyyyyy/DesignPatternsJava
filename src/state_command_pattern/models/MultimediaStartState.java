package state_command_pattern.models;

import state_command_pattern.contracts.State;

public class MultimediaStartState implements State {
    @Override
    public String doAction() {
        return "Multimedia is started";
    }
}
