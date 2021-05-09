package Command;

public class TableLamp implements LightingDevice {
    @Override
    public void on() {
        System.out.println("Table Lamp Is On");
    }

    @Override
    public void off() {
        System.out.println("Table Lamp Is Off");
    }
}
