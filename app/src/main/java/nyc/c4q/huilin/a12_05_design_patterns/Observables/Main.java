package nyc.c4q.huilin.a12_05_design_patterns.Observables;

/**
 * Created by huilin on 12/5/16.
 */

public class Main {
    public static void main(String[] args) {
        Observable<String> stringPublisher = new Observable<>();

        stringPublisher.addObserver(new Observer<String>() {
            @Override
            public void accept(String data) {
                System.out.println("Publisher 1 saw " + data);
            }
        });

        stringPublisher.addObserver(new Observer<String>() {
                                        @Override
                                        public void accept(String data) {
                                            System.out.println("Publisher 2 saw " + data);
                                        }
                                    }

        );
        stringPublisher.publish("hello");
    }
}
