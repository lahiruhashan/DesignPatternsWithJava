package Observer;

public class TryObserver {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        new Phone(station);
        final Phone otherPhone = new Phone(station);
        station.setTemperature(35);
        station.unregister(otherPhone);
        station.setTemperature(37);
    }
}
