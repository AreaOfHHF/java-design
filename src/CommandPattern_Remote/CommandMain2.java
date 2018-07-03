package CommandPattern_Remote;

import CommandPattern_Remote.impl.*;
import CommandPattern_Remote.pojo.CeilingFan;
import CommandPattern_Remote.pojo.GarageDoor;
import CommandPattern_Remote.pojo.Light;
import CommandPattern_Remote.pojo.Stereo;

public class CommandMain2 {

    public static void main(String[] args){

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living room");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor("Living room");
        Stereo stereo = new Stereo("Living room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        CeilingFanOnCommand ceilingFanOnCommand =
                new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand =
                new CeilingFanOffCommand(ceilingFan);
        GarageDoorUpCommand garageDoorUpCommand =
                new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand =
                new GarageDoorDownCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCDCommand =
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        remoteControl.setCommand(1,ceilingFanOnCommand,ceilingFanOffCommand);
        remoteControl.setCommand(2,garageDoorUpCommand,garageDoorDownCommand);
        remoteControl.setCommand(3,stereoOnWithCDCommand,stereoOffCommand);

        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(1);
        remoteControl.onButtonPushed(2);
        remoteControl.offButtonPushed(2);
        remoteControl.onButtonPushed(3);
        remoteControl.offButtonPushed(3);

    }

}
