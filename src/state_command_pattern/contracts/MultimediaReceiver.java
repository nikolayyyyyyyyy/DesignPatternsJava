package state_command_pattern.contracts;

public interface MultimediaReceiver {

    String increaseChannel();

    String decreaseChannel();

    String increaseVolume();

    String decreaseVolume();

    int getChannel();

    int getVolume();

    State getState();

    void setState(State state);
}
