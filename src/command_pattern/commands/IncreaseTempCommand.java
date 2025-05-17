package command_pattern.commands;

import command_pattern.contracts.AirConditionReceiver;
import command_pattern.contracts.Command;

public class IncreaseTempCommand implements Command {
    private final AirConditionReceiver airConditionReceiver;

    public IncreaseTempCommand(AirConditionReceiver airConditionReceiver) {
        this.airConditionReceiver = airConditionReceiver;
    }

    @Override
    public void execute() {
        this.airConditionReceiver.increaseTemperature();
    }
}
