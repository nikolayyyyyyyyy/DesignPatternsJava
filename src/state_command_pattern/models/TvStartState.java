package state_command_pattern.models;

import state_command_pattern.contracts.State;

public class TvStartState implements State {
    @Override
    public String doAction() {
        return "Tv is on.";
    }
}
