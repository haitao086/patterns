package patterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Driver implements IObserved {

    private List<IObserver> list = new ArrayList<>() ;

    @Override
    public void addObserver(IObserver observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notifiObserver() {
        for (IObserver observer : list) {
            observer.update();
        }
    }
}
