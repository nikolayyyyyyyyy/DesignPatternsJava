package command_pattern.commands;

import command_pattern.contracts.Command;
import command_pattern.contracts.LightReceiver;

public class TurnLightOnCommand implements Command {
    private final LightReceiver lightReceiver;

    public TurnLightOnCommand(LightReceiver receiver) {
        this.lightReceiver = receiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.turnOn();
    }
}
