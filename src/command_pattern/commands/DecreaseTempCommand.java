package command_pattern.commands;

import command_pattern.contracts.AirConditionReceiver;
import command_pattern.contracts.Command;

public class DecreaseTempCommand implements Command {
    private final AirConditionReceiver airConditionReceiver;

    public DecreaseTempCommand(AirConditionReceiver airConditionReceiver) {
        this.airConditionReceiver = airConditionReceiver;
    }

    @Override
    public void execute() {
        this.airConditionReceiver.decreaseTemperature();
    }
}
