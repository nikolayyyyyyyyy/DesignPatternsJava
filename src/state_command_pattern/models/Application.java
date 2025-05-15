package state_command_pattern.models;

import state_command_pattern.contracts.Command;
import state_command_pattern.contracts.State;

public class Application {
    public static void main(String[] args) {
        TvReceiver tv = new TvReceiver();
        State start = new TvStartState();
        State stop = new TvStopState();
        MultimediaInvoker invoker = new MultimediaInvoker();

        tv.setState(stop);
        if (tv.getState() == start) {
            System.out.println(tv.doAction());
            Command increaseChannel = new IncreaseChannelCommand(tv);
            invoker.setCommand(increaseChannel);
            System.out.println(invoker.execute());
            System.out.println(tv.getChannel());

            Command increaseVolume = new IncreaseVolumeCommand(tv);
            invoker.setCommand(increaseVolume);
            System.out.println(invoker.execute());
            System.out.println(tv.getVolume());

        } else {
            System.out.println(tv.doAction());
            System.out.println("Switch to start state");
        }
    }
}
