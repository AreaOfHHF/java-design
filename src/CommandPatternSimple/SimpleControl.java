package CommandPatternSimple;

import CommandPatternSimple.inter.Command;

public class SimpleControl {

    Command command;

    public SimpleControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
