package state_command_pattern.models;

import state_command_pattern.contracts.Command;
import state_command_pattern.contracts.MultimediaReceiver;

public class IncreaseChannelCommand implements Command {
    private MultimediaReceiver multimedia;

    public IncreaseChannelCommand(MultimediaReceiver multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String execute() {
        return this.multimedia.increaseChannel();
    }
}
