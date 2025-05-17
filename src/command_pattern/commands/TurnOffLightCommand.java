package command_pattern.commands;

import command_pattern.contracts.Command;
import command_pattern.contracts.LightReceiver;

public class TurnOffLightCommand implements Command {
    private final LightReceiver lightReceiver;

    public TurnOffLightCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.turnOff();
    }
}
