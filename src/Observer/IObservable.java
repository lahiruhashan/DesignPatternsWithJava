package Observer;

public interface IObservable {
    void register(IObserver observer);

    void unregister(IObserver observer);

    void notifyObserver();
}
