package CommandPattern_Remote.impl;

import CommandPattern_Remote.inter.Command;
import CommandPattern_Remote.pojo.CeilingFan;

public class CeilingFanOnCommand implements Command{

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }
}
