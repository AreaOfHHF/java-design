package CommandPattern_Hong.impl;

import CommandPattern_Hong.inter.Command;
import CommandPattern_Hong.pojo.Light;

public class LivingroomLightOffCommand implements Command{
    Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.off();
    }
    public void undo() {
        light.on();
    }
}
