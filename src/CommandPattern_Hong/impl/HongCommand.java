package CommandPattern_Hong.impl;

import CommandPattern_Hong.inter.Command;

public class HongCommand implements Command{
    Command[] commands;

    public HongCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(int i=0;i<commands.length;i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i = 0;i<commands.length;i++){
            commands[i].undo();
        }
    }
}
