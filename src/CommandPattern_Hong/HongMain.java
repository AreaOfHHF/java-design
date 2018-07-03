package CommandPattern_Hong;

import CommandPattern_Hong.impl.*;
import CommandPattern_Hong.inter.Command;
import CommandPattern_Hong.pojo.Hottub;
import CommandPattern_Hong.pojo.Light;
import CommandPattern_Hong.pojo.Stereo;
import CommandPattern_Hong.pojo.TV;

public class HongMain {

    public static void main(String[] args){

        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};

        HongCommand onHong = new HongCommand(partyOn);
        HongCommand offHong = new HongCommand(partyOff);

        remoteControl.setCommand(0,onHong,offHong);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

    }

}
