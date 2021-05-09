package Command;

public class RemoteControl {
    ICommand onCommand;
    ICommand offCommand;

    public RemoteControl(ICommand onCommand, ICommand offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void pushOn() {
        onCommand.execute();
    }

    public void pushOff() {
        offCommand.execute();
    }
}
