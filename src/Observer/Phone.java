package Observer;

public class Phone implements IObserver {

    private WeatherStation station;

    public Phone(WeatherStation station) {
        this.station = station;
        station.register(this);
    }

    @Override
    public void update() {
        System.out.println("Updated : " + station.getTemperature());
    }
}
