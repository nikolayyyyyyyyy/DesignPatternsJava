package command_pattern.commands;

import command_pattern.contracts.Command;
import command_pattern.contracts.MusicSystemReceiver;

public class DecreaseVolumeCommand implements Command {
    private final MusicSystemReceiver musicSystemReceiver;

    public DecreaseVolumeCommand(MusicSystemReceiver musicSystemReceiver) {
        this.musicSystemReceiver = musicSystemReceiver;
    }

    @Override
    public void execute() {
        this.musicSystemReceiver.decreaseVolume();
    }
}
