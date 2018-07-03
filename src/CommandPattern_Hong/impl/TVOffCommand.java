package CommandPattern_Hong.impl;

import CommandPattern_Hong.inter.Command;
import CommandPattern_Hong.pojo.TV;

public class TVOffCommand implements Command{
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv= tv;
    }

    public void execute() {
        tv.off();
    }

    public void undo() {
        tv.on();
    }
}
