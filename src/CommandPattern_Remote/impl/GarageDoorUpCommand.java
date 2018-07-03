package CommandPattern_Remote.impl;

import CommandPattern_Remote.inter.Command;
import CommandPattern_Remote.pojo.GarageDoor;

public class GarageDoorUpCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

}
