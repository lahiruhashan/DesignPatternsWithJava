package Command;

public class LightOffCommand implements ICommand {

    LightingDevice device;

    public LightOffCommand(LightingDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
