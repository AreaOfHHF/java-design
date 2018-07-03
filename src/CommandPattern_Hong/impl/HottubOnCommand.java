package CommandPattern_Hong.impl;

import CommandPattern_Hong.inter.Command;
import CommandPattern_Hong.pojo.Hottub;

public class HottubOnCommand implements Command{
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    public void execute() {
        hottub.on();
        hottub.setTemperature(104);
        hottub.circulate();
    }
    public void undo() {
        hottub.off();
    }
}
