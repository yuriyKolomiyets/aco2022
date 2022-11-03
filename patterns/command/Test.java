package aco.patterns.command;

public class Test {

    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        lightOnCommand.execute();

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setSlot(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        GarageDoorOpenCommand gd = new GarageDoorOpenCommand(new GarageDoor());
        simpleRemoteControl.setSlot(gd);
        simpleRemoteControl.buttonWasPressed();

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(1, lightOnCommand, new LightOffCommand(light));
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

    }
}
