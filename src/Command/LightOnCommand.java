package Command;

public class LightOnCommand implements ICommand {

    LightingDevice lightingDevice;

    public LightOnCommand(LightingDevice lightingDevice) {
        this.lightingDevice = lightingDevice;
    }

    @Override
    public void execute() {
        this.lightingDevice.on();
    }

    @Override
    public void undo() {
        this.lightingDevice.off();
    }
}
