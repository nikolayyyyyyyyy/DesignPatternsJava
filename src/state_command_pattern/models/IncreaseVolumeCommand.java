package state_command_pattern.models;

import state_command_pattern.contracts.Command;
import state_command_pattern.contracts.MultimediaReceiver;

public class IncreaseVolumeCommand implements Command {
    private MultimediaReceiver multimedia;

    public IncreaseVolumeCommand(MultimediaReceiver multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String execute() {
        return this.multimedia.increaseVolume();
    }
}
