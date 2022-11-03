package aco.patterns.command.bookexample;

public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
