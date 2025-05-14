package state_command_pattern.models;

import state_command_pattern.contracts.Command;
import state_command_pattern.contracts.MultimediaReceiver;
import state_command_pattern.contracts.State;

public class Application {
    public static void main(String[] args) {
        MultimediaReceiver radio = new RadioReceiver();
        State start = new MultimediaStartState();
        State stop = new MultimediaStopState();

        radio.setState(stop);
        if (radio.getState() instanceof MultimediaStartState) {

            Command increaseChannel = new IncreaseChannelCommand(radio);
            System.out.println(increaseChannel.execute());
            System.out.println(radio.getChannel());

            Command increaseVolume = new IncreaseVolumeCommand(radio);
            System.out.println(increaseVolume.execute());
            System.out.println(radio.getVolume());
        } else {

            System.out.println("Switch to start state");
        }
    }
}
