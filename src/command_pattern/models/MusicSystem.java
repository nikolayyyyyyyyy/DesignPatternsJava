package command_pattern.models;

import command_pattern.contracts.MusicSystemReceiver;

public class MusicSystem implements MusicSystemReceiver {
    private int musicVol;

    @Override
    public void increaseVolume() {
        this.musicVol++;
    }

    @Override
    public void decreaseVolume() {
        this.musicVol--;
    }

    @Override
    public String toString() {
        return String.format("Volume is : %d", this.musicVol);
    }
}
