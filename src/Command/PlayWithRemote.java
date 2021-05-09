package Command;

public class PlayWithRemote {
    public static void main(String[] args) {
        LightingDevice light = new Light();
        ICommand lightOnCommand = new LightOnCommand(light);
        ICommand lightOffCommand = new LightOffCommand(light);
        RemoteControl remoteControl = new RemoteControl(lightOnCommand, lightOffCommand);
        remoteControl.pushOn();
        remoteControl.pushOff();

        // change remote to lamp
        LightingDevice lamp = new TableLamp();
        ICommand lampOnCommand = new LightOnCommand(lamp);
        ICommand lampOffCommand = new LightOffCommand(lamp);
        remoteControl = new RemoteControl(lampOnCommand, lampOffCommand);
        remoteControl.pushOn();
        remoteControl.pushOff();
    }

}
