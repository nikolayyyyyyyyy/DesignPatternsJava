package command_pattern;

import command_pattern.commands.DecreaseTempCommand;
import command_pattern.commands.IncreaseTempCommand;
import command_pattern.commands.IncreaseVolumeCommand;
import command_pattern.commands.TurnLightOnCommand;
import command_pattern.contracts.Command;
import command_pattern.models.AirCondition;
import command_pattern.models.Invoker;
import command_pattern.models.Light;
import command_pattern.models.MusicSystem;

public class Application {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
//        Light light = new Light();
//        Command turnOn = new TurnLightOnCommand(light);
//
//        invoker.setCommand(turnOn);
//        invoker.execute();
//
//        System.out.println(light.getLightState());
//        AirCondition airCondition = new AirCondition();
//        Command increaseTemp = new DecreaseTempCommand(airCondition);
//
//        invoker.setCommand(increaseTemp);
//        invoker.execute();
//        System.out.println(airCondition);
        MusicSystem musicSystem = new MusicSystem();
        Command increase = new IncreaseVolumeCommand(musicSystem);
        invoker.setCommand(increase);
        increase.execute();

        System.out.println(musicSystem);
    }
}
