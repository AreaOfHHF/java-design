package CommandPatternSimple.impl;

import CommandPatternSimple.inter.Command;
import CommandPatternSimple.pojo.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
