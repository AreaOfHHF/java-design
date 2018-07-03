package CommandPatternSimple.impl;

import CommandPatternSimple.inter.Command;
import CommandPatternSimple.pojo.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
