package CommandPatternSimple;

import CommandPatternSimple.impl.GarageDoorOpenCommand;
import CommandPatternSimple.impl.LightOffCommand;
import CommandPatternSimple.impl.LightOnCommand;
import CommandPatternSimple.pojo.GarageDoor;
import CommandPatternSimple.pojo.Light;

public class CommandPatternMain1 {

    public static void main(String[] args){

        SimpleControl simpleControl = new SimpleControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new
                GarageDoorOpenCommand(garageDoor);

        simpleControl.setCommand(lightOnCommand);
        simpleControl.buttonWasPressed();
        simpleControl.setCommand(lightOffCommand);
        simpleControl.buttonWasPressed();
        simpleControl.setCommand(garageDoorOpenCommand);
        simpleControl.buttonWasPressed();

    }

}
