package patterns.behavior.observer;

public interface IObserved {
    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifiObserver();
}
