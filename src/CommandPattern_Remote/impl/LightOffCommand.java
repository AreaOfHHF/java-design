package CommandPattern_Remote.impl;

import CommandPattern_Remote.inter.Command;
import CommandPattern_Remote.pojo.Light;

public class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}
