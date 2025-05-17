package command_pattern.commands;

import command_pattern.contracts.Command;
import command_pattern.contracts.MusicSystemReceiver;

public class IncreaseVolumeCommand implements Command {
    private final MusicSystemReceiver musicSystemReceiver;

    public IncreaseVolumeCommand(MusicSystemReceiver musicSystemReceiver) {
        this.musicSystemReceiver = musicSystemReceiver;
    }

    @Override
    public void execute() {
        this.musicSystemReceiver.increaseVolume();
    }
}
