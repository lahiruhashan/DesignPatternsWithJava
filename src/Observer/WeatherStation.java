package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

    private List<IObserver> observers = new ArrayList<>();
    private int temperature;

    @Override
    public void register(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        int observerIndex = observers.indexOf(observer);
        observers.remove(observer);
        System.out.println("Removed Observer " + observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (IObserver o : observers) {
            o.update();
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObserver();
    }
}
