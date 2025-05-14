package state_command_pattern.models;

import state_command_pattern.contracts.Command;
import state_command_pattern.contracts.MultimediaReceiver;

public class DecreaseVolumeCommand implements Command {
    private MultimediaReceiver multimedia;

    public DecreaseVolumeCommand(MultimediaReceiver multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String execute() {
        return this.multimedia.decreaseVolume();
    }
}
