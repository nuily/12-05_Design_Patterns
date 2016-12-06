package nyc.c4q.huilin.a12_05_design_patterns.Observables;

/**
 * Created by huilin on 12/5/16.
 */

public interface Observer<T> {
    void accept(T data);
}
