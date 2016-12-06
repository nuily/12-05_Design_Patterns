package nyc.c4q.huilin.a12_05_design_patterns.Observables;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huilin on 12/5/16.
 */

public class Observable<T> {
    List<Observer<T>> listeners = new ArrayList<>();

    public void addObserver(Observer<T> listener) {
        listeners.add(listener);
    }

    public void removeObserver(Observable listener) {
        listeners.remove(listener);
    }

    public void publish(T data) {
        for (Observer<T> listener : listeners) {
            listener.accept(data);

        }
    }


}
