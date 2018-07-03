package CommandPattern_Remote.impl;

import CommandPattern_Remote.inter.Command;
import CommandPattern_Remote.pojo.Stereo;

public class StereoOffCommand implements Command{

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

}
