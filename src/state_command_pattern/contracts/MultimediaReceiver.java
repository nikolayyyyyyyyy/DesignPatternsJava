package state_command_pattern.contracts;

public interface MultimediaReceiver extends State {

    String increaseChannel();

    String decreaseChannel();

    String increaseVolume();

    String decreaseVolume();
}
