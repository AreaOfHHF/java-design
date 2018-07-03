package CommandPattern_Hong.impl;

import CommandPattern_Hong.inter.Command;
import CommandPattern_Hong.pojo.Light;

public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
