package aco.patterns.command;

public class GarageDoorOpenCommand implements Command{

    GarageDoor gd;

    public GarageDoorOpenCommand(GarageDoor gd) {
        this.gd = gd;
    }

    @Override
    public void execute() {
        gd.up();
    }

    @Override
    public void undo() {
        gd.down();
    }
}
