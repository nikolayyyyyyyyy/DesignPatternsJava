package state_command_pattern.models;

import state_command_pattern.contracts.Command;

public class MultimediaInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
