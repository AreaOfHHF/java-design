package CommandPattern_Remote.impl;

import CommandPattern_Remote.inter.Command;
import CommandPattern_Remote.pojo.CeilingFan;

public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

}
